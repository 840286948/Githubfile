<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'article.jsp' starting page</title>
    
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
<script src="qiantaiblog/wjs/qiantai.js"></script>
<script src="http://pv.sohu.com/cityjson?ie=utf-8"></script>
<script type="text/javascript">
</script>
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

<body class="user-select single" onload="comments(1,${articles.id})">
<jsp:include page="header.jsp"></jsp:include>
<section class="container">
  <div class="content-wrap">
    <div class="content">
      <header class="article-header">
        <h1 class="article-title"><a href="article.html">${articles.article_title }</a></h1>
        <div class="article-meta"> <span class="item article-meta-time">
          <time class="time" data-toggle="tooltip" data-placement="bottom" title="时间：2016-1-4 10:29:39">
          <fmt:formatDate value="${articles.createTime }" type="date" pattern="yyyy-MM-dd HH:mm:ss"/></time>
          </span> 
           <span class="item article-meta-category" data-toggle="tooltip" data-placement="bottom" title="栏目：${articles.column.column_name }"><i class="glyphicon glyphicon-list"></i> <a href="program" title="">${articles.column.column_name }</a></span>
            <span class="item article-meta-views" data-toggle="tooltip" data-placement="bottom" title="查看：${articles.article_clicks }"><i class="glyphicon glyphicon-eye-open"></i> 共${articles.article_clicks }人观看</span> 
            <span id="tota" class="item article-meta-comment" data-toggle="tooltip" data-placement="bottom"><i class="glyphicon glyphicon-comment"></i> </span> </div>
      </header>
      <article class="article-content">
      	<p><img data-original="images/banner/banner_03.jpg" src="${articles.title_image }" alt="" onerror="javascript:NoImage(this)"/></p>
        ${articles.article_content }
        <!-- <p class="article-copyright hidden-xs">未经允许不得转载：<a href="">异清轩博客</a> » <a href="article.html">php如何判断一个日期的格式是否正确</a></p> -->
      </article>
      <div class="article-tags">标签：<a href="" rel="tag">${articles.article_label }</a></div>
      <div class="relates">
        <div class="title">
          <h3>相关推荐</h3>
        </div>
        <ul>
        	<c:forEach items="${articleList }" var="a">
          		<li><a href="page/articleDetails.do?id=${a.id }&article_clicks=${a.article_clicks}">${a.article_title }</a></li>
          	</c:forEach>
        </ul>
      </div>
      <div class="title" id="comment">
        <h3>评论 <small>抢沙发</small></h3>
      </div>
      <!--<div id="respond">
        <div class="comment-signarea">
          <h3 class="text-muted">评论前必须登录！</h3>
          <p> <a href="javascript:;" class="btn btn-primary login" rel="nofollow">立即登录</a> &nbsp; <a href="javascript:;" class="btn btn-default register" rel="nofollow">注册</a> </p>
          <h3 class="text-muted">当前文章禁止评论</h3>
        </div>
      </div>-->
      <div id="respond">
        <form action="" method="post" id="comment-form">
          <div class="comment">
            <div class="comment-title"><img class="avatar" src="qiantaiblog/images/icon/icon.png" alt="" /></div>
            <div class="comment-box">
              <textarea placeholder="您的评论可以一针见血" name="comment_content" id="comment-textarea" cols="100%" rows="3" tabindex="1" ></textarea>
              <div class="comment-ctrl"> <span class="emotion"></span>
              	<input type="hidden" value="" id="ip"/>
                <div class="comment-prompt"> <i class="fa fa-spin fa-circle-o-notch"></i> <span class="comment-prompt-text"></span> </div>
                <button type="button" onclick="insertComment(${articles.id},${articles.comment_status })" name="comment-submit" id="comment-submit" tabindex="5" articleid="1">评论</button>
              </div>
            </div>
          </div>
        </form>
      </div>
      <div id="postcomments">
        <ol class="commentlist" id="commentlist">
          
        </ol>
        
        <div class="quotes" id="quotes">
        
        </div>
      </div>
    </div>
  </div>
  <jsp:include page="right.jsp"></jsp:include>
</section>

<jsp:include page="blog.jsp"></jsp:include>
<!-- <script src="qiantaiblog/js/bootstrap.min.js"></script>  -->
<script src="qiantaiblog/js/jquery.ias.js"></script> 
<script src="qiantaiblog/js/scripts.js"></script> 
<script src="qiantaiblog/js/jquery.qqFace.js"></script> 
<script type="text/javascript">
$(function(){
	$('.emotion').qqFace({
		id : 'facebox', 
		assign:'comment-textarea', 
		path:'/Home/images/arclist/'	//表情存放的路径
	});
 });   
</script>
</body>
</html>
