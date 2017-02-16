package com.yc.mybatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtils {
    public static SqlSessionFactory getFactory(){
        String config = "mybatis-config.xml";
        //流的操作（读取）
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(config);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //使用了xml的解析，解析出mybatis-config.xml中的 数据库的配置项，创建数据连接池
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory;
    }
    
    public static SqlSession getSqlSession(){
        return getFactory().openSession();
    }
    
    public static SqlSession getSqlSession( boolean isAutoCommit){
        return getFactory().openSession(isAutoCommit);
    }
}
