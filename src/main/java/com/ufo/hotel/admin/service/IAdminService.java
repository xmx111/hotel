package com.ufo.hotel.admin.service;

import java.util.List;

import com.ufo.framework.core.common.Page;
import com.ufo.framework.core.service.IBaseService;
import com.ufo.hotel.admin.dto.AdminDto;

public interface IAdminService extends IBaseService<AdminDto> {

    public List<AdminDto> findAdmin(Page page);
}
