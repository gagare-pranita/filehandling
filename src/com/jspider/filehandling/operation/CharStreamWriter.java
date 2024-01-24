package com.jspider.filehandling.operation;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;

public class CharStreamWriter  
{
	public static void main(String[] args) throws IOException
	{
		File file=new File("E:/weja2/filehandling/Demo1.txt");
		if(file.exists())
		{
			FileWriter write=new FileWriter(file);
			write.write("write");
			System.out.println("write the data inside the demo fie");
			write.close();
		}
		else
		{
			file.createNewFile();
			System.out.println("create new file");
			FileWriter write=new FileWriter(file);
			write.write("demo file write");
			System.out.println("write the data inside the demo fie");
			write.close();
			
		}
		
	}

}
