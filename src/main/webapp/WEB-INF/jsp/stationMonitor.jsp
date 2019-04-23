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
								<td align="center" colspan="2">
									<button class="layui-btn layui-btn-normal layui-btn-sm">查看详情</button>
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
			/*var icon = new BMap.Icon("markers.png",new BMap.Size(23,25),{
			});*/
			var longtitude=[];
			var latitude = [];
			var sid = [];
			var loca =[];
			var markPoints = [];
			
			<c:forEach items="${info}" var="i" varStatus="status">
				longtitude.push(${i.longtitude});
				latitude.push(${i.latitude});
				loca.push("${i.location}");
				
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
            			branch:i
            		}		
            	)
            } 
            alert(JSON.stringify(markPoints));
             var marker = new BMap.Marker(point);
            map.addOverlay(marker);
            function markFun(points,label,infoWindows){
            	var markers = new BMap.Marker(points);
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
				var info = new BMap.InfoWindow(markPoints[j].con,
						{
							width:200,
							height:200,
						});
				markFun(point,label,info);
			}
		
		</script>
	</body>

</html>