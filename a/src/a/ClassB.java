package a;

public class ClassB {
	
	void method() {
		int a = 10;
		int b = 20;//
//		int c = a+b;
		System.out.println(20);
		ClassB aobj=new ClassB();
		aobj.meth1();
		System.out.println(a+20);
		
	}
	
	void meth1() {
		
		System.out.println(45);
		System.out.println(55);
		System.out.println(65);
		
	}
	void meth2() {
		System.out.println("");
	}
	public static void main(String[] args) {
	System.out.println("start");// create in object
	 ClassB abj=new ClassB(); //calling  a method
	 abj.method();
	 System.out.println("end"); //wait a  
	}

}
