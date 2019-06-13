<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'update-category.jsp' starting page</title>
    
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
<script type="text/javascript" src="houtaiblog/wjs/user.js"></script>
<script src="houtaiblog/js/jquery-2.1.4.min.js"></script>
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
      <h1 class="page-header">修改栏目</h1>
      <form action="column/insertUpd.do" method="post" onsubmit="return columnTest()">
        <div class="form-group">
          <label for="category-name">栏目名称</label>
          <input type="hidden" name="id" value="${column.id }"/>
          <input type="text" onblur="columnName(${column.id})" id="category-name" name="column_name" value="${column.column_name }" class="form-control" placeholder="在此处输入栏目名称" required autocomplete="off">
          <span class="prompt-text">这将是它在站点上显示的名字。</span><span id="c_name" style="color:red;"></span></div>
        <div class="form-group">
          <label for="category-alias">栏目别名</label>
          <input type="text" id="category-alias" name="column_alias" value="${column.column_alias }" class="form-control" placeholder="在此处输入栏目别名" required autocomplete="off">
          <span class="prompt-text">“别名”是在URL中使用的别称，它可以令URL更美观。通常使用小写，只能包含字母，数字和连字符（-）。</span> </div>
       <!--  <div class="form-group">
          <label for="category-fname">父节点</label>
          <select id="category-fname" class="form-control" name="fid">
            <option value="0" selected>无</option>
            <option value="1">前端技术</option>
            <option value="2">后端程序</option>
            <option value="3">管理系统</option>
            <option value="4">授人以渔</option>
            <option value="5">程序人生</option>
          </select>
          <span class="prompt-text">栏目是有层级关系的，您可以有一个“音乐”分类目录，在这个目录下可以有叫做“流行”和“古典”的子目录。</span> </div> -->
        <div class="form-group">
          <label for="category-keywords">关键字</label>
          <input type="text" id="category-keywords" name="column_keywords" value="${column.column_keywords }" class="form-control" placeholder="在此处输入栏目关键字" autocomplete="off">
          <span class="prompt-text">关键字会出现在网页的keywords属性中。</span> </div>
        <div class="form-group">
          <label for="category-describe">描述</label>
          <textarea class="form-control" id="category-describe" name="column_description" rows="4" autocomplete="off">${column.column_description }</textarea>
          <span class="prompt-text">描述会出现在网页的description属性中。</span> </div>
        <button class="btn btn-primary" type="submit" name="submit">更新</button>
      </form>
    </div>
  </div>
</section>
<jsp:include page="blog.jsp"></jsp:include>
<script src="houtaiblog/js/bootstrap.min.js"></script> 
<script src="houtaiblog/js/admin-scripts.js"></script>

</body>
</html>