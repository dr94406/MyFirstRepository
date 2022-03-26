package com.edu.collect;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceFile implements StudentService {

	List<Student> students;
	File file;

	public void saveToFile() {
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);

			for (Student student : students) {
				bw.write(student.getStudentNumber() + " " + student.getStudentName() + " "//
						+ student.getEngScore() + " " + student.getKorScore() + "\n");
			}

			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public StudentServiceFile() {

		students = new ArrayList<Student>();
		file = new File("student.dat");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		String readBuffer = null;
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			while ((readBuffer = br.readLine()) != null) {
//				System.out.println(readBuffer);
				String[] contents = readBuffer.split(" ");
				students.add(new Student(Integer.parseInt(contents[0]), contents[1]//
						, Integer.parseInt(contents[2]), Integer.parseInt(contents[3])));
			}

			fr.close();
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void insertStudent(Student student) {
		students.add(student);
	}

	@Override
	public Student getStudent(int sno) {
		return null;
	}

	@Override
	public List<Student> studentList() {
		return students;
	}

	@Override
	public void modifyStudent(Student student) {

	}

	@Override
	public void removeStudent(int sno) {

	}

	@Override
	public List<Student> searchStudent(String name) {
		return null;
	}

}