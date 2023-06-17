package cgg.lab;

public class Number {

	public static void main(String[] args) {
		if(Integer.valueOf(args[0])>0) {
			System.out.println(args[0] +" is positive");
		}
		else if(Integer.valueOf(args[0])==0){
			System.out.println(args[0] +" is Neither positive nor negative");
		}
		else {
			System.out.println(args[0] +" is Negative");
		}

	}

}
