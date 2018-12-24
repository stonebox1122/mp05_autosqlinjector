package com.stone.mp.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stone.mp.beans.User;
import com.stone.mp.mapper.EmpMapper;
import com.stone.mp.mapper.UserMapper;

public class TestMP {	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	EmpMapper empMapper = ctx.getBean("empMapper",EmpMapper.class);
	UserMapper userMapper = ctx.getBean("userMapper", UserMapper.class);
	
	//测试逻辑删除
	@Test
	public void testLogicDelete() {
		Integer resutl = userMapper.deleteById(1);
		System.out.println(resutl);
		
		User user = userMapper.selectById(1);
		System.out.println(user);
	}
	
	//测试公共字段填充
	@Test
	public void testMetaObjectHandler() {
		User user = new User();
		user.setId(5);
		user.setLogicFlag(1);
		userMapper.updateById(user);
	}
	
	//测试Oracle主键Sequence
	@Test
	public void testOracle() {
		User user = new User();
		user.setLogicFlag(1);
		userMapper.insert(user);
	}

}
