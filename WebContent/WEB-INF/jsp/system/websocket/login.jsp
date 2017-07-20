<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>在线留言系统</title>
<script type="text/javascript" src="static/websocket/js/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="static/websocket/js/lbt.js"></script>
<link rel="stylesheet" href="static/websocket/css/style.css" type="text/css" media="all" />
<script type="text/javascript">
	$(function(){
		
	});

</script>

</head>
<body>
<!--登陆区域开始-->
<div class="loginMain">
	<div class="loginArea">
    	<h2>欢迎登陆</h2>
        <p>欢迎您来到聊天空间！</p>
        <div><font color="red" size="16">${requestScope.errorTips }</font></div>
        <form action="${pageContext.request.contextPath }/chat/login"  method="post">
        	<input type="text" value="请输入您想显示的昵称" name="nickname" id="myText" />
            <button>进入聊天室</button>
        </form>
    </div>
</div>
<!--登陆区域结束-->

</body>
<script type="text/javascript">
	var myText=document.getElementById('myText');
	myText.onfocus=function(){
		if(myText.value=='请输入您想显示的昵称'){
			myText.value='';
			myText.style.color='#333';	
		}	
	}
	myText.onblur=function(){
		if(myText.value==''){
			myText.value='请输入您想显示的昵称';
			myText.style.color='#ccc';
		}	
	}

</script>
</html>