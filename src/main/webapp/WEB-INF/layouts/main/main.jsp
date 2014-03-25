<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/common/tags.jsp"%>
<!DOCTYPE html>
<html lang="zh-cn">
	<head>
		<meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <tilte><sitemesh:write property='title'/></tilte>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">

        <!-- Favicons -->

        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="${ctx}/resources/images/icon/logo-144-circle.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="${ctx}/resources/images/icon/logo-114-circle.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="${ctx}/resources/images/icon/logo-72-circle.png">
        <link rel="apple-touch-icon-precomposed" href="${ctx}/resources/images/icon/logo-57-circle.png">
        <link rel="shortcut icon" href="${ctx}/resources/images/icon/favicon-circle.png">
	
		<!--[if lt IE 9]>
          <script src="${ctx}/resources/fides/js/minified/core/html5shiv.min.js"></script>
          <script src="${ctx}/resources/fides/js/minified/core/respond.min.js"></script>
        <![endif]-->

        <!-- CSS Core -->
        <link rel="stylesheet" type="text/css" href="${ctx}/resources/fides/css/minified/aui-production.min.css">
        <link id="layout-theme" rel="stylesheet" type="text/css" href="${ctx}/resources/fides/themes/minified/fides/color-schemes/dark-blue.min.css">
        <link rel="stylesheet" type="text/css" href="${ctx}/resources/fides/themes/minified/fides/common.min.css">
        <link rel="stylesheet" type="text/css" href="${ctx}/resources/fides/themes/minified/fides/responsive.min.css">

        <style type="text/css">
        #header-logo .index-a {
			float: left;
		}
        #header-logo>a img {
			margin: 9px 5px 0 0;
			float: left;
			width: 34px;
			height: 34px;
			border-radius: 4px;
		}
        </style>
	</head>
	<body scroll="no">
		<div id="page-wrapper">
			<%@ include file="/WEB-INF/layouts/main/header.jsp"%>
			<div id="page-content-wrapper" style="padding: 25px;">
				<sitemesh:write property="body"/>
			</div>
			<%@ include file="/WEB-INF/layouts/main/footer.jsp"%>
		</div>
		
		<!-- script -->
        <script src="${ctx}/resources/fides/js/minified/aui-production.min.js"></script>
        <script src="${ctx}/resources/js/index.js"></script>
	</body>
</html>