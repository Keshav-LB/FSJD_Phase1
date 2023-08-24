package com.Day11_LiveSession;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//File Handling though file reader and file writer using bufferedReader & bufferedWriter
public class FileHandling1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String path1 = "C:\\Users\\KESHAV MISHRA\\eclipse-workspace\\FSJD_Phase1\\src\\com\\Day11_LiveSession\\FileOps";
		String path2 = "C:\\Users\\KESHAV MISHRA\\eclipse-workspace\\FSJD_Phase1\\src\\com\\Day11_LiveSession\\FileOps3";
		
		FileReader fr = new FileReader(path1);
		FileWriter fw = new FileWriter(path2);
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		String temp;

		while((temp=br.readLine())!=null) {
			bw.write(temp);
		}
		
		br.close();
		bw.flush();
		fr.close();
		fw.close();
	}

}
