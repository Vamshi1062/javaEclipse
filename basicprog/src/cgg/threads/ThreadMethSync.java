package cgg.threads;

public class ThreadMethSync implements Runnable {
	int available=1;
	int wanted;

		public ThreadMethSync(int wanted) {
		super();
		this.wanted = wanted;
	}
		public synchronized void process() {
			System.out.println("Available births " +available);
			
			if(available>=wanted) {
				String name=Thread.currentThread().getName();
				System.out.println(wanted+" berths are reserved by " +name);
				try {
					Thread.sleep(1500);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
				available=available-wanted;
				
			}
			else {
				System.out.println("sorry,no berths");
			}
		}
public void run() {
process();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadMethSync  obj=new ThreadMethSync(1);
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		
		t1.start();
		t2.start();
	}

}
