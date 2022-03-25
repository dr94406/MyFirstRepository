package com.edu.collect;

import java.io.*;
import java.util.*;

public class StudentServiceFile implements StudentService {

	List<Student> list = new ArrayList<Student>();
	File file;

	@Override
	public void insertStudent(Student student) {
		list.add(student);
	}

	@Override
	public Student getStudents(int sno) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getStudentNumber() == sno) {
				return list.get(i);
			}
		}
		return null; // 리스트를 리턴하겠습니다.
	}	

	@Override
	public void removeStudent(int num) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getStudentNumber() == del) {
				list.remove(i);
				System.out.println("삭제했습니다.");
				break;
			} else {
				System.out.println("없습니다.");
			}
		}
	

	}

	@Override
	public List<Student> studentList() {
		return list;
	}

	@Override
	public void modifyStudent(Student student) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getStudentNumber() == student.getStudentNumber()) {
				list.get(i).setEngScore(student.getEngScore()); // 영어점수수정.
				list.get(i).setKorScore(student.getKorScore()); // 국어점수수정.
			}
		}
	}

	@Override
	public List<Student> searchStudent(String name) {
		List<Student> searchList = new ArrayList<Student>();
		// 찾았다고 종료 X
		for (int i = 0; i < list.size(); i++) {
			// 같은 이름이 있는지 찾아보고 있으면 searchList.add()
			if (list.get(i).getStudentName().equals(name)) { // 만약 학생들의 이름과 같은 이름이 담긴것이 있다면 (equals -> 대상의 내용 자체를
																// 비교)
				searchList.add(list.get(i)); // 목록에 추가를 하겠습니다.
			}
		}
		return searchList;
	}

	@Override
	public void saveTofile() {
	try {
		FileWriter fw = new FileWriter("studentList.data");
		BufferedWriter bw = new BufferedWriter(fw);
		
		for(Student stud : list) {
			bw.write(stud.getStudentNumber() + "," + stud.getStudentName()//
			+ );
		}
	}
		
	}

}
