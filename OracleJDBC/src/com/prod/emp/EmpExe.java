package com.prod.emp;

import java.util.List;
import java.util.Scanner;

public class EmpExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		EmpDAO dao = new EmpDAO();

		// 메뉴: 1.사원리스트 2.입력 3.수정 4.삭제 5.한건조회 9.종료
		while (true) {
			System.out.println("1.사원리스트 2.입력 3.수정 4.삭제 5.한건조회 9.종료");
			System.out.println("메뉴를 선택하세요");

			int menu = scn.nextInt();
			if (menu == 1) { // 리스트.
				List<Employee> list = dao.empList(); // 전체 조회하는 기능.

				System.out.println("사원리스트.");
				for (Employee emp : list) {
					System.out.println(emp.toString());
				}
			} else if (menu == 2) { // 입력.
				// 사원번호, lastName, email, hireDate, jobId
				Employee employee = new Employee();
				System.out.println("사원번호를 입력하세요. ");
				int id = scn.nextInt();
				employee.setEmployeeId(id);

				System.out.println("성을 입력하세요.");
				String firstName = scn.next();   
				employee.setFirstName(firstName);  

				System.out.println("이름을 입력하세요.");
				String lastName = scn.next();
				employee.setLastName(lastName);

				System.out.println("이메일을 입력하세요.");
				String email = scn.next();
				employee.setEmail(email);

				System.out.println("입사일을 기록하세요. (ex: 2022-03-30) ");
				String hireDate = scn.next();
				employee.setHireDate(hireDate);

				System.out.println("부서를 입력하세요. (ex: IT_PROG) ");
				String jobid = scn.next();
				employee.setJobId(jobid);
//				dao.insertEmp(employee);

				 dao.insertEmp(employee);

			} else if (menu == 3) { // 수정처.
				Employee employee = new Employee();
				System.out.println("수정할 이름을 입력하세요.");
				String firstname = scn.next();
				employee.setFirstName(firstname);

				System.out.println("수정할 전화번호를 입력하세요..");
				String phoneNumber = scn.next();
				employee.setPhoneNumber(phoneNumber);

				System.out.println("수정할 월급을 입력하세요.");
				int salary = scn.nextInt();
				employee.setSalary(salary);

				System.out.println("수정할 사람의 사원번호를 입력하세요.");
				int id = scn.nextInt();
				employee.setEmployeeId(id);

				dao.updateEmp(employee);

			} else if (menu == 4) { // 삭제.
				Employee employee = new Employee(); // 삭제할 사원번호

				System.out.println("삭제할 사원번호를 입력하세요.");
				int employeeId = scn.nextInt();
				dao.deleteEmp(employeeId);

			} else if (menu == 5) { // 한건조회.
				System.out.println("조회할 사원번호를 입력하세요.");
				int eid = scn.nextInt();

				Employee emp = dao.searchEmp(eid);
				if (emp == null)
					System.out.println("조회결과 없습니다.");
				else
					System.out.println(emp.toString());

			} else if (menu == 9) { // 종료.
				System.out.println("프로그램을 종료.");
				break;
			}

		} // end of while
		System.out.println("end of program");
		scn.close();

	} // end of main
}
