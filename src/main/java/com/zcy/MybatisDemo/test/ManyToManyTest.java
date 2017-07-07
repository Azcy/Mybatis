package com.zcy.MybatisDemo.test;

import com.zcy.MybatisDemo.beans.Article;
import com.zcy.MybatisDemo.beans.Order;
import com.zcy.MybatisDemo.beans.User;
import com.zcy.MybatisDemo.model.dao.OrderMapper;
import com.zcy.MybatisDemo.model.dao.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by zcy on 2017/7/7.
 */
public class ManyToManyTest {
    public static void main(String[] args) throws IOException {
        //读取mybatis-config.xml
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        //初始化mybatis,创建SqlSessionFactory类的实例
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        //创建Session实例
        SqlSession session=sqlSessionFactory.openSession();
        ManyToManyTest t=new ManyToManyTest();
        //根据用户id查询用户，测试一对多关系
        t.testSelectUserById(session);
        //根据订单id查询订单，测试多对多关系
        t.testSelectOrderById(session);
        //提交事务
        session.commit();
        //关闭Session
        session.close();


    }

    //测试一对多关系，查询班级User(一)的时候级联查询订单Order(多)
    public void testSelectUserById(SqlSession session){
        //获得UserMapper接口的代理对象
        UserMapper um=session.getMapper(UserMapper.class);
        //调用selectUserById方法
        User user1=um.selectUserById(1);
        //查看查询到的user对象信息
        System.out.println(user1.getId()+" "+user1.getUsername());
        //查看user对象关联的订单信息
        List<Order> orders=user1.getOrders();
        for (Order order:orders){
            System.out.println(order);
        }
    }

    //测试多对多关系，查询订单Order(多)的时候级联查询订单的商品Article(多)
    public void testSelectOrderById(SqlSession session){
        //获得OrderMapper接口的代理对象
        OrderMapper om=session.getMapper(OrderMapper.class);
        //调用selectOrderById方法
        Order order=om.selectOrderById(2);
        //查看查询到的order对象信息
        System.out.println(order.getId()+" "+order.getCode()+" "+order.getTotal());
        //查看order对象关联的用户信息
        User user1=order.getUser1();
        System.out.println(user1);
        //查看order对象关联的商品信息
        List<Article> articles=order.getArticles();
        for (Article article:articles){
            System.out.println(article);
        }
    }
}
