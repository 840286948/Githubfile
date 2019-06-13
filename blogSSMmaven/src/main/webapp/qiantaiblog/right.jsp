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
    
    <title>My JSP 'right.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
		$.ajax({
			type:"post",
			url: "page/AjaxArticle.do",
			success:function(data){
				var article = "";
				$.each(data,function(index,a){
					article += "<li><a href='page/articleDetails.do?id="+a.id+"&article_clicks="+a.article_clicks+"'><span class='thumbnail'>";
					article += "<img class='thumb' data-original='images/excerpt.jpg' src='"+a.title_image+"'>";
					article += "</span><span class='text'>"+a.article_title+"</span>";
					var date=new Date(a.createTime);
					var month=date.getMonth()+1;
					article += "<span class='muted'> "+date.getFullYear()+"-"+month+"-"+date.getDate()+" </span>";
					article += "<span class='muted'> "+a.article_clicks+"</span></a></li>";
				});
				var Week = ['日','一','二','三','四','五','六'];  
				var date=new Date();
				var month=date.getMonth()+1;
				var sj = date.getFullYear()+"年"+month+"月"+date.getDate()+"日 星期"+Week[date.getDay()];
				$("#shijian").html(sj);
				$("#articleUL").html(article);
			}
		});
		
        
	</script>
  </head>
  
  <body>
  <aside class="sidebar">
    <div class="fixed">
    	<c:if test="${not empty ann }">
      <div class="widget widget-tabs">
        <ul class="nav nav-tabs" role="tablist">
          <li role="presentation" class="active"><a href="#notice" aria-controls="notice" role="tab" data-toggle="tab">网站公告</a></li>
        <!--   <li role="presentation"><a href="#centre" aria-controls="centre" role="tab" data-toggle="tab">会员中心</a></li>
          <li role="presentation"><a href="#contact" aria-controls="contact" role="tab" data-toggle="tab">联系站长</a></li>
        --> </ul>
        <div class="tab-content">
          <div role="tabpanel" class="tab-pane notice active" id="notice" style="overflow:auto;">
            <ul>
              <c:forEach items="${ann }" var="ann">
	              <li>
	                <time datetime="2016-01-04"><fmt:formatDate value="${ann.createTime }" type="date" pattern="yyyy-MM"/></time>
	                <a target="_blank">${ann.announcement_title }</a>
	              </li>
              </c:forEach>
            </ul>
          </div>
          <!-- <div role="tabpanel" class="tab-pane centre" id="centre">
            <h4>需要登录才能进入会员中心</h4>
            <p> <a data-toggle="modal" data-target="#loginModal" class="btn btn-primary">立即登录</a> <a href="javascript:;" class="btn btn-default">现在注册</a> </p>
          </div>
          <div role="tabpanel" class="tab-pane contact" id="contact">
            <h2>Email:<br />
              <a href="mailto:admin@ylsat.com" data-toggle="tooltip" data-placement="bottom" title="admin@ylsat.com">admin@ylsat.com</a></h2>
          </div> -->
        </div>
      </div>
      </c:if>
      <div class="widget widget_search">
        <form class="navbar-form" action="page/indexListcolumn.do" method="post">
          <div class="input-group">
            <input type="text" name="keywords" class="form-control" size="35" placeholder="请输入关键字" maxlength="15" autocomplete="off">
            <span class="input-group-btn">
            <button class="btn btn-default btn-search" name="search" type="submit">搜索</button>
            </span> </div>
        </form>
      </div>
    </div>
    <div class="widget widget_sentence">
      <h3>每日一句</h3>
      <div class="widget-sentence-content">
        <h4 id="shijian">ss</h4>
        <p>Do not let what you cannot do interfere with what you can do.<br />
          别让你不能做的事妨碍到你能做的事。（John Wooden）</p>
      </div>
    </div>
    <div class="widget widget_hot">
      <h3>热门文章</h3>
      <ul id="articleUL">
       </ul>
    </div>
  </aside>
  </body>
</html>
