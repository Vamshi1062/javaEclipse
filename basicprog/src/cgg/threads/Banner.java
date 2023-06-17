package cgg.threads;
import java.awt.*;
import java.awt.event.*;
public class Banner extends Frame implements Runnable {
String str="Center for good governance";
	 public Banner() {
		 setLayout(null);
		 setBackground(Color.cyan);
		 setForeground(Color.red);
	 }
		public void paint(Graphics g) {
			Font font=new Font("Courier",Font.BOLD,40);
		g.setFont(font);
		g.drawString(str,100,100);
	}
	@Override
	public void run() {
		for(;;) {
			repaint();
			try {
				Thread.sleep(400);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			char ch=str.charAt(0);
			str=str.substring(1,str.length());
			str=str+ch;
			
		}
	}
	public static void main(String[] args) {
		Banner b=new Banner();
		b.setSize(700,700);
		b.setTitle("MyBanner");
		b.setVisible(true);
		b.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		Thread t=new Thread(b);
		t.start();
	}

}
