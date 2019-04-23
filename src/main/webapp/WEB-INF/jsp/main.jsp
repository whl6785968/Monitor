<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<title></title>
<script src="../../statics/layui.js" charset="utf-8"></script>
<link rel="stylesheet" href="../../statics/css/layui.css" media="all">
<link rel="stylesheet" href="/statics/js/bootstrap.min.js" media="all">
<!-- <link rel="stylesheet" href="/echarts/echarts.min.js" media="all"> -->
<script type="text/javascript" charset="utf-8"
	src="/echarts/echarts.min.js"></script>
<script type="text/javascript" charset="utf-8" src="/echarts/china.js"></script>
<script type="text/javascript" charset="utf-8"
	src="/echarts/dataTool.js"></script>
</head>
<style>
html {
	background-color: #f2f2f2;
	color: #666;
}

.layadmin-shortcut {
	position: relative;
	width: 100%;
	height: 100%;
	overflow: hidden;
}

a {
	color: #333;
	text-decoration: none;
}

.layadmin-shortcut li .layui-icon {
	display: inline-block;
	width: 100%;
	height: 60px;
	line-height: 60px;
	text-align: center;
	border-radius: 2px;
	font-size: 30px;
	background-color: #F8F8F8;
	color: #333;
	transition: all .3s;
	-webkit-transition: all .3s;
}

a cite {
	font-style: normal;
	*cursor: pointer;
}

.layadmin-shortcut li {
	text-align: center;
}

.layadmin-backlog-body h3 {
	padding-bottom: 10px;
	font-size: 12px;
}

.layadmin-backlog .layadmin-backlog-body {
	color: #999;
}

.layadmin-backlog-body p cite {
	font-style: normal;
	font-size: 30px;
	font-weight: 300;
	color: #009688;
}

.layadmin-backlog .layadmin-backlog-body {
	display: block;
	padding: 10px 15px;
	background-color: #f8f8f8;
	color: #999;
	border-radius: 2px;
	transition: all .3s;
	-webkit-transition: all .3s;
}

.layui-edge-top {
	top: -4px;
	border-bottom-color: #999;
	border-bottom-style: solid;
}

.layui-progress {
	position: relative;
	height: 6px;
	border-radius: 20px;
	background-color: #e2e2e2;
}

.layadmin-takerates .layui-progress {
	margin: 50px 0 60px;
}

.layui-card-header {
	position: relative;
	height: 42px;
	line-height: 42px;
	padding: 0 15px;
	border-bottom: 1px solid #f6f6f6;
	color: #333;
	border-radius: 2px 2px 0 0;
	font-size: 14px;
}

.layui-card-body {
	position: relative;
	padding: 10px 15px;
	padding-top: 10px;
	line-height: 24px;
}

.layadmin-takerates {
	padding-top: 5px;
}

.layadmin-takerates .layui-progress-bar {
	text-align: left;
}

.layui-progress-bar {
	position: absolute;
	left: 0;
	top: 0;
	width: 0;
	max-width: 100%;
	height: 6px;
	border-radius: 20px;
	text-align: right;
	background-color: #5FB878;
	transition: all .3s;
	-webkit-transition: all .3s;
}

.layadmin-takerates .layui-progress-text {
	top: -35px;
	line-height: 26px;
	font-size: 26px;
}

.layui-progress-text {
	position: relative;
	top: -20px;
	line-height: 18px;
	font-size: 12px;
	color: #666;
}

.layadmin-takerates .layui-progress h3 {
	position: absolute;
	right: 0;
	top: -35px;
	color: #999;
	font-size: 14px;
}

.layui-card {
	margin-bottom: 15px;
	border-radius: 2px;
	background-color: #fff;
	box-shadow: 0 1px 2px 0 rgba(0, 0, 0, .05);
}
</style>

