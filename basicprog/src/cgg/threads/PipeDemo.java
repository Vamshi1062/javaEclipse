package cgg.threads;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
class WriterThread extends Thread{
	PipedOutputStream dest; 
	public WriterThread(PipedOutputStream dest) {
		this.dest=dest;
		
	}
	public void run() {
		byte[] data="i like java".getBytes();
		try{
		for(int i=0;i<data.length;i++) {
			
				dest.write((data[i]));
			}
		}
			catch(IOException e) {
				e.printStackTrace();
			}
			finally {
				try {
					dest.flush();
					dest.close();
				}
				catch(IOException e){
					e.printStackTrace();
					
				}
			}
		}
	}
class ReaderThread extends Thread{
	PipedInputStream Source;

	public ReaderThread(PipedInputStream source) {
		super();
		Source = source;
	}
	public void run() {
		try {
			int r=Source.read();
			while(r!=-1) {
				System.out.write(r);
				r=Source.read();
				
			}
			System.out.flush();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				Source.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
public class PipeDemo {

	public static void main(String[] args) {
	    try {
	    	PipedOutputStream pos=new PipedOutputStream();
	    	PipedInputStream pis=new PipedInputStream();
	    	
	    	pos.connect(pis);
	    	WriterThread wt=new WriterThread(pos);
	    	ReaderThread rt=new ReaderThread(pis);
	    	
	    	wt.start();
	    	rt.start();
	    	
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
		

	}

}
