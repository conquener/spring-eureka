package com.example.springeureka.pojo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * declare
 *
 * @user: ritchey
 * @date: 2018/11/9
 * @time: 19:17
 * @version: v1.0
 * Description:
 */
public class TestDo {

    private Long id ;
    private String userName ;
    private Integer sex ;
    private Integer age;
    private Date birthday ;
    private String idNumber ;
    private BigDecimal money;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
