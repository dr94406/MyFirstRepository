package com.edu.collect;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceOracle extends DAO implements StudentService {

	// 입력처리
	@Override
	public void insertStudent(Student stu) {
		conn = getConnect();
		String sql = "insert into student_info  (student_no, student_name, eng_score, kor_score)\r\n"
				+ "values(?, ?, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql); // ? <= 매개변수값중에서 employeeId 필드값.
			psmt.setInt(1, stu.getStudentNo());
			psmt.setString(2, stu.getStduentName());
			psmt.setInt(3, stu.getEngScore());
			psmt.setInt(4, stu.getKorScore());

			int r = psmt.executeUpdate(); // 실행된 건수를 반환해줍니다.
			System.out.println(r + "건 입력됨.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 정상실행, 예외발생 => 반드시 실행코드.
			disconnect();
		}

	}

	// 한 건 조회. (학생번호로)
	@Override
	public Student getStudent(int aoa) { // 매개변수 타입
		conn = getConnect();
		Student student = null;
		String sql = "select * from student_info where student_no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, aoa);
			rs = psmt.executeQuery(); // 실행건수만큼 반복자.
			if (rs.next()) {
				student = new Student();
				student.setStudentNo(rs.getInt("student_no")); // 값을 읽어와서 지정하겠습니다.
				student.setStduentName(rs.getString("student_name"));
				student.setEngScore(rs.getInt("eng_score"));
				student.setKorScore(rs.getInt("kor_score"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return student;
	}

	// 전체조회
	@Override
	public List<Student> studentList() {
		List<Student> list = new ArrayList<Student>(); // 조회된 결과값을 담기위한 컬렉션.

		conn = getConnect();
		try {
			psmt = conn.prepareStatement("select * from student_info");
			rs = psmt.executeQuery(); // 실행건수만큼 반복자.
			while (rs.next()) { // 반복자를 통해 요소를 가지고 올 수 있는지 체크. 있으면 하나 가지고 옴.
				Student student = new Student();
				student.setStudentNo(rs.getInt("student_no")); // 값을 읽어와서 지정하겠습니다.
				student.setStduentName(rs.getString("student_name"));
				student.setEngScore(rs.getInt("eng_score"));
				student.setKorScore(rs.getInt("kor_score"));

				list.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;
	}
	
	// 수정처리
	@Override
	public void modifyStudent(Student stu) { 
		conn = getConnect();
		String sql = "update student_info " + "set eng_score = ?, " + "kor_score = ?, " + "where student_no = ?";
		try {
			psmt = conn.prepareStatement(sql); // ? <= 매개변수값중에서 employeeId 필드값.
			psmt.setInt(1, stu.getEngScore());
			psmt.setInt(2, stu.getKorScore());
			psmt.setInt(3, stu.getStudentNo());

			int r = psmt.executeUpdate(); // 실행된 건수를 반환해줍니다.
			System.out.println(r + "건 수정됨.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 정상실행, 예외발생 => 반드시 실행코드.
			disconnect();
		}
	}

	// 삭제처리
	@Override
	public void removeStudent(int glo) {
		conn = getConnect();
		String sql = "delete from student_info\r\n" + "where student_no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, glo);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제됨.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	// 이름으로 조회

	@Override
	public List<Student> searchStudent(String gro) {
		List<Student> Students = new ArrayList<Student>();
		conn = getConnect();
		Student gra = null;
		String sql = "select * from student_info where student_name = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, gro);
			rs = psmt.executeQuery(); // 실행건수만큼 반복자.
			if (rs.next()) {
				gra = new Student();
				gra.setStudentNo(rs.getInt("student_no")); // 값을 읽어와서 지정하겠습니다.
				gra.setStduentName(rs.getString("student_name"));
				gra.setEngScore(rs.getInt("eng_score"));
				gra.setKorScore(rs.getInt("kor_score"));

				Students.add(gra);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return Students;
	}

	@Override
	public void saveToFile() { // 안해도됨.

	}

}
