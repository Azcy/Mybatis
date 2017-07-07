package com.zcy.MybatisDemo.model.dao;

import com.zcy.MybatisDemo.beans.Person;

/**
 * Created by zcy on 2017/7/7.
 *Mybatis官方手册建议通过mapper接口的代理对象访问mybatis，该对象关联了SqlSession对象，开发者可以通过该对象直接调用方法操作数据库
 * 下面定义一个mapper接口对象，需要注意的是，mapper接口对象的类名必须和之前的XML文件中的mapper的namespace一致，而方法名和参数也必须和XML的<select../>元素的id属性
 * 和parameterType属性一致。
 *
 */
public interface PersonMapper {
    /**
     * 根据id查询Person
     * 方法名和参数必须和XML文件中的<select.../>元素的id属性和parameterType属性一致
     * @param id
     * @return Person 对象
     * */
    Person selectPersonById(Integer id);
}
