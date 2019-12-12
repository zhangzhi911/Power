package com.uti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

public final class JdbcUtil {
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private static Connection getConn() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/11_18brand", "root", "123");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	 // 返回  查询 数据
	public static List getList(Class clazz, String sql) {
		List list = new ArrayList();
		Connection conn = getConn();
		ResultSet rs = null;
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			ResultSetMetaData metaData = rs.getMetaData();
			while(rs.next()) {
				Object object = clazz.newInstance();
				for (int i = 1; i <= metaData.getColumnCount(); i++) {
					BeanUtils.copyProperty(object, metaData.getColumnName(i), rs.getObject(i));
				}
				list.add(object);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rs, stmt, conn);
		}
		return list;
	}
	// 根据id返回 对象  
	public static Object getObjectById(Class clazz, String sql) {
		Connection conn = getConn();
		ResultSet rs = null;
		Statement stmt = null;
		Object object = null;
		try {
			object = clazz.newInstance();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			ResultSetMetaData metaData = rs.getMetaData();
			if(rs.next()) {
				for (int i = 1; i <= metaData.getColumnCount(); i++) {
					BeanUtils.copyProperty(object, metaData.getColumnName(i), rs.getObject(i));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rs, stmt, conn);
		}
		return object;
	}
	 // 查询 总数 
	public static int getListCount(String sql) {
		int result = 0;
		Connection conn = getConn();
		ResultSet rs = null;
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			ResultSetMetaData metaData = rs.getMetaData();
			if(rs.next()) {
				result = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rs, stmt, conn);
		}
		return result;
	}
	 //执行sql  添加或者修改功能调用此方法 
	public static void executeSQL(String sql) {
		Connection conn = getConn();
		PreparedStatement prepareStatement = null;
		try {
			prepareStatement = conn.prepareStatement(sql);
			
			prepareStatement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(null, prepareStatement, conn);
		}
	}
	
	
	public static int executeUpdate(String sql) {
		   int   num=0;
		Connection conn = getConn();
		PreparedStatement prepareStatement = null;
		try {
			 prepareStatement = conn.prepareStatement(sql);
			 num = prepareStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(null, prepareStatement, conn);
		}
		return   num;  
	}
	
	
	
   // 执行事务 提交事物把数据  改写在 数据库中
	public static void executeTran(String... sqlArray) {
		Connection conn = getConn();
		PreparedStatement prepareStatement = null;
		try {
			conn.setAutoCommit(false);
			
			if(sqlArray.length > 0) {
				for (String sql : sqlArray) {
					prepareStatement = conn.prepareStatement(sql);
					prepareStatement.execute();
				}
			}
			
			conn.commit();
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			close(null, prepareStatement, conn);
		}
	}
	// 释放资源
	private static void close(ResultSet rs, Statement stmt, Connection conn) {
		try {
			if(rs != null) {
				rs.close();
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		try {
			if(stmt != null) {
				stmt.close();
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		try {
			if(conn != null) {
				conn.close();
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
