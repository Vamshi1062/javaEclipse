package cgg.lab;

import java.io.FileInputStream;
import java.io.IOException;

public class EvenFile {

	public static void main(String[] args) {
		try {
		    FileInputStream reader=new FileInputStream("numbers.txt");
 		    int i;
		    while((i=reader.read())!=-1) {
		    	if(((char)i)%2==0&&((char)i)!=',') {
		    		System.out.println((char)i);
		    	}
		    }
			reader.close();
		}
		catch(IOException e) {
			System.out.println(e);

	}

}
}
