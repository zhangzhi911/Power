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

	// �ܵ����ݵĲ�ѯ��ÿ���˶��ܿ����Ǹ���
	public List<Company> CompanList(Company company) {
		return c.CompanList(company);
	}
	
	
	powerMapper p = new powerMapper();

//	��վ�б�
	public List<power> selectByPrimaryKey(power power) {
		return p.selectByPrimaryKey(power);
	}

	filialeMapper f = new filialeMapper();

//	��˾ �б�
	public List<filiale> filialeList(filiale filiale) {
		return f.CompanList(filiale);
	}

}
