<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
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
    <body class="childrenBody">
    	<div class="layui-fluid">
    		<div class="layui-col-space15">
    			<div class="layui-col-md4" style="border:1px solid red;height: 500px;">
    				<div class="layui-carousel">
    					<img src="echarts-2.2.7/doc/asset/ico/chord.png" />
    				</div>
    			</div>
    			<div class="layui-col-md8" style="height:500px;border:1px solid red;">
    				<div class="layui-card">
    					<div class="layui-card-header">
    						产品名称
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
    									<td>1.2</td>
    								</tr>
    								<tr>
    									<td>参数二</td>
    									<td>1.5</td>
    								</tr>
    								<tr>
    									<td>参数三</td>
    									<td>1.8</td>
    								</tr>
    								<tr>
    									<td>参数四</td>
    									<td>2.1</td>
    								</tr>
    								<tr>
    									<td>参数五</td>
    									<td>2.4</td>
    								</tr>
    								<tr>
    									<td>参数六</td>
    									<td>2.7</td>
    								</tr>
    								<tr>
    									<td>参数七</td>
    									<td>3.0</td>
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
												<a class="layui-btn layui-btn-danger">异常</a>
												<a class="layui-btn">正常</a>
												<a class="layui-btn layui-btn-normal">维修</a>
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
    						
    					</div>
    				</div>
    			</div>
    		</div>
    	</div>
 	</body>
 	<script>
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