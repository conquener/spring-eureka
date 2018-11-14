package com.example.springeureka.mongdb.service.impl;

import com.example.springeureka.mongdb.dao.MongDBUserRepository;
import com.example.springeureka.mongdb.pojo.MongDBUser;
import com.example.springeureka.mongdb.service.MongDBUserService;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * declare
 *
 * @user: ritchey
 * @date: 2018/11/12
 * @time: 15:29
 * @version: v1.0
 * Description:
 */
@Service("mongDBUserService")
public class MongDBUserServiceImpl implements MongDBUserService {

    @Resource
    MongoTemplate mongoTemplate;


    @Override
    public List<MongDBUser> findUserAll() {

        return mongoTemplate.findAll(MongDBUser.class);
    }

    @Override
    public int saveMongDBUser(MongDBUser user) {
//        List<MongDBUser> users = new ArrayList<>();
//        users.add(user);
//        mongoTemplate.insert(users,MongDBUser.class);

        mongoTemplate.save(user);

        return 1;
    }
}
