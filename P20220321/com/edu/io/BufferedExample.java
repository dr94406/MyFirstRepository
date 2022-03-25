package com.edu.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedExample {
	public static void main(String[] args) {
		try  (FileInputStream fis = new FileInputStream("C:/temp/image.jpg");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = //
				new BufferedOutputStream(new FileOutputStream("C:/temp/copy3.jpg"));) { 
	
			int readByte = -1;
			while ((readByte = bis.read()) != -1) {
				bos.write(readByte);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end of prog");
		}
}
		
