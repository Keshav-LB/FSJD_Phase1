package com.Day11_LiveSession;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

//Client Server Architecture Network for communication
//Server
public class ClientServerArchitecture {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket listner= new ServerSocket(4000);
		System.out.println("Server is ready..... to accept the inputs: ");
		Socket soc = listner.accept();
		InputStream inputStream= soc.getInputStream();//data enters through this input stream
		DataInputStream dataInputStream= new DataInputStream(inputStream);
		String temp = dataInputStream.readUTF();
		System.out.println("Content received is: "+temp);
	}

	
}
