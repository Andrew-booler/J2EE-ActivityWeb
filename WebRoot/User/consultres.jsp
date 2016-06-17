<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

	<div id="content">
	<div style="background-color:  #808080">
	<table class="layout_table">
		<tr>
			<td><span>ID</span></td>
			<td><span>收入/支出</span></td>
			<td><span>金额</span></td>
			<td><span>日期</span></td>
			<td><span>备注</span></td>
		</tr>
		<s:iterator value="recordVMlist" id = "record">			
				<tr>
				<td><s:property value = '#record.record.id'/></td>
				<td><s:property value = '#record.ioName'/></td>
				<td><s:property value = '#record.record.amount'/></td>
				<td><s:property value = '#record.occurenceView'/></td>
				<td><s:property value = '#record.record.note'/></td>
				</tr>
		</s:iterator>
	</table>
	</div>

</div>

