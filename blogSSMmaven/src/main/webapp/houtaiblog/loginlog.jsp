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
    
    <title>My JSP 'loginlog.jsp' starting page</title>
    
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
	
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
	<body class="user-select">
<section class="container-fluid">
  <jsp:include page="header.jsp"></jsp:include>
  <div class="row">
    <jsp:include page="left.jsp"></jsp:include>
    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-lg-10 col-md-offset-2 main" id="main">
        <h1 class="page-header">操作</h1>
        <ol class="breadcrumb">
          <li><c:if test="${empty uid }">
	          <c:if test="${permission['userlog/deleteAll'] != null }">
				 	<a onclick="deleteLog('userlog/deleteLog.do')">清除所有登录记录</a>
			  </c:if>
			  <c:if test="${permission['userlog/deleteAll'] == null }">
				   <a href="javascript:alert('你没有该权限')">清除所有登录记录</a>
			   </c:if>
          
          </c:if> </li>
          <li>
          <c:if test="${permission['userlog/deleteUid'] != null }">
			  <a onclick="deleteLog('userlog/deleteLog.do?uid=${currentUser.id }${uid==0?'':'&id='}${uid==0?'':uid}')">清除本人登录记录</a>
		  </c:if>
		  <c:if test="${permission['userlog/deleteUid'] == null }">
			   <a href="javascript:alert('你没有该权限')">清除本人登录记录</a>
		   </c:if>
          
          </li>
        </ol>
        <h1 class="page-header">管理 <span class="badge">${count }</span></h1>
        <div class="table-responsive">
          <table class="table table-striped table-hover">
            <thead>
              <tr>
                <th><span class="glyphicon glyphicon-th-large"></span> <span class="visible-lg">ID</span></th>
                <th><span class="glyphicon glyphicon-user"></span> <span class="visible-lg">用户</span></th>
                <th><span class="glyphicon glyphicon-time"></span> <span class="visible-lg">时间</span></th>
                <th><span class="glyphicon glyphicon-adjust"></span> <span class="visible-lg">IP</span></th>
                <th><span class="glyphicon glyphicon-remove"></span> <span class="visible-lg">删除</span></th>
              </tr>
            </thead>
            <tbody>
            	<c:forEach items="${logList.records }" var="log" varStatus="s">
	              <tr>
	                <td>${log.id }</td>
	                <td class="article-title">${log.user.username }</td>
	                <td><fmt:formatDate value="${log.createTime }" type="date" pattern="yyyy-MM-dd HH:mm:ss"/></td>
	                <td>${log.ip }</td>
	                <td>
	                	<c:if test="${permission['userlog/deleteLog'] != null }">
			          		<a onclick="deleteLog('userlog/deleteLog.do?lid=${log.id }${uid==0?'':'&id='}${uid==0?'':uid}')">删除</a>
			          	</c:if>
			          	<c:if test="${permission['userlog/deleteLog'] == null }">
			          		<a href="javascript:alert('你没有该权限')">删除</a>
			          	</c:if>
	                	
	                </td>
	              </tr>
              </c:forEach>
            </tbody>
          </table>
        </div>
        <footer class="message_footer">
          <nav>
            <ul class="pagination pagenav">
              <li ><a href="userlog/list.do?current=${logList.pre }${uid==0?'':'&uid='}${uid==0?'':uid}"> <span aria-hidden="true">&laquo;</span> </a> </li>
              <c:forEach var="ye" begin="${logList.beginPage }" end="${logList.endPage }">
			  		<li class="active">
			  			<a style="${logList.currentPage==ye?'background: #FFFFFF;color:black;border: 1px red solid;':'' }" href="userlog/list.do?current=${ye }${uid==0?'':'&uid='}${uid==0?'':uid}">${ye }</a>
			  		</li>
			  </c:forEach>	
              
              <li ><a href="userlog/list.do?current=${logList.next }${uid==0?'':'&uid='}${uid==0?'':uid}"> <span aria-hidden="true">&raquo;</span> </a> </li>
            </ul>
          </nav>
        </footer>
    </div>
  </div>
</section>
<jsp:include page="blog.jsp"></jsp:include>
<script src="houtaiblog/js/bootstrap.min.js"></script> 
<script src="houtaiblog/js/admin-scripts.js"></script> 
<script type="text/javascript">
//是否确认删除
function deleteLog(url) {
            if (window.confirm("是否确认删除？")) {
            	 window.location = url;
          }
}
</script>
</body>
</html>
