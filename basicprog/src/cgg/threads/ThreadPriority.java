package cgg.threads;
class Myclass extends Thread{
	int count;
	public Myclass(String s) {super(s);}
	@Override
	public void run() {
		for(int i=0;i<=10000;i++) {
			count++;
		}
		System.out.println("Completed Thread :"+this.getName());
		System.out.println("Its Priority: "+this.getPriority());
	}
}
public class ThreadPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass t1= new Myclass("one");
		Myclass t2=new Myclass("two");
		
		t1.setPriority(2);
		t2.setPriority(Thread.NORM_PRIORITY);
		
		t1.start();
		t2.start();

	}

}
