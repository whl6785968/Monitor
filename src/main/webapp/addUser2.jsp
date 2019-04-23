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
						id="mid" lay-verify="required" placeholder="请输入用户账号">
				</div>
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">姓名</label>
			<div class="layui-input-inline">
				<input id="mname" name="mname" type="text" class="layui-input " lay-verify="required" placeholder="请输入姓名">
			</div>
		</div>
		<div class="layui-form-item">
			<div class="layui-inline">
				<label class="layui-form-label">日期</label>
				<div class="layui-input-inline">
					<input name="mdate" id="mdate" type="text" class="layui-input newsTime"
					 onclick="layui.laydate({elem:this})">
				</div>
			</div>
			<div class="layui-inline">
				<label class="layui-form-label">权限</label>
				<div class="layui-input-inline">
					<select id="auth" name="auth" class="newsLook" lay-filter="sel">
						<option value="0">正式成员</option>
						<option value="1">临时成员</option>
					</select>
				</div>
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">邮箱</label>
			<div class="layui-input-inline">
				<input id="email" name="email" type="text" class="layui-input " placeholder="请输入邮箱">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">联系方式</label>
			<div class="layui-input-inline">
				<input id="links" name="links" type="text" class="layui-input " placeholder="请输入联系方式">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">备注</label>
			<div class="layui-input-block">
				<textarea  name="others" class="layui-textarea layui-hide" 
					lay-verify="content" id="news_content"></textarea>
			</div>
		</div>
		<!-- lay-submit="" lay-filter="addNews" -->
		<div class="layui-form-item">
			<div class="layui-input-block">
			<!-- 	<button lay-submit lay-filter="formUser" class="layui-btn" >立即提交</button> -->
			<button class="layui-btn" lay-submit lay-filter="*">立即提交</button>
				<button type="reset" class="layui-btn layui-btn-primary">重置</button>
			</div>
		</div>
	</form>
	<script type="text/javascript" src="../../statics/layui.js"></script>
	<script>
		var index;
		layui.use('layedit', function() {
			var layedit = layui.layedit;
			index = layedit.build('news_content', {
				height : 180
			}); //建立编辑器
		});
		var text;
		var select;
		layui.use('layedit', function() {
			var layedit = layui.layedit;
			text = layedit.getContent(index);
		});
		//监听lay-filter为sel的select组件
		layui.use('form', function() {
			var form = layui.form;
			form.on('select(sel)', function(data) {
				//将select的option值赋给select
				select = data.value;
			});
		});
		layui.use(['form','layer','jquery'] ,function(){
			  var form = layui.form,
			  layer = layui.layer,
			  $$ = layui.jquery;
			  form.on('submit(*)', function(data){
			  /*	layer.msg('hello');*/
			     var ds = {};
			  	 ds.id = $$("#mid").val();
			  	 ds.mname=$$('#mname').val();
		         ds.mdate=$$('#mdate').val();
		         ds.auth = $$('#auth').val();
	             ds.email = $$('#email').val();
	             ds.links = $$('#links').val();
	           	 ds.others = $$('#news_content').val(); 
	         /*     layer.msg(links); */
	         	 
	             $$.ajax({
		            	url:"/test11",
		            	type:"post",
		            	contentType : 'application/json',
		            	data:JSON.stringify(ds),
		            	dataType:"json",
		            	success:function(data)
		            	{
		            		var index = parent.layer.getFrameIndex(window.name);
		            		setTimeout(function () { parent.layer.close(index) }, 100);
		            		layer.msg("添加成功");

		            		parent.layui.table.reload('idTest',{page:{curr:1}});
		            		
		            	}
	            });
	             return false;
	           
	             
	             });
		});
			 	
	          /*   function test11(){
	            	
	            }; */
	      

	</script>
</body>
</html>