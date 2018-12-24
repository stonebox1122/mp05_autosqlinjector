package com.stone.mp.metaobjecthandler;

import org.apache.ibatis.reflection.MetaObject;

import com.baomidou.mybatisplus.mapper.MetaObjectHandler;

/**
 * 自定义公共字段填充处理器
 * @author lei.shi445
 *
 */
public class MyMetaObjectHandler extends MetaObjectHandler {
	//插入操作自动填充
	@Override
	public void insertFill(MetaObject metaObject) {
		//获取到需要被填充的字段的值
		Object fieldValByName = getFieldValByName("name", metaObject);
		if(fieldValByName == null) {
			System.out.println("***插入操作满足填充条件***");
			setFieldValByName("name", "stone", metaObject);
		}
	}
	//修改操作自动填充
	@Override
	public void updateFill(MetaObject metaObject) {
		//获取到需要被填充的字段的值
		Object fieldValByName = getFieldValByName("name", metaObject);
		if(fieldValByName == null) {
			System.out.println("***修改操作满足填充条件***");
			setFieldValByName("name", "stonebox", metaObject);
		}
	}

}
