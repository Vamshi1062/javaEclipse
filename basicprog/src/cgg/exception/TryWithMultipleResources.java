package cgg.exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TryWithMultipleResources {

	public static void main(String[] args) {
		 try(Scanner s=new Scanner(new File("abc.txt"));FileWriter wr=new FileWriter("test.txt")){
			 while(s.hasNext()) {
				 wr.write(s.next());
			 }
			 throw new IOException("My IOException");
		 }
		 catch(IOException e) {
			 System.out.println(e.getMessage());
		 }

	}

}
