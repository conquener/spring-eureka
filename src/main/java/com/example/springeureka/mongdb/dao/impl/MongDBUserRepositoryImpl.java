package com.example.springeureka.mongdb.dao.impl;

import com.example.springeureka.mongdb.dao.MongDBUserRepository;
import com.example.springeureka.mongdb.pojo.MongDBUser;
import com.example.springeureka.mongdb.service.MongDBUserService;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * declare
 *
 * @user: ritchey
 * @date: 2018/11/12
 * @time: 15:49
 * @version: v1.0
 * Description:
 */
public class MongDBUserRepositoryImpl implements MongDBUserRepository {


    protected MongoTemplate mongoTemplate;

    @Override
    public List<MongDBUser> findUserAll() {

        return mongoTemplate.findAll(MongDBUser.class);
    }

    @Override
    public <S extends MongDBUser> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends MongDBUser> S save(S s) {
        return null;
    }

    @Override
    public <S extends MongDBUser> List<S> save(Iterable<S> iterable) {
        return null;
    }

    @Override
    public List<MongDBUser> findAll(Sort sort) {
        return null;
    }

    @Override
    public <S extends MongDBUser> S findOne(Example<S> example) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public List<MongDBUser> findAll() {
        return null;
    }

    @Override
    public Page<MongDBUser> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends MongDBUser> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends MongDBUser> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends MongDBUser> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public boolean exists(Long aLong) {
        return false;
    }

    @Override
    public Iterable<MongDBUser> findAll(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public <S extends MongDBUser> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public MongDBUser findOne(Long aLong) {

        return null;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public void delete(MongDBUser mongDBUser) {

    }

    @Override
    public <S extends MongDBUser> S insert(S s) {
        return null;
    }

    @Override
    public <S extends MongDBUser> List<S> insert(Iterable<S> iterable) {
        return null;
    }

    @Override
    public void delete(Iterable<? extends MongDBUser> iterable) {

    }
}

