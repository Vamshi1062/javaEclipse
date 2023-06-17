package cgg.exception;

public class MyResourceCloseable implements AutoCloseable{
    public void doSomething() {
   	 System.out.println("I am Autoclosable resource");
    }
    @Override
    public void close() throws Exception{
   	 System.out.println("Resource closed");
    }
	public static void main(String[] args) {
		try(MyResourceCloseable mr=new MyResourceCloseable()){
			mr.doSomething();
			throw new Exception("My closeable resource exception");
		}
catch(Exception e) {
	System.out.println(e);
}
	}

}
