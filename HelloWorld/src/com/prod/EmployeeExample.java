package com.prod;

// return (반환하다) 무조건 쓴 후에 할 것 
public class EmployeeExample {
	public static void main(String[] args) {
		Employee e1 = new Employee();
//		e1.employeeId = 100;
		e1.setEmployeeId(100);
//		e1.employeeName = "김사원";
		e1.setEmployeeName("김사원");
//		e1.department = "개발부";
		e1.setdepartment("개발부");
//		e1.job = "월급계산";
		e1.setjob("월급계산");
//		e1.salary = -1000000; // salary는 0보다 큰 값이 되어야한다.
		e1.setSalary(-10000);

//		System.out.println(e1.getEmployeeName() + "의 부서는 " + e1.getdepartment()//
//		+"입니다. 직무는 " + e1.getjob() + "이고, " // 
//		+" 급여는 " + e1.getSalary() + "입니다. ");
		System.out.println(e1.getEmpInfo());

		Employee e2 = new Employee();
		e2.setEmployeeId(101); // 컨트롤 키를 누른 후 클릭을 하면 위치를 알려준다.
		e2.setEmployeeName("김형민");
		e2.setdepartment("총무부");
		e2.setjob("비품구매");
		e2.setSalary(2000000);
		System.out.println(e2.getEmpInfo());
	}
}
