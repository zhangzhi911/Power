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

	// �ܵ����ݵĲ�ѯ��ÿ���˶��ܿ����Ǹ���
	public List<Company> CompanList(Company company) {
		return c.CompanList(company);
	}
	
	
	powerMapper p = new powerMapper();

//	��վ�б�
	public List<power> selectByPrimaryKey(power power) {
		return p.selectByPrimaryKey(power);
	}
	
//	��վ�޸ĵķ���
	public int updatepower(power s) {
		return p.updatepower(s);
	}
//	��վ��ӵķ���
	public int insertpower(power s) {
		return p.insertpower(s);
	}
//	��վɾ���ķ���
	public int deltepower(power s) {
		return p.deltepower(s);
	}
	
	
	
	
	
	
	
	
	
	
//�ֹ�˾&Ҳ���ǻ���
	filialeMapper f = new filialeMapper();

//	��˾ �б�
	public List<filiale> filialeList(filiale filiale) {
		return f.CompanList(filiale);
	}
//	�ֹ�˾�޸ĵķ���
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
