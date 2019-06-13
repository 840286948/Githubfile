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
	<script type="text/javascript" src="js/jquery.js"></script>
	<link rel="stylesheet" type="text/css" href="houtaiblog/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="houtaiblog/css/style.css">
<link rel="stylesheet" type="text/css" href="houtaiblog/css/font-awesome.min.css">
<link rel="apple-touch-icon-precomposed" href="houtaiblog/images/icon/icon.png">
<link rel="shortcut icon" href="houtaiblog/images/icon/favicon.ico">
<script src="houtaiblog/js/jquery-2.1.4.min.js"></script>
<script type="text/javascript" src="houtaiblog/wjs/user.js"></script>
<script type="text/javascript" src="houtaiblog/wjs/article.js"></script>
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
<section class="container-fluid">
  <jsp:include page="header.jsp"></jsp:include>
  <div class="row">
    <jsp:include page="left.jsp"></jsp:include>
    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-lg-10 col-md-offset-2 main" id="main">
      <form action="article/deleteArticle.do" method="post" >
        <h1 class="page-header">操作</h1>
        <ol class="breadcrumb">
          <li><a href="${permission['article/insertArticle'] == null?'javascript:alert(\'你没有该权限\')':'article/idArticle.do'}">增加文章</a></li>
        </ol>
        <h1 class="page-header">管理 <span class="badge">${count }</span></h1>
        <div class="table-responsive">
          <table class="table table-striped table-hover">
            <thead>
              <tr>
                <th><span class="glyphicon glyphicon-th-large"></span> <span class="visible-lg">选择</span></th>
                <th><span class="glyphicon glyphicon-file"></span> <span class="visible-lg">标题</span></th>
                <th><span class="glyphicon glyphicon-list"></span> <span class="visible-lg">栏目</span></th>
                <th class="hidden-sm"><span class="glyphicon glyphicon-tag"></span> <span class="visible-lg">标签</span></th>
                <th class="hidden-sm"><span class="glyphicon glyphicon-comment"></span> <span class="visible-lg">评论</span></th>
                <th><span class="glyphicon glyphicon-time"></span> <span class="visible-lg">日期</span></th>
                <th><span class="glyphicon glyphicon-pencil"></span> <span class="visible-lg">置顶</span></th>
                <th><span class="glyphicon glyphicon-pencil"></span> <span class="visible-lg">操作</span></th>
              </tr>
            </thead>
            <tbody>
            	<c:forEach items="${articleList.records }" var="a">
	              <tr>
	                <td><input type="checkbox" class="input-control" name="aid" value="${a.id }" /></td>
	                <td class="article-title">${a.article_title }</td>
	                <td>${a.column.column_name }</td>
	                <td class="hidden-sm">${a.article_label }</td>
	                <td class="hidden-sm">${a.comment_tota}</td>
	                <td><fmt:formatDate value="${a.createTime }" type="date" pattern="yyyy-MM-dd HH:mm:ss"/></td>
	                <td>
	                	<c:if test="${a.zding_status == 0}">
	                		<a href="${permission['article/zdingArticle'] == null?'javascript:alert(\'你没有该权限\');':'article/updZhiding.do?zding_status=1&id='}${a.id }">置顶</a>
	                	</c:if>
	                	<c:if test="${a.zding_status == 1}">
	                		<a href="${permission['article/zdingArticle'] == null?'javascript:alert(\'你没有该权限\');':'article/updZhiding.do?zding_status=0&id='}${a.id }">取消置顶</a>
	                	</c:if>
	                </td>
	                <td><a href="${permission['article/insertArticle'] == null?'javascript:alert(\'你没有该权限\');':'article/idArticle.do?id='}${a.id }">修改</a> 
	                <a rel="6" href="${permission['article/deleteArticle'] == null?'javascript:alert(\'你没有该权限\');':'article/deleteArticle.do?aid='}${a.id }">删除</a></td>
	              </tr>
              	</c:forEach>
            </tbody>
          </table>
        </div>
        <footer class="message_footer">
          <nav>
            <div class="btn-toolbar operation" role="toolbar">
              <div class="btn-group" role="group"> <a class="btn btn-default" onclick="quan()">全选</a> <a class="btn btn-default" onclick="bu()">不选</a> </div>
              <div class="btn-group" role="group">
              	<c:if test="${permission['article/deleteArticle'] == null }">
              		 <a class="btn btn-default" href="javascript:alert('你没有该权限')" data-toggle="tooltip" data-placement="bottom" title="删除全部选中" name="checkbox_delete">删除</a>
              	</c:if>
              	<c:if test="${permission['article/deleteArticle'] != null }">
              		 <button type="submit" class="btn btn-default" data-toggle="tooltip" data-placement="bottom" title="删除全部选中" name="checkbox_delete">删除</button>
              	</c:if>
               
              </div>
            </div>
            <ul class="pagination pagenav">
              <li><a href="article/list.do?current=${articleList.pre}${kw != nul?'&keywords=':''}${kw != nul?kw:''}"> <span aria-hidden="true">&laquo;</span> </a> </li>
              <c:forEach var="ye" begin="${articleList.beginPage }" end="${articleList.endPage }">
			  		<li class="active">
			  			<a style="${articleList.currentPage==ye?'background: #FFFFFF;color:black;border: 1px red solid;':'' }" href="article/list.do?current=${ye}${kw != null?'&keywords=':''}${kw != null?kw:''}">${ye }</a>
			  		</li>
			  </c:forEach>
              <li><a href="article/list.do?current=${articleList.next}${kw != nul?'&keywords=':''}${kw != nul?kw:''}" aria-label="Next"> <span aria-hidden="true">&raquo;</span> </a> </li>
            </ul>
          </nav>
        </footer>
      </form>
    </div>
  </div>
</section>
<jsp:include page="blog.jsp"></jsp:include>
<script src="houtaiblog/js/bootstrap.min.js"></script> 
<script src="houtaiblog/js/admin-scripts.js"></script> 
</body>
</html>
