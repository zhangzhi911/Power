package com.dao;

import java.util.List;

import com.entity.Company;
import com.entity.sheet2;
import com.uti.JdbcUtil;

public class CompanyMapper {
//    ×ÜµÄ ²éÑ¯ 

	public List<Company> CompanList(Company company) {

		String sql = "SELECT \r\n" + 
				"	Filiale.`fname` fid,\r\n" + 
				"	GROUP_CONCAT(`power`.`pname` ) 	  fname,\r\n" + 
				"	GROUP_CONCAT(`power`.`pprice`) 	  price,\r\n" + 
				"	`Filiale`.`fprice` SUM\r\n" + 
				" FROM `Filiale`,`power`,`Middle`  WHERE `Filiale`.`fid`=`Middle`.`fid` AND `power`.`pid`=`Middle`.`pid`  AND `Filiale`.`fstatus`=0 GROUP BY `Filiale`.`fid`\r\n";

		return JdbcUtil.getList(Company.class, sql);
	}


}