package com.edu.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriterExample {
	public static void main(String[] args) { 
		// 출력스트림을 문자기반으로 second.txt 트라이캐치(예외처리)해준다.
		try {
			FileWriter fw = new FileWriter("second.txt");
			fw.write("Hello\n");
			fw.write("World\n");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end of prog");
	}
}
