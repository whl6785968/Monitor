<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="../../statics/css/layui.css">
<script src="../../statics/layui.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div style="width: 500px;height: 600px;margin: 0 auto;">
    <div style="width: 500px; height: 200px"></div>
    <form class="layui-form" action="/logSuc" method="post">
        <div class="layui-form-item">
            <label class="layui-form-label">用户名:</label>
            <div class="layui-input-inline">
                <input type="text" name="username" id="username" required  lay-verify="required" placeholder="请输入用户名" autocomplete="off" class="layui-input">
            </div>
            <div id="checkUN" class="layui-form-mid layui-word-aux"></div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">密码:</label>
            <div class="layui-input-inline">
                <input type="password" name="password" id="password" required lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" id="submit" lay-submit lay-filter="tau">登录</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>
    </form>
</div>
</body>
<script type="text/javascript">
	layui.use(['form','jquery','layer'],function(){
		var form = layui.form,
		$$ = layui.jquery,
		layer = layui.layer;
		form.on('submit(tau)',function(){
			var name = $$("#username").val();
			var pwd = $$("#password").val();
			var flag = 0;
			$$.ajax({
				type:"post",
				url:"/checkLog",
				data:{"uname":name,"pwd":pwd},
				dataType:"json",
				async:false, 
				success:function(data)
				{
					flag = data;
					alert(data);
				}
			});
			
			switch(flag)
			{
				case 0:
					return true;
				case 1:
					layer.msg("用户不存在");
					return false;
				case 2:
					layer.msg("密码错误");
					return false;
				case 3:
					layer.msg("用户被锁定");
					return false;
			}
		});
	});
	layui.use(['jquery','layer'],function()
			{
				var layer = layui.layer,
				$$ = layui.jquery;
				$$(document).ready(function()
				{
					check();					
				});
				function check()
				{
					
					
					$$("#username").blur(function(){
						var name = $$("#username").val();
					/* 	alert(name); */
						$$.ajax({
							type:"post",		
							url:"/checkMuser",
							data:{"uname":name},
						/* 	contentType:'application/json', */
							dataType:"json",
							success:function(data)
							{
								if(data==true)
								{
									   document.getElementById("checkUN").innerHTML ="    <i class=\"layui-icon layui-icon-ok-circle\" style=\"font-size: 30px; color: #39ac47;\"></i>\n" ;
								}
								else
								{
									 document.getElementById("checkUN").innerHTML = "用户名不存在";
								}
							}
							
						});
					});
					
				};
				
				
				
			})
</script>
</html>