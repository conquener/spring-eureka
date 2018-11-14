package com.example.springeureka.mongdb.service;

import com.example.springeureka.mongdb.pojo.MongDBUser;


import java.util.List;

public interface MongDBUserService {


    List<MongDBUser> findUserAll();

    int saveMongDBUser(MongDBUser user);

}
