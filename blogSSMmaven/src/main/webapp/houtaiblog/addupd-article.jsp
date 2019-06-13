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
    
    <title>My JSP 'addupd-acticle.jsp' starting page</title>
    
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
<script type="text/javascript" src="houtaiblog/ueditor/ueditor.config.js"></script>
	<script type="text/javascript" src="houtaiblog/ueditor/ueditor.all.js"></script>
<!--[if gte IE 9]>
  <script src="js/jquery-1.11.1.min.js" type="text/javascript"></script>
  <script src="js/html5shiv.min.js" type="text/javascript"></script>
  <script src="js/respond.min.js" type="text/javascript"></script>
  <script src="js/selectivizr-min.js" type="text/javascript"></script>
<![endif]-->
<!--[if lt IE 9]>
  <script>window.location.href='upgrade-browser.html';</script>
<![endif]-->
<script type="text/javascript">
	function imgChange(obj) {
		var file =document.getElementById("file");
		var imgUrl =window.URL.createObjectURL(file.files[0]);
		document.getElementById('imghead').setAttribute('src',imgUrl);
	}
</script>
</head>

<body class="user-select">
<section class="container-fluid">
  <jsp:include page="header.jsp"></jsp:include>
  <div class="row">
    <jsp:include page="left.jsp"></jsp:include>
    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-lg-10 col-md-offset-2 main" id="main">
      <div class="row">
        <form action="article/insertUpd.do" method="post" enctype="multipart/form-data" onsubmit="return atest()" class="add-article-form">
          <div class="col-md-9">
            <h1 class="page-header">撰写新文章</h1>
            <div class="form-group">
              <input type="hidden" name="id" value="${article.id }"/>
              <input type="hidden" name="user_id" value="${currentUser.id }"/>
              <label for="article-title" class="sr-only">标题</label>
              <input type="text" value="${article.article_title }" id="article_title" name="article_title" class="form-control" placeholder="在此处输入标题" required autofocus autocomplete="off">
            </div>
            <div class="form-group">
              <label for="article-content" class="sr-only">内容</label>
              <textarea id="myEditor" name="article_content" rows="20" cols="20">${article.article_content }</textarea>
		  		<script type="text/javascript">
					var ue = UE.getEditor('myEditor');
				</script>
            </div>
            <div class="add-article-box">
              <h2 class="add-article-box-title"><span>关键字</span></h2>
              <div class="add-article-box-content">
              	<input type="text"  value="${article.article_keywords }" id="article_keywords" class="form-control" placeholder="请输入关键字" name="article_keywords" autocomplete="off">
                <span class="prompt-text">多个标签请用英文逗号,隔开。</span>
              </div>
            </div>
            <div class="add-article-box">
              <h2 class="add-article-box-title"><span>描述</span></h2>
              <div class="add-article-box-content">
              	<textarea class="form-control"  id="article_describe" name="article_describe" autocomplete="off">${article.article_describe }</textarea>
                <span class="prompt-text">描述是可选的手工创建的内容总结，并可以在网页描述中使用</span>
              </div>
            </div>
          </div>
          <div class="col-md-3">
            <h1 class="page-header">操作</h1>
            <div class="add-article-box">
              <h2 class="add-article-box-title"><span>栏目</span></h2>
              <div class="add-article-box-content">
                <ul class="category-list">
                  <li>
                    <label>
                    	<c:forEach items="${column }" var="c">
                      		<input name="column_id" type="radio" ${article.id == null?"checked='checked'":''} ${c.id==article.column.id?"checked='checked'":''} value="${c.id }" >${c.column_name }<br/>
                      </c:forEach>
                      </label>
                  </li>
                </ul>
              </div>
            </div>
            <div class="add-article-box">
              <h2 class="add-article-box-title"><span>标签</span></h2>
              <div class="add-article-box-content">
                <input type="text" class="form-control" id="article_label"  value="${article.article_label }" placeholder="输入新标签" name="article_label" autocomplete="off">
                <span class="prompt-text">多个标签请用英文逗号,隔开</span> </div>
            </div>
            <div class="add-article-box">
              <h2 class="add-article-box-title"><span>标题图片</span></h2>
              
              	<div id="preview">
              		<c:if test="${article != null}">
						<input type="hidden" name="title_image" value="${article.title_image }"/>
					
					<img id="imghead" src="${article.title_image }" width="260"height="180"/> <!--图片显示位置-->
					</c:if>
				</div>
              
              <div class="add-article-box-content">
                <input type="file" id="file" value="${article.title_image }" name="file"  onchange="imgChange(this)"/>
              </div>
            </div>
            <div class="add-article-box">
              <h2 class="add-article-box-title"><span>发布</span></h2>
              <div class="add-article-box-content">
              	<!-- <p><label>状态：</label><span class="article-status-display">未发布</span></p> -->
                <p><label>公开度：</label>
                <input type="radio" name="status" value="0" ${article.status == 0 or article == null?"checked='checked'":''}/>
                	公开 <input type="radio" name="status" value="1" ${article.status == 1?"checked='checked'":''} />加密</p>
                 <p><label>是否评论：</label>
                <input type="radio" name="comment_status" value="0" ${article.comment_status == 0 or article == null?"checked='checked'":''}/>
                	是<input type="radio" name="comment_status" value="1" ${article.comment_status == 1?"checked='checked'":''} />否</p>
                 <p><c:if test="${article != null }">
                 	<label>发布于：
                 </label><span class="article-time-display">
                 <fmt:formatDate value="${article.createTime }" type="date" pattern="yyyy-MM-dd HH:mm:ss"/>
                 </span>
                 </c:if></p>
              </div>
              <div class="add-article-box-footer">
                <button class="btn btn-primary" type="submit" name="submit">发布</button>
              </div>
            </div>
          </div>
        </form>
      </div>
    </div>
  </div>
</section>
<jsp:include page="blog.jsp"></jsp:include>
<script src="houtaiblog/js/bootstrap.min.js"></script> 
<script src="houtaiblog/js/admin-scripts.js"></script>
  </body>
</html>
