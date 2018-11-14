package com.example.springeureka.mongdb.pojo;

import com.example.springeureka.mongdb.util.AutoIncKey;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.util.Date;

/**
 * declare
 *
 * @user: ritchey
 * @date: 2018/11/12
 * @time: 15:23
 * @version: v1.0
 * Description:
 */
@Document(collection = "mongdbuser")
public class MongDBUser {

    @Id
    private String id ;
    @Field("user_name")
    private String userName ;
    private Integer sex ;
    private Integer age;

    private Date birthday ;
    @Field("id_number")
    private String idNumber ;
    private BigDecimal money;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }



}
