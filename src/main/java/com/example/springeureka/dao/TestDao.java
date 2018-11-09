package com.example.springeureka.dao;

import com.example.springeureka.pojo.TestDo;

import java.util.List;

/**
 * declare
 *
 * @user: ritchey
 * @date: 2018/11/9
 * @time: 19:22
 * @version: v1.0
 * Description:
 */

public interface TestDao {


    List<TestDo> queryAll();

}
