<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" charset="utf-8" src="/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/jquery.vticker.js"></script>
<script src="../../statics/layui.js" charset="utf-8"></script>
<link rel="stylesheet" href="../../statics/css/layui.css" media="all">
<style type="text/css">
</style>
</head>

<body onbeforeunload="clearAjax()">
	<div>
		<div id="theadTable" style="width:100%">
			<table class="layui-table">
					<colgroup>
						<col width="150" />
						<col width="100" />
						<col width="100" />
						<col width="100" />
						<col width="250" />
						<col width="150" />
					<col />
					</colgroup>
					<tbody>
						<thead>
							<tr>
								<th>id</th>
								<th>姓名</th>
								<th>日期</th>
								<th>权限</th>
								<th>邮箱</th>
								<th>联系方式</th>
								<th>备注</th>
							</tr>
						</thead>
					</tbody>
				</table>
		</div>
		<div id="scrollArea" class="scrollArea" style="width:100%;height:500px;overflow-y:auto">
			
			<table id="scrollTable" class="layui-table">
				<colgroup>
					<col width="150" />
					<col width="100" />
					<col width="100" />
					<col width="100" />
					<col width="250" />
					<col width="150" />
					<col />
				</colgroup>
				<tbody>
				</tbody>
			</table>
		</div>
	</div>
	<button id="kill">杀死session</button>
	<button onclick="clearAjax()">杀死thread</button>
</body>
<script type="text/javascript">
	/* $(function(){
		killSession();
	}) */
	$(function(){
	
		killSession();
		/* add(); */
		alert('NiHaoY');
		var st=0;
		var sh =0;
		var nd = $("#scrollArea").height();
		var myScroll = setInterval(timeScroll,1000);
		
		
		function timeScroll()
		{
			
			sh = $("#scrollArea")[0].scrollHeight;
			if(st+nd<sh)
			{
				st+=100;
				$("#scrollArea").scrollTop(st);
			}
			
			
		}
		setTimeout(function(){
			var wid = ($("#scrollArea").width()+20)+"px";
			$("#scrollArea").css('width',wid);
			
			}, 1000);
			
			
		
	})

	function add()
		{
		    var sub = $("#scrollTable tbody");
		    var req = null;
			if(req != null)
			{
				req.abort();
				alert("abort");
			}
			req = $.ajax({
				type:'post',
				url:'/getScrollData',
				dataType:'json',
				data:{'mark':1},
				success:function(data)
				{
					alert(JSON.stringify(data));
					if(data==null)
					{
						alert("data为Null");
					}
					else
					{
						var l ="";
						 for(var i=0;i<data.length;i++)
						 {
							 l = "<tr style='height:100px'>"+
							 "<td><div class='subDiv'>"+data[i].id+
							 "</div></td><td><div class='subDiv'>"+data[i].mname+
							 "</div></td><td><div class='subDiv'>"+data[i].mdate+
							 "</div></td><td><div class='subDiv'>"+data[i].auth+
							 "</div></td><td><div class='subDiv'>"+data[i].email+
							 "</div></td><td><div class='subDiv'>"+data[i].links+
							 "</div></td><td><div class='subDiv'>"+data[i].others+
								"<tr/>";
							sub.append(l);
						 }
						add();
						 
					}
					
				}
			})
			
		}
	function clearAjax(){
		$.ajax({
			type:'post',
			url:'/clear',
			data:{'mark':2},
			dataType:'json',
			success:function(data)
			{
				if(data!=null)
				{
					alert("clear s")
				}
			}
		})
	}
	 function killSession(){
		$.ajax({
			type:'post',
			url:'/clear',
			data:{'mark':2},
			dataType:'json',
			success:function(data)
			{
				if(data!=null)
				{
					add();
					alert("Session has been successfully slained");
				}
			}
		})
	}
	
		
</script>
</html>