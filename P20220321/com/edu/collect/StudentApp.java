package com.edu.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentServiceFile implements StudentService {

	   List<Student> list = new ArrayList<Student>();
	   File file;

	   @Override
	   public void insertStudent(Student student) {
	      list.add(student); // 추가.
	   }

	   @Override
	   public Student getStudent(int sno) {
	      for (int i = 0; i < list.size(); i++) {
	         if (list.get(i).getStudentNumber() == sno) {
	            return list.get(i);
	         }
	      }
	      return null; // 리스트를 리턴하겠습니다.
	   }

	   @Override
	   public List<Student> studentList() {
	      // TODO Auto-generated method stub
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
	   public void removeStudent(int sno) {
	      for (int i = 0; i < list.size(); i++) {
	         if (list.get(i).getStudentNumber() == sno) {
	            list.remove(i);
	            System.out.println("삭제했습니다.");
	            break;
	         } else {
	            System.out.println("없습니다.");
	         }
	      }

	   }

	   @Override
	   public List<Student> searchStudent(String name) {
	      List<Student> searchList = new ArrayList<Student>();
	      // 찾았다고 종료 X
	      for (int i = 0; i < list.size(); i++) {
	         // 같은 이름이 있는지 찾아보고 있으면 searchList.add()
	         if (list.get(i).getStudentName().equals(name)) { // equals 메소드는 비교하고자 하는 대상의 내용 자체를 비교
	            searchList.add(list.get(i));
	         }
	      }
	      return searchList;
	   }

	   @Override
	   public void saveToFile() {
	      // TODO Auto-generated method stub
	      try {
	         FileWriter fw = new FileWriter("studentList.date");
	         BufferedWriter bw = new BufferedWriter(fw);

	         for (Student stud : list) {
	            bw.write(stud.getStudentNumber() + "," + stud.getStudentName()//
	                  + "," + stud.getEngScore() + "," + stud.getKorScore());
	         }
	         bw.close();
	         fw.close();

	      } catch (IOException e) {
	         e.printStackTrace();
	      }

	   }

	}