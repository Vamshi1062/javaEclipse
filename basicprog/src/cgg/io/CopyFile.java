package cgg.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    FileInputStream fromFile;
    FileOutputStream toFile;
    public void init(String arg1,String arg2) {
    	try {
            fromFile= new FileInputStream(arg1);
            toFile=new FileOutputStream(arg2);
            
            
    	}
    	catch(IOException ioe){
    		System.out.println("Exception "+ioe);
    	}
    }
    public void copyFile() {
    	try {
    		int i=fromFile.read();
    		while(i!=-1) {
    			toFile.write(i);
    			i=fromFile.read();
    		}
    	}
    	catch(IOException ioe){
    		System.out.println("Exception "+ioe);
    		
    	}
    }
    public void closeFiles() {
    	try {
    		fromFile.close();
    		toFile.close();
    	}
    	catch(IOException ioe){
    		System.out.println("Exception "+ioe);
    		
    	}
    }
	public static void main(String[] args) {
		 CopyFile cp=new CopyFile();
         cp.init(args[0], args[1]);
         cp.copyFile();
         cp.closeFiles();
	}

}
