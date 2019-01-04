package com.neuedu.controller;

import com.neuedu.Utils.MysqlParamOropertiesUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YmlController {

//    @Value("${mysql.username}")
//    private  String username;
//    @Value("${mysql.password}")
//    private  String password;
//@Value("${user}")
//    private String user;
@Autowired
    private MysqlParamOropertiesUtil mysqlParamOropertiesUtil;
@RequestMapping(value = "/param")
    public String get()
    {
        return this.mysqlParamOropertiesUtil.getDriver()+this.mysqlParamOropertiesUtil.getUrl()+this.mysqlParamOropertiesUtil.getUsername()+this.mysqlParamOropertiesUtil.getPassword();
    }
}
