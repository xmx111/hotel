package com.ufo.hotel.admin.service.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ufo.framework.core.common.Page;
import com.ufo.framework.core.dao.IBaseDao;
import com.ufo.framework.core.entity.Admin;
import com.ufo.framework.core.service.impl.BaseService;
import com.ufo.hotel.admin.dao.IAdminDao;
import com.ufo.hotel.admin.dto.AdminDto;
import com.ufo.hotel.admin.service.IAdminService;

/**
 * 
 * 类名称：AdminService 
 * 类描述： 
 * 
 * 
 * 创建人：khe
 * 创建时间：2014-3-26 下午3:01:50 
 * @version 0.1
 *
 */
@Service(value = "adminService")
@Transactional
public class AdminService extends BaseService<AdminDto, Admin> implements IAdminService {

    @Autowired
    IAdminDao adminDao;

    public List<AdminDto> findAdmin(Page page) {
        final Collection<Admin> coll = adminDao.list(page);
        return toDtoList(coll);
    }

    @Override
    protected AdminDto toDto(Admin model) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected void buildData(Admin model, AdminDto dto) {
        // TODO Auto-generated method stub
        
    }

    @Override
    protected Admin getNewModel() {
        return new Admin();
    }

    @Override
    protected IBaseDao<Admin> getBaseDao() {
        return adminDao;
    }

    

}
