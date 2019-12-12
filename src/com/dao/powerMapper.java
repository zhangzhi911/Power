package com.dao;

import java.util.List;

import com.entity.Company;
import com.entity.power;
import com.uti.JdbcUtil;

public class powerMapper {
//	µÁ’æ¡–±Ì
	

	public  List<power> selectByPrimaryKey(power power){
		String sql=" SELECT * FROM POWER";
    	return JdbcUtil.getList(power.class, sql);
	}

	
}