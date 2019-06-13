<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'manage-user.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="js/jquery.js"></script>
	<link rel="stylesheet" type="text/css" href="houtaiblog/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="houtaiblog/css/style.css">
	<link rel="stylesheet" type="text/css" href="houtaiblog/css/font-awesome.min.css">
	<link rel="apple-touch-icon-precomposed" href="houtaiblog/images/icon/icon.png">
	<link rel="shortcut icon" href="houtaiblog/images/icon/favicon.ico">
	<script src="houtaiblog/js/jquery-2.1.4.min.js"></script>
	<script type="text/javascript" src="houtaiblog/wjs/user.js"></script>
  </head>
  
  	<body class="user-select">
<section class="container-fluid">
<jsp:include page="header.jsp"></jsp:include>
  <div class="row">
    <jsp:include page="left.jsp"></jsp:include>
    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-lg-10 col-md-offset-2 main" id="main">
    <h1 class="page-header">操作</h1>
        <ol class="breadcrumb">
          <li>
          	<c:if test="${permission['user/addUser'] != null }">
          		<a data-toggle="modal" data-target="#addUser">增加用户</a>
          	</c:if>
          	<c:if test="${permission['user/addUser'] == null }">
          		<a href="javascript:alert('你没有该权限')">增加用户</a>
          	</c:if>
          </li>
        </ol>
        <h1 class="page-header">管理 <span class="badge">2</span></h1>
        <div class="table-responsive">
          <table class="table table-striped table-hover">
            <thead>
              <tr>
                <th><span class="glyphicon glyphicon-th-large"></span> <span class="visible-lg">ID</span></th>
                <th><span class="glyphicon glyphicon-user"></span> <span class="visible-lg">用户名</span></th>
                <th><span class="glyphicon glyphicon-bookmark"></span> <span class="visible-lg">姓名</span></th>
                <th><span class="glyphicon glyphicon-pushpin"></span> <span class="visible-lg">文章</span></th>
                <th><span class="glyphicon glyphicon-time"></span> <span class="visible-lg">上次登录时间</span></th>
                <th><span class="glyphicon glyphicon-pencil"></span> <span class="visible-lg">操作</span></th>
              </tr>
            </thead>
            <tbody>
            <c:forEach items="${list }" var="u">
              <tr>
                <td>${u.id }</td>
                <td>${u.username }</td>
                <td>${u.realname }</td>
                <td>${fn:length(u.article)}</td>
                <td>
                	<c:forEach items="${u.userLog }" var="log" varStatus="s">
                		<c:if test="${log.user_id == currentUser.id and fn:length(u.userLog) == s.index+2  }">
                			<fmt:formatDate value="${log.createTime }" type="date" pattern="yyyy-MM-dd HH:mm:ss"/> 
                		</c:if>
                		<c:if test="${fn:length(u.userLog) == s.index+1 and log.user_id != currentUser.id }">
                			<fmt:formatDate value="${log.createTime }" type="date" pattern="yyyy-MM-dd HH:mm:ss"/> 
                		</c:if>
                	</c:forEach>
                </td>
                <td>
                <c:if test="${permission['user/updateUser'] != null }">
	          		<a rel="1" onclick="update(${u.id},1)" name="see" data-toggle="modal" data-target="#seeUser">修改</a> 
	          	</c:if>
	          	<c:if test="${permission['user/updateUser'] == null }">
	          		<a href="javascript:alert('你没有该权限')">修改</a>
	          	</c:if>
                <c:if test="${permission['user/deleteUser'] != null }">
                	<a onclick="deleteUser(${u.id })" rel="1" name="delete">删除</a>
	          	</c:if>
	          	<c:if test="${permission['user/deleteUser'] == null }">
	          		<a href="javascript:alert('你没有该权限')">删除</a>
	          	</c:if>
                
                <c:if test="${permission['user/jinqiUser'] != null }">
                	<c:if test="${u.status==0 }"> <a onclick="updateUser(${u.id })">禁用</a></c:if>
                	<c:if test="${u.status==1 }"> <a href="user/addupdatedel.do?id=${u.id }&status=0">启用</a></c:if>
	          	</c:if>
	          	<c:if test="${permission['user/jinqiUser'] == null }">
		          	<c:if test="${u.status==0 }"> <a  href="javascript:alert('你没有该权限')">禁用</a></c:if>
	                <c:if test="${u.status==1 }"> <a  href="javascript:alert('你没有该权限')">启用</a></c:if>
	          	</c:if>
                </td>
              </tr>
              </c:forEach>
            </tbody>
          </table>
        </div>
    </div>
  </div>
</section>

