<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
<script src="../../statics/layui.js" charset="utf-8"></script>
<link rel="stylesheet" href="../../statics/css/layui.css" media="all">
<link rel="stylesheet" href="/statics/js/bootstrap.min.js" media="all">
<!-- <link rel="stylesheet" href="/echarts/echarts.min.js" media="all"> -->
<script type="text/javascript" charset="utf-8"
	src="/echarts/echarts.min.js"></script>
<script type="text/javascript" charset="utf-8" src="/echarts/china.js"></script>
<script type="text/javascript" charset="utf-8"
	src="/echarts/dataTool.js"></script>
	<script type="text/javascript" charset="utf-8" src="/echarts/macarons.js"></script>
<style>
.layui-col-md6 {
	height: 500px;
	border: 1px red solid;
}
</style>
</head>
<body>
	<div class="layui-fluid">
		<div class="layui-row layui-col-space20">
			<div class="layui-col-md12">
				<div class="layui-col-md6">
					<div id="speedChart" style="display: none;"></div>
					<div id="speedChartMain"
						style="width: 600px; height: 332px; position: relative;"></div>
				</div>
				<div class="layui-col-md6">
					<table class="layui-table">
						<tr>
							<td><button class="layui-btn layui-btn-normal"
									onclick="switchBar()">转换柱状图</button></td>
						</tr>
						<tr>
							<td><button class="layui-btn layui-btn-normal"
									onclick="switchLine()">转换折线图</button></td>
						</tr>
					</table>
				</div>
			</div>

		</div>
	</div>
	
