package cgg.threads;
class Daemon extends Thread{
	public void run() {
		System.out.println("Thread name :"+this.getName());
	}
}
public class DaemonThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Daemon daemon=new Daemon();
		daemon.setDaemon(true);
		
		System.out.println(daemon.isDaemon());
		
		daemon.start();

	}

}
