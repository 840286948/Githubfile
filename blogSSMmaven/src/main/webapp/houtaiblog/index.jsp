<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<title>异清轩博客管理系统</title>
	<script type="text/javascript" src="js/jquery.js"></script>
	<link rel="stylesheet" type="text/css" href="houtaiblog/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="houtaiblog/css/style.css">
	<link rel="stylesheet" type="text/css" href="houtaiblog/css/font-awesome.min.css">
	<link rel="apple-touch-icon-precomposed" href="houtaiblog/images/icon/icon.png">
	<link rel="shortcut icon" href="houtaiblog/images/icon/favicon.ico">
	<script src="houtaiblog/js/jquery-2.1.4.min.js"></script>
	<script type="text/javascript" src="houtaiblog/wjs/user.js"></script>
  </head>
  
	<body class="user-select">
<section class="container-fluid">
  <jsp:include page="header.jsp"></jsp:include>
  <div class="row">
    <jsp:include page="left.jsp"></jsp:include>
    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-lg-10 col-md-offset-2 main" id="main">
      <h1 class="page-header">信息总览</h1>
      <div class="row placeholders">
        <div class="col-xs-6 col-sm-3 placeholder">
          <h4>文章</h4>
          <span class="text-muted">${articleTote } 条</span> </div>
        <div class="col-xs-6 col-sm-3 placeholder">
          <h4>评论</h4>
          <span class="text-muted">${commentTote } 条</span> </div>
        <div class="col-xs-6 col-sm-3 placeholder">
          <h4>友链</h4>
          <span class="text-muted">${linkTote } 条</span> </div>
        <div class="col-xs-6 col-sm-3 placeholder">
          <h4>登录访问量</h4>
          <span class="text-muted">${userlog }</span> </div>
      </div>
      <h1 class="page-header">状态</h1>
      <div class="table-responsive">
        <table class="table table-striped table-hover">
          <tbody>
            <tr>
              <td>登录者: <span>${currentUser.username }</span>，这是您第 <span>${longNumber }</span> 次登录</td>
            </tr>
            <tr>
              <td>
              <c:if test="${not empty lastLog }">
              上次登录时间: <fmt:formatDate value="${lastLog.createTime }" type="date" pattern="yyyy-MM-dd HH:mm:ss"/>  , 上次登录IP: ${lastLog.ip }
              	</c:if>
              	<c:if test="${empty lastLog }">
              		您是第一次登录
              	</c:if>
              </td>
            </tr>
          </tbody>
        </table>
      </div>
      <h1 class="page-header">系统信息</h1>
      <div class="table-responsive">
        <table class="table table-striped table-hover">
          <thead>
            <tr> </tr>
          </thead>
          <tbody>
            <tr>
              <td width="10%">管理员个数:</td>
              <td width="8%">${roleTote } 人</td>
              <td width="10%">登录IP:</td>
              <td width="8%">${currentIp }</td>
              <td></td>
             <!--  <td>服务器软件:</td>
              <td>Apache/2.4.10 (Win32) OpenSSL/1.0.1i mod_fcgid/2.3.9</td> -->
            </tr>
            <!-- <tr>
              <td>浏览器:</td>
              <td>Chrome47</td>
              <td>PHP版本:</td>
              <td>5.6.1</td>
            </tr>
            <tr>
              <td>操作系统:</td>
              <td>Windows 10</td>
              <td>PHP运行方式:</td>
              <td>CGI-FCGI</td>
            </tr>
            <tr>
              <td>登录者IP:</td>
              <td>::1:55570</td>
              <td>MYSQL版本:</td>
              <td>5.5.40</td>
            </tr>
            <tr>
              <td>程序版本:</td>
              <td class="version">YlsatCMS 1.0 <font size="-6" color="#BBB">(20160108160215)</font></td>
              <td>上传文件:</td>
              <td>可以 <font size="-6" color="#BBB">(最大文件：2M ，表单：8M )</font></td>
            </tr>
            <tr>
              <td>程序编码:</td>
              <td>UTF-8</td>
              <td>当前时间:</td>
              <td>2016-01-08 15:50:30</td>
            </tr> -->
          </tbody>
          <tfoot>
            <tr></tr>
          </tfoot>
        </table>
      </div>
      <footer>
        <!-- <h1 class="page-header">程序信息</h1> -->
        <div class="table-responsive">
        <table class="table table-striped table-hover">
          <tbody>
            <!-- <tr>
              <td><span style="display:inline-block; width:8em">版权所有</span> POWERED BY WY ALL RIGHTS RESERVED</td>
            </tr>
            <tr>
              <td><span style="display:inline-block;width:8em">页面加载时间</span> PROCESSED IN 1.0835s  SECONDS 更多模板：<a href="http://www.mycodes.net/" target="_blank">源码之家</a></td>
            </tr> -->
          </tbody>
        </table>
        </div>
      </footer>
    </div>
  </div>
</section>
<jsp:include page="blog.jsp"></jsp:include>
<script src="houtaiblog/js/bootstrap.min.js"></script> 
<script src="houtaiblog/js/admin-scripts.js"></script>
</body>
</html>
