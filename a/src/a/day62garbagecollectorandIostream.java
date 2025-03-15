package a;

public class day62garbagecollectorandIostream {

	
	void meth1() {
		
		System.out.println("method called");
		new day62garbagecollectorandIostream();//all the objects present in method
	}
	
	@Override
	protected void finalize() {
		System.out.println("garbage has been collected");
	}
	public static void main(String[] args) {
		
		day62garbagecollectorandIostream obj=new day62garbagecollectorandIostream();
		day62garbagecollectorandIostream obj2=new day62garbagecollectorandIostream();
		obj.meth1();
//		obj2=obj; // by re-assigning the reference variable
//		obj= null; by nullifying the reference variable
		
//		obj.meth1();//it generates an nullpointer exception
System.err.println(obj);
		
		Runtime r = Runtime.getRuntime();
		System.gc();
	}
}
