package com.prod.emp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO extends DAO {

	// 전체조회
	public List<Employee> empList() {
		List<Employee> employees = new ArrayList<Employee>();

		conn = getConnect(); // getConnect를 호출한다.
		try {
			psmt = conn.prepareStatement("select * from emp_java");
			rs = psmt.executeQuery();
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id")); // employees.employee_id 테이블
				emp.setFirstName(rs.getString("first_name")); // employees.first_name 테이블
				emp.setLastName(rs.getString("last_name")); // employees.last_name 테이블
				emp.setEmail(rs.getString("email")); // employees.email 테이블
				emp.setSalary(rs.getInt("salary")); // employees.salary 테이블
				emp.setHireDate(rs.getString("hire_date").substring(0, 10)); // 0~10글자가 들어간다는 뜻 같다. ex) 2000-01-27 하이픈을
																				// 포함한 10자리
				emp.setJobId(rs.getString("job_id")); // employees.job_id 테이블
				employees.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // 반드시 실행해야 한다는 뜻이다.
			disconnect();
		}
		return employees;
	}

	// 한건조회
	public Employee searchEmp(int eid) { // 매개변수 타입
		conn = getConnect();
		Employee emp = null;
		String sql = "select * from emp_java where employee_id = ?"; // 선택합니다. emp_java로 부터, 당신의 아이디는 ? = "입력값"
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, eid);
			rs = psmt.executeQuery();
			if (rs.next()) {
				emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id")); // employees.employee_id 테이블
				emp.setFirstName(rs.getString("first_name")); // employees.first_name 테이블
				emp.setLastName(rs.getString("last_name")); // employees.last_name 테이블
				emp.setEmail(rs.getString("email")); // employees.email 테이블
				emp.setSalary(rs.getInt("Salary")); // employees.Salary 테이블
				emp.setHireDate(rs.getString("hire_date").substring(0, 10)); // employees.hire_date 테이블
				emp.setPhoneNumber(rs.getString("phone_number")); // employees.phone_number 테이블
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 정상실행, 예외발생 => 반드시 실행코드.
			disconnect();
		}
		return emp;

	}

	// 입력처리 executeUpdate()
	public void insertEmp(Employee emp) {
		conn = getConnect();
		String sql = "insert into emp_java (employee_id, first_name, last_name, email, hire_date, job_id)\r\n"
				+ "values (?, ?, ?, ?, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql); // ? <= 매개변수값중에서 employeeId 필드값.
			psmt.setInt(1, emp.getEmployeeId());
			psmt.setString(2, emp.getFirstName());
			psmt.setString(3, emp.getLastName());
			psmt.setString(4, emp.getEmail());
			psmt.setString(5, emp.getHireDate());
			psmt.setString(6, emp.getJobId());

			int r = psmt.executeUpdate(); // 실행된 건수를 반환해줍니다.
			System.out.println(r + "건 입력됨.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 정상실행, 예외발생 => 반드시 실행코드.
			disconnect();
		}
	}

	// 수정처리
	public void updateEmp(Employee emp) {
		conn = getConnect(); // rn을 스페이스바로 지워라..
		String sql = "update emp_java " + "set first_name = ?, " + "phone_number = ?, " + "salary = ? "
				+ "where employee_id = ?"; // 쿼리 작성 => ? 작성.
		try {
			psmt = conn.prepareStatement(sql);
			// 파라메터(?) 값을 지정.
			psmt.setString(1, emp.getFirstName());
			psmt.setString(2, emp.getPhoneNumber());
			psmt.setInt(3, emp.getSalary());
			psmt.setInt(4, emp.getEmployeeId());
			// 위의 sql 갯수와 대입이 되어야한다. 콘솔창에 오류가 뜬다면 확인하길바란다.

			int r = psmt.executeUpdate(); // 실행.
			System.out.println(r + "건 수정됨.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	// 삭제처리
	public void deleteEmp(int empId) {
		conn = getConnect();
		String sql = "delete from emp_java " + "where employee_id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			// 파라메터(?) 값을 지정.
			psmt.setInt(1, empId);
			int r = psmt.executeUpdate(); // 실행.
			System.out.println(r + "건 삭제됨.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}
}
