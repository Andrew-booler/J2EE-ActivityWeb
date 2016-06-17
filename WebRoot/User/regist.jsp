<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<div id="content">
    <h1 class="title">注册</h1><br>
    <div style="background-color:  #808080">
    <s:form name="login_fm" action="regist_new" autocomplete="off">
    	<s:textfield name="username" label="用户名"/>
    	<s:password name="password" label="密码"/>
    	<s:password name="password_again" label="确认密码"/>
    	<s:textfield name="showname" label="昵称"/>
    	<s:textfield name="email" label="邮箱"/>
    	<s:submit value="注册"/>
   </s:form>
       <s:actionerror/>
       </div>
</div>
