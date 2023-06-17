package cgg.lab;

public class PositiveString {

	public static void main(String[] args) {
		 String str="aba";
		 System.out.println(Positive(str));

}

	private static boolean Positive(String str) {
		for(int i=0;i<str.length()-1;i++) {
			int j=str.charAt(i);
			int k=str.charAt(i+1);
			if(j>k) {
				return false;
			}
		}
		return true;
	}
}
