<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/common/tags.jsp"%>
<!DOCTYPE html>
<html lang="zh-cn">
	<head>
		<tilte><sitemesh:write property='title'/></tilte>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		
		<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
		<meta http-equiv="Cache-Control" content="no-store" />
		<meta http-equiv="Pragma" content="no-cache" />
		<meta http-equiv="Expires" content="0" />
		<!-- Bootstrap -->
	    <link rel="stylesheet" href="http://cdn.bootcss.com/twitter-bootstrap/3.0.3/css/bootstrap.min.css">
	
	    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
	    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
	    <!--[if lt IE 9]>
	        <script src="http://cdn.bootcss.com/html5shiv/3.7.0/html5shiv.min.js"></script>
	        <script src="http://cdn.bootcss.com/respond.js/1.3.0/respond.min.js"></script>
	    <![endif]-->
	</head>
	<body scroll="no">
		<%@ include file="/WEB-INF/layouts/main/header.jsp"%>
		<div id="mainContainer" class="layoutMain">
			<sitemesh:write property="body"/>
		</div>
		<%@ include file="/WEB-INF/layouts/main/footer.jsp"%>
		
		<!-- script -->
	    <script src="${ctx}/resources/jquery/jquery-1.11.0.min.js"></script>
	    <script src="${ctx}/resources/bootstrap/js/bootstrap.min.js"></script>
	</body>
</html>