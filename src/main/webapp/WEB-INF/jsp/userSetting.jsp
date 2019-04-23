<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>


<!DOCTYPE html>
<html>
<head>

<title>添加用户</title>
<meta charset="UTF-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="format-detection" content="telephone=no">
<link rel="stylesheet" href="../../statics/css/layui.css" media="all" />
</head>
<body class="childrenBody">
	<form class="layui-form">

		<div class="layui-form-item">
			<!-- <div class="layui-inline">
				<label class="layui-form-label">自定义属性</label>
				<div class="layui-input-block">
					<input type="checkbox" name="tuijian" class="tuijian" title="推荐">
					<input type="checkbox" name="shenhe" class="newsStatus" title="审核">
					<input type="checkbox" name="show" class="isShow" title="展示">
				</div>
			</div> -->
			<div class="layui-inline">
				<label class="layui-form-label">用户账号</label>
				<div class="layui-input-inline">
					<input name="id" type="text" class="layui-input newsAuthor"
						id="mid" value="${userId}" lay-verify="required" disabled="true" placeholder="请输入用户账号">
				</div>
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">姓名</label>
			<div class="layui-input-inline">
				<input id="mname" name="mname" value="${userName}" type="text" class="layui-input " lay-verify="required" placeholder="请输入姓名">
			</div>
		</div>
		<div class="layui-form-item">
			<div class="layui-inline">
				<label class="layui-form-label">用户权限</label>
				<div class="layui-input-inline">
					<select value="${userType}" id="auth" name="auth" class="newsLook" lay-filter="sel">
						<option value="1">成员</option>
						<option value="2">管理员</option>
					</select>
				</div>
			</div>
			<div class="layui-inline">
				<label class="layui-form-label">用户状态</label>
				<div class="layui-input-inline">
					<select value="${locked}" id="state" name="state" class="newsLook" lay-filter="sel2">
						<option value="0">正常</option>
						<option value="1">锁定</option>
					</select>
				</div>
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">信用积分</label>
			<div class="layui-input-inline">
				<input id="credit" name="credit" value="${credit}" type="text" class="layui-input " placeholder="请输入联系方式">
			</div>
		</div>
		<div class="layui-form-item">
			<div class="layui-input-block">
				<button lay-submit lay-filter="formDemo" class="layui-btn" >立即提交</button>
				<button type="reset" class="layui-btn layui-btn-primary">重置</button>
			</div>
		</div>
	</form>
	<script type="text/javascript" src="../../statics/layui.js"></script>
	<!-- <script type="text/javascript"
		src="\Manage\src\main\webapp\js\newsAdd.js"></script> -->
	<script>
		//监听lay-filter为sel的select组件
		layui.use('form', function() {
			var form = layui.form;
			form.on('select(sel)', function(data) {
				//将select的option值赋给select
				select = data.value;
			});
		});
		layui.use('form', function() {
			var form = layui.form;
			form.on('select(sel2)', function(data) {
				//将select的option值赋给select
				select = data.value;
			});
		});
		layui.use(['form','layer','jquery'], function(){
	        var form = layui.form,
	        layer=layui.layer,
	        $$=layui.jquery;
	        form.on('submit(formDemo)', function(){
	        
	             var id = $$("#mid").val();
	             var name = $$('#mname').val();
	             var auth = $$('#auth').val();
	             var state = $$('#state').val();
	             var credit = $$("#credit").val();
	             $$.ajax({
	            	url:"/setting",
	            	type:"post",
	            	data:{'id':id,'name':name,'auth':auth,'state':state,'credit':credit},
	            	dataType:"json",
	            	success:function(data)
	            	{
	            		var index = parent.layer.getFrameIndex(window.name);
	            		layer.msg("修改成功",{icon:6,time:1000});
	            		setTimeout(function () { parent.layer.close(index) }, 1000);
	            		parent.layui.table.reload('idTest',{page:{curr:1}});
	            		
	            	} 
            });
             return false;
           
	            
	        });
	     });
	</script>
</body>
</html>