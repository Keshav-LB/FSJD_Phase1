package com.Day11_LiveSession;

import java.io.File;
import java.io.IOException;

public class FileHandling2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path1 = "C:\\Users\\KESHAV MISHRA\\eclipse-workspace\\FSJD_Phase1\\src\\com\\Day11_LiveSession\\FileOps_new";
		String path2 = "C:\\Users\\KESHAV MISHRA\\eclipse-workspace\\FSJD_Phase1\\src\\com\\Day11_LiveSession\\FileOps5";
		
		File f1 = new File(path1);
		File f2 = new File(path2);
		
		if(f1.createNewFile()) {
			System.out.println("File 1 is created....");
		}
		else {
			System.out.println("File 1 creation failed...");
		}
		
		System.out.println(f1.isDirectory());
		System.out.println(f1.canExecute());
		System.out.println(f1.canRead());
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.getFreeSpace());
		System.out.println(f1.getParent());
		System.out.println(f1.isFile());
		System.out.println(f1.isHidden());
		System.out.println(f1.exists());
		System.out.println(f1.delete());
		System.out.println("After FIle deletion: "+f1.exists());

	}

}
