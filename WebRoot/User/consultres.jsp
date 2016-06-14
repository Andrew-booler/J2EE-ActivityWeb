<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'MyJsp.jsp' starting page</title>

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
	This is my JSP page.
	<br>

	<table class="layout_table">
		<tr>
			<td><span>ID</span></td>
			<td><span>收入/支出</span></td>
			<td><span>金额</span></td>
			<td><span>日期</span></td>
			<td><span>备注</span></td>
		</tr>
		<s:iterator value="recordlist" status="recordlistStatus">
			<tr>
				<td><s:property /></td>
			</tr>
		</s:iterator>
	</table>


</body>
</html>
