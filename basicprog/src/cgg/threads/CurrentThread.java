package cgg.threads;

public class CurrentThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("let us find current thread");
		Thread currentThread=Thread.currentThread();
		System.out.println("current Thread "+currentThread);
		System.out.println("Thread name "+currentThread.getName());

	}

}
