package cgg.threads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class MultiClient {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Socket socket=new Socket("localhost",999);
		BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String str;
        while((str=br.readLine())!=null) {
        	System.out.println(str);
        }
        br.close();
        socket.close();
	}

}
