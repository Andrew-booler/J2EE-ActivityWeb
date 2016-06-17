<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Regist Page</title>
    
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
    <h1 class="title">注册</h1><br>
    <s:form name="login_fm" action="regist_new" autocomplete="off">
    	<s:textfield name="username" label="用户名"/>
    	<s:password name="password" label="密码"/>
    	<s:password name="password_again" label="确认密码"/>
    	<s:textfield name="showname" label="昵称"/>
    	<s:textfield name="email" label="邮箱"/>
    	<s:submit value="注册"/>
   </s:form>
       <s:actionerror/>
  </body>
</html>
