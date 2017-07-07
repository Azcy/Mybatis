package com.zcy.MybatisDemo.model.dao;

import com.zcy.MybatisDemo.beans.Clazz;

/**
 * Created by zcy on 2017/7/7.
 */
public interface ClazzMapper {
    //根据id查询班级信息
    Clazz selectClazzById(Integer id);
}
