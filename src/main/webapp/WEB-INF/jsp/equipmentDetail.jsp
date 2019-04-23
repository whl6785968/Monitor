<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
              <meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<title>layout 后台大布局 - Layui</title>
		<script src="../../statics/layui.js" charset="utf-8"></script>
		<link rel="stylesheet" href="../../statics/css/layui.css" media="all">
		<link rel="stylesheet" href="/statics/js/bootstrap.min.js" media="all">
		<!-- <link rel="stylesheet" href="/echarts/echarts.min.js" media="all"> -->
		<script type="text/javascript" charset="utf-8" src="/echarts/echarts.min.js"></script>
		<script type="text/javascript" charset="utf-8" src="/echarts/china.js"></script>
		<script type="text/javascript" charset="utf-8" src="/echarts/dataTool.js"></script>
		<style>
			.layui-progress {
		    position: relative;
		    height: 6px;
		    border-radius: 20px;
		    background-color: #e2e2e2;
		}
		h3 {
		    position: absolute;
		    right: 0;
		    top: -15px;
		    color: #999;
		    font-size: 14px;
		}	
		</style>
    </head>
    <body class="childrenBody" onload="monitorD(2)">
    	<div class="layui-fluid">
    		<div class="layui-row layui-col-space15">
    			<div class="layui-col-md4" style="border:1px solid red;height: 500px;">
    				<div style="" class="layui-carousel" id="myCarousel">
    					<div carousel-item style="text-align: center;">
	    					<div style="border:1px solid black;"><img src="${equip.equipic }" /></div>
	    					<div style=""><img src="${equip.equipic }" /></div>
	    					<div style=""><img src="${equip.equipic }" /></div>
    					</div>
    				</div>
    			</div>
    			<div class="layui-col-md8" style="height:500px;border:1px solid red;">
    				<div class="layui-card">
    					<div class="layui-card-header">
    						${equip.ename }
    						<c:if test="${equip.estate1 == '0'}">
    							   <span class="layui-badge" style="width:130px;height:30px;font-size: 15px;text-align: center;line-height: 30px;">该设备出现异常!!!</span>
    						</c:if>
    						<c:if test="${equip.estate1 == '1'}">
    							 <span class="layui-badge layui-bg-green" style="width:130px;height:30px;font-size: 15px;text-align: center;line-height: 30px;">该设备正常运行</span>
    						</c:if>
    						<c:if test="${equip.estate1 == '2'}">
    							 <span class="layui-badge layui-bg-gray" style="width:140px;height:30px;font-size: 15px;text-align: center;line-height: 30px;">该设备正处于维修期</span>
    						</c:if>
    					</div>
    					<div class="layui-card-body">
    						<table class="layui-table">
    							<colgroup>
    								<col width="200" />
    								<col />
    							</colgroup>
    							<tbody>
    								<tr>
    									<td>参数一</td>
    									<td>${equip.eparam1}</td>
    								</tr>
    								<tr>
    									<td>参数二</td>
    									<td>${equip.eparam2}</td>
    								</tr>
    								<tr>
    									<td>参数三</td>
    									<td>${equip.eparam3}</td>
    								</tr>
    								<tr>
    									<td>参数四</td>
    									<td>${equip.eparam4}</td>
    								</tr>
    								<tr>
    									<td>参数五</td>
    									<td>${equip.eparam5}</td>
    								</tr>
    								<tr>
    									<td>参数六</td>
    									<td>${equip.eparam6}</td>
    								</tr>
    								<tr>
    									<td>参数七</td>
    									<td>${equip.eparam7}</td>
    								</tr>
    								<tr>
    									<td>状态一</td>
    									<td>
    										<div class="layui-progress" lay-showpercent="yes">
												<h3 style="padding-bottom: 10px;font-size: 12px;">
													转化率(日同比28%
													<span class="layui-edge layui-edge-top" lay-tips="增长" lay-offset="-15"></span>)
												</h3>
												<div class="layui-progress-bar" lay-percent="65%" style="width: 65%;">
													<span class="layui-progress-text">65%</span>
												</div>
											</div>
    									</td>
    										
    								</tr>
    								<tr>
    									<td>操作</td>
    									<td>
    										<div class="layui-btn-container">
												<a class="layui-btn layui-btn-danger" id="error" onclick="errorNotice(${equip.eid})">异常</a>
												<a class="layui-btn" id="normal"  onclick="normalNotice(${equip.eid})">正常</a>
												<a class="layui-btn layui-btn-normal"  onclick="repairNotice(${equip.eid})">维修</a>
												<input id="eid" type="hidden" value="${equip.eid}">
											</div>
    									</td>
    								</tr>
  									
    							</tbody>
    						</table>
    					</div>
    				</div>
    			</div>
    			<div class="layui-col-md12" style="border:1px solid red;">
    				<div class="layui-col-space15">
    					<div class="layui-col-md6" style="border:1px solid red;">
    						<div class="layui-card">
    							<div class="layui-card-header">
    								设备状态图
    							</div>
    							<div class="layui-card-body">
    								<div class="dataview">
    									 <div id="speedChart" style="display: none;">
    									 
    									 </div>
    									 	<div id="speedChartMain" style="width: 600px; height: 332px;position: relative;"></div>
    								</div>
    							</div>
    						</div>
    					</div>
    					<div class="layui-col-md6" style="border:1px solid red;">
    						<div class="layui-card-header">
    							设备动态监控
    						</div>
    						<div class="layui-card-body">
    							<div class="dynamicMonitor">
    								 <div id="dynamicChart" style="display: none;">
    									
    								</div>
    								<div id="dynamicChartMain" style="width: 600px; height: 332px;position: relative;"></div>
    							</div>
    						</div>
    						
    					</div>
    				</div>
    			</div>
    		</div>
    	</div>
 	</body>
 	<script>
 		layui.use('carousel',function()
 		{
 			var carousel = layui.carousel;
 			carousel.render({
			    elem: '#myCarousel'
			    ,width: '100%' //设置容器宽度
			    ,height: 500
			    ,arrow: 'none' //不显示箭头
			    ,anim: 'fade' //切换动画方式
			  });
 		});
 		function errorNotice(eid){
	 		layui.use(['jquery','layer'],function(){
	 			var $$ = layui.jquery,
	 			layer = layui.layer;
	 			alert(eid);
	 	 			$$.ajax({
	 	 				type:'post',
	 	 				url:'/errorNotice',
	 	 				data:{'eid':eid},
	 	 				dataType:'json',
	 	 				success:function(data){
	 	 					if(data==true){
	 	 						layer.msg("该设备已经为异常设备");
	 	 						var x = 1;
	 	 						monitorD(x);
	 	 						var index = parent.layer.getFrameIndex(window.name);
	 	 						window.location.reload();
	 	 						
	 	 					}
	 	 				}
	 	 			});
	 		})
 		}
 		Date.prototype.format = function(fmt) { 
 		    var o = { 
 		       "M+" : this.getMonth()+1,                 //月份 
 		       "d+" : this.getDate(),                    //日 
 		       "h+" : this.getHours(),                   //小时 
 		       "m+" : this.getMinutes(),                 //分 
 		       "s+" : this.getSeconds(),                 //秒 
 		       "q+" : Math.floor((this.getMonth()+3)/3),  
 		       "S"  : this.getMilliseconds()             //毫秒 
 		   }; 
 		   if(/(y+)/.test(fmt)) {
 		           fmt=fmt.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length)); 
 		   }
 		    for(var k in o) {
 		       if(new RegExp("("+ k +")").test(fmt)){
 		            fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));
 		        }
 		    }
 		   return fmt; 
 		}
 		function monitorD(x){
 			layui.use(['jquery','layer'],function(){
 				var $$ = layui.jquery;
 				
 				$$.ajax({
 					type:'post',
 					url:'/getDetailChart',
 					dataType:'json',
 					data:{"id":1,"x":x},
 					success:function(data){
 						if(data!=null)
 						{
 							alert(data);
 							refreshDp(data);
 							monitorD(2);
 						}
 					
 					},
 					error:function(XmlHttpRequest, textStatus, errorThrown){
 						alert("错误信息:"+XmlHttpRequest.status);
 					}
 				})
 			});
 		}
 		function refreshDp(data){
 			layui.use(['jquery','layer'],function(){
 				var $$ = layui.jquery,
 				layer = layui.layer;
 			
	 			var total = 20;
	 			var ddate = [];
	 			var param = [];
	 			var overHighWarn = [];
	 			 var num = Math.floor(data.length/total);
	 			var num2 = data.length - 20;
	 			alert("num is"+num2);
	 			var eid = $$("#eid").val();
	 			for(var i=num2;i<data.length;i++)
	 			{
	 				if(data[i].dparam<12){
	 					overHighWarn.push(data[i].dparam);
	 				}
	 				
	 			}
	 			for(var i=0;i<data.length;i++){
	 				var coommonTime = new Date(data[i].ddate);
	 				if(coommonTime != null)
	 				{
	 					/* var fmt = (coommonTime.getFullYear() + '-' + (coommonTime.getMonth()+1) + '-' + coommonTime.getDate()).subString(); */
	 					var time = coommonTime.format("yyyy-MM-dd hh:mm:ss");
	 				}
	 				if(i<=total){
	 				
	 					ddate.push(time);
	 					param.push(data[i].dparam);
	 				}
	 				else{
	 					/* var ct = new Date(data[i].ddate).toLocaleString() */
	 					ddate.shift();
	 					param.shift();
	 					ddate.push(time);
	 					param.push(data[i].dparam);
	 				
	 				}
	 			
	 			}
	 			alert(overHighWarn.length);
	 			if(overHighWarn.length>5)
	 			{
	 				
	 				markError(overHighWarn,eid);
	 				
	 			}
	 			option = {
	 				    title : {
	 				        text: '设备动态数据表',
	 				        subtext: '纯属虚构'
	 				    },
	 				    tooltip : {
	 				        trigger: 'axis'
	 				    },
	 				    legend: {
	 				        data:['参数1']
	 				    },
	 				    toolbox: {
	 				        show : true,
	 				        feature : {
	 				            mark : {show: true},
	 				            dataView : {show: true, readOnly: false},
	 				            magicType : {show: true, type: ['line', 'bar']},
	 				            restore : {show: true},
	 				            saveAsImage : {show: true}
	 				        }
	 				    },
	 				    calculable : true,
	 				    xAxis : [
	 				        {
	 				            type : 'category',
	 				            boundaryGap : false,
	 				     		data:ddate
	 				        }
	 				    ],
	 				    yAxis : [
	 				        {
	 				            type : 'value',
	 				          /*   axisLabel : {
	 				                formatter: '{value} °C'
	 				            } */
	 				        }
	 				    ],
	 				    series : [{
	 				    	type:'line',
	 				    	data:param,
	 				    	symbol:'emptyCircle',
	 				    	symbolSize:'3.5',
	 				    	 lineStyle:{  
	 	                         color:'#30dbdb'  
	 	                     },
	 						itemStyle:{
	 							normal:{
	 								label:{
	 									show:true,
	 				    				fontSize:10,
	 				    				position:'top',
	 				    				formatter:function(param)
	 				    				{
	 				    					if(param.value>15)
	 				    					{
	 					    					return param.value + '偏高'
	 				    					}
	 				    					else if(param.value<12)
	 				    					{
	 				    						return param.value + '偏低'
	 				    					}
	 				    				},
	 								},
	 								color:function(param)
	 			    				{
	 			    					if(param.value>15){
	 			    						return '#ff0000';
	 			    					}
	 			    					else if(param.value<12)
	 			    					{
	 			    						return '#ff0000';
	 			    					}
	 			    					else {
	
	 			    				        return '#30dbdb';
	
	 			    				    }
	 			    				}
	 								
	 							},
	 							
	 						},
	 					  	markLine:{
	 				    		symbol:"none",
	 				    		label:{
	 				    			position:"start"
	 				    		},
	 				    		data:[{
	 				    			silent:false,
	 				    			lineStyle:{
	 				    				type:"solid",
	 				    				color:"#30dbdb"
	 				    			},
	 				    			yAxis:15.0
	 				    		}],
	 				    	
	 				    	}
	 				
	 				  
	 				    
	 				    }]
	 				};
	 			 var myChart = echarts.init(document.getElementById('dynamicChartMain'),'macarons'); 
	 			 myChart.setOption(option);
	 			 
	 			
 			})
 		}
 		function markError(overHighWarn,eid)
	 		{
	 			layui.use(['layer','jquery'],
	 					function()
	 					{
	 						var $$ = layui.jquery,
	 						layer = layui.layer;
	 						layer.msg("该设备坏掉了");
	 						errorNotice(eid);
	 						
	 					})
	 		}
 		

 		
 		var dataAll = [
    [
        [10.0, 8.04],
        [8.0, 6.95],
        [13.0, 7.58],
        [9.0, 8.81],
        [11.0, 8.33],
        [14.0, 9.96],
        [6.0, 7.24],
        [4.0, 4.26],
        [12.0, 10.84],
        [7.0, 4.82],
        [5.0, 5.68]
    ],
    [
        [10.0, 9.14],
        [8.0, 8.14],
        [13.0, 8.74],
        [9.0, 8.77],
        [11.0, 9.26],
        [14.0, 8.10],
        [6.0, 6.13],
        [4.0, 3.10],
        [12.0, 9.13],
        [7.0, 7.26],
        [5.0, 4.74]
    ],
    [
        [10.0, 7.46],
        [8.0, 6.77],
        [13.0, 12.74],
        [9.0, 7.11],
        [11.0, 7.81],
        [14.0, 8.84],
        [6.0, 6.08],
        [4.0, 5.39],
        [12.0, 8.15],
        [7.0, 6.42],
        [5.0, 5.73]
    ],
    [
        [8.0, 6.58],
        [8.0, 5.76],
        [8.0, 7.71],
        [8.0, 8.84],
        [8.0, 8.47],
        [8.0, 7.04],
        [8.0, 5.25],
        [19.0, 12.50],
        [8.0, 5.56],
        [8.0, 7.91],
        [8.0, 6.89]
    ]
];

