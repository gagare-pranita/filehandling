package com.jspider.filehandling.operation;

import java.io.File;
import java.io.IOException;

public class Delete {
	public static void main(String[] args) {
		File f=new File("Demo2.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	if(f.exists())
	{
		System.out.println("file it will be already present");
		f.delete();
	System.out.println("deletre the file");
	}
	else
	{
		System.out.println("file not present");
	}
	}

}
