package com.dao;

import java.util.List;

import com.entity.Company;
import com.entity.sheet2;
import com.uti.JdbcUtil;

public class sheet2Mapper {
//�ϱ��Ĳ�ѯ  ����Ǹ���    
    
    public List<sheet2> CompanList(sheet2 s){
    	
    	String sql=" SELECT  \r\n" + 
    			"	Sheet2.`��վ����������` d,\r\n" + 
    			"	Sheet2.`�������������` e,\r\n" + 
    			"	Sheet2.`ֱ����` f,\r\n" + 
    			"	Sheet2.`ת����` g,\r\n" + 
    			"	Sheet2.`H` h\r\n" + 
    			" FROM Sheet2";
    	return JdbcUtil.getList(sheet2.class, sql);
    }

    
    
    
}