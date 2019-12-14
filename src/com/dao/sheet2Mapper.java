package com.dao;

import java.util.List;

import com.entity.sheet2;
import com.uti.JdbcUtil;

public class sheet2Mapper {
//上报的查询  最烦的那个表    

	public List<sheet2> CompanList(sheet2 s) {

		String sql = "SELECT * FROM `sheet3`";

		List<sheet2> list = JdbcUtil.getList(sheet2.class, sql);

		System.out.println(list);
		return list;
	}
//上报、驳回的方法	
	public int updateBy(sheet2 s) {
		
		String sql="UPDATE `sheet3` SET `qing` = '"+s.getQing()+"' WHERE `aid` ="+s.getAid();
		JdbcUtil.executeUpdate(sql);
		
		return 1;
	}
//	修改的方法
	public int updatesheet(sheet2 s) {
		
		String sql="UPDATE `sheet3` SET `fid` = '"+s.getFid()+"' , `fname` = '"+s.getFname()+"' , `pnum` = '"+s.getPnum()+"' , `gong` = '"+s.getGong()+"' , `gprice` = '"+s.getGprice()+"' , `gdian` = '"+s.getGdian()+"' , `gsav` = '"+s.getGsav()+"' , `maxprice` = '"+s.getMaxprice()+"' , `minprice` = '"+s.getMinprice()+"' , `psave` = '"+s.getPsave()+"' , `zprice` = '"+s.getZprice()+"' , `zhuan` = '"+s.getZhuan()+"' , `qing` = '"+s.getQing()+"' WHERE `aid` ="+s.getAid();
		JdbcUtil.executeUpdate(sql);
		
		return 1;
	}
	public int insertsheet(sheet2 s) {
		
		
		String sql="INSERT INTO `sheet3` (`fid`, `fname`, `pnum`, `gong`, `gprice`, `gdian`, `gsav`, `maxprice`, `minprice`, `psave`, `zprice`, `zhuan`) "
				+ "VALUES ('"+s.getFid()+"', '"+s.getFname()+"', '"+s.getPnum()+"','"+s.getGong()+"', '"+s.getGprice()+"', '"+s.getGdian()+"', '"+s.getGsav()+"', '"+s.getMaxprice()+"', '"+s.getMinprice()+"', '"+s.getPsave()+"', '"+s.getZprice()+"', '"+s.getZhuan()+"')";
		JdbcUtil.executeTran(sql);
		return 1;
	}
	
	public int deletesheet2(sheet2 s) {
		
		String sql="DELETE FROM `11_18brand`.`sheet3` WHERE `aid` ="+s.getAid();
		JdbcUtil.executeTran(sql);
		return 1;
	}
	

}