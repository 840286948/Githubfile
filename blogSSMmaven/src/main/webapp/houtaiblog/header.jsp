<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'header.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
			$.ajax({
				type:"post",
				url:"comment/AjaxStatus.do",
				dataType:"JSON",
				success:function(data){
					$("#badge").html(data);
				}
			});
	</script>
  </head>
  
  <body>
    <header>
    <nav class="navbar navbar-default navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false"> <span class="sr-only">切换导航</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
          <a class="navbar-brand" href="/">YlsatCMS</a> </div>
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="${permission['comment/list'] == null?'javascript:alert(\'你没有该权限\')':'comment/list.do'}">消息 <span class="badge" id="badge"></span></a></li>
            <li class="dropdown"> <a class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">${currentUser.username } <span class="caret"></span></a>
              <ul class="dropdown-menu dropdown-menu-left">
                <li><a title="查看或修改个人信息" onclick="update(${currentUser.id},2)" data-toggle="modal" data-target="#seeUserInfo">个人信息</a></li>
                <li><a title="查看您的登录记录" onclick="log()" data-toggle="modal" data-target="#seeUserLoginlog">登录记录</a></li>
              </ul>
            </li>
            <li><a href="user/tuilogin.do" onClick="if(!confirm('是否确认退出？'))return false;">退出登录</a></li>
            <!-- <li><a data-toggle="modal" data-target="#WeChat">帮助</a></li> -->
          </ul>
          <form action="article/list.do" method="post" class="navbar-form navbar-right" role="search">
            <div class="input-group">
              <input type="text" name="keywords" class="form-control" autocomplete="off" placeholder="键入关键字搜索" maxlength="15">
              <span class="input-group-btn">
              <c:if test="${permission['article/likeArticle'] == null }">
              		 <a  class="btn btn-default" href="javascript:alert('你没有该权限')">搜索</a>
              	</c:if>
              	<c:if test="${permission['article/likeArticle'] != null }">
              		 <button class="btn btn-default" type="submit">搜索</button>
              	</c:if>
              
              </span> </div>
          </form>
        </div>
      </div>
    </nav>
  </header>
  </body>
</html>
