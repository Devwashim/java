package a;

public class day24static {

	
	
	static int x = meth1();
	
	static {
		System.out.println("1st static block executed : "+x);
	}
	
	static int meth1() {
		System.out.println("meth1()called");
		return 100;
		
	}
	static int y=meth2();
	
	static int meth2() {
		
		
		System.out.println("meth2() called :");
		return 200;
	}
	
	public static void main(String[] args) {
		System.out.println("main() called");
		
	}
	static {
		
		System.out.println("2nd static block "+y);
	}
}


/*
 * for 
 * 
 * 
 */
