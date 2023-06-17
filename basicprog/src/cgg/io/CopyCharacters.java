package cgg.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyCharacters {

	public static void main(String[] args) {
		try {
		    FileInputStream reader=new FileInputStream("names.txt");
		    FileOutputStream writer=new FileOutputStream("output.txt");
		    int i;
		    while((i=reader.read())!=-1) {
		    	writer.write(i);
		    }
			writer.close();
			reader.close();
		}
		catch(IOException e) {
			System.out.println(e);

	}

}
}
