package com.dao;

import java.util.List;

import com.entity.filiale;
import com.uti.JdbcUtil;

public class filialeMapper {
//	��˾ �б�

	public List<filiale> CompanList(filiale company) {

		String sql = " SELECT * FROM `Filiale` ";

		return JdbcUtil.getList(filiale.class, sql);
	}

}