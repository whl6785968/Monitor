<%@ page contentType="text/html;charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>layui</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="stylesheet" href="../../statics/css/layui.css" media="all">
<!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>
	<div style="margin-bottom: 0px;">

		示例-970
		<ins class="adsbygoogle"
			style="display: inline-block; width: 970px; height:20px"
			data-ad-client="ca-pub-6111334333458862" data-ad-slot="3820120620"></ins>

	</div>
	<blockquote class="layui-elem-quote demoTable">
		<div class="layui-inline">
			<div class="layui-input-inline">
				<input type="text" value="" placeholder="请输入关键字"
					id="searchU" class="layui-input search_input">
			</div>
			<a class="layui-btn" data-type="search">查询用户</a>
		</div>
		<div class="layui-inline">
			<!-- <a class="layui-btn layui-btn-normal newsAdd_btn">添加用户</a> -->
			<button class="layui-btn" data-type="getCheckData">获取选中行数据</button>
		</div>
		<div class="layui-inline">
			<!-- <a class="layui-btn recommend" style="background-color:#5FB878">修改用户</a> -->
			<button class="layui-btn" data-type="getCheckLength"
				style="background-color: #5FB878">获取选中数目</button>
		</div>
		<div class="layui-inline">
			<!-- <a class="layui-btn audit_btn">审核用户</a> -->
			<!-- <button class="layui-btn" data-type="isAll">验证是否全选</button> -->
			<a href="addUser2.jsp"><button class="layui-btn">添加用户</button></a>
		</div>
		<div class="layui-inline">
			<!-- <a class="layui-btn layui-btn-danger batchDel">批量删除</a> -->
			<!-- <a class="layui-btn layui-btn-normal newsAdd_btn" id="add">添加用户</a> -->
			<button class="layui-btn" data-type="add"
				id="auser" style="background-color: #5FB672">添加用户</button>
		</div>
		<div class="layui-inline">
			<div class="layui-form-mid layui-word-aux">本页面刷新后除新添加的文章外所有操作无效，关闭页面所有数据重置</div>
		</div>
	</blockquote>
	<!-- <div class="layui-btn-group demoTable">
		<button class="layui-btn" data-type="getCheckData">获取选中行数据</button>
		<button class="layui-btn" data-type="getCheckLength">获取选中数目</button>
		<button class="layui-btn" data-type="isAll">验证是否全选</button>
		<a class="layui-btn layui-btn-normal newsAdd_btn">添加用户</a>
		<a href="addUser.jsp"><button class="layui-btn">添加用户</button></a>
	</div> -->

	<table class="layui-table"
		lay-data="{width: 1200, height:350, url:'/queryAll', page:true, 
		id:'idTest',method:'post',toolbar: 'default',defaultToolbar: ['filter', 'print', 'exports'],totalRow:true}"
		lay-filter="demo">
		<colgroup>
			<col width="50">
			<col width="20%">
			<col width="10%">
			<col width="5%">
			<col width="20%">
			<col width="20%">
			<col width="450">

		</colgroup>
		<thead>
			<tr>
				<th lay-data="{type:'checkbox', fixed: 'left'}"></th>
				<th lay-data="{field:'id',  sort: true, fixed: true}">用户账号</th>
				<th lay-data="{field:'mname'}">姓名</th>
				<th lay-data="{field:'mdate',  sort: true}">日期</th>
				<th lay-data="{field:'auth',sort:true}">权限</th>
				<th lay-data="{field:'email'}">邮箱</th>
				<th lay-data="{field:'links'}">联系方式</th>
				<th lay-data="{field:'others'}">备注</th>

				<th
					lay-data="{fixed: 'right', width:178, align:'center', toolbar: '#barDemo'}"></th>
			</tr>
		</thead>
	</table>

	<script type="text/html" id="barDemo">
  <a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">查看</a>
  <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>

	<script type="text/javascript">
		
	</script>


	<script src="../../statics/layui.js" charset="utf-8"></script>
	<script>
		layui.use([ 'table', 'jquery','laypage' ,'layer'],
						function() {
							var table = layui.table;
							//重点处
							//监听表格复选框选择
							table.on('checkbox(demo)', function(obj) {
								console.log(obj)
							});
							table.on(
											'tool(demo)',
											function(obj) {
												var data = obj.data;
												if (obj.event === 'detail') {
													layer.msg('ID：' + data.id
															+ ' 的查看操作');
												} else if (obj.event === 'del') {
													layer
															.confirm(
																	'真的删除行么',
																	{
																		btn : [
																				'真的确定',
																				'真的取消' ],
																		title : "提示"
																	},
																	function() {
																		var uid = data.id;
																		layer
																				.alert(uid);
																		var url = "${pageContext.request.contextPath}/deleteUser"
																		$
																				.ajax({
																					type : "post",
																					url : url,
																					data : {
																						"id" : uid
																					},
																					dataType : "json",
																					async : false,
																					success : function(
																							data) {
																						layer
																								.alert(data);
																						location
																								.reload();

																						/*  if(data.flag == 1){
																						     layer.msg('删除成功', {icon: 1});
																						     window.setTimeout("javascript:location.href='${ctx }/manage/member/toPage.do'", 2000); 
																						 }else{
																						     layer.msg('删除失败', {icon: 2});
																						 } */
																					}
																				});
																		/* layer.alert(index); */
																		/* obj.del(); */
																		layer
																				.close(this.index);
																	});
												} else if (obj.event === 'edit') {
													
													/* layer.alert('编辑行：<br>'+ JSON.stringify(data)); */
													/*  $.ajax({
														type:"post",
														url:"/checkUser",
														data:{"id":id},
														dataType:json,
														async:false,
														success : function(data)
														{
															layer.alert(data);
														}
													})  */
													/* layer.alert(data.id); */
													var id = data.id;
													var mname = data.mname;
													var mdate = data.mdate;
													var auth = data.auth;
													var email = data.email;
													var links = data.links;
													var others=data.others;
													 var index = layer.open({
														  title: '编辑用户',
														  type: 2,
														  skin: 'layui-layer-rim', //加上边框
														  area: ['1000px', '650px'], //宽高
														  content: "/toUpdate?id="+id+"&mname="+mname+"&mdate="+mdate+"&auth="+auth+
																  "&email="+email+"&links="+links+"&others="+others,
														  success:function(data)
														  {
													
														  }
														}); 
												}
											});
							//监听工具条

							var $ = layui.$, active = {
								getCheckData : function() { //获取选中数据
									var checkStatus = table
											.checkStatus('idTest'), data = checkStatus.data;
									layer.alert(JSON.stringify(data));
								},
								getCheckLength : function() { //获取选中数目
									var checkStatus = table
											.checkStatus('idTest'), data = checkStatus.data;
									layer.msg('选中了：' + data.length + ' 个');
								},
								isAll : function() { //验证是否全选
									var checkStatus = table
											.checkStatus('idTest');
									layer.msg(checkStatus.isAll ? '全选' : '未全选')
								},
								 search : function()
								{
									 
									var text = $("#searchU");
								      //执行重载
								      table.reload('idTest', {
								    	url:"/searchUser",
								    	method:"post",
								        page: {
								          curr: 1 //重新从第 1 页开始
								        }
								        ,where: {
								        	id: text.val()
								        	}
								        });
									/* $.ajax({
										url:"/searchUser",
										type:"post",
										data:{"text":text},
										dataType:"json",
										async:true,
										success:function(data)
										{
											layer.msg(data);
											table.reload('idTest',{
												where : {id:$("#searchU").val()}
											}) 
										}
									})  */
									
										
								}, 
								add:function(){
									layer.msg("happy");
									var index = layer.open({
										  title: '添加用户',
										  type: 2,
										  skin: 'layui-layer-rim', //加上边框
										  area: ['1000px', '650px'], //宽高
										  content: 'addUser2.jsp',
										  success:function()
										  {
											  layer.tips('按x返回', '.layui-layer-setwin .layui-layer-close',{tips:1});

										
											/*   setTimeout(function(index)
											{
												  layer.tips('Hi，我是tips', '#add');
											},500) */
										  }
										});
									/* layer.msg(index); */
								}
						
							
							};

							$('.demoTable .layui-btn').on('click', function() {
								var type = $(this).data('type');
								active[type] ? active[type].call(this) : '';
							});
						});
	</script>

</body>
</html>