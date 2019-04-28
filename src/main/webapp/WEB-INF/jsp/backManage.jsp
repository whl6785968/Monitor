<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
	<meta charset="UTF-8">
	<title>Basic Layout - jQuery EasyUI Demo</title>
	<link rel="stylesheet" type="text/css" href="../../themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="../../themes/icon.css">
	<link rel="stylesheet" type="text/css" href="../../css/demo.css">
	<script type="text/javascript" src="../../js/jquery.min.js"></script>
	<script type="text/javascript" src="../../js/jquery.easyui.min.js"></script>
</head>
<body>
	<!-- <div style="margin:20px 0;"></div> -->
	<div class="easyui-layout" style="width:1750px;height:750px;">
		<div data-options="region:'north'" style="height:50px"></div>
		<div data-options="region:'south',split:true" style="height:50px;"></div>
		<div data-options="region:'east',split:true" title="East" style="width:300px;">
		
		</div>
		<div data-options="region:'west',split:true" title="West" style="width:300px;">
				<div class="easyui-panel" style="padding:5px">
				<ul id="tree">
					<!-- <li>
						<span>Sandalen后台管理系统</span>
						<ul>
							<li data-options="state:'closed'">
								<span>站点管理</span>
								<ul>
									<li>
										<span id="stationList" onclick="showList()">站点列表</span>
									</li>
									<li>
										<span>Wife</span>
									</li>
									<li>
										<span>Company</span>
									</li>
								</ul>
							</li>
							<li>
								<span>用户管理</span>
								<ul>
									<li>Intel</li>
									<li>Java</li>
									<li>Microsoft Office</li>
									<li>Games</li>
								</ul>
							</li>
							<li>index.html</li>
							<li>about.html</li>
							<li>welcome.html</li>
						</ul>
					</li> -->
				</ul>
			</div>
		</div>
		<div id="center" data-options="region:'center',title:'Main Title',iconCls:'icon-ok'">
			<div class="easyui-tabs" fit="true" border="false" id="tabs">
	    	   <div title="首页"><h3>欢迎使用Sandalen后台管理系统</h3>
	    	   		<!-- <table id="pg" class="easyui-propertygrid" style="width:300px" data-options="
								url:'../../json/ProjectInfo.json',
								method:'get',
								showGroup:true,
								scrollbarSize:0
							">
					</table> -->
					<div id="p" class="easyui-panel" title="about" style="width:1200px;height:500px;padding:10px;">
						<p style="font-size:14px">请阅读以下内容</p>
						<ul>
							<li>注意:该项目仅作学习用途，若使用为商业目的请联系作者授权，侵权必究。</li>
							<li>作者:Sandalen</li>
							<li>联系方式:806403789@qq.com</li>
							<li>项目名称:Sandalen水质管理系统</li>
							<li>项目版本:v1.0</li>
							<li>更新事件:2019.4.28</li>
						</ul>
					</div>
	    	</div>
			
			<!-- <table class="easyui-datagrid"
					data-options="url:'datagrid_data1.json',method:'get',border:false,singleSelect:true,fit:true,fitColumns:true">
				<thead>
					<tr>
						<th data-options="field:'itemid'" width="80">Item ID</th>
						<th data-options="field:'productid'" width="100">Product ID</th>
						<th data-options="field:'listprice',align:'right'" width="80">List Price</th>
						<th data-options="field:'unitcost',align:'right'" width="80">Unit Cost</th>
						<th data-options="field:'attr1'" width="150">Attribute</th>
						<th data-options="field:'status',align:'center'" width="60">Status</th>
					</tr>
				</thead>
			</table> -->
		</div>
	</div>
 
</body>
<script type="text/javascript">
	$(function(){
		var treeData = [{
	    	  text : "Sandalen后台管理系统",
	          children : [{
	                  text : "站点管理",
	                  state:'closed',
	                  children : [{
	                          text : "站点列表",
	                          attributes : {
	                              url : '<iframe width="100%" height="100%" frameborder="0"  src="/showStaionListPage" style="width:100%;height:100%;margin:0px 0px;"></iframe>'
	                          }
	                  		
	                      	}, 
	                      	{
	                          text : "数据查询",
	                          attributes : {
	                              url : ''
	 
	                          }
	                      }
	                  ]
	              },
	              {
	                  text : "设备和人员管理",
	                  children : [{
	                          text : "设备管理",
	                          attributes : {
	                        	  url : '<iframe width="100%" height="100%" frameborder="0"  src="jsp/queryPriceStock.jsp" style="width:100%;height:100%;margin:0px 0px;"></iframe>'
	                          }
	                      }, {
	                          text : "人员管理",
	                          attributes : {
	                        	  url : ''
	                          }
	                      }
	                  ]
	              }
	          ]
	      }
	  ];
	 $("#tree").tree({
	        data : treeData,
	        lines : true,
	        onClick : function (node) {
	            if (node.attributes) {
	                Open(node.text, node.attributes.url);
	            }
	        }
	});
	 //在右边center区域打开菜单，新增tab
	    function Open(text, url) {
	        if ($("#tabs").tabs('exists', text)) {
	            $('#tabs').tabs('select', text);
	        } else {
	            $('#tabs').tabs('add', {
	                title : text,
	                closable : true,
	                content : url
	            });
	        }
	    }
	    
	    //绑定tabs的右键菜单
	    $("#tabs").tabs({
	        onContextMenu : function (e, title) {
	            e.preventDefault();
	            $('#tabsMenu').menu('show', {
	                left : e.pageX,
	                top : e.pageY
	            }).data("tabTitle", title);
	        }
	    });
	    
	    //实例化menu的onClick事件
	    $("#tabsMenu").menu({
	        onClick : function (item) {
	            CloseTab(this, item.name);
	        }
	    });


	})
	
	
</script>
</html>