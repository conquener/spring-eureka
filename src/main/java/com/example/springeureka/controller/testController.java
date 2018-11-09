package com.example.springeureka.controller;


import com.alibaba.fastjson.JSONArray;
import com.example.springeureka.BaseController;
import com.example.springeureka.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

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
    TestService testService;

    @RequestMapping(value = "/test",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String test(HttpServletRequest request){


        return JSONArray.toJSONString(testService.getAll());
    }
    @RequestMapping(value = "/demo",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String demo(HttpServletRequest request){

        return "demo";
    }

}
