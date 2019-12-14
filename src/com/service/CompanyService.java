package com.service;

import java.util.List;

import com.dao.CompanyMapper;
import com.dao.filialeMapper;
import com.dao.powerMapper;
import com.entity.Company;
import com.entity.filiale;
import com.entity.power;
import com.uti.JdbcUtil;

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
	
//	电站修改的方法
	public int updatepower(power s) {
		return p.updatepower(s);
	}
//	电站添加的方法
	public int insertpower(power s) {
		return p.insertpower(s);
	}
//	电站删除的方法
	public int deltepower(power s) {
		return p.deltepower(s);
	}
	
	
	
	
	
	
	
	
	
	
//分公司&也就是机构
	filialeMapper f = new filialeMapper();

//	公司 列表
	public List<filiale> filialeList(filiale filiale) {
		return f.CompanList(filiale);
	}
//	分公司修改的方法
	public int updatefiliale(filiale s) {
		return f.updatefiliale(s);
	}
	public int insertfiliale(filiale s) {
		return f.insertfiliale(s);
	}
	public int deltefiliale(filiale s) {
		return f.deltefiliale(s);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
