<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="../../themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="../../themes/icon.css">
<link rel="stylesheet" type="text/css" href="../../css/demo.css">
<script type="text/javascript" src="../../js/jquery.min.js"></script>
<script type="text/javascript" src="../../js/jquery.easyui.min.js"></script>
</head>
<body>
	<div style="margin: 20px 0;"></div>
	<table id="dg" class="easyui-datagrid" title="DataGrid Complex Toolbar"
		style="width: 100%; height: 500px"
		data-options="rownumbers:true,singleSelect:true,url:'/getStationData',method:'get',toolbar:'#tb'" pagination="true">
		<thead>
			<tr>
				<th data-options="field:'sid',width:80">站点编号</th>
				<th data-options="field:'did',width:80,align:'right'">站点所属区域</th>
				<th data-options="field:'charge',width:100">站点名称</th>
				<th data-options="field:'location',width:100">站点负责人</th>
				<th data-options="field:'slevel',width:80,align:'right'">站点水质</th>
				<th data-options="field:'longtitude',width:240">经度</th>
				<th data-options="field:'latitude',width:60,align:'center'">纬度</th>
			</tr>
		</thead>
	</table>
	<div id="tb" style="padding: 5px; height: auto">
		<div style="margin-bottom: 5px">
			<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true"
				onclick="addInfo()"></a> 
			<a href="#" class="easyui-linkbutton"
				iconCls="icon-edit" plain="true" onclick="editInfo()"></a> 
			<a href="#" class="easyui-linkbutton" iconCls="icon-remove"
				plain="true" onclick="removeInfo()"></a>
			<a href="#"
				class="easyui-linkbutton" iconCls="icon-save" plain="true"></a> 
			<a href="#" class="easyui-linkbutton" iconCls="icon-cut" plain="true"></a>
			
		</div>
		<div>
		
			Date From: <input class="easyui-datebox" style="width: 80px">
			To: <input class="easyui-datebox" style="width: 80px">
			District: <select id="dist" class="easyui-combobox" panelHeight="auto" style="width: 100px">
				<option value="1">玄武区</option>
				<option value="2">句容市</option>
				<option value="3">江宁区</option>
				<option value="4">秦淮区</option>
			</select> 
			<a href="javascript:search()" class="easyui-linkbutton" iconCls="icon-search">Search</a>
		</div>
	</div>

	<div id="dlg" class="easyui-dialog"
		style="width: 400px; height: 500px; padding: 10px 20px" closed="true"
		buttons="#dlg-buttons">
		<form id="fm" method="post">
			<div class="fitem">
				<label style="width:100px">站点编号:       </label> <input id ="sid" name="sid"
					class="easyui-validatebox" required="true">
			</div>
			<div class="fitem">
				<label style="width:100px">站点所属区域:</label> <input id="did" name="did"
					class="easyui-validatebox" required="true">
			</div>
			<div class="fitem">
				<label>站点名称:       </label> <input id="location" name="location">
			</div>
			<div class="fitem">
				<label>站点负责人:   </label> <input id="charge" name="charge" class="easyui-validatebox">
			</div>
			<div class="fitem">
				<label>站点水质:      </label> <input id="slevel" name="slevel" class="easyui-validatebox">
			</div>
			<div class="fitem">
				<label>经度:            </label> <input id="lgt" name="longtitude" class="easyui-validatebox">
			</div>
			<div class="fitem">
				<label>纬度:           </label> <input id="lat" name="latitude" class="easyui-validatebox">
			</div>
		</form>
	</div>
	<div id="dlg-buttons">
		<a href="#" class="easyui-linkbutton" iconCls="icon-ok"
			onclick="saveUser()">Save</a> <a href="#" class="easyui-linkbutton"
			iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')">Cancel</a>
	</div>
</body>
<script type="text/javascript">
	var url;
	function addInfo(){
		$('#dlg').dialog('open').dialog('setTitle','添加新站点');
		$('#fm').form('clear');
	 	url = '/insertStation';
	}

	function saveUser(){
		if(!$('#fm').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return ;
		}
		$.post(url,$("#fm").serialize(), function(data){
		
			if(data=!null){
				$.messager.alert('提示','新增/修改商品成功!');
				$('#dlg').dialog('close');
				$('#dg').datagrid('reload');
			}
		});
	}
	
	function editInfo()
	{
		var row = $('#dg').datagrid('getSelected');
		var rsid = $("#sid");
		if (row){
			$('#dlg').dialog('open').dialog('setTitle','Edit User');
			 $('#fm').form('load',row); 
			$('#sid').attr("disabled",true);
			 url="/editStation";
		}
	}
	function removeInfo()
	{
		var row = $('#dg').datagrid('getSelected');
		alert(row.sid);
		if (row){
			$.messager.confirm('Confirm','Are you sure you want to destroy this station?',function(r){
				if (r){
					$.post('/removeInfo',{'sid':row.sid},function(data){
							if(data!=null)
							{
								$.messager.alert('提示','删除商品成功!');
								$('#dg').datagrid('reload');
							}
						
					},'json');
				}
			});
		}

	}
	
	/* function search()
	{
		var did = $("#dist").val();
		alert(did);
		$.ajax({
			type:'post',
			data:{'did':did},
			url:'/searchStation',
			success:function(data)
			{
				if(data !=null)
				{
					$('#dg').datagrid('reload');
				}
			}
		})
		
	} */
	function search()
	{
		$('#dg').datagrid('load',{
			dist: $('#dist').val(),
			
		});
	}

</script>
</html>