package a;

public interface day52interface1 {

	
	
	void meth1();
	
	default void meth2() 
	{
		System.out.println("deafault method of intrtface A");
		this.meth4();
		
	}
	
	static void meth3() {
		
		System.out.println("static method of inerface A");
	}
	
	 default void meth4() {
		System.out.println("private method of interface A");
	}
	
	default void msg() 
	{
		
		System.out.println("i am from interface A");
		
	}
	
	public static void main(String[] args) {
		
		
		day52interface1.meth3();
	}
	
}
