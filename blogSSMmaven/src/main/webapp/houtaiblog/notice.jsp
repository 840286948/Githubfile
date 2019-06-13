<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'notice.jsp' starting page</title>
    
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
<script type="text/javascript">
function quan(){
	var aid = document.getElementsByName("aid");
	for(var a = 0;a < aid.length;a++){
		aid[a].checked=true;
	}
}
function bu(){
	var aid = document.getElementsByName("aid");
	for(var a = 0;a < aid.length;a++){
		aid[a].checked=false;
	}
}
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

<body class="user-select">
<section class="container-fluid">
  <jsp:include page="header.jsp"></jsp:include>
  <div class="row">
    <jsp:include page="left.jsp"></jsp:include>
    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-lg-10 col-md-offset-2 main" id="main">
      <form action="ann/delAnn.do" method="post" >
        <h1 class="page-header">操作</h1>
        <ol class="breadcrumb">
          <li>
          	<a href="${permission['ann/insertAnn'] == null?'javascript:alert(\'你没有该权限\');':'houtaiblog/addupd-notice.jsp'}">增加公告</a>
          </li>
        </ol>
        <h1 class="page-header">管理 <span class="badge">3</span></h1>
        <div class="table-responsive">
          <table class="table table-striped table-hover">
            <thead>
              <tr>
                <th><span class="glyphicon glyphicon-th-large"></span> <span class="visible-lg">选择</span></th>
                <th><span class="glyphicon glyphicon-file"></span> <span class="visible-lg">标题</span></th>
                <th><span class="glyphicon glyphicon-time"></span> <span class="visible-lg">日期</span></th>
                <th><span class="glyphicon glyphicon-pencil"></span> <span class="visible-lg">操作</span></th>
              </tr>
            </thead>
            <tbody>
            	<c:forEach items="${annList.records }" var="ann">
	              <tr>
	                <td><input type="checkbox" class="input-control" name="aid" value="${ann.id }" /></td>
	                <td class="article-title">${ann.announcement_title}</td>
	                <td><fmt:formatDate value="${ann.createTime }" type="date" pattern="yyyy-MM-dd HH:mm:ss"/></td>
	                <td><a href="${permission['ann/updateAnn'] == null?'javascript:alert(\'你没有该权限\');':'ann/queryId.do?id='}${ann.id }">修改</a>
	                	<c:if test="${permission['ann/deleteAnn'] == null}">
	                		<a rel="6" href="javascript:alert('你没有该权限');">删除</a>
	                	</c:if>	
	                	<c:if test="${permission['ann/deleteAnn'] != null}">
	                		<a rel="6" onclick="delAnn(${ann.id})">删除</a>
	                	</c:if>	
	                 </td>
	              </tr>
              	</c:forEach>
            </tbody>
          </table>
        </div>
        <footer class="message_footer">
          <nav>
            <div class="btn-toolbar operation" role="toolbar">
              <div class="btn-group" role="group"> <a class="btn btn-default" onclick="quan()">全选</a>
               <a class="btn btn-default" onclick="bu()">反选</a> <a class="btn btn-default" onClick="noselect()">不选</a> </div>
              <div class="btn-group" role="group">
              	<c:if test="${permission['article/deleteArticle'] == null }">
              		 <a class="btn btn-default" data-toggle="tooltip" data-placement="bottom" title="删除全部选中" name="checkbox_delete" href="javascript:alert('你没有该权限')">删除</a>
              	</c:if>
              	<c:if test="${permission['article/deleteArticle'] != null }">
              		<button type="submit" class="btn btn-default" data-toggle="tooltip" data-placement="bottom" title="删除全部选中" name="checkbox_delete">删除</button>
              	</c:if>
                
              </div>
            </div>
            <ul class="pagination pagenav">
              <li><a href="ann/list.do?current=${annList.pre}"> <span aria-hidden="true">&laquo;</span> </a> </li>
              <c:forEach var="ye" begin="${annList.beginPage }" end="${annList.endPage }">
			  		<li class="active">
			  			<a style="${annList.currentPage==ye?'background: #FFFFFF;color:black;border: 1px red solid;':'' }" href="ann/list.do?current=${ye}">${ye }</a>
			  		</li>
			  </c:forEach>
              <li><a href="ann/list.do?current=${annList.next}" aria-label="Next"> <span aria-hidden="true">&raquo;</span> </a> </li>
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
<script>
//是否确认删除
function delAnn(id){
			if(window.confirm("此操作不可逆，是否确认？")){
				window.location = "ann/delAnn.do?aid="+id;
			}
}
</script>
</body>
</html>
