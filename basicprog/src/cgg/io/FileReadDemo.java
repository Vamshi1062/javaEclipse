package cgg.io;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadDemo {

	public static void main(String[] args) {
		try {
		Path File=Paths.get("C:\\Users\\CGG\\Desktop\\HTML\\images\\assignment2.html");
		List<String>lines=Files.readAllLines(File);
		for(String line:lines) {
			System.out.println(line);
		}
		System.out.println("end of file");
		}
		catch(Exception e) {
			
		}
	}

}
