package com.lec.java.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	public static Connection getConnection() {
		Connection conn = null;
		
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String user = "hr";
			String pw = "hr";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pw);
		} catch (ClassNotFoundException e) {
			System.out.println("DBConnection 오류 : " + e);
		} catch (SQLException sqle) {
			System.out.println("DB 연결 오류 : " + sqle);
		} catch (Exception e) {
			System.out.println("오류 : " + e);
		}
		return conn;
	}
}