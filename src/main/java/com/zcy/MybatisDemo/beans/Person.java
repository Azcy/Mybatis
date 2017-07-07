package com.zcy.MybatisDemo.beans;

import java.io.Serializable;

/**
 * Created by zcy on 2017/7/7.
 */
public class Person implements Serializable {
    private Integer id;//主键id
    private String name;//姓名
    private String sex;//性别
    private Integer age;//年龄
    //人和身份证是一对一的关系，即一个人只有一个身份证
    private Card card;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", card=" + card +
                '}';
    }
}
