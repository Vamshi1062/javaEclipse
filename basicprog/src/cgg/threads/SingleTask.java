package cgg.threads;

class ThreadTest extends Thread{
	public void run() {
		task1();
		task2();
		task3();
	}

	public void task1() {
		 System.out.println("task1");
		
	}
	public void task2() {
		 System.out.println("task2");
		
	}
	public void task3() {
		 System.out.println("task3");
		
	}
}
public class SingleTask {

	public static void main(String[] args) {
		ThreadTest test=new ThreadTest();
		test.start();
		

	}

}
