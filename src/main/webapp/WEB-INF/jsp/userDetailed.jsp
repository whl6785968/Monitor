<%--
  Created by IntelliJ IDEA.
  User: Maxci
  Date: 2018/7/30
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="../../statics/css/layui.css">
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!-- 引入 Bootstrap -->
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<!-- 包括所有已编译的插件 -->
<script src="../../statics/js/bootstrap.min.js"></script>
<script src="../../statics/layui.js"></script>
<style>
	/* .layui-card-header {
		    position: relative;
		    height: 42px;
		    line-height: 42px;
		    padding: 0 15px;
		    border-bottom: 1px solid #f6f6f6;
		    color: #333;
		    border-radius: 2px 2px 0 0;
		    font-size: 14px;
		} */
    .fly-panel {
        margin-bottom: 15px;
        border-radius: 2px;
        background-color: #fff;
        box-shadow: 0px 1px 2px 0px rgba(0,0,0,0.05);
    }
    .fly-panel-title {
        position: relative;
        height: 50px;
        line-height: 50px;
        padding: 0 15px;	
        border-bottom: 1px dotted #E9E9E9;
        color: #333;
        border-radius: 2px 2px 0 0;
        font-size: 14px;
    }
    .fly-home-jie .jie-row, .fly-home-da .home-jieda {
        min-height: 500px;
        padding: 5px 20px;
    }
    .home-jieda li {
        margin-bottom: 20px;
        line-height: 24px;
    }
    .home-jieda li p {
        color: #999;
    }
    .home-jieda li a {
        padding: 0 5px;
        color: #4f99cf;
    }
    .home-dacontent {
        margin-top: 10px;
        padding: 10px 15px;
        background-color: #f2f2f5;
        border-radius: 5px;
        word-wrap: break-word;
    : ;
    }
    .jie-row li .jie-title {
        max-width: 70%;
        overflow: hidden;
        text-overflow: ellipsis;
        white-space: nowrap;
    }


</style>
<html>
<head>
    <title>${user.userName}的资料</title>
</head>
<body class="childrenBody">
<%-- <%@include file="header.jsp"%> --%>

<div style="
    position: relative;
    padding: 30px 0 30px;
    text-align: center;
    margin-bottom: 15px;
    border-radius: 2px;
    background-color: #fff;
    box-shadow: 0px 1px 2px 0px rgba(0,0,0,0.05);
">
        <img id="img" src="${info.imagePath}" alt="aa" style="width: 120px;height: 120px;border-radius: 100%">
        <br/>
    <h1>${username}</h1>
    <c:if test="${info.sex=='男'}">
        <i class="layui-icon">&#xe662;</i>
    </c:if>
    <c:if test="${info.sex=='女'}">
        <i class="layui-icon">&#xe661;
        </i>
    </c:if>
    <i></i>
    <br/>
    <br/>
    <span>加入时间:<fmt:formatDate value="${info.signTime}" type="date"/></span>
    <br/>
    <p style="
    padding: 0 10px;
    color: #999;
    margin-top: 10px;
">${info.userSignature}</p>
    <br/>
        <button type="button" class="layui-btn" id="up">
            <i class="layui-icon">&#xe67c;</i>更改头像
        </button>
        <br/>
        <input type="hidden" id="uid" value="${user.userId}">
</div>
<div class="layui-container"style="height: 800px;width: 700px">

	<div class="layui-row layui-col-space15">
		<div class="layui-col-md12">
		       <div class="layui-card">
		       	<div class="layui-card-header" align="center"><h3><i class="layui-icon layui-icon-username" style="font-size: 30px; color:black;"></i> 
		       	${username}的一些信息</h3></div>
		       	<div class="layui-card-body">
		       		<div class="userInfo">
		       			<form class="layui-form">
		       				<div class="layui-form-item">
		       					<label class="layui-form-label">邮箱</label>
		       					<div class="layui-input-block">
		       						<input type="text" id="email" name="email" lay-verify="email" autocomplete="off" placeholder="请输入邮箱" value="${info.eMail}" class="layui-input">
		       					</div>
		       				</div>
		       				<div class="layui-form-item">
		       					<label class="layui-form-label">电话</label>
		       					<div class="layui-input-block">
		       						<input type="text" name="phone" id="phone" lay-verify="phone" autocomplete="off" placeholder="请输入电话" value="${info.phoneNumber}" class="layui-input">
		       					</div>
		       				</div>
		       				<div class="layui-form-item">
		       					<label class="layui-form-label">个性签名</label>
		       					<div class="layui-input-block">
		       						<textarea id ="signature" placeholder="请输入内容" value="${info.userSignature}" class="layui-textarea"></textarea>	
		       					</div>
		       				</div>
		       				<div class="layui-form-item">
		       					<div class="layui-input-block">
		       						<button class="layui-btn" lay-submit lay-filter="muInfo">修改</button>
		       						<button type="reset" class="layui-btn layui-btn-primary">重置</button>
		       					</div>
		       				</div>
		       				
		       			</form>
		       		</div>
		       	</div>
		       </div>
	       </div>
	       <div class="layui-col-md12">
	       	<div class="layui-card">
	       		<div class="layui-card-header" align="center"><h3><i class="layui-icon layui-icon-username" style="font-size: 30px; color:black;"></i> 
		       	${username}的浏览记录 </h3>
		      
		       	</div>
		       	<div class="layui-card-body">
		       		<div id="userRecord" class="userRecord">
		       			
		       			 <input id="ids" value="${userRecord.idsrecord}" type="hidden"> 
		       			
		       			<input id="equipPics" value="${userRecord.picrecord}" type="hidden">
		       		</div>
		       	</div>
	       	</div>
	       </div>
	       <div class="layui-col-md12">
	       	<div class="layui-card">
	       		<div class="layui-card-header" align="center"><h3><i class="layui-icon layui-icon-username" style="font-size: 30px; color:black;"></i> 
		       	猜${username}的喜欢</h3>
		      
		       	</div>
		       	<div class="layui-card-body">
		       		<div id="userRecomm" class="userRecomm">
		       		<c:forEach items="${equips}" var="r">
		       			<div class="layui-col-md3">
		       				<div class='layui-col-md4'><a href='javascript:openEquipDetail("${r.eid}")'><img height='200px' weight='200px' src="${r.equipic}"/></a></div>
		       			</div>
		       		</c:forEach>
		       			
		       			
		       		</div>
		       	</div>
	       	</div>
	       </div>
	</div>
