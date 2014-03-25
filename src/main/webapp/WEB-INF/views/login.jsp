<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/common/tags.jsp"%>
<!DOCTYPE html>
<html>
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

    </head>
    <body>

<div class="row">

    <form action="${ctx}/index.htm" id="login-validation" class="col-md-4 center-margin" method="">

        <div id="login-form" class="content-box form-vertical">
            <h3 class="content-box-header ui-state-default">
                <div class="glyph-icon icon-separator">
                    <i class="glyph-icon icon-user"></i>
                </div>
                <span>管理系统登录</span>
            </h3>
            <div class="content-box-wrapper pad20A pad0B">
                <div class="form-row">
                    <div class="form-label col-md-2">
                        <label for="login_email">
                           	用户名:
                            <span class="required">*</span>
                        </label>
                    </div>
                    <div class="form-input col-md-10">
                        <div class="form-input-icon">
                            <i class="glyph-icon icon-envelope-o ui-state-default"></i>
                            <input placeholder="邮箱" data-type="email" data-trigger="change" data-required="true" type="text" name="j_username" id="login_email">
                        </div>
                    </div>
                </div>

                <div class="form-row">
                    <div class="form-label col-md-2">
                        <label for="login_pass">
                           	 密码:
                        </label>
                    </div>
                    <div class="form-input col-md-10">
                        <div class="form-input-icon">
                            <i class="glyph-icon icon-unlock-alt ui-state-default"></i>
                            <input placeholder="密码" data-trigger="keyup" data-rangelength="[3,25]" type="password" name="j_password" id="login_pass">
                        </div>
                    </div>
                </div>
                <div class="form-row">
                    <div class="form-checkbox-radio col-md-6">
                        <input type="checkbox" class="custom-checkbox" name="remember-password" id="remember-password">
                        <label for="remember-password" class="pad5L">记住密码?</label>
                    </div>
                    <div class="form-checkbox-radio text-right col-md-6">
                        <a href="#" class="toggle-switch" switch-target="#login-forgot" switch-parent="#login-form" title="Recover password">忘记密码?</a>
                    </div>
                </div>
            </div>
            <div class="button-pane text-center">
                <button type="submit" class="btn large primary-bg text-transform-upr font-size-11" id="demo-form-valid" title="Validate!">
                    <span class="button-content">
                        	登录
                    </span>
                </button>
            </div>
        </div>

        <div class="divider"></div>
        <div class="form-row text-center">
            <a href="javascript:;" data-layout="center" data-type="warning" class="ui-state-default btn medium noty radius-all-100" title="Register">
                <span class="button-content pad20L pad20R">
                    	注册帐号
                </span>
            </a>
        </div>
        <div class="ui-dialog mrg5T no-shadow hide" id="login-forgot" style="position: relative !important;">
            <div class="ui-dialog-titlebar ui-widget-header ui-corner-all ui-helper-clearfix">
                <span class="ui-dialog-title">找回密码</span>
            </div>
            <div class="pad20A ui-dialog-content ui-widget-content">
                <div class="form-row">
                    <div class="form-label col-md-2">
                        <label for="">
                            	邮箱地址:
                        </label>
                    </div>
                    <div class="form-input col-md-10">
                        <div class="form-input-icon">
                            <i class="glyph-icon icon-envelope-o ui-state-default"></i>
                            <input placeholder="邮箱" type="text" name="" id="">
                        </div>
                    </div>
                </div>


            </div>
            <div class="ui-dialog-buttonpane text-center">
                <button type="submit" class="btn large primary-bg" id="demo-form-valid" onclick="javascript:$(&apos;#demo-form&apos;).parsley( &apos;validate&apos; );" title="Validate!">
                    <span class="button-content">
                        	提交
                    </span>
                </button>
                <a href="javascript:;" switch-target="#login-form" switch-parent="#login-forgot" class="btn large transparent no-shadow toggle-switch font-bold font-size-11 radius-all-4" id="login-form-valid" onclick="javascript:$(&apos;#login-validation&apos;).parsley( &apos;validate&apos; );" title="Validate!">
                    <span class="button-content">
                        	取消
                    </span>
                </a>
            </div>
        </div>
    </form>

</div>

		<!-- script -->
        <script src="${ctx}/resources/fides/js/minified/aui-production.min.js"></script>
    </body>
</html>
