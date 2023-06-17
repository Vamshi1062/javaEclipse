package cgg.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputDemo {

	public static void main(String[] args) {
	byte[] data= {65,66,67,68,69};
	try {
	ByteArrayInputStream bis=new ByteArrayInputStream(data);
	int i=bis.read();
	while(i!=-1) {
		System.out.println((char)i);
		i=bis.read();
	}

	bis.close();
} catch (IOException e) {
	System.out.println(e);
}
	}

}
