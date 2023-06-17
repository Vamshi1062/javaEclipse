package cgg.threads;

public class Theatre implements Runnable {
   String str;
   public Theatre(String str) {
	   super();
	   this.str=str;
	   
   }
   @Override
   public void run() {
	   for(int i=1;i<=10;i++) {
		   System.out.println(str+" "+i);
	try {
		Thread.sleep(2000);
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}
	   }
   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theatre theatre=new Theatre("cut the ticket");
		Theatre theatre1=new Theatre("show the seat");
		
		Thread t1=new Thread(theatre);
		Thread t2=new Thread(theatre1);
		
		t1.start();
		t2.start();
		
	}

}
