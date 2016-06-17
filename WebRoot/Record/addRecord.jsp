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
    
    <title>addRecord</title>
    
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
  
       <h1 class="title">添加记录</h1><br>
    <s:form name="addRecord_fm" action="regist_new" autocomplete="off">
    	<s:textfield name="id" label = "ID"/>
    	<s:textfield name="io" label="收入/支出"/>
    	<s:textfield name="amount" label="账户金额"/>
    	<s:textfield name="occurence" label="时间"/>
    	<s:textfield name="note" label="注释"/>
    	<s:submit value=添加"/>
   </s:form>
       <s:actionerror/>
  </body>
</html>
