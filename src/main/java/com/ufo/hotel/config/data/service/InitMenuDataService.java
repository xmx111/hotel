package com.ufo.hotel.config.data.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ufo.framework.core.common.Page;
import com.ufo.hotel.config.common.Entry;
import com.ufo.hotel.config.common.MenuModelType;
import com.ufo.hotel.config.dao.IMenuDao;
import com.ufo.hotel.config.entity.Menu;

/**
 * 
 * 类名称：InitMenuDataService 
 * 类描述：初始化菜单 
 * 
 * 
 * 创建人：khe
 * 创建时间：2014-3-25 下午4:08:18 
 * @version 0.1
 *
 */
@Service("initMenuDataService")
@SuppressWarnings("unused")
public class InitMenuDataService {
    
    private final Logger logger = LoggerFactory.getLogger(InitMenuDataService.class);
    
    @Autowired
    private IMenuDao menuDao;

    /** 
     * 是否已经初始化
     */
     @Transactional(readOnly = true)
     public boolean isInit() {
         Page page = new Page();
         page.setPageSize(5);
         List<Menu> list = menuDao.list(page);
         if (CollectionUtils.isNotEmpty(list)) {
             return true;
         } else {
             return false;
         }
     }
    
    @Transactional(readOnly = false)
    public void init(){
        menuDao.clean();
        createAdminMenu(MenuModelType.CONFIG);
        createRoomConfigMenu(MenuModelType.CONFIG);
    }
    
    /**
     * 创建用户管理菜单
     * @param type
     */
    private void createAdminMenu(MenuModelType type) {
        List<Entry<String, String>> list = new ArrayList<Entry<String, String>>();
        list.add(new Entry<String, String>("权限设置", "admin/authority/list.htm"));
        list.add(new Entry<String, String>("角色设置", "admin/role/list.htm"));
        list.add(new Entry<String, String>("用户设置", "admin/list.htm"));
        createRootMenu(new Entry<String, String>("用户管理", ""), list, type);
    }
    
    /**
     * 创建房间配置管理菜单
     * @param type
     */
    private void createRoomConfigMenu(MenuModelType type) {
        List<Entry<String, String>> list = new ArrayList<Entry<String, String>>();
        list.add(new Entry<String, String>("房间设置", "config/system/room/list.htm"));
        createRootMenu(new Entry<String, String>("房间配置管理", ""), list, type);
    }
    
    /**
     * 创建客户管理菜单
     * @param type
     */
    private void createCustomMenu(MenuModelType type) {
        List<Entry<String, String>> list = new ArrayList<Entry<String, String>>();
        list.add(new Entry<String, String>("权限设置", "config/system/authority/list.htm"));
        list.add(new Entry<String, String>("角色设置", "config/system/role/list.htm"));
        list.add(new Entry<String, String>("用户设置", "config/system/manager/list.htm"));
        createRootMenu(new Entry<String, String>("用户管理", ""), list, type);
    }
    
    /**
     * 创建菜单项及其子菜单项
     * @param parent
     * @param children
     */
    private void createRootMenu(Entry<String, String> parent, List<Entry<String, String>> children, MenuModelType type) {
        Menu parentMenu = new Menu();
        parentMenu.setModel(type.getValue());
        parentMenu.setText(parent.getKey());
        parentMenu.setIcon(type.getIcon());
        menuDao.create(parentMenu);
        int i = 1;
        for (Entry<String, String> entry : children) {
            Menu menu = new Menu();
            menu.setModel(type.getValue());
            menu.setText(entry.getKey());
            menu.setUrl(entry.getValue());
            menu.setParent(parentMenu);
            menu.setSequence(i);
            menuDao.create(menu);
            i++;
        }
    }
}
