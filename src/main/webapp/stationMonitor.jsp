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
		<link rel="stylesheet" href="http://api.map.baidu.com/library/SearchInfoWindow/1.5/src/SearchInfoWindow_min.css" />
		<script type="text/javascript" charset="utf-8" src="/js/jquery-1.8.3.min.js"></script>
	</head>

	<body>
		<div id="container"></div>
		<c:forEach items="${info }" var="i">
			<div style="display:none" id="${i.sid}">
				<div style="text-align: center">${i.location}</div>
				站点编号:${i.sid}<br />
				负责人:${i.charge}<br />
			</div>
		</c:forEach>
		<input id="info" value="${info}" type="hidden"/>
		
		<script type="text/javascript">
		    var infos = $("#info").val();
		    var longtitude = [];
		    var latitude = [];
		    
		    for(var i=0;i<infos.length;i++)
		    {
		    	longtitude.push(infos[i].longtitude);
		    	latitude.push(infos[i].latitude);
		    }
			var map = new BMap.Map("container");
			var point = new BMap.Point(118.844765, 32.065069);
			map.centerAndZoom(point, 15); // 编写自定义函数，创建标注   
			/*var icon = new BMap.Icon("markers.png",new BMap.Size(23,25),{
			});*/
			
			for(var i=0;i<infos.length;i++)
			{
				var point = new BMap.Point(infos[i].longtitude,infos[i].latitude);
				var marker = new BMap.Marker(point);
				map.addOverlay(marker);
			}
			
		/* 	var t = $("#tt").html();
			var info = new BMap.InfoWindow("t",
				{
					width:220,
					height:110,
					title:"introduce"
				})
			
			marker.addEventListener("click",function(){
					map.openInfoWindow(info,map.getCenter());
				}
			) */
		</script>
	</body>

</html>