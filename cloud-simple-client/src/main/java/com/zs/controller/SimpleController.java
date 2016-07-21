package com.zs.controller;

import com.zs.conf.MysqlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @Autowired
    private MysqlProperties mysqlProperties;

    @RequestMapping("/get")
    public MysqlProperties get(){
        return mysqlProperties;
    }
}
