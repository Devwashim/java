package a;

public  abstract class day51abstraction {
	
	abstract void meth1();
	
	
	
	void meth2() {
		
		System.out.println("classA meth2() called");
		this.display();
	}
	
	static void meth3() {
		System.out.println("meth3 called");
		
	}
	
	void display() {
			System.out.println("hello");

	 }
	 
	 day51abstraction(){
		 System.out.println("classA constructor");
	 }

	 
	 public static void main(String[] args) {
		
		 System.out.println("java is awesome");
		 day51abstraction.meth3();
	}
}
