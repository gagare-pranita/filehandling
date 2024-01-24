package com.jspider.filehandling.operation;

import java.io.File;
import java.io.IOException;

public class CreateDemo2 {
	public static void main(String[] args) {
		File file=new File("E:/weja2/filehandling/Demo.txt");
		System.out.println("file will be created");
		try {
			file.createNewFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
		
	}

}
