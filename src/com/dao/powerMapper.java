package com.dao;

import java.util.List;

import com.entity.Company;
import com.entity.filiale;
import com.entity.power;
import com.uti.JdbcUtil;

public class powerMapper {
//	电站列表
	

	public  List<power> selectByPrimaryKey(power power){
		String sql=" SELECT * FROM POWER";
    	return JdbcUtil.getList(power.class, sql);
	}


//	修改的方法
	public int updatepower(power s) {
		String sql="UPDATE `power` SET `pname` = '"+s.getPname()+"' , `pprice` = '"+s.getPprice()+"' WHERE `pid` = "+s.getPid();
		JdbcUtil.executeUpdate(sql);
		
		return 1;
	}
	public int insertpower(power s) {
		String sql="INSERT INTO `power` (`pname`, `pprice`) VALUES ('"+s.getPname()+"', '"+s.getPprice()+"')";
		
		JdbcUtil.executeTran(sql);
		return 1;
	}
	public int deltepower(power s) {
		
		String sql="DELETE FROM `power` WHERE `pid` ="+s.getPid();
		JdbcUtil.executeUpdate(sql);
		return 1;
	}
}