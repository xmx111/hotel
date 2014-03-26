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
                            <a href="javascript:;" title="Dashboard">
                                <i class="glyph-icon icon-users"></i>
                                	用户管理
                            </a>
                            <ul>
                                <li>
                                    <a href="${ctx}/config/system/authority/list.htm" class="dt-menu" title="权限设置">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        	权限设置
                                    </a>
                                </li>
                                <li>
                                    <a href="${ctx}/config/system/role/list.htm" class="dt-menu" title="角色设置">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        	角色设置
                                    </a>
                                </li>
                                <li>
                                    <a href="${ctx}/system/admin/list.htm" class="dt-menu" title="用户设置">
                                        <i class="glyph-icon icon-chevron-right"></i>
                                        	用户设置
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