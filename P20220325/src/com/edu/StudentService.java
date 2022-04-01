package com.edu;

import java.util.List;

public interface StudentService {
	public void addStudent(Student student); // 회원추가.
	public void modifyStudent(Student student); // 회원정보수정.
	public List<Student> StudentList(); // 회원리스트.

}
