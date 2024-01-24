package com.jspider.filehandling.operation;

import java.io.File;
import java.io.IOException;
//In java we can be created the file in two ways  with the defult path and another isabsolute path
//in that file it will be categorized in two ways  1)soure
public class CreateDemo1 {
	public static void main(String args[])
	{
		File file=new File("Demo.txt");
		System.out.println("file will be craeted");
		try {
			file.createNewFile();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}

}