<body class="childrenBody" onload="someDetail()">
	<div class="layui-fluid">
		<div class="layui-row layui-col-space15">
			<div class="layui-col-md8">
				<div class="layui-row layui-col-space15">
					<div class="layui-col-md6">
						<div class="layui-card">
							<div class="layui-card-header">功能</div>
							<div class="layui-card-body">
								<div class="layadmin-shortcut">
									<ul class="layui-col-space10 layui-this">
										<li class="layui-col-md3"><a> <i
												class="layui-icon layui-icon-console"> </i> <cite>主页一</cite>
										</a></li>
										<li class="layui-col-md3"><a> <i
												class="layui-icon layui-icon-chart"> </i> <cite>主页二</cite>
										</a></li>
										<li class="layui-col-md3"><a> <i
												class="layui-icon layui-icon-template-1"> </i> <cite>弹层</cite>
										</a></li>
										<li class="layui-col-md3"><a> <i
												class="layui-icon layui-icon-chat"> </i> <cite>聊天</cite>
										</a></li>
										<li class="layui-col-md3"><a> <i
												class="layui-icon layui-icon-find-fill"> </i> <cite>进度条</cite>
										</a></li>
										<li class="layui-col-md3"><a> <i
												class="layui-icon layui-icon-survey"> </i> <cite>调查</cite>
										</a></li>
										<li class="layui-col-md3"><a> <i
												class="layui-icon layui-icon-user"> </i> <cite>用户</cite>
										</a></li>
										<li class="layui-col-md3"><a> <i
												class="layui-icon layui-icon-set"> </i> <cite>设置</cite>
										</a></li>
									</ul>
								</div>
							</div>
						</div>
					</div>
					<div class="layui-col-md6">
						<div class="layui-card">
							<div class="layui-card-header">设备详情</div>
							<div class="layui-card-body">
								<div class="layadmin-backlog">
									<ul class="layui-row layui-col-space10 layui-this">
										<li class="layui-col-md6"><a
											class="layadmin-backlog-body">
												<h3>正常设备</h3>
												<p>
													<cite>${norCount}</cite>
												</p>
										</a></li>
										<li class="layui-col-md6"><a
											class="layadmin-backlog-body">
												<h3>异常设备</h3>
												<p>
													<cite>${errCount }</cite>
												</p>
										</a></li>
										<li class="layui-col-md6"><a
											class="layadmin-backlog-body">
												<h3>维修设备</h3>
												<p>
													<cite>99</cite>
												</p>
										</a></li>
										<li class="layui-col-md6"><a
											class="layadmin-backlog-body">
												<h3>其他</h3>
												<p>
													<cite>20</cite>
												</p>
										</a></li>
									</ul>
								</div>
							</div>
						</div>
					</div>
					<div class="layui-col-md12">
						<div class="layui-card">
							<div class="layui-card-header">数据概览</div>
							<div class="layui-card-body">
								<div class="layadmin-dataview">
									<div id="speedChart" style="display: none;"></div>
									<!-- ä¸º ECharts åå¤ä¸ä¸ªå·å¤å¤§å°ï¼å®½é«ï¼ç DOM -->

									<div id="speedChartMain"
										style="width: 811px; height: 332px; position: relative;"></div>
								</div>
							</div>
						</div>
						<div class="layui-card">
							<div class="layui-card-header">数据概览</div>
							<div class="layui-card-body">
								<div class="layadmin-dataview">
									<div id="lineChart" style="display: none;"></div>
									<!-- ä¸º ECharts åå¤ä¸ä¸ªå·å¤å¤§å°ï¼å®½é«ï¼ç DOM -->

									<div id="lineChartMain"
										style="width: 811px; height: 332px; position: relative;"></div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="layui-col-md4">
				<div class="layui-card">
					<div class="layui-card-header">异常设备</div>
					<div class="layui-card-body layui-text">
						<table class="layui-table">
							<colgroup>
								<col width="100" />
								<col />
							</colgroup>
							<tbody>
								<c:forEach items="${errEquip}" var="e">
									<tr>
									<td> <a href="javascript:void(0)" onclick="openEquipDetail(${e.eid})">${e.eid}</a></td>
									<td><span class="layui-badge" style="width:130px;height:30px;font-size: 15px;text-align: center;line-height: 30px;">该设备出现异常!!!</span></td>
									</tr>
								</c:forEach>
							
								<tr>
									<td>渠道</td>
									<td>
										<div class="layui-btn-container">
											<a class="layui-btn layui-btn-danger">你好</a> <a
												class="layui-btn">我不好</a>
										</div>

									</td>
								</tr>


							</tbody>
						</table>
					</div>
				</div>
				<div class="layui-card">
					<div class="layui-card-header">效果报告 </div>
					<div class="layui-card-body layadmin-takerates">
						<div class="layui-progress" lay-showpercent="yes">
							<h3>
								转化率(日同比28% )<span class="layui-edge layui-edge-top"
									lay-tips="å¢é¿" lay-offset="-15"></span>)
							</h3>
							<div class="layui-progress-bar" lay-percent="65%"
								style="width: 65%;">
								<span class="layui-progress-text">65%</span>
							</div>
						</div>
						<div class="layui-progress" lay-showpercent="yes">
							<h3>
								转化率(日同比28% ) <span class="layui-edge layui-edge-top"
									lay-tips="å¢é¿" lay-offset="-15"></span>)
							</h3>
							<div class="layui-progress-bar" lay-percent="65%"
								style="width: 65%;">
								<span class="layui-progress-text">65%</span>
							</div>
						</div>
					</div>
				</div>
				<div class="layui-card">
					<div class="layui-card-header">实时监控</div>
					<div class="layui-card-body layadmin-takerates">
						<div class="layui-progress" lay-showpercent="yes">
							<h3>
								转化率(日同比28% )<span class="layui-edge layui-edge-top"
									lay-tips="å¢é¿" lay-offset="-15"></span>)
							</h3>
							<div class="layui-progress-bar" lay-percent="65%"
								style="width: 65%;">
								<span class="layui-progress-text">65%</span>
							</div>
						</div>
						<div class="layui-progress" lay-showpercent="yes">
							<h3>
								转化率(日同比28% ) <span class="layui-edge layui-edge-top"
									lay-tips="å¢é¿" lay-offset="-15"></span>)
							</h3>
							<div class="layui-progress-bar" lay-percent="65%"
								style="width: 65%;">
								<span class="layui-progress-text">65%</span>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
