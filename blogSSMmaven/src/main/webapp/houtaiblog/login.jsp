<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<title>博客管理系统</title>
<link rel="stylesheet" type="text/css" href="houtaiblog/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="houtaiblog/css/style.css">
<link rel="stylesheet" type="text/css" href="houtaiblog/css/login.css">
<link rel="apple-touch-icon-precomposed" href="houtaiblog/images/icon/icon.png">
<link rel="shortcut icon" href="houtaiblog/images/icon/favicon.ico">
<script src="houtaiblog/js/jquery-1.4.4.min.js"></script>
</head>

<body class="user-select">

<div class="container">
  <div class="siteIcon"><img src="houtaiblog/images/icon/icon.png" alt="" data-toggle="tooltip" data-placement="top" title="欢迎使用异清轩博客管理系统" draggable="false" /></div>
  <form action="user/login.do" method="post" autocomplete="off" class="form-signin">
    <h2 class="form-signin-heading">管理员登录</h2>
    <label for="userName" class="sr-only">用户名</label>
    <input type="text" value="${user.username }" id="userName" name="username" class="form-control" placeholder="请输入用户名" required autofocus autocomplete="off" maxlength="10">
    <label for="userPwd" class="sr-only">密码</label>
    <input type="password" value="" id="userPwd" name="password" class="form-control" placeholder="请输入密码" required autocomplete="off" maxlength="18">
    <button class="btn btn-lg btn-primary btn-block" type="submit" id="signinSubmit">登录</button>
  </form>
  <div class="footer">
    <p><!-- <a href="index.html" data-toggle="tooltip" data-placement="left" title="不知道自己在哪?">回到后台 →</a> --></p>
  </div>
</div>
<script type="text/javascript">
$('#signinSubmit').click(function(){
	if($('#userName').val() === ''){
		alert('用户名不能为空');
		$(this).text('用户名不能为空');
		return false;
	}else if($('#password').val() === ''){
		alert('密码不能为空');
		$(this).text();
		return false;
	}
	return true;
});
</script>
<c:if test="${not empty user }">
	<script type="text/javascript">
		alert("用户名密码错误");
	</script>
</c:if>
<c:if test="${not empty alt }">
	<script type="text/javascript">
		alert("该用户已被禁用");
	</script>
</c:if>
  </body>
</html>
