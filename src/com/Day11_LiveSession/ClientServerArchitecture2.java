package com.Day11_LiveSession;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

//Client
public class ClientServerArchitecture2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Socket soc = new Socket("192.168.188.1",4000);
		OutputStream outputStream=soc.getOutputStream();
		DataOutputStream dataOutputStream= new DataOutputStream(outputStream);
		Scanner sc = new Scanner(System.in);
		String temp = sc.nextLine();
		dataOutputStream.writeUTF(temp);
	}

}
