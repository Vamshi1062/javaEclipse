package cgg.threads;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
public class MultiServe implements Runnable{
	
	static ServerSocket ss;
	static Socket s;
	public void run() {
		String name=Thread.currentThread().getName();
		for(;;) {
			System.out.println("Thread "+name+" ready to accept");
			try {
				s=ss.accept();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			System.out.println("Thread "+name+" accepted connection");
			PrintStream ps=null;
			try {
			 ps=new PrintStream(s.getOutputStream());
		}
			catch(IOException e) {
				e.printStackTrace();
			}
			ps.println("Thread  "+name+" contacted you");
			ps.close();
			try {
				s.close();}
				catch(IOException e) {
					e.printStackTrace();
				}
			 
				
			}
		
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		MultiServe ms=new MultiServe();

        ss=new ServerSocket(999);
        Thread t1=new Thread(ms,"one");
        Thread t2=new Thread(ms,"two");
        
        t1.start();
        t2.start();
        
	}

}
