<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

	<div id="sidebar">
		 <div id="logo"><a href="index.jsp"><img src="${path}style/images/logo.png" alt="Caprice" /></a></div>
		 
	<!-- Begin Menu -->
    <div id="menu" class="menu-v">
      <ul>
      	<li>
      		<jsp:include page="${ContextPath}/User/login.jsp"></jsp:include>
      	</li>
        <li><a href="index.action">主页</a>
        </li>

        <li><a href="contact.jsp">Contact Us</a></li>
      </ul>
    </div>
    <!-- End Menu -->
   
    
    <div class="sidebox">
    <ul class="share">
    	<li><a href="#"><img src="style/images/icon-rss.png" alt="RSS" /></a></li>
    	<li><a href="#"><img src="style/images/icon-facebook.png" alt="Facebook" /></a></li>
    	<li><a href="#"><img src="style/images/icon-twitter.png" alt="Twitter" /></a></li>
    	<li><a href="#"><img src="style/images/icon-dribbble.png" alt="Dribbble" /></a></li>
    	<li><a href="#"><img src="style/images/icon-linkedin.png" alt="LinkedIn" /></a></li>
    </ul>
    </div>

    
	</div>