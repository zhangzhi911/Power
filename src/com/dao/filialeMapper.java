package com.dao;

import java.util.List;

import com.entity.filiale;
import com.uti.JdbcUtil;

public class filialeMapper {
//	公司 列表

	public List<filiale> CompanList(filiale company) {

		String sql = " SELECT * FROM `Filiale` ";

		return JdbcUtil.getList(filiale.class, sql);
	}

}