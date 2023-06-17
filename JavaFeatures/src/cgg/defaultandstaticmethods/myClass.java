package cgg.defaultandstaticmethods;

import java.util.Collections;
import java.util.List;

public class myClass implements MyInterface {
	@Override
	public int getMaxNum(List<Integer> intlist) {
		Integer max = Collections.max(intlist);
		return max;
	}
	
	//default methods can be over ride but static methods cannot be over ride
//	@Override
//	 public List<Student> sortStudents(List<Student> stuList){
//		Collections.sort(stuList);
//		return stuList;
//}
}
