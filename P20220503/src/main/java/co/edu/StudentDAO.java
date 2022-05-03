package co.edu;

// 데이터베이스와 연결하는 페이지
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO extends DAO {
	// id로 한건조회.
	public Student searchStudent(String id) {
		conn = getConnect();
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
			disConnect();
		}
		return null; // 한건조회를 못 해왔다는 뜻, 값이 있으면 조회해옴. 없을 시 null 리턴.
	}

	// 수정,
	public boolean modifyStudent(Student stud) {
		conn = getConnect();
		String sql = "update student_info set student_name=?, eng_Score=?, kor_Score=? where student_no=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, stud.getStudentName());
			psmt.setInt(2, stud.getEngScore());
			psmt.setInt(3, stud.getKorScore());
			psmt.setInt(4, stud.getStudentNo());

			int r = psmt.executeUpdate();
			System.out.println(r + "건 변경.");
			if (r > 0) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}
		return false;
	}

	// 한건삭제.
	public boolean removeStudent(String id) {
		conn = getConnect();
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
			disConnect();
		}
		return false;

	}

	// 한건입력.
	public boolean addStudent(Student stud) {
		conn = getConnect(); // Connection 객체.
		String sql = "insert into student_info values(?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, stud.getStudentNo());
			psmt.setString(2, stud.getStudentName());
			psmt.setInt(3, stud.getEngScore());
			psmt.setInt(4, stud.getKorScore());
			int r = psmt.executeUpdate(); // 처리된 건이 있으면
			System.out.println(r + "건 입력되었습니다.");
			if (r > 0) {
				return true; // 정상처리 = true return
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}
		return false; // 에러발생 = false return
	}

	// 전체조회.
	public List<Student> studentList() {
		conn = getConnect();
		List<Student> list = new ArrayList<Student>();
		try {
			psmt = conn.prepareStatement("select * from  student_info order by student_no");
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
			disConnect();
		}
		return list;
	}
}
