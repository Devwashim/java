package a;

public class day20constructor {
	
	public void meth1() {
		
		System.out.println("mrthod1() called ");
	}
	
	private day20constructor(){
		
		System.out.println("default constructor");
	}
	
	day20constructor(String s){
		
		System.out.println("parameter constructor" +s);
		
	}
	
	public static void main(String[] args) {
		
		day20constructor obj =new day20constructor();
		obj.meth1();
	}

}
