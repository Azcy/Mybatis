package com.zcy.MybatisDemo.model.dao;

import com.zcy.MybatisDemo.beans.Order;

/**
 * Created by zcy on 2017/7/7.
 */
public interface OrderMapper {
    Order selectOrderById(int id);
}
