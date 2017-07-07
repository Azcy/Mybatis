package com.zcy.MybatisDemo.model.dao;

import com.zcy.MybatisDemo.beans.Student;

import java.util.List;

/**
 * Created by zcy on 2017/7/7.
 */
public interface StudentMapper {
    //根据id查询学生信息
    Student selectStudentById(Integer id);
    //根据班级id查询学生信息
    List<Student> selectStudentByClazzId(Integer id);
}
