package com.zcy.MybatisDemo.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by zcy on 2017/7/5.
 */
public class MyBatisTest {
    public static void main(String[] args) throws IOException {
        //读取mybatis-config.xml文件
        InputStream inputStream= Resources.getResourceAsStream("mybatis-config.xml");
        //初始化mybatis，创建sqlSessionFactory类的实例
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        //创建Session实例
        SqlSession session=sqlSessionFactory.openSession();
        //创建Student对象
//        Student student=new Student(443,"3213");
//        session.insert("com.zcy.MybatisDemo.model.dao.StudentMapper.save",student);
        session.commit();
        session.close();
    }
}
