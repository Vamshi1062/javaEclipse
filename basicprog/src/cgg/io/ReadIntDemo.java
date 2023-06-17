package cgg.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class ReadIntDemo {

	public static void main(String[] args) {
		 try {
			 InputStream source=new FileInputStream("num.txt");
			 DataInputStream dis=new DataInputStream(source);
			 for(int i=0;i<=10;i++) {
				 System.out.println(dis.readInt());
			 }
			 
		 }
		 catch(Exception e){
			 e.printStackTrace();
			 
		 }
	}

}
