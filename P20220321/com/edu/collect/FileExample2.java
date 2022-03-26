package com.edu.collect;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

public class FileExample2 {
	public static void main(String[] args) {
		Student[] stds = { new Student(101, "Hong", 20, 30), new Student(102, "Hwang", 33, 44) };
		List<Student> list = Arrays.asList(stds);

		File file = new File("list.dat");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(list);
			oos.close();

			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			List<Student> stlist = (List<Student>) ois.readObject();
			for (Student student : stlist) {
				System.out.println(student.toString());
			}
			ois.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}