var markLineOpt = {
    animation: false,
    label: {
        normal: {
            formatter: 'y = 0.5 * x + 3',
            textStyle: {
                align: 'right'
            }
        }
    },
    lineStyle: {
        normal: {
            type: 'solid'
        }
    },
    tooltip: {
        formatter: 'y = 0.5 * x + 3'
    },
    data: [[{
        coord: [0, 3],
        symbol: 'none'
    }, {
        coord: [20, 13],
        symbol: 'none'
    }]]
};

option = {
    title: {
        text: 'Anscombe\'s quartet',
        x: 'center',
        y: 0
    },
    grid: [
        {x: '7%', y: '7%', width: '38%', height: '38%'},
        {x2: '7%', y: '7%', width: '38%', height: '38%'},
        {x: '7%', y2: '7%', width: '38%', height: '38%'},
        {x2: '7%', y2: '7%', width: '38%', height: '38%'}
    ],
    tooltip: {
        formatter: 'Group {a}: ({c})'
    },
    xAxis: [
        {gridIndex: 0, min: 0, max: 20},
        {gridIndex: 1, min: 0, max: 20},
        {gridIndex: 2, min: 0, max: 20},
        {gridIndex: 3, min: 0, max: 20}
    ],
    yAxis: [
        {gridIndex: 0, min: 0, max: 15},
        {gridIndex: 1, min: 0, max: 15},
        {gridIndex: 2, min: 0, max: 15},
        {gridIndex: 3, min: 0, max: 15}
    ],
    series: [
        {
            name: 'I',
            type: 'scatter',
            xAxisIndex: 0,
            yAxisIndex: 0,
            data: dataAll[0],
            markLine: markLineOpt
        },
        {
            name: 'II',
            type: 'scatter',
            xAxisIndex: 1,
            yAxisIndex: 1,
            data: dataAll[1],
            markLine: markLineOpt
        },
        {
            name: 'III',
            type: 'scatter',
            xAxisIndex: 2,
            yAxisIndex: 2,
            data: dataAll[2],
            markLine: markLineOpt
        },
        {
            name: 'IV',
            type: 'scatter',
            xAxisIndex: 3,
            yAxisIndex: 3,
            data: dataAll[3],
            markLine: markLineOpt
        }
    ]
};

	var myChart = echarts.init(document.getElementById('speedChartMain')); 
	myChart.setOption(option);
 	</script>
</html>