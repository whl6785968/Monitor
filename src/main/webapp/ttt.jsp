<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title> new document </title>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script> 
 
</head>
 
<body>
<script type="text/javascript">
$(document).ready(function(){     
	alert("1");
	$("#b01").click(function(){ 
	    alert("2");
	});
});     
</script>
这个是按钮<button id="b01" type="button">Change Content</button>
</body>
</html>      