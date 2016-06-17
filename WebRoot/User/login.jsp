<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
	<s:if test="user.id!=null">
		<s:hidden value="user.id"/><br>
		<font style="color: white;
		vertical-align: middle;
		text-align:center;
		position: absolute;
		left: 20%;
		top: 0px;"><s:property value="user.showname"/><span>,welcome</span><br>
		<s:property value="user.email"/></font><br>
	</s:if>
	<s:else>
	<s:form name="login_fm" action="login" autocomplete="off">
	<s:textfield name="username" label="用户名" autocomplete="off" />
    	<s:password name="password" label="密码" autocomplete="off"/>
		<s:submit name="login"  value="登录"/>
		<s:submit name="regist"  value="注册" method="regist"/>
    </s:form>

    <s:actionerror/>
	</s:else>
    
