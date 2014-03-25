package com.ufo.hotel.config.dao;

import java.util.List;

import com.ufo.framework.core.dao.IBaseDao;
import com.ufo.hotel.config.common.MenuModelType;
import com.ufo.hotel.config.entity.Menu;

/**
 * 
 * 类名称：IMenuDao 
 * 类描述：菜单dao接口 
 * 
 * 
 * 创建人：khe
 * 创建时间：2014-3-25 下午4:43:17 
 * @version 0.1
 *
 */
public interface IMenuDao extends IBaseDao<Menu> {

    /**
     * 清空菜单
     */
    public void clean();
    
    /**
     * 取子菜单
     * @return
     */
    public List<Menu> listByParentId(Integer id);
    
    /**
     * 最上层菜单
     * @return
     */
    public List<Menu> listRoot();

    /**
     * 取模块菜单
     * @param model
     * @return
     */
    List<Menu> findByModel(MenuModelType type);
    
}
