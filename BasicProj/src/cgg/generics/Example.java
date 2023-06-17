package cgg.generics;

public class Example {

	public static void main(String[] args) {

//	Box box=new Box("water");
//	box.Container=123;
//	box.Container="string";
//	System.out.println(box.getValue());
//  This is not TypeSafe
		
		Box<String> box=new Box<>("String");
		System.out.println(box.getValue());
		System.out.println(box.Container.getClass().getName());
		
		Box<Integer> box1=new Box<>(123);
		System.out.println(box1.getValue());
		System.out.println(box1.Container.getClass().getName());
		
		Box<Boolean> box2=new Box<>(true);
		System.out.println(box2.getValue());
		System.out.println(box2.Container.getClass().getName());
		box.perform();
		box1.perform();
		
	}
	

}
