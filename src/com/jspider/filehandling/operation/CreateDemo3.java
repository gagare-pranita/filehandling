package com.jspider.filehandling.operation;

import java.io.File;
import java.io.IOException;

public class CreateDemo3 {
	public static void main(String[] args) {
		File f=new File("Demo1.txt");
		if(f.exists())
		{
			System.out.println("file is alreadu exits");
		}
		else
		{
			System.out.println("create new file");
		try {
			f.createNewFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		}
		
	}

}





//this exists() it cab used to cheack whether that file is already preasent or not it willbe return the outputt in the for of boolean if it is 
//present return true otherwise false