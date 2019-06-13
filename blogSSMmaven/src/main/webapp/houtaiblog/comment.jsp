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
    
    <title>My JSP 'comment.jsp' starting page</title>
    
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
	var aid = document.getElementsByName("cid");
	for(var a = 0;a < aid.length;a++){
		aid[a].checked=true;
	}
}
function bu(){
	var aid = document.getElementsByName("cid");
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
      <form action="comment/deleteComment.do" method="post">
        <h1 class="page-header">管理<span style="font-size:17px;">未查看的信息：</span> <span style="color:red;font-size:17px;">${count }</span><span style="font-size:17px;">条</span></h1>
        <div class="table-responsive">
          <table class="table table-striped table-hover">
            <thead>
              <tr>
                <th><span class="glyphicon glyphicon-th-large"></span> <span class="visible-lg">选择</span></th>
                <th><span class="glyphicon glyphicon-file"></span> <span class="visible-lg">摘要</span></th>
                <th><span class="glyphicon glyphicon-time"></span> <span class="visible-lg">日期</span></th>
                <th><span class="glyphicon glyphicon-pencil"></span> <span class="visible-lg">操作</span></th>
              </tr>
            </thead>
            <tbody>
            	<c:forEach items="${commentList.records }" var="co">
	              <tr>
	                <td><input type="checkbox" class="input-control" name="cid" value="${co.id }" /></td>
	                <td class="article-title">${co.comment_content}</td>
	                <td><fmt:formatDate value="${co.createTime }" type="date" pattern="yyyy-MM-dd HH:mm:ss"/> </td>
	                <td>
	                <c:if test="${permission['comment/updateComment'] == null }">
	              		 <a href="javascript:alert('你没有该权限')" style="${co.status==0?'color:red;':'' }">查看</a>
	              	</c:if>
	              	<c:if test="${permission['comment/updateComment'] != null }">
	              		 <a rel="1" name="see" style="${co.status==0?'color:red;':'' }" onclick="commentTest(${co.id})" data-toggle="modal" data-target="#seeComment">查看</a>
	              	</c:if>
	               
	                 <a rel="1" href="${permission['comment/deleteComment'] == null?'javascript:alert(\'你没有该权限\');':'comment/deleteComment.do?cid='}${co.id }" name="delete">删除</a></td>
	              </tr>
                </c:forEach>
            </tbody>
          </table>
        </div>
        <footer class="message_footer">
          <nav>
            <div class="btn-toolbar operation" role="toolbar">
              <div class="btn-group" role="group"> 
              <a class="btn btn-default" onclick="quan()">全选</a> 
              <a class="btn btn-default" onclick="bu()">反选</a></div>
              <div class="btn-group" role="group">
              	<c:if test="${permission['comment/deleteComment'] == null }">
              		 <a class="btn btn-default" href="javascript:alert('你没有该权限')" data-toggle="tooltip" data-placement="bottom" title="删除全部选中" name="checkbox_delete">删除</a>
              	</c:if>
              	<c:if test="${permission['comment/deleteComment'] != null }">
              		  <button type="submit" class="btn btn-default" data-toggle="tooltip" data-placement="bottom" title="删除全部选中" name="checkbox_delete">删除</button>
              	</c:if>
               
              </div>
            </div>
            <ul class="pagination pagenav">
              <li ><a href="comment/list.do?current=${logList.pre}"> <span aria-hidden="true">&laquo;</span> </a> </li>
              <c:forEach var="ye" begin="${commentList.beginPage }" end="${commentList.endPage }">
			  		<li class="active">
			  			<a style="${commentList.currentPage==ye?'background: #FFFFFF;color:black;border: 1px red solid;':'' }" href="comment/list.do?current=${ye}">${ye }</a>
			  		</li>
			  </c:forEach>
              <li ><a href="comment/list.do?current=${logList.next}"> <span aria-hidden="true">&raquo;</span> </a> </li>
            </ul>
          </nav>
        </footer>
      </form>
    </div>
  </div>
</section>
<!--查看评论模态框-->
<div class="modal fade" id="seeComment" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
          <h4 class="modal-title" >查看评论</h4>
        </div>
        <div class="modal-body">
          <table class="table" style="margin-bottom:0px;">
            <thead>
              <tr> </tr>
            </thead>
            <tbody>
              <tr>
                <td wdith="20%">评论ID:</td>
                <td width="80%" class="see-comment-id"><span id="commentId"></span></td>
              </tr>
              <tr>
                <td wdith="20%">评论页面:</td>
                <td width="80%" class="see-comment-page"><span id="title"></span></td>
              </tr>
              <tr>
                <td wdith="20%">评论内容:</td>
                <td width="80%" class="see-comment-content"><span id="content"></span></td>
              </tr>
              <tr>
                <td wdith="20%">IP:</td>
                <td width="80%" class="see-comment-ip"><span id="comIp"></span></td>
              </tr>
              <tr>
                <td wdith="20%">所在地:</td>
                <td width="80%" class="see-comment-address"><span id="ipaddress"></span></td>
              </tr>
              <!-- <tr>
                <td wdith="20%">系统:</td>
                <td width="80%" class="see-comment-system"></td>
              </tr>
              <tr>
                <td wdith="20%">浏览器:</td>
                <td width="80%" class="see-comment-browser"></td>
              </tr> -->
            </tbody>
            <tfoot>
              <tr></tr>
            </tfoot>
          </table>
        </div>
        <div class="modal-footer">
          <button type="button" onclick="updateComment()" class="btn btn-default" data-dismiss="modal">朕已阅</button>
        </div>
      </div>
  </div>
</div>
<jsp:include page="blog.jsp"></jsp:include>
<script src="houtaiblog/js/bootstrap.min.js"></script> 
<script src="houtaiblog/js/admin-scripts.js"></script> 
<script>
function commentTest(id){
		$.ajax({
			type:"post",
			url: "comment/AjaxqueryId.do",
			data:"cid="+id,
			success:function(data){
				$("#commentId").html(data.id);
				$("#title").html(data.article.article_title);
				$("#content").html(data.comment_content);
				$("#comIp").html(data.ip);
				$("#ipaddress").html(data.ipaddress);
			}
		});
}
function updateComment(id){
	$.ajax({
			type:"post",
			url: "comment/updateComment.do",
			data:"cid="+$("#commentId").html(),
			success:function(data){
				window.location.reload();
			}
		});
}
</script>
</body>
</html>
