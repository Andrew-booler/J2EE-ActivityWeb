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
    
	<title>在线记账本</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is the welcome page of ActivityWeb">
	
	<link rel="shortcut icon" type="image/x-icon" href="style/images/favicon.png" />
	<link rel="stylesheet" type="text/css" href="style/css/style.css" media="all" />
	<link href='http://fonts.googleapis.com/css?family=Amaranth' rel='stylesheet' type='text/css'>
	<link href='http://fonts.googleapis.com/css?family=Droid+Serif:400,400italic,700,700italic' rel='stylesheet' type='text/css'>
	<script type="text/javascript" src="style/js/jquery-1.6.4.min.js"></script>
	<script type="text/javascript" src="style/js/ddsmoothmenu.js"></script>
	<script type="text/javascript" src="style/js/jquery.jcarousel.js"></script>
	<script type="text/javascript" src="style/js/jquery.prettyPhoto.js"></script>
	<script type="text/javascript" src="style/js/carousel.js"></script>
	<script type="text/javascript" src="style/js/jquery.flexslider-min.js"></script>
	<script type="text/javascript" src="style/js/jquery.masonry.min.js"></script>
	<script type="text/javascript" src="style/js/jquery.slickforms.js"></script>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  	<div id="wrapper">
    <jsp:include page="component/sidebar.jsp" flush="true"/>
    <jsp:include page="${status}" flush="true"/>
    </div>
    <div class="clear"></div>
<script type="text/javascript" src="style/js/scripts.js"></script>
<!--[if !IE]> -->
<script type="text/javascript" src="style/js/jquery.corner.js"></script>
<!-- <![endif]-->
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' charset='gb2312'></script></div>
	
  </body>
</html>
