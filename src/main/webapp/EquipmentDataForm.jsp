<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="../../statics/layui.js" charset="utf-8"></script>
<link rel="stylesheet" href="../../statics/css/layui.css" media="all">
<link rel="stylesheet" href="/statics/js/bootstrap.min.js" media="all">
<!-- <link rel="stylesheet" href="/echarts/echarts.min.js" media="all"> -->
<script type="text/javascript" charset="utf-8" src="/echarts/echarts.min.js"></script>
<script type="text/javascript" charset="utf-8" src="/echarts/china.js"></script>
<script type="text/javascript" charset="utf-8" src="/echarts/dataTool.js"></script>

</head>
<style>
 	/* .demoTable{position: fixed; top:50px; left: 15px; width: 1200px;} */

	/*  .blank{position:fixed;top:300px;height:100px;border:1px solid #F00;} */
	
	
</style>
<body>
		<!-- 图表区域 -->
	<div id="lineChart" style="display: none;">
        <!-- 为 ECharts 准备一个具备大小（宽高）的 DOM -->
        <div id="lineChartMain" style="width: 600px; height: 400px;"></div>
	</div>
	<div id="scatterChart" style="display: none;">
        <!-- 为 ECharts 准备一个具备大小（宽高）的 DOM -->
        <div id="scatterChartMain" style="width: 600px; height: 400px;"></div>
	</div>
	<div id="speedChart" style="display: none;">
        <!-- 为 ECharts 准备一个具备大小（宽高）的 DOM -->
        <div id="speedChartMain" style="width: 600px; height: 400px;"></div>
	</div>
	<div id="mapChart" style="display: none;">
        <!-- 为 ECharts 准备一个具备大小（宽高）的 DOM -->
        <div id="mapChartMain" style="width: 600px; height: 400px;"></div>
	</div>
	<div id="barChart" style="display: none;">
        <!-- 为 ECharts 准备一个具备大小（宽高）的 DOM -->
        <div id="barChartMain" style="width: 600px; height: 400px;"></div>
	</div>
	<div id="K1Chart" style="display: none;">
        <!-- 为 ECharts 准备一个具备大小（宽高）的 DOM -->
        <div id="K1ChartMain" style="width: 600px; height: 400px;"></div>
	</div>
	<div id="radarChart" style="display: none;">
        <!-- 为 ECharts 准备一个具备大小（宽高）的 DOM -->
        <div id="radarChartMain" style="width: 600px; height: 400px;"></div>
	</div>
	<div id="boxChart" style="display: none;">
        <!-- 为 ECharts 准备一个具备大小（宽高）的 DOM -->
        <div id="boxChartMain" style="width: 600px; height: 400px;"></div>
	</div>
	<div id="relationChart" style="display: none;">
        <!-- 为 ECharts 准备一个具备大小（宽高）的 DOM -->
        <div id="relationChartMain" style="width: 600px; height: 400px;"></div>
	</div>
	<div style="margin-bottom: 0px;">

		<ins class="adsbygoogle"
			style="display: inline-block; width: 970px; height:30px"
			data-ad-client="ca-pub-6111334333458862" data-ad-slot="3820120620"></ins>

	</div>
	<div style="margin-bottom: 5px;">
	<blockquote class="layui-elem-quote demoTable">
		<div class="layui-inline">
			<button class="layui-btn" data-type="Anan">折线图</button>
		</div>
		<div class="layui-inline">
			<button class="layui-btn" data-type="bar">散點图</button>
		</div>
		<div class="layui-inline">
			<button class="layui-btn" data-type="pie">饼图</button>
		</div>
		<div class="layui-inline">
			<button class="layui-btn" data-type="realBar">柱状图</button>
		</div>
		<div class="layui-inline">
			<button class="layui-btn" data-type="ChinaMap">中国地图</button>
		</div>
		<div class="layui-inline">
			<button class="layui-btn" data-type="Kline1">K线图1</button>
		</div>
		<div class="layui-inline">
			<button class="layui-btn" data-type="radar">雷达图</button>
		</div>
	
		<div class="layui-inline">
			<button class="layui-btn" data-type="box">箱图图</button>
		</div>
		<div class="layui-inline">
			<button class="layui-btn" data-type="relation">关系图</button>
		</div>
			<div class="layui-inline">
			<button class="layui-btn" data-type="check">检查数据</button>
		</div>
	</blockquote>
	<div style="margin-bottom: 0px;">
		<ins class="adsbygoogle"
			style="display: inline-block; width: 970px; height:20px"
			data-ad-client="ca-pub-6111334333458862" data-ad-slot="3820120620"></ins>

	</div>
	<div class="layui-form equip">
		<table class="layui-table equipmentTable"
			lay-data="{width: 1450, height:500, url:'/queryAllPro', page:true, id:'idTest',method:'post'}"
			lay-filter="demo">
			<colgroup>
				<col width="50">
				<col width="10%">
				<col width="10%">
				<col width="5%">
				<col width="10%">
				<col width="10%">
				<col width="10%">
				<col width="10%">
				<col width="450">
	
			</colgroup>
			<thead class="theadE">
				<tr>
					<th lay-data="{type:'checkbox', fixed: 'left'}"></th>
					<th lay-data="{field:'pid',sort:true}">产品编号</th>
					<th lay-data="{field:'pname', sort: true}">产品名称</th>
					<th lay-data="{field:'pstorage',sort:true}">数量</th>
					<th lay-data="{field:'psaled',sort:true}">销售量</th>
					<th lay-data="{field:'price',sort:true}">单价</th>
					<th lay-data="{field:'rate',sort:true}">变化率</th>
					<th lay-data="{field:'predict',sort:true}">预测销售量</th>
					<th lay-data="{field:'place'}">产地</th>
					
				
	
					<th lay-data="{fixed: 'right', width:178, align:'center', toolbar: '#barDemo'}"></th>
				</tr>
			</thead>
		</table>
	</div>
	</div>


	
	


	<script type="text/html" id="barDemo">
  <a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">查看</a>
  <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
