package com.Day11_LiveSession;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 1.Creating a file
 * 2.Reading content from one file
 * 3.Writing the content from 1 file to another
 */
public class FileHandling {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String path1 = "C:\\Users\\KESHAV MISHRA\\eclipse-workspace\\FSJD_Phase1\\src\\com\\Day11_LiveSession\\FileOps";
		String path2 = "C:\\Users\\KESHAV MISHRA\\eclipse-workspace\\FSJD_Phase1\\src\\com\\Day11_LiveSession\\FileOps2";
		
		FileInputStream fis = new FileInputStream(path1);
		int temp;
		FileOutputStream fos = new FileOutputStream(path2);
		
		while((temp=fis.read())!=-1) {
			fos.write(temp);
		}
		
		fos.close();
		fis.close();
	}

}
