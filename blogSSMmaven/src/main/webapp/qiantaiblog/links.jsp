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
    
    <title>My JSP 'links.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="qiantaiblog/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="qiantaiblog/css/nprogress.css">
<link rel="stylesheet" type="text/css" href="qiantaiblog/css/style.css">
<link rel="stylesheet" type="text/css" href="qiantaiblog/css/font-awesome.min.css">
<link rel="apple-touch-icon-precomposed" href="qiantaiblog/images/icon/icon.png">
<link rel="shortcut icon" href="qiantaiblog/images/icon/favicon.ico">
<script src="qiantaiblog/js/jquery-2.1.4.min.js"></script>
<script src="qiantaiblog/js/nprogress.js"></script>
<script src="qiantaiblog/js/jquery.lazyload.min.js"></script>
<!--[if gte IE 9]>
  <script src="js/jquery-1.11.1.min.js" type="text/javascript"></script>
  <script src="js/html5shiv.min.js" type="text/javascript"></script>
  <script src="js/respond.min.js" type="text/javascript"></script>
  <script src="js/selectivizr-min.js" type="text/javascript"></script>
<![endif]-->
<!--[if lt IE 9]>
  <script>window.location.href='upgrade-browser.html';</script>
<![endif]-->
</head>

<body class="user-select">
<jsp:include page="header.jsp"></jsp:include>
<section class="container container-page">
  <div class="pageside">
    <div class="pagemenus">
      <ul class="pagemenu">
        <!-- <li><a href="tags.html">标签云</a></li>
        <li><a href="readers.html">读者墙</a></li> -->
        <li><a href="page/links.do">友情链接</a></li>
      </ul>
    </div>
  </div>
  <div class="content">
    <header class="article-header">
      <h1 class="article-title">友情链接</h1>
    </header>
    <ul class="plinks">
    	<c:forEach items="${Qlinks }" var="l">
      		<li><a href="${l.link_url }" title="" target="_blank" rel="nofollow"><img src="qiantaiblog/images/icon/favicon.ico" alt="">${l.link_name }</a></li>
    	</c:forEach>
    </ul>
  </div>
</section>
<jsp:include page="blog.jsp"></jsp:include>
<!-- <script src="qiantaiblog/js/bootstrap.min.js"></script>  -->
<script src="qiantaiblog/js/jquery.ias.js"></script> 
<script src="qiantaiblog/js/scripts.js"></script>
</body>
</html>
