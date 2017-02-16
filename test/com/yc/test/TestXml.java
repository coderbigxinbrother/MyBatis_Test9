package com.yc.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.yc.mybatis.MybatisHelperxml;
import com.yc.mybatis.MybatisUtils;

public class TestXml {

	private MybatisHelperxml mh = new MybatisHelperxml();
	private MybatisUtils mu = new MybatisUtils();
	private SqlSessionFactory sqlSessionFactory = mu.getFactory();
	private SqlSession sqlSession = mu.getSqlSession();
	@Test
	public void find() {
		mh.findClasses();
	}
	
}
