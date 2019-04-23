<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

	<head>
		<meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>Hello, World</title>
		<style type="text/css">
			html {
				height: 100%
			}
			
			body {
				height: 100%;
				margin: 0px;
				padding: 0px
			}
			
			#container {
				height: 100%
			}
		</style>
		<script type="text/javascript" src="http://api.map.baidu.com/api?v=3.0&ak=xoKsurOO9lwXDwRt57TMef0A4eZ5m2ir">
			//v3.0版本的引用方式：src="http://api.map.baidu.com/api?v=3.0&ak=您的密钥"
		</script>
		<script type="text/javascript" src="http://api.map.baidu.com/library/SearchInfoWindow/1.5/src/SearchInfoWindow_min.js"></script>
		<link rel="stylesheet" href="http://api.map.baidu.com/library/SearchInfoWindow/1.5/src/Sea
		rchInfoWindow_min.css" />
		<script type="text/javascript" charset="utf-8" src="/js/jquery-1.8.3.min.js"></script>
		<link rel="stylesheet" href="../../statics/css/layui.css" media="all">
			<script src="../../statics/layui.js" charset="utf-8"></script>
	</head>

	<body>
		<div id="container"></div>
		<c:forEach items="${info }" var="i">
			<div  style="display:hidden" class="sid" id="${i.sid}">
				<div class="layui-form" style="display:hidden">
					<table style="display:hidden" class="layui-table">
						<colgroup>
							<col width="120"/>
							<col />
						</colgroup>
						<thead>
							<tr>
								<th colspan="2"><i class="layui-icon layui-icon-release" style="font-size: 30px; color: #1E9FFF;"></i>  
								${i.location }</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>
									站点编号:
								</td>
								<td>
									${i.sid }
								</td>
							</tr>
							<tr>
								<td>
									站点负责人:
								</td>
								<td>
									${i.charge}
								</td>
							</tr>
							<tr>
								<td>
									水质质量:
								</td>
								<td>
									${i.slevel}
								</td>
							</tr>
							<tr>
								<td align="center" colspan="2">
									<a href="javascript:openDetatil(${i.sid})" class="layui-btn layui-btn-normal layui-btn-sm">查看详情</a>
								</td>
								
							</tr>
						</tbody>
					</table>
					
				</div>
			</div>
		</c:forEach>
		<input type="hidden" id="infos" value="${info}">
		
		<script type="text/javascript">
			var map = new BMap.Map("container");
			var point = new BMap.Point(118.844765, 32.065069);
			map.centerAndZoom(point, 10); // 编写自定义函数，创建标注 
			map.enableScrollWheelZoom(true);
			map.addControl(new BMap.NavigationControl());
			map.addControl(new BMap.GeolocationControl());
			map.addControl(new BMap.OverviewMapControl());
			map.addControl(new BMap.MapTypeControl());
			//http://developer.baidu.com/map/jsdemo/img/fox.gif
		
			
			var longtitude=[];
			var latitude = [];
			var sid = [];
			var loca =[];
			var markPoints = [];
			var slevel = [];
			<c:forEach items="${info}" var="i" varStatus="status">
				longtitude.push(${i.longtitude});
				latitude.push(${i.latitude});
				loca.push("${i.location}");
				slevel.push(Math.floor(${i.slevel}));
				/* markPoints.push(
	            		{
	            			y:${i.longtitude},
	            			x:${i.latitude},
	            			title:"${i.location}",
	            			con:sids[${status.count}],
	            			branch:${status.count}
	            		});	 */
				
       	 </c:forEach>
			
			var sids = document.getElementsByClassName("sid");
		
             for(var i=0;i<sids.length;i++)
            {
            	markPoints.push(
            		{
            			y:longtitude[i],
            			x:latitude[i],
            			title:loca[i],
            			con:sids[i],
            			branch:slevel[i]
            		}		
            	)
            } 
         /*    alert(JSON.stringify(markPoints)); */
             var marker = new BMap.Marker(point);
            map.addOverlay(marker);
            function markFun(points,label,icon,infoWindows){
            	var markers = new BMap.Marker(points,{icon:myIcon});
            	map.addOverlay(markers);
            	markers.setLabel(label);
            	markers.addEventListener("click",function(event){
            		map.openInfoWindow(infoWindows,points);
            	})
            }
           var j =0;
			for( ;j<markPoints.length;j++)
			{
				var point = new BMap.Point(markPoints[j].y,markPoints[j].x);
				var label = new BMap.Label(markPoints[j].branch,{
	                    offset:new BMap.Size(25,5)
	                });
				if(markPoints[j].branch==1)
				{
					var myIcon = new BMap.Icon("/imgs/mark2.png",new BMap.Size(35,40),
							{
							   anchor: new BMap.Size(10, 15),   
							}
						);
				}
				if(markPoints[j].branch==2)
				{
					var myIcon = new BMap.Icon("/imgs/mark3.png",new BMap.Size(35,40),
							{
							   anchor: new BMap.Size(10, 15),   
							}
						);
				}
				if(markPoints[j].branch==3)
				{
					var myIcon = new BMap.Icon("/imgs/mark4.png",new BMap.Size(35,40),
							{
							   anchor: new BMap.Size(10, 15),   
							}
						);
				}
				if(markPoints[j].branch==4)
				{
					var myIcon = new BMap.Icon("/imgs/mark5.png",new BMap.Size(35,40),
							{
							   anchor: new BMap.Size(10, 15),   
							}
						);
				}
					
				var info = new BMap.InfoWindow(markPoints[j].con,
						{
							width:200,
							height:250,
						});
				markFun(point,label,myIcon,info);
			};
			
			
			function openDetatil(sid){
				layui.use(['layer','jquery'],function(){
					var layer = layui.layer,
					$$ = layui.jquery;
			/* 		var eid = $$("#equipId").val(); */
					$$(window).one("resize",function(){
						var index = layer.open({
							title :'站点详情',
							type:2,
							maxmin: true,
							resize:true,
							skin: 'layui-layer-rim', 
							area: ['1500px', '850px'],
							content:'/showStationQuality?sid='+sid,
							success:function(){
								 layer.tips('按x返回', '.layui-layer-setwin .layui-layer-close',{tips:1});
							}
						})
						layer.full(index);
					}).resize();
					
				})
			}
		
		</script>
	</body>

</html>