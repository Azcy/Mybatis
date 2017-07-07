package com.zcy.MybatisDemo.model.dao;

import com.zcy.MybatisDemo.beans.User;

/**
 * Created by zcy on 2017/7/7.
 */
public interface UserMapper {
    User selectUserById(int id);
}
