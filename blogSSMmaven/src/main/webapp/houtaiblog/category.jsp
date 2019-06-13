<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'category.jsp' starting page</title>
    
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
<script type="text/javascript" src="houtaiblog/wjs/column.js"></script>
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
      <div class="row">
        <div class="col-md-5">
          <h1 class="page-header">添加</h1>
          <form action="column/insertUpd.do" method="post" autocomplete="off" onsubmit="return columnTest()">
            <div class="form-group">
              <label for="category-name">栏目名称</label>
              <input type="text" onblur="columnName(0)" id="category-name" name="column_name" class="form-control" placeholder="在此处输入栏目名称" required autocomplete="off">
              <span class="prompt-text">这将是它在站点上显示的名字。</span>
              <span id="c_name" style="color:red;"></span>
               </div>
            <div class="form-group">
              <label for="category-alias">栏目别名</label>
              <input type="text" id="category-alias" name="column_alias" class="form-control" placeholder="在此处输入栏目别名" required autocomplete="off">
              <span class="prompt-text">“别名”是在URL中使用的别称，它可以令URL更美观。通常使用小写，只能包含字母，数字和连字符（-）。</span> </div>
            <!-- <div class="form-group">
              <label for="category-fname">父节点</label>
              <select id="category-fname" class="form-control" name="fid">
                <option value="0" selected>无</option>
                <option value="1">前端技术</option>
                <option value="2">后端程序</option>
                <option value="3">管理系统</option>
                <option value="4">授人以渔</option>
                <option value="5">程序人生</option>
              </select>
              <span class="prompt-text">栏目是有层级关系的，您可以有一个“音乐”分类目录，在这个目录下可以有叫做“流行”和“古典”的子目录。</span>
               </div> -->
            <div class="form-group">
              <label for="category-keywords">关键字</label>
              <input type="text" id="category-keywords" name="column_keywords" class="form-control" placeholder="在此处输入栏目关键字" autocomplete="off">
              <span class="prompt-text">关键字会出现在网页的keywords属性中。</span> </div>
            <div class="form-group">
              <label for="category-describe">描述</label>
              <textarea class="form-control" id="category-describe" name="column_description" rows="4" autocomplete="off"></textarea>
              <span class="prompt-text">描述会出现在网页的description属性中。</span> </div>
              <c:if test="${permission['column/insertColumn'] == null }">
              		 <a class="btn btn-primary" name="submit" href="javascript:alert('你没有该权限')">添加新栏目</a>
              	</c:if>
              	<c:if test="${permission['column/insertColumn'] != null }">
              		  <button class="btn btn-primary" type="submit" name="submit">添加新栏目</button>
              	</c:if>
           
          </form>
        </div>
        <div class="col-md-7">
          <h1 class="page-header">管理 <!-- <span class="badge">3</span> --></h1>
          <div class="table-responsive">
            <table class="table table-striped table-hover">
              <thead>
                <tr>
                  <th><span class="glyphicon glyphicon-paperclip"></span> <span class="visible-lg">ID</span></th>
                  <th><span class="glyphicon glyphicon-file"></span> <span class="visible-lg">名称</span></th>
                  <th><span class="glyphicon glyphicon-list-alt"></span> <span class="visible-lg">别名</span></th>
                  <th><span class="glyphicon glyphicon-pushpin"></span> <span class="visible-lg">总数</span></th>
                  <th><span class="glyphicon glyphicon-pencil"></span> <span class="visible-lg">操作</span></th>
                </tr>
              </thead>
              <tbody>
              	<c:forEach items="${columnList }" var="c" varStatus="s">
	                <tr>
	                  <td>${s.index+1 }</td>
	                  <td>${c.column_name }</td>
	                  <td>${c.column_alias }</td>
	                  <td>${fn:length(c.article)}</td>
	                  <td><a href="${permission['column/updateColumn'] == null?'javascript:alert(\'你没有该权限\');':'column/queryId.do?id='}${c.id }">修改</a>
	                   <c:if test="${permission['column/deleteColumn'] != null}"><a onclick="deleteColumn(${c.id})" >删除</a></c:if>
	                  	<c:if test="${permission['column/deleteColumn'] == null}"><a href="javascript:alert('你没有该权限')" >删除</a></c:if>
	                   </td>
	                </tr>
                </c:forEach>
              </tbody>
            </table>
            <span class="prompt-text"><strong>注：</strong>删除一个栏目也会删除栏目下的文章和子栏目,请谨慎删除!</span> </div>
        </div>
      </div>
    </div>
  </div>
</section>
<jsp:include page="blog.jsp"></jsp:include>
<script src="houtaiblog/js/bootstrap.min.js"></script> 
<script src="houtaiblog/js/admin-scripts.js"></script>
<script type="text/javascript">
function deleteColumn(id) {
            if (window.confirm("删除栏目，该栏目下的文章都会删除，请您慎重？")) {
                  window.location = "column/deleteColumn.do?id="+id;
          }
}
</script>
</body>
</html>