</body>
	<script type="text/javascript">
		var itime = [];
		var tss = [];
		var cod =[];
		var tn =[];
		var tp=[];
		var dis = [];
		var ph = [];
		var temper =[];
		var nhn = [];
		var condu =[];
		
		<c:forEach items="${index}" var="i">
			itime.push("${i.itime}");
			tss.push(${i.tss});
			cod.push(${i.cod});
			tn.push(${i.tn});
			tp.push(${i.tp});
			dis.push(${i.dissolve});
			temper.push(${i.temper});
			nhn.push(${i.nhn});
			condu.push(${i.conductivity});
			
		</c:forEach>
		
		option = {
			    title : {
			        text: '水质参数变化',
			        subtext: '纯属虚构'
			    },
			    tooltip : {
			        trigger: 'axis'
			    },
			    legend: {
			        data:['tss','cod','tn','tp','dissolve','temperture','conductivity'],
			        y:60
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
			    grid: {
			    		/* top:'30%' */
			    		y:110,
			    		y2:20,
			    		x:100
			    	  },
			    calculable : true,
			    xAxis : [
			        {
			            type : 'category',
			            boundaryGap : false,
			            data : itime,
			            boundaryGap:true
			        }
			    ],
			    yAxis : [
			        {
			            type : 'value',
			            name:'各值'
			           /*  axisLabel : {
			                formatter: '{value} °C'
			            } */
			        },
			        {
			            type : 'value',
			             name : '温度',
			            axisLabel : {
			                formatter: '{value} °C'
			            },
			        }
			    ],
			    series : [
			        {
			            name:'tss',
			            type:'line',
			            data:tss,
			          /*   markPoint : {
			                data : [
			                    {type : 'max', name: '最大值'},
			                    {type : 'min', name: '最小值'}
			                ]
			            },
			            markLine : {
			                data : [
			                    {type : 'average', name: '平均值'}
			                ]
			            } */
			        },
			        {
			            name:'cod',
			            type:'line',
			            data:cod
			          
			        },
			        {
			            name:'tn',
			            type:'line',
			            data:tn
			          
			        },
			        {
			            name:'tp',
			            type:'line',
			            data:tp
			          
			        },
			      /*    {
			            name:'nhn',
			            type:'bar',
			            data:nhn
			          
			        }, */
			        {
			            name:'temperture',
			            type:'bar',
			            data:temper,
			            yAxisIndex: 1,
			            barWidth:20,
			            barCateGoryGap:20
			          
			        },
			        {
			            name:'conductivity',
			            type:'line',
			            data:condu
			          
			        }
			    ]
			};
			var myChart = echarts.init(document.getElementById('speedChartMain'),'macarons');
			myChart.setOption(option);
			
			function switchBar()
			{
				myChart.clear();
				option = {
				    tooltip : {
				        trigger: 'axis',
				        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
				            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
				        }
				    },
				    legend: {
				        data: ['tss','cod','tn','tp','dissolve','temperture','conductivity']
				    },
				    grid: {
				        left: '3%',
				        right: '4%',
				        bottom: '3%',
				        containLabel: true
				    },
				    xAxis:  {
				        type: 'value'
				    },
				    yAxis: {
				        type: 'category',
				        data:itime
				    },
				    series: [
				        {
				            name: 'tss',
				            type: 'bar',
				            stack: '总量',
				            label: {
				                normal: {
				                    show: true,
				                    position: 'insideRight'
				                }
				            },
				            data: tss
				        },
				        {
				            name: 'cod',
				            type: 'bar',
				            stack: '总量',
				            label: {
				                normal: {
				                    show: true,
				                    position: 'insideRight'
				                }
				            },
				            data: cod
				        },
				        {
				            name: 'tn',
				            type: 'bar',
				            stack: '总量',
				            label: {
				                normal: {
				                    show: true,
				                    position: 'insideRight'
				                }
				            },
				            data:tn
				        },
				        {
				            name: 'tp',
				            type: 'bar',
				            stack: '总量',
				            label: {
				                normal: {
				                    show: true,
				                    position: 'insideRight'
				                }
				            },
				            data:tp
				        },
				        {
				            name: 'conductivity',
				            type: 'bar',
				            stack: '总量',
				            label: {
				                normal: {
				                    show: true,
				                    position: 'insideRight'
				                }
				            },
				            data: condu
				        }
				    ]
				};
				myChart.setOption(option);
			}
			function switchLine()
			{
				myChart.clear();
				option = {
					    title : {
					        text: '水质参数变化',
					        subtext: '纯属虚构'
					    },
					    tooltip : {
					        trigger: 'axis'
					    },
					    legend: {
					        data:['tss','cod','tn','tp','dissolve','temperture','conductivity'],
					        y:60
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
					    grid: {
					    		/* top:'30%' */
					    		y:110,
					    		y2:20,
					    		x:100
					    	  },
					    calculable : true,
					    xAxis : [
					        {
					            type : 'category',
					            boundaryGap : false,
					            data : itime,
					            boundaryGap:true
					        }
					    ],
					    yAxis : [
					        {
					            type : 'value',
					            name:'各值'
					           /*  axisLabel : {
					                formatter: '{value} °C'
					            } */
					        },
					        {
					            type : 'value',
					             name : '温度',
					            axisLabel : {
					                formatter: '{value} °C'
					            },
					        }
					    ],
					    series : [
					        {
					            name:'tss',
					            type:'line',
					            data:tss,
					          /*   markPoint : {
					                data : [
					                    {type : 'max', name: '最大值'},
					                    {type : 'min', name: '最小值'}
					                ]
					            },
					            markLine : {
					                data : [
					                    {type : 'average', name: '平均值'}
					                ]
					            } */
					        },
					        {
					            name:'cod',
					            type:'line',
					            data:cod
					          
					        },
					        {
					            name:'tn',
					            type:'line',
					            data:tn
					          
					        },
					        {
					            name:'tp',
					            type:'line',
					            data:tp
					          
					        },
					      /*    {
					            name:'nhn',
					            type:'bar',
					            data:nhn
					          
					        }, */
					        {
					            name:'temperture',
					            type:'bar',
					            data:temper,
					            yAxisIndex: 1,
					            barWidth:20,
					            barCateGoryGap:20
					          
					        },
					        {
					            name:'conductivity',
					            type:'line',
					            data:condu
					          
					        }
					    ]
					};
					myChart.setOption(option);
			}
	</script>
</html>