package com.ufo.hotel.config.data.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * 类名称：InitAdminDataService 
 * 类描述： 初始化超级管理员
 * 
 * 
 * 创建人：khe
 * 创建时间：2014-3-25 下午4:07:37 
 * @version 0.1
 *
 */
@Service("initAdminDataService")
@SuppressWarnings("unused")
public class InitAdminDataService {
    
    

    @Transactional(readOnly = false)
    public void init(){
        
    }
}
