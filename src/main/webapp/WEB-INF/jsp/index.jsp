<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	
<title>layout 后台大布局 - Layui</title>
<link rel="stylesheet" href="../../statics/css/layui.css"/>
<link rel="stylesheet" href="../../statics/css/main.css" media="all"/>
<script type="text/javascript" charset="utf-8" src="/js/jquery-1.8.3.min.js"></script>
</head>
<style>
		.layui-tab-title li:first-child>i {
			display: none;
		}
		.weather{ color:#fff; float:left; margin:15px 0 0 580px;}
		/* iframe{
			 postion:absolute;
			 top:40px;
		} */
		.layui-side-scroll{
			postion:relative;
			width:100%;
		}
		/* #3{
			 postion:absolute;
			 top:100px;
		} */
		.iframe1{
			position:absolute;
			top:50px;
		}	
</style>

<body class="layui-layout-body">
	<div class="layui-layout layui-layout-admin">
		<div class="layui-header">
			<div class="layui-logo"><span>在线监控平台</span></div>
		 
			<!-- 头部区域（可配合layui已有的水平导航） -->
			<ul class="layui-nav layui-layout-left" lay-filter="">
			<!-- 	<li class="layui-nav-item"><a href="javascript:;" data-id="15"
					data-title="存款列表" data-url="login.jsp" class="site-demo-active" data-type="tabAdd">登陆</a></li> -->
				<li class="layui-nav-item"><a href="">设备管理</a></li>
				<li class="layui-nav-item"><a href="">数据分析</a></li>
				<li class="layui-nav-item"><a href="javascript:;">其它系统</a>
					<dl class="layui-nav-child">
						<dd>
							<a href="">邮件管理</a>
						</dd>
						<dd>
							<a href="">消息管理</a>
						</dd>
						<dd>
							<a href="">授权管理</a>
						</dd>
					</dl></li>
			</ul>
			
			 <div class="weather" pc>
		    	<div id="tp-weather-widget"></div>
				<script>(function(T,h,i,n,k,P,a,g,e){g=function(){P=h.createElement(i);a=h.getElementsByTagName(i)[0];P.src=k;P.charset="utf-8";P.async=1;a.parentNode.insertBefore(P,a)};T["ThinkPageWeatherWidgetObject"]=n;T[n]||(T[n]=function(){(T[n].q=T[n].q||[]).push(arguments)});T[n].l=+new Date();if(T.attachEvent){T.attachEvent("onload",g)}else{T.addEventListener("load",g,false)}}(window,document,"script","tpwidget","//widget.seniverse.com/widget/chameleon.js"))</script>
				<script>tpwidget("init", {
				    "flavor": "slim",
				    "location": "WX4FBXXFKE4F",
				    "geolocation": "enabled",
				    "language": "zh-chs",
				    "unit": "c",
				    "theme": "chameleon",
				    "container": "tp-weather-widget",
				    "bubble": "disabled",
				    "alarmType": "badge",
				    "color": "#FFFFFF",
				    "uid": "U9EC08A15F",
				    "hash": "039da28f5581f4bcb5c799fb4cdfb673"
				});
				tpwidget("show");</script>
		   </div>
		
		
			<div id="time" style="color:#FFFFFF;margin-left:700px;width:300px;height:50px;text-align:center;line-height:60px;font-size:15px"></div>
			 <div class="layui-form" style="position:absolute;top:-30px;left:1100px;;width:300px;height:50px;text-align:center;line-height:60px">
			  <div class="layui-form-item">
			    <div class="layui-inline">
			      <label class="layui-form-label">中文版</label>
			      <div class="layui-input-inline">
			        <input type="text" class="layui-input" id="test1" placeholder="日历">
			      </div>
			    </div>
			
			</div>
			<div style="color:#FFFFFF;margin-left:1300px;width:300px;height:50px;text-align:center;line-height:60px;font-size:15px">${notice}</div>
			</div>
			<ul class="layui-nav layui-layout-right">
				
				<c:if test="${empty user}">
					<li class="layui-nav-item" style="float: right"><a
						href="/user/register">注册</a></li>
					<li class="layui-nav-item" style="float: right"><a
						href="/muser/login"> <i class="layui-icon layui-icon-username"></i>登录
					</a></li>
				</c:if>
				<c:if test="${!empty user}">
					<li class="layui-nav-item" style="float: right"><a href="#" data-id="5" data-title="个人中心"data-url="/muser/detail/${user.userId}" class="site-demo-active"
									data-type="tabAdd"><i class="layui-icon layui-icon-username">&nbsp;</i>${user.userName}</a>
						<dl class="layui-nav-child">
							<dd>
								<%-- <a href="/muser/detail/${user.userId}">个人中心</a> --%>
								<a href="#" data-id="5" data-title="个人中心"
									data-url="/muser/detail/${user.userId}" class="site-demo-active"
									data-type="tabAdd">个人中心</a>
							</dd>
							<dd>
								<a href="javascript:signout_confirm()">退出</a>
							</dd>
						</dl></li>

				</c:if>
				<li class="layui-nav-item" style="float:right">
					${notice}
				</li>
			</ul>
		</div>

		<div class="layui-side layui-bg-black">
			<div class="layui-side">
			<!-- style="font-size: 20px; color: black;" -->
				<!-- 左侧导航区域（可配合layui已有的垂直导航） -->
				<ul class="layui-nav layui-nav-tree" lay-filter="test">
					<li class="layui-nav-item layui-nav-itemed"><a class=""
						href="javascript:;"><i class="layui-icon layui-icon-face-smile" ></i>
						
						<cite>查看信息</cite>
						</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="#" data-id="1" data-title="用户名单"
									data-url="userForm.jsp" class="site-demo-active"
									data-type="tabAdd">
									用户列表
									
									</a>

							</dd>
							<dd>
								<a href="#" data-id="2" data-title="产品清单"
									data-url="EquipmentDataForm.jsp" class="site-demo-active"
									data-type="tabAdd">产品清单</a>
							</dd>
							<dd>
								<a href="#" data-id="3" data-title="设备清单"
									data-url="/showEquipment" class="site-demo-active"
									data-type="tabAdd">设备清单</a>
							</dd>
						</dl></li>
					<li class="layui-nav-item"><a href="javascript:;">数据处理</a>
						<dl class="layui-nav-child">
							<dd>
								<!-- <a href="/showDynamicChart">动态图表</a> -->
								<a href="#" data-id="4" data-title="动态图表"
									data-url="/showDynamicChart" class="site-demo-active"
									data-type="tabAdd">动态图表</a>
							</dd>
							<dd>
								<a href="#" data-id="6" data-title="远程数据接收"
									data-url="/showRemoteDataRecieve" class="site-demo-active"
									data-type="tabAdd">远程数据接收</a>
							</dd>
							<dd>
								<a href="#" data-id="7" data-title="数据滚动"
									data-url="/dataScroll" class="site-demo-active"
									data-type="tabAdd">滚动数据监控</a>
							</dd>
						</dl></li>
					<c:if test="${user.userType==2}">
						<li class="layui-nav-item"><a href="javascript:;">管理操作</a>
							<dl class="layui-nav-child">
								<dd>
									<!-- <a href="/showDynamicChart">动态图表</a> -->
									<a href="#" data-id="8" data-title="用户设置"
										data-url="/showControlAuth" class="site-demo-active"
										data-type="tabAdd">用户设置</a>
								</dd>
								<dd>
									<a href="#" data-id="9" data-title="Map"
										data-url="/stationMonitor" class="site-demo-active"
										data-type="tabAdd">站点监控</a>
								</dd>
					
							</dl></li>
					</c:if>	
					<li class="layui-nav-item"><a href="">发布商品</a></li>
				</ul>
			</div>
		</div>
		<div class="layui-body layui-form">
				
	
				
				<ul class="layui-nav closeBox">
				  <li class="layui-nav-item">
				    <a href="javascript:;"><i class="iconfont icon-caozuo"></i> 页面操作</a>
				    <dl class="layui-nav-child">
					  <dd><a href="javascript:;" class="refresh refreshThis"><i class="layui-icon">&#x1002;</i> 刷新当前</a></dd>
				      <dd><a href="javascript:;" class="closePageOther"><i class="iconfont icon-prohibit"></i> 关闭其他</a></dd>
				      <dd><a href="javascript:;" class="closePageAll"><i class="iconfont icon-guanbi"></i> 关闭全部</a></dd>
				    </dl>
				  </li>
				</ul>
				
	
				<div class="layui-tab" lay-filter="demo" lay-allowclose="true" style="margin-left: 200px;" id="top_tabs_box">
					<ul class="layui-tab-title" id="top_tabs">
						<li class="layui-this" lay-id=""><i class="layui-icon layui-icon-home" ></i> <cite>后台首页</cite></li>
					</ul>
					<div class="layui-tab-content clildFrame">
						<div class="layui-tab-item layui-show">
							<iframe data-frameid="main" scrolling="auto" frameborder="0" src="/showMainDetail" style="width:100%;height:99%;top:60px"></iframe>,
						</div>
					</div>	
				</div>

				<div class="layui-footer" style="text-align:center;">
					<!-- 底部固定区域 -->
					© sandalen 在线监控平台
				</div>
			</div>
		<!-- <div class="layui-tab" lay-filter="demo" lay-allowclose="true"
			style="margin-left: 200px;">
			<ul class="layui-tab-title"></ul>
			<div class="layui-tab-content"></div>
		</div> -->
	</div>
	
	<script src="../../statics/layui.js"></script>
	<script>
		layui.use([ 'element', 'layer', 'jquery' ], function() {
			var element = layui.element;
			// var layer = layui.layer;
			var $ = layui.$;
			/* <a href="#" data-id="5" data-title="个人中心"
				data-url="/muser/detail/${user.userId}" class="site-demo-active"
				data-type="tabAdd">个人中心</a> */
			// 配置tab实践在下面无法获取到菜单元素
			$('.site-demo-active').on('click',function() {
						var dataid = $(this);
						//这时会判断右侧.layui-tab-title属性下的有lay-id属性的li的数目，即已经打开的tab项数目
						if ($(".layui-tab-title li[lay-id]").length <= 0) {
							//如果比零小，则直接打开新的tab项
							active.tabAdd(dataid.attr("data-url"), dataid.attr("data-id"), dataid.attr("data-title"));
						} else {
							//否则判断该tab项是否以及存在
							var isData = false; //初始化一个标志，为false说明未打开该tab项 为true则说明已有
							$.each($(".layui-tab-title li[lay-id]"),
									function() {
										//如果点击左侧菜单栏所传入的id 在右侧tab项中的lay-id属性可以找到，则说明该tab项已经打开
										if ($(this).attr("lay-id") == dataid
												.attr("data-id")) {
											isData = true;
										}
									})
							if (isData == false) {
								//标志为false 新增一个tab项
								active.tabAdd(dataid.attr("data-url"), dataid
										.attr("data-id"), dataid
										.attr("data-title"));
							}
						}
						//最后不管是否新增tab，最后都转到要打开的选项页面上
						active.tabChange(dataid.attr("data-id"));
					});

			var active = {
				//在这里给active绑定几项事件，后面可通过active调用这些事件
				tabAdd : function(url, id, name) {
					//新增一个Tab项 传入三个参数，分别对应其标题，tab页面的地址，还有一个规定的id，是标签中data-id的属性值
					//关于tabAdd的方法所传入的参数可看layui的开发文档中基础方法部分
					element.tabAdd('demo', {
						title : name,
						content : '<iframe class="iframe1" id="'+id+'" data-frameid="' + id+ '" scrolling="auto" frameborder="0" src="'
								+ url
								+ '" style="width:100%;height:99%;"></iframe>',
						id : id
					//规定好的id
					})
					FrameWH(); //计算ifram层的大小
				},
				tabChange : function(id) {
					//切换到指定Tab项
					element.tabChange('demo', id); //根据传入的id传入到指定的tab项
				},
				tabDelete : function(id) {
					element.tabDelete("demo", id); //删除
				}
			};

			function FrameWH() {
				var h = $(window).height();
				$("iframe").css("height", h + "px");
			};
			
			$(".refresh").on("click",function(){  //此处添加禁止连续点击刷新一是为了降低服务器压力，另外一个就是为了防止超快点击造成chrome本身的一些js文件的报错(不过貌似这个问题还是存在，不过概率小了很多)
				if($(this).hasClass("refreshThis")){
					$(this).removeClass("refreshThis");
					$(".clildFrame .layui-tab-item.layui-show").find("iframe")[0].contentWindow.location.reload(true);
					setTimeout(function(){
						$(".refresh").addClass("refreshThis");
					},2000)
				}else{
					layer.msg("您点击的速度超过了服务器的响应速度，还是等两秒再刷新吧！");
				}
			})
		});
		layui.use([ 'element', 'jquery' ], function() {
			var element = layui.element;
			var $ = layui.$;
			$("#b").click(function() {
				$("#a").removeClass("layui-this ");
				$("#b").addClass("layui-this");

			});
		});
		function signout_confirm() {
			layui.use('layer', function() {
				var layer = layui.layer;

				layer.confirm('确定退出?', {
					icon : 3,
					title : '提示'
				}, function(index) {
					window.location.href = "/user/logout";
					layer.close(index);
				});
			});

		};	
		layui.use(['laydate','layer'], function(){
			  var laydate = layui.laydate,
			  layer=layui.layer;

			  //执行一个laydate实例
			  laydate.render({
			    elem: '#test1',//指定元素
			   /* type:'year'*/
			  type:'datetime',
			  calendar:true,
			  mark:{
			  	'2019-3-30':'贝鲁奇'
			  },
			  
			  min:-7,
			  max:7,
			  done : function(value,date){
			  	layer.alert('你选择的日期是:' + value + '<br>获得的对象是'+JSON.stringify(date));
			  }
			 /* done:function(value,data)
			  {
			  	if(date.year ===2019 && date.month ===8 && date.date ===15){
			  		layer.msg("中国人民抗日战争胜利72周年");
			  	}
			  }*/
			  
			  });
			});
		
		window.onload=function(){
			setInterval( function(){
				fnDate();
			}, 1000);
		};
		function fnDate()
		{
			var oDiv = document.getElementById("time");
			var date = new Date();
			var year = date.getFullYear();
			var month=date.getMonth();//当前月份
			var data=date.getDate();//天
			var hours=date.getHours();//小时
			var minute=date.getMinutes();//分
			var second=date.getSeconds();//秒
			var time="系统当前时间:"+year+"-"+fnW((month+1))+"-"+fnW(data)+" "+fnW(hours)+":"+fnW(minute)+":"+fnW(second);
			oDiv.innerHTML=time;
		};
		function fnW(str){
			var num;
			str>=10?num=str:num="0"+str;
			return num;
			} 
	function signout_confirm()
	{
		layui.use(['jquery','layer'],function(){
			var $$ = layui.jquery,
			layer = layui.layer;
			 layer.confirm('确定退出?', {icon: 3, title:'提示'}, function(index){
	                window.location.href="/nlogout";
	                layer.close(index);
	            });
		
			
		})
		
	}
		
	</script>
</body>

</html>