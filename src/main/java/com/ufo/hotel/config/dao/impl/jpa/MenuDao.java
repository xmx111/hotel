package com.ufo.hotel.config.dao.impl.jpa;

import java.sql.Connection;
import java.util.List;

import org.hibernate.internal.SessionImpl;
import org.springframework.stereotype.Repository;

import com.ufo.framework.core.dao.exception.DaoException;
import com.ufo.framework.core.dao.impl.jpa.BaseDao;
import com.ufo.hotel.config.common.MenuModelType;
import com.ufo.hotel.config.dao.IMenuDao;
import com.ufo.hotel.config.entity.Menu;

/**
 * 
 * 类名称：MenuDao 
 * 类描述： 菜单dao
 * 
 * 
 * 创建人：khe
 * 创建时间：2014-3-25 下午4:33:45 
 * @version 0.1
 *
 */
@Repository
public class MenuDao extends BaseDao<Menu> implements IMenuDao {

    /**
     * 
     * 重写方法 
     * @see com.ufo.hotel.config.dao.IMenuDao#clean()
     */
    public void clean() {
        try {
            String sql = "truncate table ufo_sys_menu";
            SessionImpl impl = (SessionImpl) getEntityManager().getDelegate();
            Connection conn = impl.getJdbcConnectionAccess().obtainConnection();
            conn.createStatement().execute(sql);
        } catch (Exception e) {
            throw new DaoException(e.getMessage(), e);
        }
    }

    /**
     * 
     * 重写方法 
     * @see com.ufo.hotel.config.dao.IMenuDao#listByParentId(java.lang.Integer)
     */
    public List<Menu> listByParentId(Integer id) {
        if (id == null || id == 0) {
            return find("select t from Menu t where t.parent is null order by t.parent.id,sequence");
        } else {
            return find("select t from Menu t where t.parent.id=? order by t.parent.id,sequence", id);
        }
    }

    /**
     * 
     * 重写方法 
     * @see com.ufo.hotel.config.dao.IMenuDao#listRoot()
     */
    public List<Menu> listRoot() {
        return find("select t from Menu t where t.parent is null order by t.parent.id,sequence");
    }

    /**
     * 
     * 重写方法 
     * @see com.ufo.hotel.config.dao.IMenuDao#findByModel(com.ufo.hotel.config.common.MenuModelType)
     */
    public List<Menu> findByModel(MenuModelType type) {
        return find("select t from Menu t where t.model=:model order by t.parent.id,sequence", "model", type.getValue());
    }

}
