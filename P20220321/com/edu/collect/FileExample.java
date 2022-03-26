package com.edu.collect;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileExample {
	public static void main(String[] args) {

		File file = new File("file.dat");

		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
			Student student = new Student(100, "hong", 80, 90);
			oos.writeObject(student);
			oos.close();

			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			Student oist = (Student) ois.readObject();
			System.out.println(oist);
			ois.close();

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("end of program");
	}
}