package com.example.springeureka.mongdb.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

/**
 * declare
 *
 * @user: ritchey
 * @date: 2018/11/12
 * @time: 17:43
 * @version: v1.0
 * Description:
 */
@Document(collection = "seqInfo")
public class SeqInfo implements Serializable {

    @Id
    private String id;// 主键

    @Field("coll_name")
    private String collName;// 集合名称

    @Field("seq_id")
    private Long seqId;// 序列值


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCollName() {
        return collName;
    }

    public void setCollName(String collName) {
        this.collName = collName;
    }

    public Long getSeqId() {
        return seqId;
    }

    public void setSeqId(Long seqId) {
        this.seqId = seqId;
    }
}
