package com.prod.emp;

import java.util.List;

public class EmpExe {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		List<Employee> list =dao.empList(); //전체 조회하는 기능.
		
		System.out.println("사원리스트.");
		for(Employee emp : list) {
			System.out.println(emp.toString());
		}
	}
}
