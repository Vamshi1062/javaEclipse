package cgg.threads;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
class WriterThread1 extends Thread{
	PipedOutputStream dest; 
	public WriterThread1(PipedOutputStream dest) {
		this.dest=dest;
		
	}
	public void run() {
		byte[] data="i like java".getBytes();
		try(PipedOutputStream pos=new PipedOutputStream()){
		for(int i=0;i<data.length;i++) {
			
				dest.write((data[i]));
			}
		}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
class ReaderThread1 implements AutoCloseable{
	PipedInputStream Source;

	public ReaderThread1(PipedInputStream source) {
		super();
		Source = source;
	}
	public void run() {
		try(PipedInputStream pis=new PipedInputStream()) {
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
	}
}
public class PipedResourcesTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
		    	PipedOutputStream pos=new PipedOutputStream();
		    	PipedInputStream pis=new PipedInputStream();
		    	
		    	pos.connect(pis);
		    	WriterThread1 wt=new WriterThread1(pos);
		    	ReaderThread1 rt=new ReaderThread1(pis);
		    	
		    	wt.start();
		    	rt.start();
		    	
		    }catch(Exception e) {
		    	e.printStackTrace();
		    }
			

		}
	}

