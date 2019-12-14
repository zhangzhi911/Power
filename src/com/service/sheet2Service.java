package com.service;

import java.util.List;

import com.dao.sheet2Mapper;
import com.entity.sheet2;
import com.uti.JdbcUtil;

public class sheet2Service {

	// 上报的查询 最烦的那个表

	sheet2Mapper c = new sheet2Mapper();

	public List<sheet2> CompanList(sheet2 s) {
		return c.CompanList(s);
	}

	// 上报、驳回的方法
	public int updateBy(sheet2 s) {

		return c.updateBy(s);
	}

//		修改的方法
	public int updatesheet(sheet2 s) {

		return c.updatesheet(s);
	}

	public int insertsheet(sheet2 s) {

		return c.insertsheet(s);
	}

	public int deletesheet2(sheet2 s) {

		String sql = "DELETE FROM `11_18brand`.`sheet3` WHERE `aid` =" + s.getAid();
		JdbcUtil.executeTran(sql);
		return 1;
	}
}
