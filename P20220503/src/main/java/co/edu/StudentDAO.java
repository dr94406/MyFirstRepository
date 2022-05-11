package co.edu;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO extends DAO {

	// id로 한건조회.
	public Student searchStudent(String id) {
		conn = getConn();
		String sql = "select * from student_info where student_no=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			if (rs.next()) {
				Student stud = new Student();
				stud.setStudentNo(rs.getInt("student_no"));
				stud.setStudentName(rs.getString("student_name"));
				stud.setEngScore(rs.getInt("eng_score"));
				stud.setKorScore(rs.getInt("kor_score"));
				return stud;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConn();
		}
		return null;
	}

	// 수정.
	public boolean modifyStudent(Student std) {
		conn = getConn();
		String sql = "update student_info set student_name=?, eng_Score=?, kor_Score=? where student_no=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, std.getStudentName());
			psmt.setInt(2, std.getEngScore());
			psmt.setInt(3, std.getKorScore());
			psmt.setInt(4, std.getStudentNo());

			int r = psmt.executeUpdate();
			System.out.println(r + "건 변경.");
			if (r > 0) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConn();
		}
		return false;
	}

	// 한건삭제.
	public boolean removeStudent(String id) {
		conn = getConn();
		String sql = "delete from student_info where student_no=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);

			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제.");
			if (r > 0) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConn();
		}
		return false;
	}

	// 한건입력.
	public boolean addStudent(Student stud) {
		conn = getConn(); // Connection 객체.
		String sql = "insert into student_info values(?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, stud.getStudentNo());
			psmt.setString(2, stud.getStudentName());
			psmt.setInt(3, stud.getEngScore());
			psmt.setInt(4, stud.getKorScore());
			int r = psmt.executeUpdate();
			System.out.println(r + " 입력.");
			if (r > 0) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConn();
		}
		return false;
	}

	// 전체조회.
	public List<Student> studentList() {
		conn = getConn();
		List<Student> list = new ArrayList<Student>();
		try {
			psmt = conn.prepareStatement("select * from student_info order by student_no");
			rs = psmt.executeQuery();
			while (rs.next()) {
				Student student = new Student();
				student.setStudentNo(rs.getInt("student_no"));
				student.setStudentName(rs.getString("student_name"));
				student.setEngScore(rs.getInt("eng_score"));
				student.setKorScore(rs.getInt("kor_score"));
				list.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConn();
		}
		return list;
	}
}
