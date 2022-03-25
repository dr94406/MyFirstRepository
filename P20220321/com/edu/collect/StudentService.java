package com.edu.collect;

import java.util.List;

public interface StudentService {
	
	public void insertStudent(Student student); // 입력.
	public Student getStudents(int sno); //한건조회.
	public List<Student> studentList();	 // 전체목록.
	public void modifyStudent(Student student); // 한건수정.
	public void removeStudent(int del); // 한건삭제.
	public List <Student> searchStudent(String name);  // 이름조회. 한 건이 아니고 여러건을 반영하는 컬렉션타입.
	
	
}
