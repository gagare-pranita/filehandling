package com.jspider.filehandling.operation;

import java.io.File;

public class FileInfo {
	public static void main(String[] args) {
		File f=new File("Demo.txt");
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.length());
		if(f.canRead())
		{
			System.out.println("readbale file");
		}
		else
		{
			System.out.println("not readable");
		}
		if(f.canWrite())
		{
			System.out.println("writable file");
		}
		else
		{
			System.out.println("not writable");
		}
		if(f.canExecute())
		{
			System.out.println("excutable file");
		}
		else
		{
			System.out.println("not excutable");
		}
		
	}

}
