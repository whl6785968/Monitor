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
		data-options="rownumbers:true,singleSelect:true,url:'/getDetailData',method:'get',toolbar:'#tb'" pagination="true">
		<thead>
			<tr>
				<th data-options="field:'iid',width:80,align:'center'">站点编号</th>
				<th data-options="field:'itime',width:150,align:'center',formatter: DateTimeFormatter">时间</th>
				<th data-options="field:'tss',width:70,align:'center'">tss</th>
				<th data-options="field:'cod',width:70,align:'center'">cod</th>
				<th data-options="field:'tn',width:70,align:'center'">tn</th>
				<th data-options="field:'tp',width:70,align:'center'">tp</th>
				<th data-options="field:'dissolve',width:100,align:'center'">dissolve</th>
				<th data-options="field:'ph',width:70,align:'center'">ph</th>
				<th data-options="field:'temper',width:70,align:'center'">temper</th>
				<th data-options="field:'nhn',width:70,align:'center'">nhn</th>
				<th data-options="field:'conductivity',width:70,align:'center'">conductivity</th>
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
		
			Date From: <input id="from" class="easyui-datebox" style="width: 80px">
			To: <input id="to" class="easyui-datebox" style="width: 80px">
			station: <select id="sid" class="easyui-combobox" panelHeight="auto" style="width: 100px">
				<option value="0">--显示全部--</option>
				<option value="1">玄武区</option>
				<option value="2">句容市</option>
				<option value="3">江宁区</option>
				<option value="4">秦淮区</option>
			</select>
			Choose: <select id="op" class="easyui-combobox" panelHeight="auto" style="width: 100px">
				<option value="0">--显示全部--</option>
				<option value="1">显示当天数据</option>
				<option value="2">显示昨天数据</option>
				<option value="3">显示近7天数据</option>
				<option value="4">显示近30天数据</option>
				<option value="5">显示本周数据</option>
				<option value="6">显示上周数据</option>
			</select>
			Choose: <select id="op2" class="easyui-combobox" panelHeight="auto" style="width: 100px">
				<option value="0">--显示全部--</option>
				<option value="1">显示本月数据</option>
				<option value="2">显示上一月数据</option>
				<option value="3">显示本季度数据</option>
				<option value="4">显示上季度数据</option>
				<option value="5">显示本年数据</option>
			</select>
			<a href="javascript:search()" class="easyui-linkbutton" iconCls="icon-search">Search</a>
		</div>
	</div>

	<div id="dlg" class="easyui-dialog"
		style="width: 400px; height: 500px; padding: 10px 20px" closed="true"
		buttons="#dlg-buttons">
		<form id="fm" method="post">
			<div class="fitem">
				<label style="width:100px">站点编号:       </label> <input id ="iid" name="iid"
					class="easyui-validatebox" required="true">
			</div>
			<div class="fitem">
				<label style="width:100px">时间:</label> <input id="itime" name="itime"
					class="easyui-validatebox" required="true">
			</div>
			<div class="fitem">
				<label>tss:       </label> <input id="tss" name="tss">
			</div>
			<div class="fitem">
				<label>cod:   </label> <input id="cod" name="cod" class="easyui-validatebox">
			</div>
			<div class="fitem">
				<label>tn:      </label> <input id="tn" name="tn" class="easyui-validatebox">
			</div>
			<div class="fitem">
				<label>tp:            </label> <input id="tp" name="tp" class="easyui-validatebox">
			</div>
			<div class="fitem">
				<label>dissolve:           </label> <input id="dissolve" name="dissolve" class="easyui-validatebox">
			</div>
			<div class="fitem">
				<label>ph:           </label> <input id="ph" name="ph" class="easyui-validatebox">
			</div>
			<div class="fitem">
				<label>temper:           </label> <input id="temper" name="temper" class="easyui-validatebox">
			</div>
			<div class="fitem">
				<label>nhn:           </label> <input id="nhn" name="nhn" class="easyui-validatebox">
			</div>
			<div class="fitem">
				<label>conductivity:           </label> <input id="conductivity" name="conductivity" class="easyui-validatebox">
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
	
	function search()
	{
		$('#dg').datagrid('load',{
			from:$("#from").val(),
			to:$("#to").val(),
			op:$("#op").val()
			
		});
	}
	Date.prototype.format = function(fmt) { 
	    var o = { 
	       "M+" : this.getMonth()+1,                 //月份 
	       "d+" : this.getDate(),                    //日 
	       "h+" : this.getHours(),                   //小时 
	       "m+" : this.getMinutes(),                 //分 
	       "s+" : this.getSeconds(),                 //秒 
	       "q+" : Math.floor((this.getMonth()+3)/3), //季度 
	       "S"  : this.getMilliseconds()             //毫秒 
	   }; 
	   if(/(y+)/.test(fmt)) {
	           fmt=fmt.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length)); 
	   }
	    for(var k in o) {
	       if(new RegExp("("+ k +")").test(fmt)){
	            fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));
	        }
	    }
	   return fmt; 
	}       
	function DateTimeFormatter(value) {
	    if (value == undefined) {
	        return "";
	    }
	 	var commontTime = new Date(value);
	    return commontTime.format("yyyy-MM-dd hh:mm:ss");
	}
	
</script>
</html>