<script>
/* 	function someDetail(){
		layui.use(['layer','jquery'],function(){
			var $$ = layui.jquery,
			layer = layui.layer;
			$$.ajax({
				type:'post',
				url:'/showMainDetail',
				dataType:'json',
				success:function(data)
				{
					
				}
			})
		})
	} */
	var dataAll = [
			[ [ 10.0, 8.04 ], [ 8.0, 6.95 ], [ 13.0, 7.58 ], [ 9.0, 8.81 ],
					[ 11.0, 8.33 ], [ 14.0, 9.96 ], [ 6.0, 7.24 ],
					[ 4.0, 4.26 ], [ 12.0, 10.84 ], [ 7.0, 4.82 ],
					[ 5.0, 5.68 ] ],
			[ [ 10.0, 9.14 ], [ 8.0, 8.14 ], [ 13.0, 8.74 ], [ 9.0, 8.77 ],
					[ 11.0, 9.26 ], [ 14.0, 8.10 ], [ 6.0, 6.13 ],
					[ 4.0, 3.10 ], [ 12.0, 9.13 ], [ 7.0, 7.26 ], [ 5.0, 4.74 ] ],
			[ [ 10.0, 7.46 ], [ 8.0, 6.77 ], [ 13.0, 12.74 ], [ 9.0, 7.11 ],
					[ 11.0, 7.81 ], [ 14.0, 8.84 ], [ 6.0, 6.08 ],
					[ 4.0, 5.39 ], [ 12.0, 8.15 ], [ 7.0, 6.42 ], [ 5.0, 5.73 ] ],
			[ [ 8.0, 6.58 ], [ 8.0, 5.76 ], [ 8.0, 7.71 ], [ 8.0, 8.84 ],
					[ 8.0, 8.47 ], [ 8.0, 7.04 ], [ 8.0, 5.25 ],
					[ 19.0, 12.50 ], [ 8.0, 5.56 ], [ 8.0, 7.91 ],
					[ 8.0, 6.89 ] ] ];

	var markLineOpt = {
		animation : false,
		label : {
			normal : {
				formatter : 'y = 0.5 * x + 3',
				textStyle : {
					align : 'right'
				}
			}
		},
		lineStyle : {
			normal : {
				type : 'solid'
			}
		},
		tooltip : {
			formatter : 'y = 0.5 * x + 3'
		},
		data : [ [ {
			coord : [ 0, 3 ],
			symbol : 'none'
		}, {
			coord : [ 20, 13 ],
			symbol : 'none'
		} ] ]
	};

	option = {
		title : {
			text : 'Anscombe\'s quartet',
			x : 'center',
			y : 0
		},
		grid : [ {
			x : '7%',
			y : '7%',
			width : '38%',
			height : '38%'
		}, {
			x2 : '7%',
			y : '7%',
			width : '38%',
			height : '38%'
		}, {
			x : '7%',
			y2 : '7%',
			width : '38%',
			height : '38%'
		}, {
			x2 : '7%',
			y2 : '7%',
			width : '38%',
			height : '38%'
		} ],
		tooltip : {
			formatter : 'Group {a}: ({c})'
		},
		xAxis : [ {
			gridIndex : 0,
			min : 0,
			max : 20
		}, {
			gridIndex : 1,
			min : 0,
			max : 20
		}, {
			gridIndex : 2,
			min : 0,
			max : 20
		}, {
			gridIndex : 3,
			min : 0,
			max : 20
		} ],
		yAxis : [ {
			gridIndex : 0,
			min : 0,
			max : 15
		}, {
			gridIndex : 1,
			min : 0,
			max : 15
		}, {
			gridIndex : 2,
			min : 0,
			max : 15
		}, {
			gridIndex : 3,
			min : 0,
			max : 15
		} ],
		series : [ {
			name : 'I',
			type : 'scatter',
			xAxisIndex : 0,
			yAxisIndex : 0,
			data : dataAll[0],
			markLine : markLineOpt
		}, {
			name : 'II',
			type : 'scatter',
			xAxisIndex : 1,
			yAxisIndex : 1,
			data : dataAll[1],
			markLine : markLineOpt
		}, {
			name : 'III',
			type : 'scatter',
			xAxisIndex : 2,
			yAxisIndex : 2,
			data : dataAll[2],
			markLine : markLineOpt
		}, {
			name : 'IV',
			type : 'scatter',
			xAxisIndex : 3,
			yAxisIndex : 3,
			data : dataAll[3],
			markLine : markLineOpt
		} ]
	};

	var myChart = echarts.init(document.getElementById('speedChartMain'));
	myChart.setOption(option);
	
	
	function openEquipDetail(eid){
		layui.use(['layer','jquery'],function(){
			var layer = layui.layer,
			$$ = layui.jquery;
	/* 		var eid = $$("#equipId").val(); */
			alert(eid);
			$$(window).one("resize",function(){
				var index = layer.open({
					title :'设备详情',
					type:2,
					maxmin: true,
					resize:true,
					skin: 'layui-layer-rim', 
					area: ['1500px', '850px'],
					content:'/showEquipDetailed?eid='+eid,
					success:function(){
						 layer.tips('按x返回', '.layui-layer-setwin .layui-layer-close',{tips:1});
					}
				})
				layer.full(index);
			}).resize();
			
			/* layer.msg('sss'); */
		})
		
	}