</div>
<script>
	function getIframeByElement(element){
	    var iframe;
	    $("iframe", window.parent.document).each(function(){
	        if(element.ownerDocument === this.contentWindow.document) {
	            iframe = this;
	        }
	        return !iframe;
	    });
	    return iframe;
	};
   layui.use(['jquery','form','layer'],function()
   {
  		var $$ = layui.jquery,
  		form = layui.form,
  		layer = layui.layer;
  		form.on('submit(muInfo)',function(data){
  			var uid = $$("#uid").val();
			var eMail = $$("#email").val();
			var phoneNumber = $$("#phone").val();
			var userSignature = $$("#signature").val();
			alert(userSignature);
  		/* 	var eMail = JSON.stringify($$("#email").val());
  			var phoneNumber =JSON.stringify($$("#phoneNumber").val());
  			var userSignature = JSON.stringify($$("#userSignature").val()); */
  			
  		/* 	ds.email = $$("#email").val();
  			ds.phoneNumber = $$("#phone").val();
  			ds.userSignature = $$("#signature").val(); */

  			/* var userId = JSON.toStringify($$("#uid").val()); */
  			$$.ajax({
  				type:"post",
  				url:"/updateMuser",
  				data:{"uid":uid,"email":eMail,"phoneNumber":phoneNumber,"userSignature":userSignature},   
  			 /* 	data:[eMail,phoneNumber,userSignature], */
  			 	/* contentType : 'application/json',  */
  				dataType:"json",
  				success:function(data){
  					if (data==true)
					{
						layer.msg("修改成功 ",{icon:6,time:1000});
						/* var iframe=window.parent.getIframeByElement(document.body);
						var iframeObj=$(iframe); */
						var pbody = window.parent;
						var iframe5 = pbody.document.getElementById('5')
						alert(iframe5);
						iframe5.contentWindow.location.reload(true);
					}
  					
  				}
  			});
  			return false;
  		})
  
  
   });
   
   layui.use(['jquery','upload'],function(){
	   var $ = layui.$;
       var upload = layui.upload;
     /*   if (${!empty info.imagePath}) {
           $("#img").attr("src"," ${info.imagePath}");
       }

       if (${user.userId!=info.userId}) {
           $("#up").hide();
       } */
	   var uploadIn = upload.render({
		  elem:'#up',
		  url:'/localUpload',
		  done:function(res)
		  {
			  $("#img").attr("src",res.path);
			  layer.msg("上传成功");
		  },
		  error:function()
		  {
			  layer.msg("上传失败");
		  },
		  accept:'images',
		  size:5000,
		  number:1,
		  data:{
			  id:'${user.userId}'
		  }
	   });
   });
  
   layui.use(['jquery','layer'],function(){
	   var layer = layui.layer,
	   $$ = layui.jquery;
	   $$(function(){
		   var equipPics = $$("#equipPics").val();
		   alert(equipPics);
		   var pic = [];
		   pic = equipPics.split("-");
		   var ids = $$("#ids").val();
		   var str = [];
		   str = ids.split("-");
		   var l = "";
		   for(var i=0;i<str.length;i++)
		   {
			   /* <a href="javascript:void(0)" onclick="openEquipDetail(${e.eid})"><img height="300px" src="${e.equipic}" alt="aa"/><br /></a>  */
			   l = "<div class='layui-col-md4'><a href='javascript:openEquipDetail("+str[i]+")'><img height='200px' weight='200px' src='"+pic[i]+"'</a></div>";
			    alert(l);
			   $$("#userRecord").append(l);
			  /*  alert(str[i]); */
		   }
		  
	   })
	  
   });
   function openEquipDetail(eid){
		layui.use(['layer','jquery'],function(){
			var layer = layui.layer,
			$$ = layui.jquery;
	/* 		var eid = $$("#equipId").val(); */
			alert(eid);
			$$(window).one("resize",function(){
				var index = layer.open({
					title :'设备详情',
					type:2,
					maxmin: true,
					resize:true,
					skin: 'layui-layer-rim', 
					area: ['1500px', '850px'],
					content:'/showEquipDetailed?eid='+eid,
					success:function(){
						 layer.tips('按x返回', '.layui-layer-setwin .layui-layer-close',{tips:1});
					}
				})
				layer.full(index);
			}).resize();
			
			/* layer.msg('sss'); */
		})
		
	}

   
    
</script>
<%-- <%@include file="footer.jsp"%> --%>
</body>
</html>