<script type="text/javascript">
	layui.use(['table','jquery','layer'],function()
			{
				var table = layui.table;
				table.on('checkbox(demo)',function(obj){console.log(obj)});
				var $ = layui.$,active={
						check : function()
						{
							var checkStatus = table.checkStatus('idTest'),
							data = checkStatus.data; 
							 layer.alert(JSON.stringify(data));
					
							
						},
						
						Anan : function(obj)
						{
							var x = [];
							var y = [];
							var rate = [];
							var stor = [];
							var con = [];
							var checkStatus = table.checkStatus('idTest'),
							data = checkStatus.data; 
							data.forEach(function(n,i){
								/*  layer.msg(n.price);  */
								
								 x.push(n.pname);
								 y.push(n.price);
								 stor.push(n.pstorage);
								 rate.push(n.rate);
							});
							/* for(var i=0;i<x.length;i++)
								{
									layer.msg(x[i]);
								} */
							option = {
				                    tooltip: {
				                        trigger: 'axis'
				                    },
				                    legend: {
				                        data:["价格","变化率"]
				                    },
				                    grid: {
				                        left: '3%',
				                        right: '4%',
				                        bottom: '3%',
				                        containLabel: true
				                    },
				                    toolbox: {
				                        feature: {
				                            saveAsImage: {}
				                        }
				                    },
				                    xAxis: {
				                        type: 'category',
				                        boundaryGap: false,
				                        data:x
				                    },
				                    yAxis: [{
				                    	type: 'value',
				                        name: '价格',
				                        min: 0,
				                        max: 10,
				                        interval: 5,
				                        axisLabel: {
				                            formatter: '{value}元'
				                        }
				                    },
				                    {
				                        type: 'value',
				                        name: '变化率',
				                        min: -1,
				                        max: 1,
				                        interval: 5,
				                        axisLabel: {
				                            formatter: '{value}'
				                        }
				                    }
				                    ],
				                    series:[
				                    	{
											name:["价格"],
											type:'bar',
											data:y,
											markPoint:{
												data:[
													{type:'max',name:'最大值'},
													{type:'min',name:'最小值'}
												]
											},
											markLine:{
												data:[
													{type:'average',name:'平均值'}
												]
											}
									 	},
									 	{
									 		name:["变化率"],
									 		type:'line',
									 		data:rate,
									 		yAxisIndex: 1
									 	}
									 
									]
				                };
							var myChart = echarts.init(document.getElementById('lineChartMain')); 
							myChart.setOption(option);
							layer.open({
								title:'折线图',
								type:1,
								shade:false,
								area:['620px','460px'],
								content: $("#lineChart"),
								maxmin: true
							});
							/*  $.ajax({
								 url:"getAllMproduct",
							 	 type:"post",
							 	contentType : 'application/json',
							 	dataType:'json',
							 	success:function(data)
							 	{
							 		data.forEach(function(n,i){
							 			layer.msg(n.pname);
							 		});
							 	
							 	} 
							 });*/
							
						},
						pie:function()
						{
							var pname = [];
							var y = [];
							var stor = [];
							var con = [];
							var checkStatus = table.checkStatus('idTest'),
							data = checkStatus.data; 
							data.forEach(function(n,i){
								/*  layer.msg(n.price);  */
								/* var temp = "{name:"+"'"+n.pname+"'"+",value:"+n.pstorage+"}"; */
								var value = JSON.stringify(n.pstorage);
								var name = JSON.stringify(n.pname);
								var temp = {value,name};
								/* alert(temp);
								alert(typeof(temp)); */
								con.push(temp);
								
								pname.push(n.pname);
								 y.push(n.price);
								 stor.push(n.pstorage);
							});
						/* 	 alert(typeof(con)); */ 
							pieOption = {
									title:{
										text:"pie图",
										subtext:"真是pie图",
										x:'center'
									},
				                    tooltip: {
				                    	 show : 'true',
				                    	 trigger : 'item',
				                    	 formatter : "{a} <br/>{b}: {c} ({d}%)"
				                    },
				                    legend: {
				                    	orient : 'vertical',
				                    	x:'left',
				                        data:pname
				                    },
				                    calculable:true,
				                    /* grid: {
				                        left: '3%',
				                        right: '4%',
				                        bottom: '3%',
				                        containLabel: true
				                    }, */
				                    
				                    toolbox: {
				                        show : true,
				                        feature : {
				                            mark : {show: true},
				                            dataView : {show: true, readOnly: false},
				                            magicType : {
				                                show: true, 
				                                type: ['pie', 'funnel'],
				                                option: {
				                                    funnel: {
				                                        x: '25%',
				                                        width: '50%',
				                                        funnelAlign: 'left',
				                                        max: 1548
				                                    }
				                                }
				                            },
				                            restore : {show: true},
				                            saveAsImage : {show: true}
				                        }
				                    },
				                  /*    xAxis: {
				                        type: 'category',
				                        boundaryGap: false,
				                        data:x
				                    }, 
				                    yAxis: {
				                        type: 'value'
				                    }, */
				                    series:[
										
									 	{
									 		name:["数量"],
									 		type:'pie',
									 		radius: ['30%', '60%'],  // 设置环形饼状图， 第一个百分数设置内圈大小，第二个百分数设置外圈大小
								            center: ['50%', '50%'],
									 		data:con,
									 		label : {
									 			//设置饼状图圆心属性
					 			                      //normal,emphasis分别对应正常情况下与悬停效果
					 			                      normal : {
					 			                          show : true,
					 			                         formatter:'{b}: {c}({d}%)'
					 			                         
					 			                         
					 			                     },
					 			                     emphasis : {
					 			                          show : false,
					 			                          textStyle : {
					 			                              fontSize : '20',
					 			                              fontWeight : 'bold'
					 			                          }
					 			                      }
					 			                  },
					 			                  labelLine : {
					 			                      normal : {
					 			                          show : true
					 			                   
					 			                      }
					 			                  },
					 					}
				                    ]
							}
							var cChart = document.getElementById('speedChartMain')
							var autoContainer = function () {
					            //container.clientWidth和container.clientHeight //自适应容器宽和高
					            // window.innerWidth和window.innerHeight//自适应浏览器宽和高
					            cChart.style.width = $(".layui-col-sm12").clientWidth + 'px';
					        };
					        autoContainer();
					        var myChart = echarts.init(document.getElementById('speedChartMain')); 
					        window.onresize = function () {//用于使chart自适应高度和宽度
					            autoContainer();//重置容器高宽
					            myChart.resize();
					        };

							myChart.setOption(pieOption);
							layer.open({
								title:'pie',
								type:1,
								shade:false,
								area:['620px','460px'],
								content: $("#speedChart"),
								maxmin: true
							});
						},
						bar	 : function()
						{
							var x = [];
							var y = [];
							var stor = [];
							var checkStatus = table.checkStatus('idTest'),
							data = checkStatus.data; 
							data.forEach(function(n,i){
								/*  layer.msg(n.price);  */
								
								 x.push(n.pname);
								 y.push(n.price);
								 stor.push(n.pstorage);
							});
							function random(){
							    var r = Math.round(Math.random() * 100);
							    return (r * (r % 2 == 0 ? 1 : -1));
							}

							function randomDataArray() {
							    var d = [];
							    var len = 100;
							    while (len--) {
							        d.push([
							            random(),
							            random(),
							            Math.abs(random()),
							        ]);
							    }
							    return d;
							}
							option = {
								    tooltip : {
								        trigger: 'axis',
								        showDelay : 0,
								        axisPointer:{
								            show: true,
								            type : 'cross',
								            lineStyle: {
								                type : 'dashed',
								                width : 1
								            }
								        }
								    },
								    legend: {
								        data:['scatter1','scatter2']
								    },
								    toolbox: {
								        show : true,
								        feature : {
								            mark : {show: true},
								            dataZoom : {show: true},
								            dataView : {show: true, readOnly: false},
								            restore : {show: true},
								            saveAsImage : {show: true}
								        }
								    },
								    xAxis : [
								        {
								            type : 'value',
								            splitNumber: 4,
								            scale: true
								        }
								    ],
								    yAxis : [
								        {
								            type : 'value',
								            splitNumber: 4,
								            scale: true
								        }
								    ],
								   
								    series : [
								        {
								            name:'scatter1',
								            type:'scatter',
								            symbolSize: function (value){
								                return Math.round(value[2] / 5);
								            },
								            data: randomDataArray(),
								            itemStyle:{
								            	normal:{
								            		color:'rgb(129,227,238)',
								            		shadowColor: 'rgba(25, 100, 150, 0.5)',
								            		shadowBlur: 10
								            	},
								            	 emphasis: {
								                     color: '各异',
								                     barBorderColor: 'rgba(0,0,0,0)',   // 柱条边线
								                     barBorderRadius: 0,                // 柱条边线圆角，单位px，默认为0
								                     barBorderWidth: 1,                 // 柱条边线线宽，单位px，默认为1
								                     label: {
								                         show: false
								                         // position: 默认自适应，水平布局为'top'，垂直布局为'right'，可选为
								                         //           'inside'|'left'|'right'|'top'|'bottom'
								                         // textStyle: null      // 默认使用全局文本样式，详见TEXTSTYLE
								                     }
								                 }
								            }
								            
								        },
								        {
								            name:'scatter2',
								            type:'scatter',
								            symbolSize: function (value){
								                return Math.round(value[2] / 5);
								            },
								            data: randomDataArray()
								        }
								    ]
								};
								var myChart = echarts.init(document.getElementById('scatterChartMain')); 
								myChart.setOption(option);
								layer.open({
									title:'bar',
									type:1,
									shade:false,
									area:['620px','460px'],
									content: $("#scatterChart"),
									maxmin: true
								});
						},
						ChinaMap : function()
						{
							function randomData() {  
							     return Math.round(Math.random()*500);  
							} 
							var mydata = [  
				                {name: '北京',value: '100' },{name: '天津',value: randomData() },  
				                {name: '上海',value: randomData() },{name: '重庆',value: randomData() },  
				                {name: '河北',value: randomData() },{name: '河南',value: randomData() },  
				                {name: '云南',value: randomData() },{name: '辽宁',value: randomData() },  
				                {name: '黑龙江',value: randomData() },{name: '湖南',value: randomData() },  
				                {name: '安徽',value: randomData() },{name: '山东',value: randomData() },  
				                {name: '新疆',value: randomData() },{name: '江苏',value: randomData() },  
				                {name: '浙江',value: randomData() },{name: '江西',value: randomData() },  
				                {name: '湖北',value: randomData() },{name: '广西',value: randomData() },  
				                {name: '甘肃',value: randomData() },{name: '山西',value: randomData() },  
				                {name: '内蒙古',value: randomData() },{name: '陕西',value: randomData() },  
				                {name: '吉林',value: randomData() },{name: '福建',value: randomData() },  
				                {name: '贵州',value: randomData() },{name: '广东',value: randomData() },  
				                {name: '青海',value: randomData() },{name: '西藏',value: randomData() },  
				                {name: '四川',value: randomData() },{name: '宁夏',value: randomData() },  
				                {name: '海南',value: randomData() },{name: '台湾',value: randomData() },  
				                {name: '香港',value: randomData() },{name: '澳门',value: randomData() }  
				            ];
							var option = {  
					                backgroundColor: '#FFFFFF',  
					                title: {  
						                    /* text: '全国地图大数据',  
						                    subtext: '',  
						                    x:'center'   */
					                },  
					                tooltip : {  
					                    trigger: 'item'  
					                },  
					                
					                //左侧小导航图标
					                visualMap: {  
					                    show : true,  
					                    x: 'left',  
					                    y: 'center',  
					                    splitList: [   
					                        {start: 500, end:600},{start: 400, end: 500},  
					                        {start: 300, end: 400},{start: 200, end: 300},  
					                        {start: 100, end: 200},{start: 0, end: 100},  
					                    ],  
					                    color: ['#5475f5', '#9feaa5', '#85daef','#74e2ca', '#e6ac53', '#9fb5ea']  
					                },  
					                
					                //配置属性
					                series: [{  
					                    name: '数据',  
					                    type: 'map',  
					                    mapType: 'china',   
					                    roam: true,  
					                    label: {  
					                        normal: {  
					                            show: true  //省份名称  
					                        },  
					                        emphasis: {  
					                            show: false  
					                        }  
					                    },  
					                    data:mydata  //数据
					                }]  
					            };  
								var myChart = echarts.init(document.getElementById('mapChartMain')); 
								myChart.setOption(option);
								layer.open({
									title:'map',
									type:1,
									shade:false,
									area:['640px','460px'],
									content: $("#mapChart"),
									maxmin: true
								});
							
						},
						realBar:function()
						{
							var x = [];
							var y = [];
							var stor = [];
							var psaled = [];
							var predict=[];
							var checkStatus = table.checkStatus('idTest'),
							data = checkStatus.data; 
							data.forEach(function(n,i){
								/*  layer.msg(n.price);  */
								
								 x.push(n.pname);
								 y.push(n.price);
								 stor.push(n.pstorage);
								 psaled.push(n.psaled);
								 predict.push(n.predict);
							});
							option = {
								    title : {
								        text: '水果销售量和预测销售量',
								        subtext: '纯属虚构'
								    },
								    tooltip : {
								        trigger: 'axis'
								    },
								    legend: {
								        data:['销售量','预测销售量']
								    },
								    toolbox: {
								        show : true,
								        feature : {
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
								            data : x
								        }
								    ],
								    yAxis : [
								        {
								            type : 'value'
								        }
								    ],
								    series : [
								        {
								            name:'销售量',
								            type:'bar',
								            data:psaled,
								            markPoint : {
								                data : [
								                    {type : 'max', name: '最大值'},
								                    {type : 'min', name: '最小值'}
								                ]
								            },
								            markLine : {
								                data : [
								                    {type : 'average', name: '平均值'}
								                ]
								            }
								        },
								        {
								            name:'预测销售量',
								            type:'bar',
								            data:predict,
								            markPoint : {
								                data : [
								                    {name : '最大值', type:'max'},
								                    {name : '最小值', type:'min'}
								                ]
								            },
								            markLine : {
								                data : [
								                    {type : 'average', name : '平均值'}
								                ]
								            }
								        }
								    ]
								};
								var myChart = echarts.init(document.getElementById('barChartMain')); 
								myChart.setOption(option);
								layer.open({
									title:'realBar',
									type:1,
									shade:false,
									area:['640px','460px'],
									content: $("#barChart"),
									maxmin: true
								});
									

						},
						Kline1 : function()
						{
							var upColor = '#ec0000';
							var upBorderColor = '#8A0000';
							var downColor = '#00da3c';
							var downBorderColor = '#008F28';


							// 数据意义：开盘(open)，收盘(close)，最低(lowest)，最高(highest)
							var data0 = splitData([
							    ['2013/1/24', 2320.26,2320.26,2287.3,2362.94],
							    ['2013/1/25', 2300,2291.3,2288.26,2308.38],
							    ['2013/1/28', 2295.35,2346.5,2295.35,2346.92],
							    ['2013/1/29', 2347.22,2358.98,2337.35,2363.8],
							    ['2013/1/30', 2360.75,2382.48,2347.89,2383.76],
							    ['2013/1/31', 2383.43,2385.42,2371.23,2391.82],
							    ['2013/2/1', 2377.41,2419.02,2369.57,2421.15],
							    ['2013/2/4', 2425.92,2428.15,2417.58,2440.38],
							    ['2013/2/5', 2411,2433.13,2403.3,2437.42],
							    ['2013/2/6', 2432.68,2434.48,2427.7,2441.73],
							    ['2013/2/7', 2430.69,2418.53,2394.22,2433.89],
							    ['2013/2/8', 2416.62,2432.4,2414.4,2443.03],
							    ['2013/2/18', 2441.91,2421.56,2415.43,2444.8],
							    ['2013/2/19', 2420.26,2382.91,2373.53,2427.07],
							    ['2013/2/20', 2383.49,2397.18,2370.61,2397.94],
							    ['2013/2/21', 2378.82,2325.95,2309.17,2378.82],
							    ['2013/2/22', 2322.94,2314.16,2308.76,2330.88],
							    ['2013/2/25', 2320.62,2325.82,2315.01,2338.78],
							    ['2013/2/26', 2313.74,2293.34,2289.89,2340.71],
							    ['2013/2/27', 2297.77,2313.22,2292.03,2324.63],
							    ['2013/2/28', 2322.32,2365.59,2308.92,2366.16],
							    ['2013/3/1', 2364.54,2359.51,2330.86,2369.65],
							    ['2013/3/4', 2332.08,2273.4,2259.25,2333.54],
							    ['2013/3/5', 2274.81,2326.31,2270.1,2328.14],
							    ['2013/3/6', 2333.61,2347.18,2321.6,2351.44],
							    ['2013/3/7', 2340.44,2324.29,2304.27,2352.02],
							    ['2013/3/8', 2326.42,2318.61,2314.59,2333.67],
							    ['2013/3/11', 2314.68,2310.59,2296.58,2320.96],
							    ['2013/3/12', 2309.16,2286.6,2264.83,2333.29],
							    ['2013/3/13', 2282.17,2263.97,2253.25,2286.33],
							    ['2013/3/14', 2255.77,2270.28,2253.31,2276.22],
							    ['2013/3/15', 2269.31,2278.4,2250,2312.08],
							    ['2013/3/18', 2267.29,2240.02,2239.21,2276.05],
							    ['2013/3/19', 2244.26,2257.43,2232.02,2261.31],
							    ['2013/3/20', 2257.74,2317.37,2257.42,2317.86],
							    ['2013/3/21', 2318.21,2324.24,2311.6,2330.81],
							    ['2013/3/22', 2321.4,2328.28,2314.97,2332],
							    ['2013/3/25', 2334.74,2326.72,2319.91,2344.89],
							    ['2013/3/26', 2318.58,2297.67,2281.12,2319.99],
							    ['2013/3/27', 2299.38,2301.26,2289,2323.48],
							    ['2013/3/28', 2273.55,2236.3,2232.91,2273.55],
							    ['2013/3/29', 2238.49,2236.62,2228.81,2246.87],
							    ['2013/4/1', 2229.46,2234.4,2227.31,2243.95],
							    ['2013/4/2', 2234.9,2227.74,2220.44,2253.42],
							    ['2013/4/3', 2232.69,2225.29,2217.25,2241.34],
							    ['2013/4/8', 2196.24,2211.59,2180.67,2212.59],
							    ['2013/4/9', 2215.47,2225.77,2215.47,2234.73],
							    ['2013/4/10', 2224.93,2226.13,2212.56,2233.04],
							    ['2013/4/11', 2236.98,2219.55,2217.26,2242.48],
							    ['2013/4/12', 2218.09,2206.78,2204.44,2226.26],
							    ['2013/4/15', 2199.91,2181.94,2177.39,2204.99],
							    ['2013/4/16', 2169.63,2194.85,2165.78,2196.43],
							    ['2013/4/17', 2195.03,2193.8,2178.47,2197.51],
							    ['2013/4/18', 2181.82,2197.6,2175.44,2206.03],
							    ['2013/4/19', 2201.12,2244.64,2200.58,2250.11],
							    ['2013/4/22', 2236.4,2242.17,2232.26,2245.12],
							    ['2013/4/23', 2242.62,2184.54,2182.81,2242.62],
							    ['2013/4/24', 2187.35,2218.32,2184.11,2226.12],
							    ['2013/4/25', 2213.19,2199.31,2191.85,2224.63],
							    ['2013/4/26', 2203.89,2177.91,2173.86,2210.58],
							    ['2013/5/2', 2170.78,2174.12,2161.14,2179.65],
							    ['2013/5/3', 2179.05,2205.5,2179.05,2222.81],
							    ['2013/5/6', 2212.5,2231.17,2212.5,2236.07],
							    ['2013/5/7', 2227.86,2235.57,2219.44,2240.26],
							    ['2013/5/8', 2242.39,2246.3,2235.42,2255.21],
							    ['2013/5/9', 2246.96,2232.97,2221.38,2247.86],
							    ['2013/5/10', 2228.82,2246.83,2225.81,2247.67],
							    ['2013/5/13', 2247.68,2241.92,2231.36,2250.85],
							    ['2013/5/14', 2238.9,2217.01,2205.87,2239.93],
							    ['2013/5/15', 2217.09,2224.8,2213.58,2225.19],
							    ['2013/5/16', 2221.34,2251.81,2210.77,2252.87],
							    ['2013/5/17', 2249.81,2282.87,2248.41,2288.09],
							    ['2013/5/20', 2286.33,2299.99,2281.9,2309.39],
							    ['2013/5/21', 2297.11,2305.11,2290.12,2305.3],
							    ['2013/5/22', 2303.75,2302.4,2292.43,2314.18],
							    ['2013/5/23', 2293.81,2275.67,2274.1,2304.95],
							    ['2013/5/24', 2281.45,2288.53,2270.25,2292.59],
							    ['2013/5/27', 2286.66,2293.08,2283.94,2301.7],
							    ['2013/5/28', 2293.4,2321.32,2281.47,2322.1],
							    ['2013/5/29', 2323.54,2324.02,2321.17,2334.33],
							    ['2013/5/30', 2316.25,2317.75,2310.49,2325.72],
							    ['2013/5/31', 2320.74,2300.59,2299.37,2325.53],
							    ['2013/6/3', 2300.21,2299.25,2294.11,2313.43],
							    ['2013/6/4', 2297.1,2272.42,2264.76,2297.1],
							    ['2013/6/5', 2270.71,2270.93,2260.87,2276.86],
							    ['2013/6/6', 2264.43,2242.11,2240.07,2266.69],
							    ['2013/6/7', 2242.26,2210.9,2205.07,2250.63],
							    ['2013/6/13', 2190.1,2148.35,2126.22,2190.1]
							]);


							function splitData(rawData) {
							    var categoryData = [];
							    var values = []
							    for (var i = 0; i < rawData.length; i++) {
							        categoryData.push(rawData[i].splice(0, 1)[0]);
							        values.push(rawData[i])
							    }
							    return {
							        categoryData: categoryData,
							        values: values
							    };
							}

							function calculateMA(dayCount) {
							    var result = [];
							    for (var i = 0, len = data0.values.length; i < len; i++) {
							        if (i < dayCount) {
							            result.push('-');
							            continue;
							        }
							        var sum = 0;
							        for (var j = 0; j < dayCount; j++) {
							            sum += data0.values[i - j][1];
							        }
							        result.push(sum / dayCount);
							    }
							    return result;
							}



							option = {
							    title: {
							        text: '上证指数',
							        x:'left',
							        y:120
							    },
							    tooltip: {
							        trigger: 'axis',
							        axisPointer: {
							            type: 'cross'
							        }
							    },
							    legend: {
							    	orient:'horizontal',
							    	
							        data: ['日K', 'MA5', 'MA10', 'MA20', 'MA30'],
							        x:'center',
							        y:120
							    },
							    grid: [{
							        left: '20%',
							        bottom: '10%',
							        top: '45%',
							        right: '10%'
							    }],
							    xAxis: {
							        type: 'category',
							        data: data0.categoryData,
							        scale: true,
							        boundaryGap : false,
							        axisLine: {onZero: false},
							        splitLine: {show: false},
							        splitNumber: 20,
							        min: 'dataMin',
							        max: 'dataMax'
							    },
							    yAxis: {
							        scale: true,
							        splitArea: {
							            show: true
							        }
							    },
							    dataZoom: [
							        {
							            type: 'inside',
							            start: 50,
							            end: 100
							        },
							        {
							            show: true,
							            type: 'slider',
							            y: '90%',
							            start: 50,
							            end: 100
							        }
							    ],
							    series: [
							        {
							            name: '日K',
							            type: 'candlestick',
							            data: data0.values,
							            itemStyle: {
							                normal: {
							                    color: upColor,
							                    color0: downColor,
							                    borderColor: upBorderColor,
							                    borderColor0: downBorderColor
							                }
							            },
							            markPoint: {
							                label: {
							                    normal: {
							                        formatter: function (param) {
							                            return param != null ? Math.round(param.value) : '';
							                        }
							                    }
							                },
							                data: [
							                    {
							                        name: 'XX标点',
							                        coord: ['2013/5/31', 2300],
							                        value: 2300,
							                        itemStyle: {
							                            normal: {color: 'rgb(41,60,85)'}
							                        }
							                    },
							                    {
							                        name: 'highest value',
							                        type: 'max',
							                        valueDim: 'highest'
							                    },
							                    {
							                        name: 'lowest value',
							                        type: 'min',
							                        valueDim: 'lowest'
							                    },
							                    {
							                        name: 'average value on close',
							                        type: 'average',
							                        valueDim: 'close'
							                    }
							                ],
							                tooltip: {
							                    formatter: function (param) {
							                        return param.name + '<br>' + (param.data.coord || '');
							                    }
							                }
							            },
							            markLine: {
							                symbol: ['none', 'none'],
							                data: [
							                    [
							                        {
							                            name: 'from lowest to highest',
							                            type: 'min',
							                            valueDim: 'lowest',
							                            symbol: 'circle',
							                            symbolSize: 10,
							                            label: {
							                                normal: {show: false},
							                                emphasis: {show: false}
							                            }
							                        },
							                        {
							                            type: 'max',
							                            valueDim: 'highest',
							                            symbol: 'circle',
							                            symbolSize: 10,
							                            label: {
							                                normal: {show: false},
							                                emphasis: {show: false}
							                            }
							                        }
							                    ],
							                    {
							                        name: 'min line on close',
							                        type: 'min',
							                        valueDim: 'close'
							                    },
							                    {
							                        name: 'max line on close',
							                        type: 'max',
							                        valueDim: 'close'
							                    }
							                ]
							            }
							        },
							        {
							            name: 'MA5',
							            type: 'line',
							            data: calculateMA(5),
							            smooth: true,
							            lineStyle: {
							                normal: {opacity: 0.5}
							            }
							        },
							        {
							            name: 'MA10',
							            type: 'line',
							            data: calculateMA(10),
							            smooth: true,
							            lineStyle: {
							                normal: {opacity: 0.5}
							            }
							        },
							        {
							            name: 'MA20',
							            type: 'line',
							            data: calculateMA(20),
							            smooth: true,
							            lineStyle: {
							                normal: {opacity: 0.5}
							            }
							        },
							        {
							            name: 'MA30',
							            type: 'line',
							            data: calculateMA(30),
							            smooth: true,
							            lineStyle: {
							                normal: {opacity: 0.5}
							            }
							        },

							    ]
							};
							var myChart = echarts.init(document.getElementById('K1ChartMain')); 
							myChart.setOption(option);
							layer.open({
								title:'K-line1',
								type:1,
								shade:false,
								area:['700px','500px'],
								content: $("#K1Chart"),
								maxmin: true
							});
						},
						radar : function()
						{
							var checkStatus = table.checkStatus('idTest'),
							data = checkStatus.data; 
							var x = [];
							var d={};
							for (var i=0;i<data.length;i++)
							{
								d['arr'+i]=[];
								
							}
						
						/* 	alert(data.length); */
							
							 data.forEach(function(n,i){
								d['arr'+i].push(n.pstorage);
								d['arr'+i].push(n.psaled);
								d['arr'+i].push(n.rate);
								d['arr'+i].push(n.predict);
								d['arr'+i].push(n.price);
								
								x.push(n.pname);
								
							}); 
						/* 	alert(d['arr'+0]); */
							var radarData =[];
							for(var i=0;i<data.length;i++)
							{
								radarData.push({
									value:d['arr'+i],
									name:x[i]
								})
							}
			
							option = {
								    title: {
								        text: '基础雷达图'
								    },
								    tooltip: {},
								    legend: {
								        data:x
								    },
								    radar: {
								        // shape: 'circle',
								        name: {
								            textStyle: {
								                color: '#fff',
								                backgroundColor: '#999',
								                borderRadius: 3,
								                padding: [3, 5]
								           }
								        },
								        indicator: [
								           { name: '数量', max: 1000},
								           { name: '销售量', max: 15000},
								           { name: '变化率', max: 1},
								           { name: '预测销售量', max: 15000},
								           { name: '价格', max: 10},
								        ]
								    },
								    series: [{
								        name: '预算 vs 开销（Budget vs spending）',
								        type: 'radar',
								        // areaStyle: {normal: {}},
								        data : radarData
								    }]
								};
							var myChart = echarts.init(document.getElementById('radarChartMain')); 
							myChart.setOption(option);
							layer.open({
								title:'Radar',
								type:1,
								shade:false,
								area:['700px','500px'],
								content: $("#radarChart"),
								maxmin: true
							});
						},
						//箱图
						box:function(){
							var data=[];
							var apoeData = [
								[850,740,900,1070,930],
								[960,940,960,880,800]
							];
							data.push(echarts.dataTool.prepareBoxplotData(apoeData));
							var apofData = [
								[850,740,900,1070,930],
								[960,940,960,940,880]
							]
							data.push(echarts.dataTool.prepareBoxplotData(apofData));
							var apogData = [
								[850,740,900,1070,930],
								[960,940,960,940,880]
							]
							data.push(echarts.dataTool.prepareBoxplotData(apogData));
							option = {
								    title: {
								        text: 'Multiple Categories',
								        left: 'center',
								    },
								    legend: {
								        y: '10%',
								        data: ['apoe','apof','apog']
								    },
								    tooltip: {
								        trigger: 'item',
								        axisPointer: {
								            type: 'shadow'
								        }
								    },
								    grid: {
								        left: '10%',
								        top: '20%',
								        right: '10%',
								        bottom: '15%'
								    },
								    xAxis: {
								        type: 'category',
								        data: data[0].axisData,
								        boundaryGap: true,
								        nameGap: 30,
								        splitArea: {
								            show: true
								        },
								        axisLabel: {
								            formatter: 'gender {value}'
								        },
								        splitLine: {
								            show: false
								        }
								    },
								    yAxis: {
								        type: 'value',
								        name: 'Value',
								        min: 600,
								        max: 1200,
								        splitArea: {
								            show: false
								        }
								    },
								    dataZoom: [
								        {
								            type: 'inside',
								            start: 0,
								            end: 20
								        },
								        {
								            show: true,
								            height: 20,
								            type: 'slider',
								            top: '90%',
								            xAxisIndex: [0],
								            start: 0,
								            end: 20
								        }
								    ],
								    series: [
								        {
								            name: 'apoe',
								            type: 'boxplot',
								            data: data[0].boxData,
								            tooltip: {formatter: formatter}
								        },
								        {
								            name: 'apof',
								            type: 'boxplot',
								            data: data[1].boxData,
								            tooltip: {formatter: formatter}
								        },
								       
								        {
								            name: 'apog',
								            type: 'boxplot',
								            data: data[2].boxData,
								            tooltip: {formatter: formatter}
								        }
								       
								    ]
								};

								function formatter(param) {
								    return [
								        'Experiment ' + param.name + ': ',
								        'upper: ' + param.data[0],
								        'Q1: ' + param.data[1],
								        'median: ' + param.data[2],
								        'Q3: ' + param.data[3],
								        'lower: ' + param.data[4]
								    ].join('<br/>')
								}
								var myChart = echarts.init(document.getElementById('boxChartMain')); 
								myChart.setOption(option);
								layer.open({
									title:'box',
									type:1,
									shade:false,
									area:['620px','460px'],
									content: $("#boxChart"),
									maxmin: true
								});
						},
						relation: function()
						{
							 option = {
							            title: { text: '人民的名义关系图谱' },
							            tooltip: {
							                formatter: function (x) {
							                    return x.data.des;
							                }
							            },
							            grid: {
							            	x: '7%', y: '7%', width: '38%', height: '38%',
									        
									    },	
							            series: [
							                {
							                    type: 'graph',
							                    layout: 'force',
							                    symbolSize: 80,
							                    roam: true,
							                    edgeSymbol: ['circle', 'arrow'],
							                    edgeSymbolSize: [4, 10],
							                    edgeLabel: {
							                        normal: {
							                            textStyle: {
							                                fontSize: 20
							                            }
							                        }
							                    },
							                     force: {
							                        repulsion: 2500,
							                        edgeLength: [10, 50]
							                    }, 
							                    draggable: true,
							                    itemStyle: {
							                        normal: {
							                            color: '#4b565b'
							                        }
							                    },
							                    lineStyle: {
							                        normal: {
							                            width: 2,
							                            color: '#4b565b'

							                        }
							                    },
							                    edgeLabel: {
							                        normal: {
							                            show: true,
							                            formatter: function (x) {
							                                return x.data.name;
							                            }
							                        }
							                    },
							                    label: {
							                        normal: {
							                            show: true,
							                            textStyle: {
							                            }
							                        }
							                    },
							                    data: [
							                        {
							                            name: '侯亮平',
							                            des: '最高检反贪局侦查处处长，汉东省人民检察院副检察长兼反贪局局长。<br/>经过与腐败违法分子的斗争，最终将一批腐败分子送上了审判台，<br/>正义战胜邪恶，自己也迎来了成长。',
							                            symbolSize: 100,
							                            itemStyle: {
							                                normal: {
							                                    color: 'red'
							                                }
							                            }
							                        }, {
							                            name: '李达康',
							                            des: '汉东省省委常委，京州市市委书记。是一个正义无私的好官。<br/>但为人过于爱惜自己的羽毛，对待身边的亲人和朋友显得有些无情。',
							                            itemStyle: {
							                                normal: {
							                                    color: 'red'
							                                }
							                            }
							                        }, {
							                            name: '祁同伟',
							                            des: '汉东省公安厅厅长',
							                            symbolSize: 100
							                        }, {
							                            name: '陈岩石',
							                            des: '离休干部、汉东省检察院前常务副检察长。充满正义，平凡而普通的共 产 党人。<br/>对大老虎赵立春，以各种形式执着举报了十二年。<br/>在这场关系党和国家生死存亡的斗争中，老人家以耄耋高龄，<br/>义无反顾地背起了炸 药包，在反腐胜利前夕因病去世。',
							                            itemStyle: {
							                                normal: {
							                                    color: 'red'
							                                }
							                            }
							                        }, {
							                            name: '陆亦可',
							                            des: '汉东省检察院反贪局一处处长',
							                            itemStyle: {
							                                normal: {
							                                    color: 'red'
							                                }
							                            }
							                        }, {
							                            name: '高育良',
							                            des: '汉东省省委副书记兼政法委书记。年近六十，是一个擅长太极功夫的官场老手。侯亮平、陈海和祁同伟是其学生。',
							                            symbolSize: 100
							                        }, {
							                            name: '沙瑞金',
							                            des: '汉东省省委书记',
							                            itemStyle: {
							                                normal: {
							                                    color: 'red'
							                                }
							                            }
							                        }, {
							                            name: '高小琴',
							                            des: '山水集团董事长，是一位叱咤于政界和商界的风云人物，处事圆滑、精明干练。'
							                        }, {
							                            name: '高小凤'
							                        }, {
							                            name: '赵东来',
							                            des: '汉东省京州市公安局局长，充满正义，整治恶势力，<br/>在与检察部门的合作中从最初的质疑到之后的通力配合。',
							                            itemStyle: {
							                                normal: {
							                                    color: 'red'
							                                }
							                            }
							                        }, {
							                            name: '程度',
							                            des: '汉东省京州市公安局光明区分局局长，因犯错误，被李达康书记和赵东来局长点名要清除公安队伍。<br/>但在高小琴的帮助下，祁同伟调他当上了省公安厅办公室副主任。<br/>尽管程度逃避了所有罪责，上面也有人保他，<br/>但最终还是在反贪局局长侯亮平的缜密侦查下被绳之于法。',
							                        }, {
							                            name: '吴惠芬',
							                            des: '汉东省省委副书记高育良的妻子，汉东大学明史教授。',
							                            itemStyle: {
							                                normal: {
							                                    color: 'red'
							                                }
							                            }
							                        }, {
							                            name: '赵瑞龙',
							                            des: '副国级人物赵立春的公子哥，官二代，打着老子的旗子，<br/>黑白两道通吃，可谓呼风唤雨，权倾一时。',
							                        }, {
							                            name: '赵立春',
							                            des: '副国级领导人，曾经的改革闯将，在权利面前，显得极其渺小。',
							                        }, {
							                            name: '陈海',
							                            itemStyle: {
							                                normal: {
							                                    color: 'red'
							                                }
							                            }
							                        }, {
							                            name: '梁璐',
							                            itemStyle: {
							                                normal: {
							                                    color: 'red'
							                                }
							                            }
							                        }, {
							                            name: '刘新建'
							                        }, {
							                            name: '欧阳菁'
							                        }, {
							                            name: '吴心怡',
							                            itemStyle: {
							                                normal: {
							                                    color: 'red'
							                                }
							                            }
							                        }, {
							                            name: '蔡成功'
							                        }, {
							                            name: '丁义珍'
							                        }
							                    ],
							                    links: [
							                        {
							                            source: '高育良',
							                            target: '侯亮平',
							                            name: '师生',
							                            des: '侯亮平是高育良的得意门生'
							                        }, {
							                            source: '高育良',
							                            target: '祁同伟',
							                            name: '师生'
							                        }, {
							                            source: '赵立春',
							                            target: '高育良',
							                            name: "前领导"
							                        }, {
							                            source: '赵立春',
							                            target: '赵瑞龙',
							                            name: "父子"
							                        }, {
							                            source: '赵立春',
							                            target: '刘新建',
							                            name: "前部队下属"
							                        }, {
							                            source: '李达康',
							                            target: '赵立春',
							                            name: "前任秘书"
							                        }, {
							                            source: '祁同伟',
							                            target: '高小琴',
							                            name: "情人"
							                        }, {
							                            source: '陈岩石',
							                            target: '陈海',
							                            name: "父子"
							                        }, {
							                            source: '陆亦可',
							                            target: '陈海',
							                            name: "属下"
							                        }, {
							                            source: '沙瑞金',
							                            target: '陈岩石',
							                            name: "故人"
							                        }, {
							                            source: '祁同伟',
							                            target: '陈海',
							                            name: "师哥"
							                        }, {
							                            source: '祁同伟',
							                            target: '侯亮平',
							                            name: "师哥"
							                        }, {
							                            source: '侯亮平',
							                            target: '陈海',
							                            name: "同学，生死朋友"
							                        }, {
							                            source: '高育良',
							                            target: '吴惠芬',
							                            name: "夫妻"
							                        }, {
							                            source: '陈海',
							                            target: '赵东来',
							                            name: "朋友"
							                        }, {
							                            source: '高小琴',
							                            target: '高小凤',
							                            name: "双胞胎",
							                            symbolSize: '1'
							                        }, {
							                            source: '赵东来',
							                            target: '陆亦可',
							                            name: "爱慕"
							                        }, {
							                            source: '祁同伟',
							                            target: '程度',
							                            name: "领导"
							                        }, {
							                            source: '高育良',
							                            target: '高小凤',
							                            name: "情人"
							                        }, {
							                            source: '赵瑞龙',
							                            target: '祁同伟',
							                            name: "勾结",
							                            symbolSize: '1',
							                        }, {
							                            source: '李达康',
							                            target: '赵东来',
							                            name: "领导"
							                        }, {
							                            source: '赵瑞龙',
							                            target: '程度',
							                            name: "领导"
							                        }, {
							                            source: '沙瑞金',
							                            target: '李达康',
							                            name: "领导"
							                        }, {
							                            source: '沙瑞金',
							                            target: '高育良',
							                            name: "领导"
							                        }, {
							                            source: '祁同伟',
							                            target: '梁璐',
							                            name: "夫妻"
							                        }, {
							                            source: '吴惠芬',
							                            target: '梁璐',
							                            name: "朋友"
							                        }, {
							                            source: '李达康',
							                            target: '欧阳菁',
							                            name: "夫妻"
							                        }, {
							                            source: '赵瑞龙',
							                            target: '刘新建',
							                            name: "洗钱工具"
							                        }, {
							                            source: '赵瑞龙',
							                            target: '高小琴',
							                            name: "勾结，腐化",
							                            symbolSize: '1'
							                        }, {
							                            source: '赵瑞龙',
							                            target: '高小凤',
							                            name: "腐化"
							                        }, {
							                            source: '吴心怡',
							                            target: '陆亦可',
							                            name: "母女"
							                        }, {
							                            source: '吴心怡',
							                            target: '吴惠芬',
							                            name: "姐妹"
							                        }, {
							                            source: '蔡成功',
							                            target: '侯亮平',
							                            name: "发小"
							                        }, {
							                            source: '蔡成功',
							                            target: '欧阳菁',
							                            name: "举报",
							                            lineStyle: {
							                                normal: {
							                                    type: 'dotted',
							                                    color: '#000'
							                                }
							                            }
							                        }, {
							                            source: '欧阳菁',
							                            target: '刘新建',
							                            name: "举报",
							                            lineStyle: {
							                                normal: {
							                                    type: 'dotted',
							                                    color: '#000'
							                                }
							                            }
							                        }, {
							                            source: '刘新建',
							                            target: '赵瑞龙',
							                            name: "举报",
							                            lineStyle: {
							                                normal: {
							                                    type: 'dotted',
							                                    color: '#000'
							                                }
							                            }
							                        }, {
							                            source: '李达康',
							                            target: '丁义珍',
							                            name: "领导"
							                        }, {
							                            source: '高小琴',
							                            target: '丁义珍',
							                            name: "策划出逃"
							                        }, {
							                            source: '祁同伟',
							                            target: '丁义珍',
							                            name: "勾结"
							                        }, {
							                            source: '赵瑞龙',
							                            target: '丁义珍',
							                            name: "勾结"
							                        }]
							                }
							            ]
							        };
								 var myChart = echarts.init(document.getElementById('relationChartMain')); 
									myChart.setOption(option);
									
									 layer.open({
										title:'relation',
										type:1,
										shade:false,
										area:['700px','560px'],
										content: $("#relationChart"),
										maxmin: true,
										anim:3,                    //动画
										shade: [0.8, '#393D49'],//遮罩层
									});
						}
				};
				$('.demoTable .layui-btn').on('click', function() {
					var type = $(this).data('type');
					active[type] ? active[type].call(this) : '';
				});
			})
</script>
<script>

</script>
</body>
</html>