<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<title>设备清单</title>
		<script src="../../statics/js/bootstrap.min.js"></script>
		<script src="../../statics/layui.js"></script>
		<link rel="stylesheet" href="../../statics/css/layui.css"/>
		<style type="text/css">
			.layui-input-search {
		   		 display: inline-block;
			    vertical-align: middle;
			    height: 32px;
			    border: none;
			    cursor: text;
			    width:300px;
			}
		</style>
	</head>
	<body class="childrenBody">
		<div class="layui-fluid">
			<div class="layui-row layui-col-space15">
				<div class="layui-col-md12" style="">
				<form action="/search">
					  <input name="q" style="width:500px" class="layui-input layui-input-search" type="text" placeholder="搜索..." autocomplete="off" layadmin-event="search" lay-action="/searchEquipByName"/>
			
						 <div class="layui-form-item">
						    <div class="layui-inline">
						      <label class="layui-form-label">Id:范围</label>
						      <div class="layui-input-inline" style="width:50px">
						        <input type="text" name="preId"  autocomplete="off" class="layui-input">
						      </div>
						    </div>
						    <div class="layui-inline">
						      <div class="layui-input-inline" style="width:1px">
						       	-
						      </div>
						    </div>
						    <div class="layui-inline">
						      <div class="layui-input-inline" style="width:50px">
						        <input type="text" name="postId" autocomplete="off" class="layui-input">
						      </div>
						    </div>
						  </div>
					
					 
					  <button type="submit" class="layui-btn">搜索</button>
					  
				</form>
						<a class="layui-btn" href="javascript:importIndex()">导入索引库</a>
				</div>
				<div class="layui-col-md12" style="text-align: center">
					<c:if test="${pageInfo.hasPreviousPage }">
						<a href="/showEquipment?page=${pageInfo.prePage }"><i class="layui-icon layui-icon-prev" style="font-size: 30px; color: #39ac47;"></i></a>
					</c:if>
					第${pageInfo.pageNum}页，共${pageInfo.pages}页
					&nbsp;
					<c:if test="${pageInfo.hasNextPage }">
						<a href="/showEquipment?page=${pageInfo.nextPage }"><i class="layui-icon layui-icon-next" style="font-size: 30px; color: #39ac47;"></i></a>
					</c:if>
				</div>
				<c:forEach items="${pageInfo.list}" var="e">
					<div class="layui-col-md3" style="height:500px;border:1px solid gainsboro;text-align: center;line-height: 50px;">
				 	<a href="javascript:void(0)" onclick="openEquipDetail(${e.eid})"><img height="300px" src="${e.equipic}" alt="aa"/><br /></a> 
					<h2>${e.eid}</h2>
					<c:if test="${e.estate1 == '0'}">
    							   <span class="layui-badge" style="width:130px;height:30px;font-size: 15px;text-align: center;line-height: 30px;">该设备出现异常!!!</span>
    						</c:if>
    						<c:if test="${e.estate1 == '1'}">
    							 <span class="layui-badge layui-bg-green" style="width:130px;height:30px;font-size: 15px;text-align: center;line-height: 30px;">该设备正常运行</span>
    						</c:if>
    						<c:if test="${e.estate1 == '2'}">
    							 <span class="layui-badge layui-bg-gray" style="width:140px;height:30px;font-size: 15px;text-align: center;line-height: 30px;">该设备正处于维修期</span>
    						</c:if>
					
					 <a href="javascript:void(0)" onclick="openEquipDetail(${e.eid})"><p>${e.ename}
					 		
					 </p></a> 
		
					 <input type="hidden" id="equipId" value="${e.eid }"/> 
				</div>
				</c:forEach>
				
			</div>
		</div>
		
	</body>
	<script type="text/javascript">
		
		function importIndex()
		{
			layui.use(['layer','jquery'],function(){
				var layer = layui.layer,
				$$ = layui.jquery;
				alert("fesiable");
				$$.ajax({
					type:"post",
					url:"/importIndex",
					dataType:"json",
					success:function(data)
					{
						if(data!=null)
						{
							layer.msg("导入成功");
						}
						else
						{
							layer.msg("导入失败");
						}
					}
				})
			})
		}
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
</html>