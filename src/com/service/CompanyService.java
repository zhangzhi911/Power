package com.service;

import java.util.List;

import com.dao.CompanyMapper;
import com.dao.filialeMapper;
import com.dao.powerMapper;
import com.entity.Company;
import com.entity.filiale;
import com.entity.power;

public class CompanyService {

	CompanyMapper c = new CompanyMapper();

	// 总的数据的查询，每个人都能看的那个表
	public List<Company> CompanList(Company company) {
		return c.CompanList(company);
	}
	
	
	powerMapper p = new powerMapper();

//	电站列表
	public List<power> selectByPrimaryKey(power power) {
		return p.selectByPrimaryKey(power);
	}

	filialeMapper f = new filialeMapper();

//	公司 列表
	public List<filiale> filialeList(filiale filiale) {
		return f.CompanList(filiale);
	}

}
