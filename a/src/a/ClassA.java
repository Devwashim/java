package a;

public class ClassA {
	
	
	
	void meth1(){
		
		System.out.println("aman");
	}
	
	void medth() {
		 
		int a =10;
		int b = 20;
		int c = a+b;
		System.out.println("addition value: "+c);
	}
	
	public static void main(String[] args) {
		
		System.out.println("start");
		
		new ClassA().meth1();
		//new ClassA().medth();
		
		ClassA obj =new ClassA();
		obj.medth();
		
		
		
		
		
		
	}


}
