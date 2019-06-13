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
	<link rel="stylesheet" href="css/zTreeStyle.css">
	<script type="text/javascript" src="js/jquery.js"></script>
	<link rel="stylesheet" type="text/css" href="houtaiblog/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="houtaiblog/css/style.css">
	<link rel="stylesheet" type="text/css" href="houtaiblog/css/font-awesome.min.css">
	<link rel="apple-touch-icon-precomposed" href="houtaiblog/images/icon/icon.png">
	<link rel="shortcut icon" href="houtaiblog/images/icon/favicoWn.ico">
	<script src="houtaiblog/js/jquery-2.1.4.min.js"></script>
	<script type="text/javascript" src="houtaiblog/wjs/user.js"></script>
	<script type="text/javascript" src="houtaiblog/wjs/role.js"></script>
	
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
          	<c:if test="${permission['role/insertRole'] != null }">
          		<a data-toggle="modal" data-target="#addUser">增加角色</a>
          	</c:if>
          	<c:if test="${permission['role/insertRole'] == null }">
          		<a href="javascript:alert('你没有该权限')">增加角色</a>
          	</c:if>
          </li>
        </ol>
        <h1 class="page-header">管理 <span class="badge">2</span></h1>
        <div class="table-responsive">
          <table class="table table-striped table-hover">
            <thead>
              <tr>
                <th><span class="glyphicon glyphicon-th-large"></span> <span class="visible-lg">ID</span></th>
                <th><span class="glyphicon glyphicon-user"></span> <span class="visible-lg">角色</span></th>
                <th><span class="glyphicon glyphicon-bookmark"></span> <span class="visible-lg">操作</span></th>
                <th><span class="glyphicon glyphicon-pushpin"></span> <span class="visible-lg">操作</span></th>
                <th><span class="glyphicon glyphicon-time"></span> <span class="visible-lg">操作</span></th>
              </tr>
            </thead>
            <tbody>
            <c:forEach items="${roleList }" var="role">
              <tr>
                <td>${role.id }</td>
                <td>${role.role_name }</td>
                <td>
                	<c:if test="${permission['role/insertUserRole'] != null }">
		          		 <a data-toggle="modal" data-target="#seeUser" onclick="assginUser('no',${role.id})">未分配用户</a>
		          	</c:if>
		          	<c:if test="${permission['role/insertUserRole'] == null }">
		          		<a href="javascript:alert('你没有该权限')">未分配用户</a>
		          	</c:if>
		           
                </td>
                <td>
                	<c:if test="${permission['role/insertRolePermission'] != null }">
		          		 <a data-toggle="modal" data-target="#seePermission" onclick="permission(${role.id})">权限分配</a>
		          	</c:if>
		          	<c:if test="${permission['role/insertRolePermission'] == null }">
		          		<a href="javascript:alert('你没有该权限')">权限分配</a>
		          	</c:if>
                </td>
                <td>
                	<c:if test="${permission['role/deleteUserRole'] != null }">
		          		 <a data-toggle="modal" data-target="#seeUser" onclick="assginUser('yes',${role.id})">以分配用户</a>
		          	</c:if>
		          	<c:if test="${permission['role/deleteUserRole'] == null }">
		          		<a href="javascript:alert('你没有该权限')">以分配用户</a>
		          	</c:if>
                	
                </td>
                <%-- <td>
                <a onclick="deleteUser(${u.id })" rel="1" name="delete">删除</a>
                </td> --%>
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
     <form action="role/insertRole.do" method="post" autocomplete="off" draggable="false" onsubmit="return roleTest()">
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
                <td wdith="20%">角色:</td>
                <td width="80%"><input type="text" value="" class="form-control" id="role_name" name="role_name" maxlength="10" autocomplete="off" /></td>
              </tr>
              <tr>
                <td wdith="20%">角色描述:</td>
                <td width="80%">
					<textarea name="role_describe" id="role_describe" rows="5" cols="40"></textarea>
				</td>
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
<!--用户信息模态框-->
<div class="modal fade" id="seeUser" style="margin-top: 180px;" tabindex="-1" role="dialog" aria-labelledby="seeUserModalLabel">
  <div class="modal-dialog" role="document" style="max-width:450px;">
    <form action="role/deladdUserRole.do" method="post" autocomplete="off" draggable="false">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
          <h4 id="title" class="modal-title"></h4>
        </div>
        <div class="modal-body">
          <table class="table" style="margin-bottom:0px;">
            <thead>
              <tr> 
              	<th>选择</th>
              	<th>用户名</th>
              </tr>
            </thead>
            <tbody id="tbodyRole">
            
            </tbody>
          </table>
        </div>
        <div class="modal-footer">
          <input type="hidden" id="roleid" name="roleid"/>
           <input type="hidden" id="deladd" name="deladd"/>
          <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
          <button type="submit"  class="btn btn-primary">提交</button>
        </div>
      </div>
    </form>
  </div>
</div>

<div class="modal fade" id="seePermission" style="margin-top: 0px;" tabindex="-1" role="dialog" aria-labelledby="seeUserModalLabel">
  <div class="modal-dialog" role="document" style="max-width:450px;">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
          <h4 id="title" class="modal-title"></h4>
        </div>
        <div class="modal-body">
            	<div id="tbodyRolePermission">
					<ul id="regionZTree" class="ztree"></ul>
				</div>
        </div>
        <div class="modal-footer">
          <input type="hidden" id="roleid2" name="roleid2"/>
          <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
          <button type="button" onclick="doSave()" class="btn btn-primary">保存</button>
        </div>
      </div>
  </div>
</div>
<jsp:include page="blog.jsp"></jsp:include>
<script src="houtaiblog/js/bootstrap.min.js"></script> 
<script src="houtaiblog/js/admin-scripts.js"></script> 
<script type="text/javascript" src="js/jquery.ztree.all.js"></script>
<script type="text/javascript">
function deleteUser() {
		if (window.confirm("是否确认删除？")) {
                  window.location = "user/addupdatedel.do?status=2&id="+id;
          }
}
</script>
</body>
</html>
