package com.example.springeureka.mongdb.dao;

import com.example.springeureka.mongdb.pojo.MongDBUser;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MongDBUserRepository extends MongoRepository<MongDBUser,Long> {

    List<MongDBUser> findUserAll();

}
