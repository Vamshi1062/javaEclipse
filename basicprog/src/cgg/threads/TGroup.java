package cgg.threads;

class Reservation extends Thread{
	public Reservation( ThreadGroup tg,String name) {
		 
		super(tg,name);
	}

	public void run() {
		System.out.println("I am reservation thread ");
	}
}
class Cancellation extends Thread{
	public Cancellation(ThreadGroup tg,String name) {
		 
		super(tg,name);
	}

	public void run() {
		System.out.println("I am cancellation Thread");
	}
}
public class TGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroup tg= new ThreadGroup("First Group");

		Reservation res=new Reservation(tg,"First Thread");
		Reservation res1=new Reservation(tg,"second Thread");
		
		
		ThreadGroup tg1= new ThreadGroup(tg,"Second Group");

		Cancellation can=new Cancellation(tg1,"Third Thread");
		Cancellation can1=new Cancellation(tg1,"Fourth Thread");
		
		System.out.println("parent of tg1 ="+tg1.getParent());
		tg1.setMaxPriority(7);
		System.out.println("Thread Group of first thread :"+res.getThreadGroup());
		System.out.println("Thread Group of Third thread :"+can.getThreadGroup());
		
		res.start();
		res1.start();
		can.start();
		can1.start();
		
		System.out.println("No of thread active in tg :"+tg.activeCount());
		System.out.println("No of thread active in tg1 :"+tg1.activeCount());
		
		
		
		
		

	}

}
