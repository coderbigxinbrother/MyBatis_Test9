package com.yc.mybatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.yc.bean.Classes;
import com.yc.bean.Teacher;


public class MybatisHelperxml {
   /* public static void main(String[] args) {
        MybatisHelperxml mh = new MybatisHelperxml();
        //mh.find();
        mh.findClasses();
        //mh.delete();
        //mh.update();
        //mh.insert();
    }*/
    
    public void find(){
        
        //通过session工厂得到一个session
        SqlSession session = MybatisUtils.getSqlSession();
        try {
            //session中有很多操作方法
            //会由mybatis框架自动根据你的usersMapper.xml中的select id为selectUser
            Teacher c = session.selectOne("com.yc.dao.mapper.TeacherMapper.findTeacher", 2);
            System.out.println(c);
        } finally {
        session.close();
        }
    }
    
    public void findClasses(){
        
        //通过session工厂得到一个session
        SqlSession session = MybatisUtils.getSqlSession();
        try {
            //session中有很多操作方法
            //会由mybatis框架自动根据你的usersMapper.xml中的select id为selectUser
            Classes c = session.selectOne("com.yc.dao.mapper.ClassesMapper.findAllClasses", 3);
            System.out.println(c);
        } finally {
        session.close();
        }
    }
    public void delete(){
        SqlSession session = MybatisUtils.getSqlSession();
        try {
            //session中有很多操作方法
            //会由mybatis框架自动根据你的usersMapper.xml中的select id为selectUser
            Teacher u  = new Teacher();
            int  num = session.delete("com.yc.dao.mapper.UsersMapper.deleteUser", u);
            session.commit();
            System.out.println(num);
        } finally {
        session.close();
        }
    }
    public void update(){
        SqlSession session = MybatisUtils.getSqlSession();
        try {
            //session中有很多操作方法
            //会由mybatis框架自动根据你的usersMapper.xml中的select id为selectUser
            Teacher u  = new Teacher();
            int  num = session.delete("com.yc.dao.mapper.UsersMapper.updateUser", u);
            session.commit();
            System.out.println(num);
        } finally {
        session.close();
        }
    }
    public void insert(){
        SqlSession session = MybatisUtils.getSqlSession();
        try {
            //session中有很多操作方法
            //会由mybatis框架自动根据你的usersMapper.xml中的select id为selectUser
            Teacher u  = new Teacher();
            int  num = session.delete("com.yc.dao.mapper.UsersMapper.insertUser", u);
            session.commit();
            System.out.println(num);
        } finally {
        session.close();
        }
    }
}
