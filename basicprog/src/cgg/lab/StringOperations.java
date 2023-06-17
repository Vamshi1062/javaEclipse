package cgg.lab;
import java.util.*;

public class StringOperations {

	public static void main(String[] args) {
		Scanner str=new Scanner(System.in);
		System.out.println("Enter string");
		String str1=str.nextLine();
		System.out.println("Press 1 to add String to itself");
		System.out.println("Press 2 to replace odd positions with #");
		System.out.println("Press 3 to remove duplicate characters in the string");
		System.out.println("Press 4 to change odd characters to uppercase");
		Scanner no=new Scanner(System.in);
		System.out.println("Enter no");
		int num=no.nextInt();
		switch (num) {
		case 1:
			String str2;
			str2=str1.concat(str1);
			System.out.println("After concatinating :"+str2);
			break;
		case 2:
			String str3 = "";
			for(int i=0;i<str1.length();i++) {
				if(i%2==0) {
					str3+='#';
				}
				else {
					str3+=str1.charAt(i);
				}
			}
			System.out.println(str3);
			break;
		case 3:
			String str4="";
			for (int i=0;i<str1.length();i++) {
				for(int j=i+1;j<str1.length();j++) {
					if(str1.charAt(i)==str1.charAt(j)){}
					else {
						str4+=str1.charAt(i);
					}
					}
				}
			System.out.println(str4);
			break;
		case 4:
			String str5="";
			for(int i=0;i<str1.length();i++) {
				char ch1=str1.charAt(i);
				
				if(i%2==0) {
					str5+=Character.toUpperCase(ch1);
				}
				else {
					str5+=ch1;
				}
			}
			System.out.println(str5);
			}
		}

	}


