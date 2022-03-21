package com.prod;

//return (반환하다) 무조건 쓴 후에 할 것 
public class Employee {
	// field.
	int employeeId;
	private String employeeName;
	private String department;
	private String job;
	private int salary; // 숨기는 항목은 private로 입력

	// employee Id
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeName() {
		return this.employeeName;
	}

	public void setdepartment(String department) {
		this.department = department;
	}

	public String getdepartment() {
		return this.department;
	}

	public void setjob(String job) {
		this.job = job;
	}

	public String getjob() {
		return this.job;
	}

	public void setSalary(int salary) {
		if (salary < 0) {
			this.salary = 100000; // 필드를 쓸 때에는 this. 을 무조건 기입한다. (구분)
		} else {
			this.salary = salary;
		}
	}

	public int getSalary() {
		return this.salary;
	}

	public String getEmpInfo() {
		String result = this.employeeName + "의 부서는 " //
				+ this.department + "입니다. 직무는 " + this.job //
				+ "이고, 급여는 " + this.salary + "입니다.";
		return result;
	}
}
