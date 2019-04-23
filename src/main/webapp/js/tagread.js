
var tagNos = new Array(); // 存放标签的卡号
var data = []; // 存放温度数据
var tagCount = 20; // 默认创建20
var date = []; // 存放当前的时分秒
var day = 15;  // 定义x轴的坐标刻度
var cardNos = []; // 从后台请求的卡号数据
var param = [];  // 从后台请求的卡号数据作为形参
var temperatures = [];  // 从后台获取的温度
var createDates = [];  // 从后台获取的时间
// 全局变量end

// 创建data对象数组
for(var i = 0; i < tagCount; i++) {
	data[i] = new Array();
}

//定义x轴的坐标刻度
for(var i = 0; i < day; i++) {
	addData();
}
// 去除字符串的前后空格
function trim(str) {
	if("undefined" == typeof(str) || null == str || str.length < 1) {
		return str;
	} else if(str.length > 0) {
		return str.replace(/\s/g, "");
	}
}

// 获取不重复的卡号加入到折线图中
function getArray(param) {
	var same = new Array();
	if(null == tagNos[0]) {
		for(var i = 0; i < param.length && null != param[i]; i++) {
			tagNos[i] = trim(param[i]);
		}
		return tagNos;
	}

	for(var i = 0; i < tagNos.length && "undefined" != typeof(tagNos[i]); i++) {
		for(var j = 0; j < param.length; j++) {
			if(tagNos[i] == trim(param[j])) {
				for(var k = 0; k < (tagNos.length + param.length) / 2; k++) {
					if(null == same[k]) {
						same[k] = tagNos[i];
						break;
					}
				}
				break;
			}
		}
	}
	var flag = false;
	for(var i = 0; i < param.length; i++) {
		for(var j = 0; j < same.length; j++) {
			if("undefined" != typeof(param[i]) && trim(param[i]) == same[j]) {  
				param[i] = null;  
				break;
			}
		}
	}
	var result = 0;
	for(var i = 0; i < tagCount; i++) {
		if("undefined" == typeof(tagNos[i]) || null == tagNos[i]) {
			for(var j = result; j < tagCount && null != param[j] || "undefined" != typeof(param[i]); j++) {
				tagNos[i] = trim(param[j]);
				result += 1;
				break;
			}
		}
	}
	return tagNos;
}

// 获取当前的时分秒
function getCurrentTime() {
	var date = new Date(); // 实例一个时间对象；
	var year = date.getFullYear(); // 获取系统的年；
	var month = date.getMonth() + 1; // 获取系统月份，由于月份是从0开始计算，所以要加1
	var day = date.getDate();
	var hour = date.getHours(); // 获取系统时间
	hour = hour <= 9 ? '0' + hour : hour;
	var minute = date.getMinutes(); // 分
	minute = minute <= 9 ? '0' + minute : minute;
	var second = date.getSeconds(); // 秒
	second = second <= 9 ? '0' + second : second;
	return hour + ':' + minute + ':' + second;
}

// 获取更新数据
function addData(shift) {
	date.push(getCurrentTime());
	var tempTagNos = [];
	var tempTemperatures = [];
	getArray(param);
	for(var i = 0; i < tagNos.length; i++) {  
		if(cardNos.length > 0) {
			for(var j = 0; j < cardNos.length; j++) {
				cardNos[j] = trim(cardNos[j]);
				if(tagNos[i] == cardNos[j]) {
					tempTagNos[i] = cardNos[j];
					tempTemperatures[i] = temperatures[j];
					break;
				}
			}
		}
	}
	for(var i = 0; i < tagCount; i++) {
		cardNos[i] = tempTagNos[i];
		if("undefined" == typeof(tempTemperatures[i])) { 
			data[i].push(null);  
		} else { 
			data[i].push(tempTemperatures[i]);  
		}
	}

	if(shift) {
		console.log(data);
		date.shift();
		for(var i = 0; i < tagCount; i++) {
			data[i].shift();  
		}
	}
}

// 从后台请求数据
function requestData() {
	$.ajax({
		type: "POST",
		dataType: "json",
		url: "servlet/DoQueryData",
		success: function(json) { // 返回的result为json格式的数据
			//json = [{"id":750273,"cardNo":" 8C 07 ED 51 78 E8 00 00 00 00 00 00","createDate":"2017-11-21 11:36:30.007","temperature":24},{"id":750274,"cardNo":" 8C A7 C5 58 F9 20 00 00 00 00 00 0E","createDate":"2017-11-21 11:36:30.07","temperature":22.4},{"id":750275,"cardNo":" 8B F8 31 4B 59 00 00 00 00 00 01 97","createDate":"2017-11-21 11:36:30.09","temperature":23.9}]
			cardNos = [];
			temperatures = [];
			for(var i = 0; i < json.length; i++) {
				for(var key in json[i]) {
					if(key == 'cardNo') {
						cardNos[i] = json[i][key];
						param[i] = json[i][key];
					} else if(key == 'createDate') {
						var temp = json[i][key];
						createDates[i] = temp.substring(10, temp.length - 4);
					} else if(key == 'temperature') {
						temperatures[i] = json[i][key];
					}
				}
			}
		}
	});
}