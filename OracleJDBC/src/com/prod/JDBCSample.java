package src.com.prod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// ojdbc라이브러리, 오라클DB 연결(db접속주소,hr,hr), Connection객체,
// query실행(Statement, PreparedStatement)
// 연결작업 -> DAO 
// CRUD 작업 -> EmpDAO (db에 추가 삭제 등)
// main메소드 -> EmpExe 
public class JDBCSample {
//	DriverManager
	static Connection conn;
	static Statement stmt;
	static ResultSet rs;
	static PreparedStatement psmt;

	public static Connection getConnect() {
		try { // 밑의 주소에서 Oracle 주소와 아이디, 비밀번호로 접속을 하겠습니다. (데이터베이스)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr"); // oracle 연결주소 및 아이디 비밀번호.
		} catch (ClassNotFoundException | SQLException e) { // 예외처리 (try,catch)
			e.printStackTrace();
		}
		System.out.println("연결성공!!");
		return conn;
	}

	public static void disconnect() {
		try {
			if (rs != null)
				rs.close();

			if (stmt != null)
				stmt.close();

			if (psmt != null)
				psmt.close();

			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		conn = getConnect();
		// Statement 객체 생성.
		try {
//			stmt = conn.prepareStatement(sql);

			// 입력. 사원번호, last_name, 입사일자, 이메일, job_id
			int emp_id = 302;
			String last_name = "홍길동";
			String hire_date = "2020-03-05";
			String email = "kdong@email.com";
			String job = "IT_PROG";

			String fn = "kildong";
			String pn = "010-xxxx-7xx4";
			int salary = 8000;

			String sql = "delete from emp_java\r\n" + "where employee_id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, emp_id);

			int r = psmt.executeUpdate(); // 입력, 수정, 삭제
			System.out.println(r + "건 삭제됨.");

			// 조회.
//			rs = stmt.executeQuery("select * from emp_java order by employee_id");
//			while(rs.next()) { // 가져올 데이터가 있습니까? 있으면 1개 가져옴.
//				System.out.println("사원번호: " + rs.getInt("employee_id"));
//				System.out.println("이름: " + rs.getString("first_name"));
//				//db연결 
//			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		disconnect(); // DB연결 끊는 작업
	}
}
