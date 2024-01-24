package com.jspider.filehandling.operation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStreamReader {
	public static void main(String[] args) throws IOException {
		
		File file=new File("Demo.txt");
		if(file.exists())
		{
		FileInputStream fileinputstream=new FileInputStream(file);
		System.out.println(fileinputstream.read());
		System.out.println("fetact the data from th efile");
		fileinputstream.close();
		}
		else
		{
			System.out.println("file does not exists");
		}
		
		}

}
