package a;

public class day48inheritancep1 {

	
	void meth1() {
		System.out.println("meth1() called from class A");
	}
	
	day48inheritancep1(){
		System.out.println("default constrator class a");
	}
	
	day48inheritancep1(String s){
		
		this();
		this.meth1();
		System.out.println("java "+s);
		
		
	}
}
