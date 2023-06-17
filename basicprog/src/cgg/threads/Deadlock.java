package cgg.threads;
class Bookticket extends Thread{
	Object train,comp;
	public Bookticket(Object train,Object comp) {
		this.train=train;
		this.comp=comp;
	}
	public void run() {
		synchronized(train) {
			System.out.println("Book ticket locked on train");
			try {
				Thread.sleep(150);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("Book ticket wainting for lock on compartment");
			synchronized(comp) {
				System.out.println("Book ticket locked on compartment");
			}
		}
	}
}
class Cancelticket extends Thread{
	Object train,comp;
	public Cancelticket(Object train,Object comp) {
		this.train=train;
		this.comp=comp;
	}
	public void run() {
		//synchronized(train)
		synchronized(comp) {
			//System.out.println("cancel ticket locked on train");
			System.out.println("cancel ticket locked on comp");
			try {
				Thread.sleep(150);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			//System.out.println("Cancel ticket wainting for lock on comp");
			System.out.println("Cancel ticket wainting for lock on train");
			//synchronized(comp);
			synchronized(train) {
				//System.out.println("Book ticket locked on comp");
				System.out.println("Book ticket locked on train");
			}
		}
	}
}
public class Deadlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object train=new Object();
		Object comp=new Object();
		
		Bookticket bt=new Bookticket(train,comp);
		Cancelticket ct=new Cancelticket(train,comp);
		
		bt.start();
		ct.start();

	}

}