<!--增加用户模态框-->
<div class="modal fade" id="addUser" tabindex="-1" role="dialog" aria-labelledby="addUserModalLabel">
  <div class="modal-dialog" role="document" style="max-width:450px;">
    <form action="user/addupdatedel.do" method="post" autocomplete="off" draggable="false" onsubmit="return insertUser()">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
          <h4 class="modal-title" >增加用户</h4>
        </div>
        <div class="modal-body">
          <table class="table" style="margin-bottom:0px;">
            <thead>
              <tr> </tr>
            </thead>
            <tbody>
              <tr>
                <td wdith="20%">姓名:</td>
                <td width="80%"><input type="text" value="" class="form-control" id="realnamez" name="realname" maxlength="10" autocomplete="off" /></td>
              </tr>
              <tr>
                <td wdith="20%">用户名:</td>
                <td width="80%"><input type="text" value="" class="form-control" onblur="nameTest()" id="usernamez" name="username" maxlength="10" autocomplete="off" /><span style="color:red;" id="namets"></span></td>
              </tr>
              <tr>
                <td wdith="20%">电话:</td>
                <td width="80%"><input type="text" value="" class="form-control" id="telephonez" name="telephone" maxlength="13" autocomplete="off" /></td>
              </tr>
              <tr>
                <td wdith="20%">新密码:</td>
                <td width="80%"><input type="password" class="form-control" id="passwordz" name="password" maxlength="18" autocomplete="off" /></td>
              </tr>
              <tr>
                <td wdith="20%">确认密码:</td>
                <td width="80%"><input type="password" class="form-control" id="new_passwordz" name="new_password" maxlength="18" autocomplete="off" /></td>
              </tr>
            </tbody>
            <tfoot>
              <tr></tr>
            </tfoot>
          </table>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
          <button type="submit" class="btn btn-primary">提交</button>
        </div>
      </div>
    </form>
  </div>
</div>

<script type="text/javascript">
	
</script>
<!--用户信息模态框-->
<div class="modal fade" id="seeUser" tabindex="-1" role="dialog" aria-labelledby="seeUserModalLabel">
  <div class="modal-dialog" role="document" style="max-width:450px;">
    <form action="user/addupdatedel.do" method="post" autocomplete="off" draggable="false" onsubmit="return updateUsers(1)">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
          <h4 class="modal-title">修改用户</h4>
        </div>
        <div class="modal-body">
          <table class="table" style="margin-bottom:0px;">
            <thead>
              <tr> </tr>
            </thead>
            <tbody>
              <tr>
                <td wdith="20%">姓名:</td>
                <td width="80%">
                <input type="hidden" value="" id="userid1" name="id" />
                	<input type="text" value="" class="form-control" id="realname1" name="realname" maxlength="10" autocomplete="off" />
                </td>
              </tr>
              <tr>
                <td wdith="20%">用户名:</td>
                <td width="80%"><input type="text" value="" class="form-control" disabled="disabled" id="username1" name="username" maxlength="10" autocomplete="off" /></td>
              </tr>
              <tr>
                <td wdith="20%">电话:</td>
                <td width="80%"><input type="text" value="" class="form-control" id="telephone1" name="telephone" maxlength="13" autocomplete="off" /></td>
              </tr>
              <tr>
                <td wdith="20%">旧密码:</td>
                <td width="80%"><input type="password" class="form-control" onblur="passwordTest(1)" id="old_password1" name="old_password" maxlength="18" autocomplete="off" /><span style="color:red;" id="old_pwd1"></span></td>
              </tr>
              <tr>
                <td wdith="20%">新密码:</td>
                <td width="80%"><input type="password" class="form-control" id="password1" name="password" maxlength="18" autocomplete="off" /></td>
              </tr>
              <tr>
                <td wdith="20%">确认密码:</td>
                <td width="80%"><input type="password" class="form-control" id="new_password1" name="new_password" maxlength="18" autocomplete="off" /></td>
              </tr>
            </tbody>
            <tfoot>
              <tr></tr>
            </tfoot>
          </table>
        </div>
        <div class="modal-footer">
          <input type="hidden" name="userid" value="" />
          <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
          <button type="submit" class="btn btn-primary">提交</button>
        </div>
      </div>
    </form>
  </div>
</div>
<jsp:include page="blog.jsp"></jsp:include>
<script src="houtaiblog/js/bootstrap.min.js"></script> 
<script src="houtaiblog/js/admin-scripts.js"></script> 
<script type="text/javascript">
function deleteUser(id) {
		if(id == '${currentUser.id}'){
			alert("你不能删除自己");
		}else if (window.confirm("是否确认删除？")) {
                  window.location = "user/addupdatedel.do?status=2&id="+id;
          }
}
function updateUser(id) {
         if(id == '${currentUser.id}'){
			alert("你不能禁用自己");
		  }else if (window.confirm("是否确认禁用？")) {
                  window.location = "user/addupdatedel.do?status=1&id="+id;
          }
}
</script>
</body>
</html>
