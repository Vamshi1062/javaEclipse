package cgg.generics;

public class Box <T>{
T Container;
public Box(T Container) {
	this.Container=Container;
	
}
public T getValue() {
	return this.Container;
}

public void perform() {
	if(Container instanceof String ) {
		System.out.println("Length of "+Container+" is : "+((String)this.Container).length());
	}
	else if(Container instanceof Integer) {
		System.out.println("This is Integer value : "+Container);
	}
}

}
