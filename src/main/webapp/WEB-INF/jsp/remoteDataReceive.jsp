<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="../../statics/layui.js" charset="utf-8"></script>
<link rel="stylesheet" href="../../statics/css/layui.css" media="all">
<link rel="stylesheet" href="/statics/js/bootstrap.min.js" media="all">
<script type="text/javascript" charset="utf-8" src="/echarts/echarts.min.js"></script>
</head>
<body>
<h3>远程数据接收</h3>
<a class="layui-btn layui-btn-danger" href="javascript:receive()">开启端口</a>
	 <table class="layui-table">
		<colgroup>
			<col width="100" />
			<col width="100"/>
			<col />
		</colgroup>
		<tbody>
			<c:forEach items="${remote}" var="r">
				<tr>
				<td>${r.id}</td>
				<td>${r.price }</td>
				<td>${r.num }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table> 
</body>
<script type="text/javascript">
	function receive()
	{
		layui.use(['layer','jquery'],function(){
			var $$ = layui.jquery,
			layer = layui.layer;
			
			$$.ajax({
				type:'post',
				url:'/startPort',
				dataType:'json',
				success:function(data)
				{
					alert(data);
				}
			})
		})
	}
</script>
</html>