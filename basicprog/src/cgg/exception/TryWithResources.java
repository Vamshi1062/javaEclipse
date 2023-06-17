package cgg.exception;

import java.io.FileWriter;
import java.io.IOException;

public class TryWithResources {

	public static void main(String[] args) {
		try(FileWriter wr=new FileWriter("abc.txt")){
			wr.write("TEsting try with resources");
			throw new IOException("Test IOException");
		}
catch(IOException e) {
	System.out.println("File name specified does not exists "+e.getMessage());
	System.out.println(e);
}
	}

}
