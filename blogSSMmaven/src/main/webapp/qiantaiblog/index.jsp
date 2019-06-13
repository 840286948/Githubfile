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
    
    <title>My JSP 'index.jsp' starting page</title>
    
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
<script type="text/javascript" src="qiantaiblog/wjs/qiantai.js"></script>
<!--[if gte IE 9]>
  <script src="js/jquery-1.11.1.min.js" type="text/javascript"></script>
  <script src="js/html5shiv.min.js" type="text/javascript"></script>
  <script src="js/respond.min.js" type="text/javascript"></script>
  <script src="js/selectivizr-min.js" type="text/javascript"></script>
<![endif]-->
<!--[if lt IE 9]>
  <script>window.location.href='upgrade-browser.html';</script>
<![endif]-->
<style type="text/css">
.texts {
    position: relative;
    width:510px;
    font-size: 16px;
    line-height: 16px;
    height: 32px;
    overflow: hidden;
    color: #666;
    margin-bottom: 0;
    text-indent: 28px;
    cursor: default;
}
.texts::after {
    content: '...';
    position: absolute;
    right: 0;
    bottom: 0;
}
</style>
</head>

<body class="user-select">
<c:if test="${empty articleList}">
	<script type="text/javascript">
		window.location = "page/indexListcolumn.do";
	</script>
</c:if>
<jsp:include page="header.jsp"></jsp:include>
<section class="container">
  <div class="content-wrap">
    <div class="content">
      <div class="jumbotron">
        <h1>欢迎访问异清轩博客</h1>
        <p>在这里可以看到前端技术，后端程序，网站内容管理系统等文章，还有我的程序人生！</p>
      </div>
      <div id="focusslide" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
          <li data-target="#focusslide" data-slide-to="0" class="active"></li>
          <li data-target="#focusslide" data-slide-to="1"></li>
          <li data-target="#focusslide" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner" role="listbox">
          <div class="item active"> <a href="" target="_blank"><img src="qiantaiblog/images/banner/banner_01.jpg" alt="" class="img-responsive"></a> 
            <!--<div class="carousel-caption"> </div>--> 
          </div>
          <div class="item"> <a href="" target="_blank"><img src="qiantaiblog/images/banner/banner_02.jpg" alt="" class="img-responsive"></a> 
            <!--<div class="carousel-caption"> </div>--> 
          </div>
          <div class="item"> <a href="" target="_blank"><img src="qiantaiblog/images/banner/banner_03.jpg" alt="" class="img-responsive"></a> 
            <!--<div class="carousel-caption"> </div>--> 
          </div>
        </div>
        <a class="left carousel-control" role="button" data-slide="prev" rel="nofollow"> 
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span> 
        <span class="sr-only">上一个</span> </a> <a class="right carousel-control" role="button" data-slide="next" rel="nofollow"> 
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> <span class="sr-only">下一个</span> </a> </div>
      <article class="excerpt-minic excerpt-minic-index">
        <h2><span class="red">【最新公告】</span><a href="" title="">${ann[0].announcement_title }</a></h2>
        <p class="note">${ann[0].announcement_content }</p>
      </article>
      
      <div class="title">
        <h3><a href="page/indexList.do">最新发布</a></h3>
        <div class="more" id="more">
        <c:forEach items="${list }" var="list">
        	<c:set value="${fn:split(list.article_label,',')}" var="label"/>
			<c:forEach items="${label}" var="l">
				<a id="label" name="label">${l }</a>
			</c:forEach>
       	</c:forEach>
        </div>
        <script type="text/javascript">
        	var label = document.getElementsByName("label");
        	var hash = [];
        	var content = "";
        	for(var i = 0;i < label.length;i++){
        		if(hash.indexOf(label[i].innerHTML) ==  -1){
        			content+="<a href='page/indexListcolumn.do?label="+label[i].innerHTML+"'>"+label[i].innerHTML+"</a>";
        			hash.push(label[i].innerHTML);
        		}
        	}
        	$("#more").html(content);
        </script>
      </div>
      <c:forEach items="${articleList.records}" var="article">
	      <article class="excerpt excerpt-1" >
	      <a class="focus" href="page/articleDetails.do?id=${article.id }&article_clicks=${article.article_clicks}" title="">
	      <img class="thumb" data-original="images/excerpt.jpg" src="${article.title_image }" alt=""></a>
	        <header><a class="cat" href="program">${article.column.column_name }<i></i></a>
	          <h2><a href="page/articleDetails.do?id=${article.id }&article_clicks=${article.article_clicks}" title="">${article.article_title }</a></h2>
	        </header>
	        <p class="meta">
	          <time class="time">
	          	<fmt:formatDate value="${article.createTime }" type="date" pattern="yyyy-MM-dd HH:mm:ss"/>
	          </time>
	          <span class="views"> 共${article.article_clicks }人围观</span>
	           <a class="comment" href="page/articleDetails.do?id=${article.id }&article_clicks=${article.article_clicks}">
	           	 ${article.comment_tota }条评论
	           </a>
	          </p>
	       <div class="texts">${article.article_content }</div>
	      </article>
      </c:forEach>
      <nav class="pagination" >
        <ul>
           <li class="next-page"><a href="page/indexListcolumn.do?current=${articleList.pre }${labels != null?'&label=':''}${labels != null?labels:''}">上一页</a></li>
          <c:forEach var="ye" begin="${articleList.beginPage }" end="${articleList.endPage }">
			  <li class="active">
			  	<a style="${articleList.currentPage==ye?'background: #FFFFFF;color:black;border: 1px red solid;':'' }" href="page/indexListcolumn.do?current=${ye}${labels != null?'&label=':''}${labels != null?labels:''}">${ye }</a>
			  </li>
			</c:forEach>
          <li class="next-page"><a href="page/indexListcolumn.do?current=${articleList.next }${labels != null?'&label=':''}${labels != null?labels:''}">下一页</a></li>
          <li><span>共 ${articleList.lastPage } 页</span></li>
        </ul>
      </nav>
    </div>
  </div>
  <jsp:include page="right.jsp"></jsp:include>
</section>

<jsp:include page="blog.jsp"></jsp:include>
<!-- <script src="qiantaiblog/js/bootstrap.min.js"></script>  -->
<script src="qiantaiblog/js/jquery.ias.js"></script> 
<script src="qiantaiblog/js/scripts.js"></script>
</body>
</html>
