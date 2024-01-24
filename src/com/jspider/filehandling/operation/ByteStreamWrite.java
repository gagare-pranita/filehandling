package com.jspider.filehandling.operation;
import java.io.IOException;
import java.io.File;
import java.io.FileOutputStream;

public class ByteStreamWrite {
	public static void main(String[] args)throws IOException {
		File file=new File("Demo.txt");
		if(file.exists())
		{
			FileOutputStream write= new FileOutputStream(file);
			write.write(200);
			System.out.println("write the byte code data inside the file");
			write.close();
			
		}
		else
		{
			file.createNewFile();
			System.out.println("createnew file");
			FileOutputStream write= new FileOutputStream(file);
			write.write(200);
			System.out.println("write the byte code data inside the file");
			write.close();
		}
		
		
	}

}
