package com.dao;

import java.util.List;

import com.entity.Company;
import com.entity.sheet2;
import com.uti.JdbcUtil;

public class sheet2Mapper {
//上报的查询  最烦的那个表    
    
    public List<sheet2> CompanList(sheet2 s){
    	
    	String sql=" SELECT  \r\n" + 
    			"	Sheet2.`电站数量（个）` d,\r\n" + 
    			"	Sheet2.`电表数量（个）` e,\r\n" + 
    			"	Sheet2.`直供电` f,\r\n" + 
    			"	Sheet2.`转供电` g,\r\n" + 
    			"	Sheet2.`H` h\r\n" + 
    			" FROM Sheet2";
    	return JdbcUtil.getList(sheet2.class, sql);
    }

    
    
    
}