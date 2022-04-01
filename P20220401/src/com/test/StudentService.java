package com.test;

import java.util.List;

public interface StudentService {
	// 입력
	public void addStudent(Student student);

	// 수정
	public void modStudent(Student student);

	// 리스트
	public List<Student> studentList();
}
