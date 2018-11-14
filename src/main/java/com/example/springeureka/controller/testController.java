package com.example.springeureka.controller;


import com.alibaba.fastjson.JSONArray;
import com.example.springeureka.BaseController;
import com.example.springeureka.mongdb.pojo.MongDBUser;
import com.example.springeureka.mongdb.service.MongDBUserService;
import com.example.springeureka.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * declare
 *
 * @user: ritchey
 * @date: 2018/11/5
 * @time: 16:06
 * @version: v1.0
 * Description:
 */
@RestController
@RequestMapping("/")
public class testController  extends BaseController {

    @Resource
    private TestService testService;

    @Resource
    private MongDBUserService mongoUserService;

    /**
     * 测试mysql
     * @param request
     * @return
     */
    @RequestMapping(value = "/testMysql",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String test(HttpServletRequest request){


        return JSONArray.toJSONString(testService.getAll());
    }


    @RequestMapping(value = "/testMongdb",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String testMongdb(HttpServletRequest request){

        MongDBUser user = new MongDBUser();
        try {
            user.setAge(20);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            user.setBirthday(sdf.parse("1988-10-12 21:23:45"));
            user.setIdNumber("234567810u2-3");
            user.setMoney(new BigDecimal(10000000));
            user.setSex(1);
            user.setUserName("huangson");

            mongoUserService.saveMongDBUser(user);
        }catch (Exception e){
            logger.error("异常:",e);
        }


        return JSONArray.toJSONString(mongoUserService.findUserAll());
    }


    @RequestMapping(value = "/testRedis",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String testRedis(HttpServletRequest request){

        return "demo";
    }

}
