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
	
//	修改的方法
	public int updatefiliale(filiale s) {
		String sql="UPDATE  `filiale` SET `fname` = '"+s.getFname()+"' , `fprice` = '"+s.getFprice()+"' , `fstatus` = '"+s.getFstatus()+"' WHERE `fid` = '"+s.getFid()+"'";
		JdbcUtil.executeUpdate(sql);
		
		return 1;
	}
	public int insertfiliale(filiale s) {
		String sql="INSERT INTO  `filiale` (`fname`, `fprice`, `fstatus`) VALUES ('"+s.getFname()+"', '"+s.getFprice()+"', '"+s.getFstatus()+"'); ";
		
		JdbcUtil.executeTran(sql);
		return 1;
	}
	public int deltefiliale(filiale s) {
		
		String sql="DELETE FROM  `filiale` WHERE `fid` = "+s.getFid();
		JdbcUtil.executeTran(sql);
		return 1;
	}

}