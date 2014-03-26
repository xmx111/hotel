package com.ufo.hotel.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ufo.framework.core.annotation.Description;
import com.ufo.framework.core.common.Page;
import com.ufo.hotel.admin.service.IAdminService;

@Controller("adminController")
@RequestMapping("/system/admin/")
@Description(code = "admin", value = "用户设置")
public class AdminController {

    @Autowired
    IAdminService adminService;
    
    @RequestMapping("list.htm")
    @Description("用户列表")
    //@Secured("system.admin.list")
    public String list(Page page, ModelMap map){
        
        map.put("", "");
        return "admin/list";
    }
}
