package co.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
	Connection conn;
	Statement stmt;
	PreparedStatement psmt;
	ResultSet rs;

	public Connection getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost", "hr", "hr"); //localhost에 ip주소 적어도 된다
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public void disConn() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (stmt != null) {
				psmt.close();
			}
			if (conn != null) {
				psmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
