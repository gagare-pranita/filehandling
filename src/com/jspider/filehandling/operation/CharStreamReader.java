package com.jspider.filehandling.operation;

import java.io.File;
import java.io.IOException;
import java.io.FileReader;


public class CharStreamReader {
	public static void main(String[] args) throws IOException 
	{
		File file =new File("Demo1.txt");
		if(file.exists())
		{
			FileReader reader=new FileReader(file);
				System.out.println(reader.read());
				System.out.println("fetcgh the data from th file");
				reader.close();
			
			
		}
		else
		{
			System.out.println("file is already exits");
		}
		
	}

}
