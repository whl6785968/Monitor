<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>

<html>
<head>
<link rel="stylesheet" href="../../statics/css/layui.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form class="layui-form" action="/tes" method="post">
		<div class="layui-inline">
				<label class="layui-form-label">用户账号</label>
				<div class="layui-input-inline">
					<input name="id" type="text" class="layui-input"
						lay-verify="required" placeholder="请输入用户账号">
				</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">姓名</label>
			<div class="layui-input-inline">
				<input name="name" type="text" class="layui-input " lay-verify="required" placeholder="请输入姓名">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">密码</label>
			<div class="layui-input-inline">
				<input name="psw" type="text" class="layui-input " lay-verify="required" placeholder="请输入密码">
			</div>
		</div>
		<div class="layui-form-item">
			<div class="layui-input-block">
				<button lay-submit lay-filter="formDemo" class="layui-btn" >立即提交</button>
				<button type="reset" class="layui-btn layui-btn-primary">重置</button>
			</div>
		</div>
	</form>
</body>
</html>