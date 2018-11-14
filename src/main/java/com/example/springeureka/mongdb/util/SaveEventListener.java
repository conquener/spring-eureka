package com.example.springeureka.mongdb.util;

import com.example.springeureka.mongdb.pojo.SeqInfo;
import com.mongodb.DBObject;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapping.event.*;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;
import javax.annotation.Resource;
import java.lang.reflect.Field;

/**
 * mongdb 主键自增
 *
 * @user: ritchey
 * @date: 2018/11/12
 * @time: 17:32
 * @version: v1.0
 * Description:
 */
public class SaveEventListener {

    @Resource
    private MongoTemplate mongoTemplate;


    public void onBeforeSave(BeforeSaveEvent<Object> source) {
        System.out.println("------------------222222222222222222222222222");
        if (source != null) {
            ReflectionUtils.doWithFields(source.getClass(), new ReflectionUtils.FieldCallback() {
                @Override
                public void doWith(Field field) throws IllegalArgumentException, IllegalAccessException {
                    ReflectionUtils.makeAccessible(field);
                    // 如果字段添加了我们自定义的AutoIncKey注解
                    if (field.isAnnotationPresent(AutoIncKey.class)) {
                        // 设置自增ID
                        field.set(source, getNextId(source.getClass().getSimpleName()));
                    }
                }
            });
        }
    }






    /**
     * 获取下一个自增ID
     *
     * @param collName
     *            集合（这里用类名，就唯一性来说最好还是存放长类名）名称
     * @return 序列值
     */
    private Long getNextId(String collName) {
        Query query = new Query(Criteria.where("coll_name").is(collName));
        Update update = new Update();
        update.inc("seq_id", 1);
        FindAndModifyOptions options = new FindAndModifyOptions();
        options.upsert(true);
        options.returnNew(true);
        SeqInfo seq = mongoTemplate.findAndModify(query, update, options, SeqInfo.class);
        return seq.getSeqId();
    }




}
