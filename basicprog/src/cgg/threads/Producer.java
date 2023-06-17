package cgg.threads;
class Produce extends Thread{
	StringBuffer sb;
     boolean dataprodover;
	
	public Produce() {
		sb=new StringBuffer();
		
	}
	public void run() {
		//synchronized(sb)
		for(int i=1;i<=10;i++) {
			
			try {
				sb.append(i+":");
				Thread.sleep(100);
				System.out.println("appending");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		//sb.notify();
		dataprodover=true;
	}
}
class Consumer extends Thread{
	Produce prod;
	public Consumer(Produce prod) {
		this.prod=prod;
	}
	public void run() {
		try {
			//synchronized(prod.sb){
			//prod.sb.wait();
			//instead of while loop
		while(!prod.dataprodover) {
			Thread.sleep(10);
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
		System.out.println(prod.sb);
}
}
public class Producer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Produce producer=new Produce();
	  Consumer consumer=new Consumer(producer);
	  
	  consumer.start();
	  producer.start();
	  
      
      
     
	}

}
