package cgg.io;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class FilesDemo {
	public static void main(String[] args) {
		try {
		Path path=Paths.get("C:\\Program Files\\Java");
		System.out.println(path.getNameCount());
		System.out.println(path.getRoot());
		System.out.println(path.getParent());
		DirectoryStream<Path>contents=Files.newDirectoryStream(path);
		for(Path content:contents) {
			System.out.println(content.getFileName());
		}
		contents.close();
	}
catch(Exception e){
}
}
}
