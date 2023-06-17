package cgg.defaultandstaticmethods;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		MyInterface m = new myClass();
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("xyz", 20));
		list.add(new Student("abc", 30));
		list.add(new Student("pqr", 10));
		list.add(new Student("lmn", 5));

		List<Student> students = m.sortStudents(list);
		for (Student student : students) {
			System.out.println(student.getName() + "\t" + student.getAge());
		}
		System.out.println("----------------------------");
		MyInterface.greet("CGG");
		
		ArrayList<Integer>  intlist = new ArrayList<Integer>();
		intlist.add(1000);
		intlist.add(50);
		intlist.add( 9000);
		intlist.add( 90);
		
		
		System.out.println("---------------------------");
		int maxnum=m.getMaxNum(intlist);
		System.out.println("Max Num : "+ maxnum);
	}

}
