<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>温度标签折线图</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript" src="js/tagread.js"></script>
<script type="text/javascript" charset="utf-8" src="/echarts/echarts.min.js"></script>
</head>
<body>
	<!-- 为 ECharts 准备一个具备大小（宽高）的 DOM -->
	<div id="main"
		style="width: 100%; height: 700px; border: 1px solid red;"></div>
	<script language="javascript" type="text/javascript">
		   //切记：每隔2秒就会到数据库中以当前时间查询数据；实时插入数据才会显示折线图,如果不插入数据是不会显示折线图

		// 基于准备好的dom，初始化echarts实例
		var myChart = echarts.init(document.getElementById('main'));
		option = {
			title : {
				text : '温度标签动态数据图',
				subtext : '纯属虚构'
			},
			tooltip : {
				trigger : 'axis',
				axisPointer : {
					type : 'cross',
					label : {
						backgroundColor : '#283b56'
					}
				}
			},
			toolbox : {
				show : true,
				feature : {
					dataView : {
						readOnly : false
					},
					restore : {},
					saveAsImage : {}
				}
			},
			dataZoom : {
				show : false,
				start : 0,
				end : 100
			},
			xAxis : [ {
				type : 'category',
				boundaryGap : false,
				name : '时间{时：分：秒}',
				data : date
			} ],
			yAxis : [ {
				type : 'value',
				scale : true,
				name : '温度(℃)',
				max : 120,
				min : -10,
				boundaryGap : [ 0.2, 0.2 ]
			} ]
		};
		myChart.setOption(option);
		setInterval(function() {
			requestData();
			addData(true);
			option = {
				legend : {
					data : function() {
						var list = [];
						for (var i = 0; i < tagNos.length; i++) {
							list.push(tagNos[i]);
						}
						return list;
					}()
				},
				xAxis : [ {
					data : date
				} ],
				series : function() {
					var serie = [];
					var distance = 0;
					for (var i = 0; i < tagCount; i++) {
						var item = {
							name : tagNos[i],
							smooth : true, //数据光滑过度
							type : 'line',
							data : data[i],
							itemStyle : {
								normal : {
									label : {
										show : true,
										distance : distance += 15
									}
								}
							}
						};
						serie.push(item);
					}
					;
					return serie;
				}()
			};
			myChart.setOption(option);
		}, 1000);
	</script>
</body>
</html>
