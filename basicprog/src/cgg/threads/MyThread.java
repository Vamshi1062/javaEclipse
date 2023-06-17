package cgg.threads;

public class MyThread extends Thread{
public MyThread(String name) {
	super(name);
}
@Override
public void run() {
	System.out.println("Thread name "+getName());
}
	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		MyThread thread=new MyThread("Thread1");
		MyThread thread1=new MyThread("Thread2");
	thread.start();
	thread1.start();
	System.out.println(thread.isAlive());
	thread.join();
	thread1.join();
	System.out.println(thread.isAlive());
	System.out.println(thread1.isAlive());
	System.out.println("Main ends");
		}

}
