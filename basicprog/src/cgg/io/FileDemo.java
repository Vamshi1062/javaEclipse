package cgg.io;

import java.io.File;
import java.util.Date;

public class FileDemo {

	public static void main(String[] args) {
		String fname=args[0];
		File file=new File(fname);
		
		System.out.println("File name :"+file.getName());
		System.out.println("Parent dir name :"+file.getParent());
		System.out.println("Absolute Path Name:"+file.getAbsolutePath());
		System.out.println("File Modified last :"+new Date(file.lastModified()));
		System.out.println("File length:"+file.length());
		System.out.println("File Readable?"+(file.canRead()?"true":"false"));

	}

}
