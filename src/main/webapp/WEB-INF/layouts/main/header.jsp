<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/common/tags.jsp"%>
			<!-- 右边设置开始 -->
            <div class="theme-customizer">
                <a href="javascript:;" class="change-theme-btn" title="Change theme">
                    <i class="glyph-icon icon-cog"></i>
                </a>
                <div class="theme-wrapper">

                </div>
            </div>
            <!-- 右边设置结束 -->

            <!-- #顶部#page-header开始 -->
            <div id="page-header" class="clearfix">
                <div id="header-logo">
                	<a href="" class="index-a"><img src="${ctx}/resources/images/icon/favicon-square.png"/></a><span>酒店管理系统</span>
                	<a href="javascript:;" class="tooltip-button" data-placement="bottom" title="Close sidebar" id="close-sidebar">
                        <i class="glyph-icon icon-caret-left"></i>
                    </a>
                    <a href="javascript:;" class="tooltip-button hidden" data-placement="bottom" title="Open sidebar" id="rm-close-sidebar">
                        <i class="glyph-icon icon-caret-right"></i>
                    </a>
                    <a href="javascript:;" class="tooltip-button hidden" title="Navigation Menu" id="responsive-open-menu">
                        <i class="glyph-icon icon-align-justify"></i>
                    </a>
                </div>
                
                <div class="user-profile dropdown">
                    <a href="javascript:;" title="" class="user-ico clearfix" data-toggle="dropdown">
                        <img width="36" src="${ctx}/resources/fides/images/gravatar.jpg" alt="">
                        <span>Horia Simon</span>
                        <i class="glyph-icon icon-chevron-down"></i>
                    </a>
                    <ul class="dropdown-menu float-right">
                        <li>
                            <a href="javascript:;" title="">
                                <i class="glyph-icon icon-user mrg5R"></i>
                                个人资料
                            </a>
                        </li>
                        <li>
                            <a href="javascript:;" title="">
                                <i class="glyph-icon icon-cog mrg5R"></i>
                                修改设置
                            </a>
                        </li>
                        <li>
                            <a href="javascript:;" title="">
                                <i class="glyph-icon icon-flag mrg5R"></i>
                                通知消息
                            </a>
                        </li>
                        <li>
                            <a href="javascript:;" title="">
                                <i class="glyph-icon icon-sign-out font-size-13 mrg5R"></i>
                                <span class="font-bold">退出</span>
                            </a>
                        </li>
                    </ul>
                </div>
                <div class="dropdown dash-menu">
                    <a href="javascript:;" data-toggle="dropdown" data-placement="left" class="medium btn primary-bg float-right popover-button-header hidden-mobile mrg15R tooltip-button" title="Example menu">
                        <i class="glyph-icon icon-th"></i>
                    </a>
                    <div class="dropdown-menu float-right">
                        <div class="small-box">
                            <div class="pad10A dashboard-buttons clearfix">
                                <p class="font-gray-dark font-size-11 pad0B">This menu type can be used in pages, not just popovers.</p>
                                <div class="divider mrg10T mrg10B"></div>
                                <a href="javascript:;" class="btn vertical-button hover-blue-alt" title="">
                                    <span class="glyph-icon icon-separator-vertical pad0A medium">
                                        <i class="glyph-icon icon-dashboard opacity-80 font-size-20"></i>
                                    </span>
                                    <span class="button-content">Dashboard</span>
                                </a>
                                <a href="javascript:;" class="btn vertical-button hover-green" title="">
                                    <span class="glyph-icon icon-separator-vertical pad0A medium">
                                        <i class="glyph-icon icon-tags opacity-80 font-size-20"></i>
                                    </span>
                                    <span class="button-content">Widgets</span>
                                </a>
                                <a href="javascript:;" class="btn vertical-button hover-orange" title="">
                                    <span class="glyph-icon icon-separator-vertical pad0A medium">
                                        <i class="glyph-icon icon-sort-amount-asc opacity-80 font-size-20"></i>
                                    </span>
                                    <span class="button-content">Tables</span>
                                </a>
                                <a href="javascript:;" class="btn vertical-button hover-orange" title="">
                                    <span class="glyph-icon icon-separator-vertical pad0A medium">
                                        <i class="glyph-icon icon-bar-chart-o opacity-80 font-size-20"></i>
                                    </span>
                                    <span class="button-content">Charts</span>
                                </a>
                                <a href="javascript:;" class="btn vertical-button hover-purple" title="">
                                    <span class="glyph-icon icon-separator-vertical pad0A medium">
                                        <i class="glyph-icon icon-laptop opacity-80 font-size-20"></i>
                                    </span>
                                    <span class="button-content">Buttons</span>
                                </a>
                                <a href="javascript:;" class="btn vertical-button hover-azure" title="">
                                    <span class="glyph-icon icon-separator-vertical pad0A medium">
                                        <i class="glyph-icon icon-code opacity-80 font-size-20"></i>
                                    </span>
                                    <span class="button-content">Panels</span>
                                </a>
                            </div>

                            <div class="bg-gray text-transform-upr font-size-12 font-bold font-gray-dark pad10A">Dashboard menu</div>
                            <div class="pad10A dashboard-buttons clearfix">
                                <a href="javascript:;" class="btn vertical-button remove-border bg-blue" title="">
                                    <span class="glyph-icon icon-separator-vertical pad0A medium">
                                        <i class="glyph-icon icon-dashboard opacity-80 font-size-20"></i>
                                    </span>
                                    <span class="button-content">Dashboard</span>
                                </a>
                                <a href="javascript:;" class="btn vertical-button remove-border bg-red" title="">
                                    <span class="glyph-icon icon-separator-vertical pad0A medium">
                                        <i class="glyph-icon icon-tags opacity-80 font-size-20"></i>
                                    </span>
                                    <span class="button-content">Widgets</span>
                                </a>
                                <a href="javascript:;" class="btn vertical-button remove-border bg-purple" title="">
                                    <span class="glyph-icon icon-separator-vertical pad0A medium">
                                        <i class="glyph-icon icon-sort-amount-asc opacity-80 font-size-20"></i>
                                    </span>
                                    <span class="button-content">Tables</span>
                                </a>
                                <a href="javascript:;" class="btn vertical-button remove-border bg-azure" title="">
                                    <span class="glyph-icon icon-separator-vertical pad0A medium">
                                        <i class="glyph-icon icon-bar-chart-o opacity-80 font-size-20"></i>
                                    </span>
                                    <span class="button-content">Charts</span>
                                </a>
                                <a href="javascript:;" class="btn vertical-button remove-border bg-yellow" title="">
                                    <span class="glyph-icon icon-separator-vertical pad0A medium">
                                        <i class="glyph-icon icon-laptop opacity-80 font-size-20"></i>
                                    </span>
                                    <span class="button-content">Buttons</span>
                                </a>
                                <a href="javascript:;" class="btn vertical-button remove-border bg-orange" title="">
                                    <span class="glyph-icon icon-separator-vertical pad0A medium">
                                        <i class="glyph-icon icon-code opacity-80 font-size-20"></i>
                                    </span>
                                    <span class="button-content">Panels</span>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="top-icon-bar">
                    <div class="dropdown">

                        <a data-toggle="dropdown" href="javascript:;" title="">
                            <span class="badge badge-absolute bg-blue">8</span>
                            <i class="glyph-icon icon-lightbulb-o"></i>
                        </a>
                        <div class="dropdown-menu">
                            <div class="small-box">
                                <div class="popover-title">Color schemes</div>
                            </div>
                        </div>
                    </div>
                    <div class="dropdown">

                        <a data-toggle="dropdown" href="javascript:;" title="">
                            <span class="badge badge-absolute bg-orange">4</span>
                            <i class="glyph-icon icon-envelope-o"></i>
                        </a>
                        <div class="dropdown-menu">
                            <div class="pad10A button-pane button-pane-alt">
                                <a href="messaging.html" class="btn small float-left bg-white">
                                    <span class="button-content text-transform-upr font-size-11">All messages</span>
                                </a>
                                <div class="button-group float-right">
                                    <a href="javascript:;" class="btn small primary-bg">
                                        <i class="glyph-icon icon-star"></i>
                                    </a>
                                    <a href="javascript:;" class="btn small primary-bg">
                                        <i class="glyph-icon icon-random"></i>
                                    </a>
                                    <a href="javascript:;" class="btn small primary-bg">
                                        <i class="glyph-icon icon-map-marker"></i>
                                    </a>
                                </div>
                                <a href="javascript:;" class="small btn bg-red float-right mrg10R tooltip-button" data-placement="left" title="Remove comment">
                                    <i class="glyph-icon icon-remove"></i>
                                </a>
                            </div>

                        </div>
                    </div>
                    <div class="dropdown">

                        <a data-toggle="dropdown" href="javascript:;" title="">
                            <span class="badge badge-absolute bg-green">9</span>
                            <i class="glyph-icon icon-bell"></i>
                        </a>
                        <div class="dropdown-menu">
                            <div class="pad10A button-pane button-pane-alt text-center">
                                <a href="notifications.html" class="btn medium primary-bg">
                                    <span class="button-content">View all notifications</span>
                                </a>
                            </div>

                        </div>
                    </div>
                    <div class="dropdown">

                        <a data-toggle="dropdown" href="javascript:;" title="">
                            <span class="badge badge-absolute bg-red">2</span>
                            <i class="glyph-icon icon-tasks"></i>
                        </a>
                        <div class="dropdown-menu" id="progress-dropdown">
                            <div class="pad10A button-pane button-pane-alt text-center">
                                <a href="notifications.html" class="btn medium font-normal bg-green">
                                    <span class="button-content">View all</span>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
            <!-- #顶部#page-header结束 -->

			<!-- 侧边栏开始 -->
            <div id="page-sidebar" class="scrollable-content">

                <div id="sidebar-menu">
                    <ul>
                        <li>
                            <a href="index.html" title="Dashboard">
                                <i class="glyph-icon icon-dashboard"></i>
                                Dashboard
                            </a>
                        </li>
                        <li>
                            <a href="javascript:;" title="Components">
                                <i class="glyph-icon icon-code"></i>
                                Components
                            </a>
                            <ul>
                                <li>
                                    <a href="dashboard_panels.html" title="Dashboard panels">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Dashboard panels
                                    </a>
                                </li>
                                <li>
                                    <a href="social_boxes.html" title="Social boxes">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Social boxes
                                    </a>
                                </li>
                                <li>
                                    <a href="information_boxes.html" title="Information boxes">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Information boxes
                                    </a>
                                </li>
                                <li>
                                    <a href="chat.html" title="Chat">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Chat
                                    </a>
                                </li>
                                <li>
                                    <a href="notifications.html" title="Notifications">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Notifications
                                    </a>
                                </li>
                                <li>
                                    <a href="messaging.html" title="Messaging">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Messaging
                                    </a>
                                </li>
                                <li>
                                    <a href="progress_bars.html" title="Progress">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Progress
                                    </a>
                                </li>
                            </ul>
                        </li>
                        <li>
                            <a href="javascript:;" title="Pages">
                                <i class="glyph-icon icon-folder-open"></i>
                                Pages
                            </a>
                            <ul>
                                <li>
                                    <a href="grid.html" title="Grid Layouts">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Grid Layouts
                                    </a>
                                </li>
                                <li>
                                    <a href="helper_classes.html" title="Helpers">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Helpers
                                    </a>
                                </li>
                                <li>
                                    <a href="login.html" title="Login">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Login example 1
                                    </a>
                                </li>
                                <li>
                                    <a href="login-alt.html" title="Login">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Login example 2
                                    </a>
                                </li>
                            </ul>
                        </li>
                        <li>
                            <a href="javascript:;" title="Widgets">
                                <i class="glyph-icon icon-tags"></i>
                                Widgets
                            </a>
                            <ul>
                                <li>
                                    <a href="tabs.html" title="Tabs">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Tabs
                                    </a>
                                </li>
                                <li>
                                    <a href="accordions.html" title="Accordions">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Accordions
                                    </a>
                                </li>
                                <li>
                                    <a href="datepicker.html" title="Datepicker">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Datepicker
                                    </a>
                                </li>
                                <li>
                                    <a href="timepicker.html" title="Timepicker">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Timepicker
                                    </a>
                                </li>
                                <li>
                                    <a href="colorpicker.html" title="Colorpicker">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Colorpicker
                                    </a>
                                </li>
                                <li>
                                    <a href="slider.html" title="Sliders">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Sliders
                                    </a>
                                </li>
                                <li>
                                    <a href="jgrowl_notifications.html" title="JGrowl Notifications">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        JGrowl Notifications
                                    </a>
                                </li>
                                <li>
                                    <a href="noty_notifications.html" title="Noty Notifications">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Noty Notifications
                                    </a>
                                </li>
                                <li>
                                    <a href="modal_windows.html" title="Modal Windows">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Modal Windows
                                    </a>
                                </li>
                                <li>
                                    <a href="tooltips.html" title="Tooltips">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Tooltips
                                    </a>
                                </li>
                                <li>
                                    <a href="popovers.html" title="Popovers">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Popovers
                                    </a>
                                </li>
                                <li>
                                    <a href="sortable.html" title="Sortable Elements">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Sortable Elements
                                    </a>
                                </li>
                                <li>
                                    <a href="dropdown_menus.html" title="Dropdown Menus">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Dropdown Menus
                                    </a>
                                </li>
                            </ul>
                        </li>
                        <li>
                            <a href="javascript:;" title="Elements">
                                <i class="glyph-icon icon-laptop"></i>
                                Elements
                            </a>
                            <ul>
                                <li>
                                    <a href="content_boxes.html" title="Content Boxes">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Content Boxes
                                    </a>
                                </li>
                                <li>
                                    <a href="response_messages.html" title="Response Messages">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Response Messages
                                    </a>
                                </li>
                                <li>
                                    <a href="badges.html" title="Badges &amp; Labels">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Badges &amp; Labels
                                    </a>
                                </li>
                                <li>
                                    <a href="overlays.html" title="Overlays">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Overlays
                                    </a>
                                </li>
                                <li>
                                    <a href="navigation_menus.html" title="Navigation Menus">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Navigation Menus
                                    </a>
                                </li>
                                <li>
                                    <a href="icons.html" title="Icons">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Icons
                                    </a>
                                </li>
                                <li>
                                    <a href="buttons.html" title="Buttons">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Buttons
                                    </a>
                                </li>
                                <li>
                                    <a href="pagination.html" title="Pagination">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Pagination
                                    </a>
                                </li>
                                <li>
                                    <a href="typography.html" title="Typography">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Typography
                                    </a>
                                </li>
                                <li>
                                    <a href="animations.html" title="Animations">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Animations
                                    </a>
                                </li>
                            </ul>
                        </li>
                        <li>
                            <a href="javascript:;" title="Charts">
                                <i class="glyph-icon icon-bar-chart-o"></i>
                                Charts
                            </a>
                            <ul>
                                <li>
                                    <a href="charts_piegauges.html" title="Pie Gauges">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Pie Gauges
                                    </a>
                                </li>
                                <li>
                                    <a href="charts_justgage.html" title="JustGage">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        JustGage
                                    </a>
                                </li>
                                <li>
                                    <a href="charts_sparklines.html" title="Sparklines">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Sparklines
                                    </a>
                                </li>
                                <li>
                                    <a href="charts_morris.html" title="Morris Charts">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Morris Charts
                                    </a>
                                </li>
                            </ul>
                        </li>
                        <li>
                            <a href="javascript:;" title="Tables">
                                <i class="glyph-icon icon-table"></i>
                                Tables
                            </a>
                            <ul>
                                <li>
                                    <a href="tables.html" title="Normal tables">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Normal tables
                                    </a>
                                </li>
                                <li>
                                    <a href="tables_dynamic.html" title="Dynamic tables">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Dynamic tables
                                    </a>
                                </li>
                            </ul>
                        </li>
                        <li>
                            <a href="javascript:;" title="Forms">
                                <i class="glyph-icon icon-sort-amount-asc"></i>
                                Forms
                            </a>
                            <ul>
                                <li>
                                    <a href="forms.html" title="Layouts &amp; Elements">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Layouts &amp; Elements
                                    </a>
                                </li>
                                <li>
                                    <a href="forms_validation.html" title="Forms validation">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Forms validation
                                    </a>
                                </li>
                            </ul>
                        </li>
                        <li>
                            <a href="javascript:;" title="Help &amp; Support">
                                <i class="glyph-icon icon-book"></i>
                                Help &amp; Support
                            </a>
                            <ul>
                                <li>
                                    <a href="docs.html" title="Getting started guide">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Getting started guide
                                    </a>
                                </li>
                                <li>
                                    <a href="http://agileui.com/support-forums" title="Support forums">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        Support forums
                                    </a>
                                </li>

                            </ul>
                        </li>
                    </ul>
                    <div class="divider mrg5T mobile-hidden"></div>
                    <div class="text-center mobile-hidden">
                        <div class="button-group display-inline">
                            <a href="javascript:;" class="btn medium bg-green tooltip-button" data-placement="top" title="Messages">
                                <i class="glyph-icon icon-flag"></i>
                            </a>
                            <a href="javascript:;" class="btn medium bg-green tooltip-button" data-placement="top" title="Mailbox">
                                <i class="glyph-icon icon-inbox"></i>
                            </a>
                            <a href="javascript:;" class="btn medium bg-green tooltip-button" data-placement="top" title="Content">
                                <i class="glyph-icon icon-hdd-o"></i>
                            </a>
                        </div>

                    </div>
                </div>
            </div><!-- 侧边栏#page-sidebar结束 -->