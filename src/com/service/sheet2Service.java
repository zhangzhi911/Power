package com.service;

import java.util.List;

import com.dao.CompanyMapper;
import com.dao.sheet2Mapper;
import com.entity.Company;
import com.entity.sheet2;


public class sheet2Service {

//	�ϱ��ı���
	
	sheet2Mapper c=new sheet2Mapper();
	
	public List<sheet2> CompanList(sheet2 s) {
		return c.CompanList(s);
	}
	
	
}
