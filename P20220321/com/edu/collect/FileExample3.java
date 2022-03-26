package com.edu.collect;

import java.io.File;
import java.io.IOException;

public class FileExample3 {
	public static void main(String[] args) {

		File file = new File("listFile.dat");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		

	}
}