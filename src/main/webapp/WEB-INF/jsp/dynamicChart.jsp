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
<script type="text/javascript" charset="utf-8" src="/echarts/macarons.js"></script>
</head>
<body onload="longpolling();monitorD()">
	
	<div id="dynamicChart" style="display: none;">
        <!-- 为 ECharts 准备一个具备大小（宽高）的 DOM -->
        
	</div>
	<div class="layui-fluid">
		<div class="layui-row layui-col-space15">
			<div>
				<a href="javascript:longpolling()" class="layui-btn">按我</a>
			</div>
			<div class="layui-card">
				<div class="layui-card-header">
					<h1>动态数据展示</h1>
				</div>
				<div class="layui-card-body">
					<div class="dataview">
						 <div id="dynamicChart" style="display: none;">
						 
						 </div>
						 <div id="dynamicChartMain" style="width: 600px; height: 332px;position: relative;"></div>
					</div>
				</div>
			</div>
			<div class="layui-col-md6">
				<div class="layui-card-header">
						<h1>动态数据展示</h1>
					</div>
					<div class="layui-card-body">
						<div class="dataview">
							 <div id="dynamicChart" style="display: none;">
							 
							 </div>
							 <div id="shiftApushChartMain" style="width: 600px; height: 332px;position: relative;"></div>
						</div>
					</div>
				</div>
			</div>
		</div>
	
</body>
<script type="text/javascript">
	Date.prototype.format = function(fmt) { 
	    var o = { 
	       "M+" : this.getMonth()+1,                 //月份 
	       "d+" : this.getDate(),                    //日 
	       "h+" : this.getHours(),                   //小时 
	       "m+" : this.getMinutes(),                 //分 
	       "s+" : this.getSeconds(),                 //秒 
	       "q+" : Math.floor((this.getMonth()+3)/3), //季度 
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

	function longpolling(){
		layui.use(['jquery','layer'],function(){
			var $$ = layui.jquery;
			
			$$.ajax({
				type:'post',
				url:'/getDynamicChart',
				dataType:'json',
				data:{"id":1},
				success:function(data){
					if(data!=null)
					{
						alert(data);
						refreshData(data);
						longpolling();
					}
				
				},
				error:function(XmlHttpRequest, textStatus, errorThrown){
					alert("错误信息:"+XmlHttpRequest.status);
				}
			})
		});
	}
	function refreshData(data){
		var rowData = [];
		var x =[]
		for(var i=0;i<data.length;i++){
			rowData.push(data[i].eparam1);
			x.push(data[i].ename);	
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
			     		data:x
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
			    	type:'bar',
			    	data:rowData
			    }]
			};
		 var myChart = echarts.init(document.getElementById('dynamicChartMain'),'macarons'); 
		 myChart.setOption(option);
	};
	
	function monitorD(){
		layui.use(['jquery','layer'],function(){
			var $$ = layui.jquery;
			
			$$.ajax({
				type:'post',
				url:'/getDpChart',
				dataType:'json',
				data:{"id":1},
				success:function(data){
					if(data!=null)
					{
						alert(data);
						refreshDp(data);
						monitorD();
					}
				
				},
				error:function(XmlHttpRequest, textStatus, errorThrown){
					alert("错误信息:"+XmlHttpRequest.status);
				}
			})
		});
	}
	function refreshDp(data){
		var total = 20;
		var ddate = [];
		var param = [];
		var overHighWarn = [];
		for(var i=0;i<data.length;i++){
			var coommonTime = new Date(data[i].ddate);
			if(coommonTime != null)
			{
				/* var fmt = (coommonTime.getFullYear() + '-' + (coommonTime.getMonth()+1) + '-' + coommonTime.getDate()).subString(); */
				var time = coommonTime.format("yyyy-MM-dd hh:mm:ss");
			}
			if(i<=total){
				if(data[i].dparam<12)
				{
					overHighWarn.push(data[i].dparam);
				}
				ddate.push(time);
				param.push(data[i].dparam);
			}
			else{
				/* var ct = new Date(data[i].ddate).toLocaleString() */
				ddate.shift();
				param.shift();
				ddate.push(time);
				param.push(data[i].dparam);
				if(data[i].dparam<12)
				{
					overHighWarn.push(data[i].dparam);
				}
				
			}
		
		}
		alert(overHighWarn.length);
		if(overHighWarn.length>3)
		{
			
			markError(overHighWarn);
			
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
		 var myChart = echarts.init(document.getElementById('shiftApushChartMain'),'macarons'); 
		 myChart.setOption(option);
	
	}
	function markError(overHighWarn)
	{
		layui.use(['layer','jquery'],
				function()
				{
					var $$ = layui.jquery,
					layer = layui.layer;
					alert("该设备坏掉了");
					alert(overHighWarn);
					
				})
	}

	

	

</script>
</html>