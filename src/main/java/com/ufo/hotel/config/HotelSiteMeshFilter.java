package com.ufo.hotel.config;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

public class HotelSiteMeshFilter extends ConfigurableSiteMeshFilter {

    @Override
    protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
        builder
            // 主页配置
            .addDecoratorPath("/index.htm", "/WEB-INF/layouts/main/main.jsp")
            // 不被渲染的路径
            .addExcludedPath("/resources/*")
            .addExcludedPath("/login*.htm")
            .addExcludedPath("/test.htm");
    }
}
