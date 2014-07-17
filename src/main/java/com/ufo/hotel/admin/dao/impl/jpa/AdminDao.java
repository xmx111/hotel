package com.ufo.hotel.admin.dao.impl.jpa;

import org.springframework.stereotype.Repository;

import com.ufo.framework.core.dao.impl.jpa.BaseDao;
import com.ufo.framework.core.entity.Admin;
import com.ufo.hotel.admin.dao.IAdminDao;

/**
 * 
 * 类名称：RoleDao 
 * 类描述：权限dao 
 * 
 * 
 * 创建人：khe
 * 创建时间：2014-3-25 下午4:34:08 
 * @version 0.1
 *
 */
@Repository("adminHotelDao")
public class AdminDao extends BaseDao<Admin> implements IAdminDao {

    
}
