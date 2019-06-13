<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	
  </head>
  
  <body>
    <aside class="col-sm-3 col-md-2 col-lg-2 sidebar">
      <ul class="nav nav-sidebar">
        <li class="active"><a href="report/indexList.do">报告</a></li>
      </ul>
      
      <ul class="nav nav-sidebar">
      	<c:forEach items="${permission }" var="p">
      		<c:if test="${permission[p.key].parent_id == null}">
      			<c:if test="${permission[p.key].method eq 'listId'}">
      				<li><a class="dropdown-toggle" id="otherMenu" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">${permission[p.key].name}</a>
			          <ul class="dropdown-menu" aria-labelledby="otherMenu">
			            <li><a href="${permission[p.key].url}.do?uid=${currentUser.id}">我的${permission[p.key].name}</a></li>
			            <c:forEach items="${permission }" var="per">
			            	<c:if test="${permission[per.key].method eq 'listAll' and  permission[per.key].parent_id == permission[p.key].id}">
			            		<li><a  href="${permission[p.key].url}.do">${permission[per.key].name}</a></li>
			            	</c:if>
			            </c:forEach>
			          </ul>
			        </li>
      			</c:if>
      			<c:if test="${permission[p.key].method != 'listId'}">
      				<c:if test="${permission[p.key].name eq '其他管理'}">
      					<li><a class="dropdown-toggle" id="otherMenu" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">${permission[p.key].name}</a>
				          <ul class="dropdown-menu" aria-labelledby="otherMenu">
				          	<c:if test="${not empty permission['other/link']}">
				          		<li><a href="other/link.do">友情链接</a></li>
				          	</c:if>
				            <c:if test="${not empty permission['other/loglist']}">
				            	<li><a href="other/loglist.do">统计</a></li>
				            </c:if>
				          </ul>
				        </li>
      				</c:if>
      				<c:if test="${permission[p.key].name != '其他管理'}">
      					<li><a href="${permission[p.key].url}.do">${permission[p.key].name}</a></li>
      				</c:if>
      			</c:if>
	        </c:if>
        </c:forEach>
      </ul>
      
     <!--  <ul class="nav nav-sidebar">
        <li><a href="category.html">栏目</a></li>
        <li><a class="dropdown-toggle" id="otherMenu" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">其他</a>
          <ul class="dropdown-menu" aria-labelledby="otherMenu">
            <li><a href="flink.html">友情链接</a></li>
            <li><a data-toggle="modal" data-target="#areDeveloping">访问记录</a></li>
          </ul>
        </li>
      </ul> -->
      <!-- <ul class="nav nav-sidebar">
        <li><a class="dropdown-toggle" id="userMenu" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">用户</a>
          <ul class="dropdown-menu" aria-labelledby="userMenu">
            <li><a data-toggle="modal" data-target="#areDeveloping">管理用户组</a></li>
            <li><a href="manage-user.html">管理用户</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="loginlog.html">管理登录日志</a></li>
          </ul>
        </li>
        <li><a class="dropdown-toggle" id="settingMenu" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">设置</a>
          <ul class="dropdown-menu" aria-labelledby="settingMenu">
            <li><a href="setting.html">基本设置</a></li>
            <li><a href="readset.html">阅读设置</a></li>
            <li role="separator" class="divider"></li>
            <li><a data-toggle="modal" data-target="#areDeveloping">安全配置</a></li>
            <li role="separator" class="divider"></li>
            <li class="disabled"><a>扩展菜单</a></li>
          </ul>
        </li>
      </ul> -->
    </aside>
  </body>
</html>