</script>

<script>
	var base = +new Date(1968, 9, 3);
	var oneDay = 24 * 3600 * 1000;
	var date = [];

	var data = [ Math.random() * 300 ];

	for (var i = 1; i < 20000; i++) {
		var now = new Date(base += oneDay);
		date.push([ now.getFullYear(), now.getMonth() + 1, now.getDate() ]
				.join('/'));
		data.push(Math.round((Math.random() - 0.5) * 20 + data[i - 1]));
	}

	option = {
		tooltip : {
			trigger : 'axis',
			position : function(pt) {
				return [ pt[0], '10%' ];
			}
		},
		title : {
			left : 'center',
			text : 'å¤§æ°æ®éé¢ç§¯å¾',
		},
		toolbox : {
			feature : {
				dataZoom : {
					yAxisIndex : 'none'
				},
				restore : {},
				saveAsImage : {}
			}
		},
		xAxis : {
			type : 'category',
			boundaryGap : false,
			data : date
		},
		yAxis : {
			type : 'value',
			boundaryGap : [ 0, '100%' ]
		},
		dataZoom : [
				{
					type : 'inside',
					start : 0,
					end : 10
				},
				{
					start : 0,
					end : 10,
					handleIcon : 'M10.7,11.9v-1.3H9.3v1.3c-4.9,0.3-8.8,4.4-8.8,9.4c0,5,3.9,9.1,8.8,9.4v1.3h1.3v-1.3c4.9-0.3,8.8-4.4,8.8-9.4C19.5,16.3,15.6,12.2,10.7,11.9z M13.3,24.4H6.7V23h6.6V24.4z M13.3,19.6H6.7v-1.4h6.6V19.6z',
					handleSize : '80%',
					handleStyle : {
						color : '#fff',
						shadowBlur : 3,
						shadowColor : 'rgba(0, 0, 0, 0.6)',
						shadowOffsetX : 2,
						shadowOffsetY : 2
					}
				} ],
		series : [ {
			name : '大数据图',
			type : 'line',
			smooth : true,
			symbol : 'none',
			sampling : 'average',
			itemStyle : {
				color : 'rgb(255, 70, 131)'
			},
			areaStyle : {
				color : new echarts.graphic.LinearGradient(0, 0, 0, 1, [ {
					offset : 0,
					color : 'rgb(255, 158, 68)'
				}, {
					offset : 1,
					color : 'rgb(255, 70, 131)'
				} ])
			},
			data : data
		} ]
	};
	var linechart = echarts.init(document.getElementById('lineChartMain'));
	linechart.setOption(option);
</script>
</html>