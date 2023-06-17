package cgg.io;

import java.io.RandomAccessFile;

public class RandomAccessDemo {

	public static void main(String[] args) {
		 try {
			 RandomAccessFile raf=new RandomAccessFile(args[0],"r");
			 int no=(int)raf.length()/4;
			 for(int i=no;i>0;i--) {
				 raf.seek((i-1)*4);
				 System.out.println(raf.readInt());
			 }
			 
		 }catch(Exception e){
			 System.out.println(e);
			 
		 }

	}

}
