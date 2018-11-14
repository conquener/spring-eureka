package com.example.springeureka.service.impl;

import com.example.springeureka.dao.TestDao;
import com.example.springeureka.pojo.TestDo;
import com.example.springeureka.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * declare
 *
 * @user: ritchey
 * @date: 2018/11/9
 * @time: 19:28
 * @version: v1.0
 * Description:
 */
@Service("testService")
public class TestServiceImpl implements TestService {

    @Resource
    private TestDao testDao;

    @Override
    public List<TestDo> getAll() {

        return testDao.queryAll();
    }

}
