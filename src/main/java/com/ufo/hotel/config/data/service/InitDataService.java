package com.ufo.hotel.config.data.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Lazy(false)
@Transactional
@Scope("singleton")
public class InitDataService {

    static {
        //设置字符编码,异常乱码问题处理.
        System.setProperty("file.encoding", "UTF-8");
    }
    
    @Autowired
    InitAdminDataService initAdminDataService;
    
    private static boolean init = false;
    
    @PostConstruct
    public void initData() {
        if (!init) {
            new Thread(new Runnable() {
                public void run() {
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                    }
                    initAdminDataService.init();
                }
            }).start();
            init = true;
        }
    }
}
