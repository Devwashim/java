package a;

public class day24statictest {
	
	
	
	
////	test 1st
//	public static void main(String[] args) {
//		
//		
//		int x = 20;
//		System.out.println(x);
//		
//	}
//	static {
//		int x =10;
//		System.out.print(x+" ");
//	}
	
	
//	int x =10;
//	public static void main(String[] args) {
//		int x = 20;
//		System.out.println(x);
//	}
//	
//	static {
//		int x=30;
//		System.out.println(x + "");
//		
//	}
	
//	int x=10;
//	public static void main(String[] args) {
//		System.out.println(new day24statictest().x);
//		System.out.println( day24statictest.x);
//	}
//	static {
//		int x =30;
//		System.out.println(x +"");
//	}
//	
//	
	
	
//	static int x = 10;
//
//	public static void main(String[] args) {
//		
//		day24statictest t1=new day24statictest();
//		day24statictest t2=new day24statictest();
//		t1.x=20;
//		System.out.print(x +" ");
//		System.out.println(t2.x);
//		
//	}
	
	
	
	static int x = 10;
	static int y = 20;
	
	static {
		System.out.println("---test 1 sb1 called --");
		System.out.println("X:"+x);
		System.out.println("y:"+y);
	}
	static void m1() {
		int x=100;
		System.out.println("static method called");
		System.out.println("X:"+x);
		System.out.println("y:"+y);
	}
	
	public static void main(String[] args) {
		m1();
	}
	static {
		System.out.println("---test 2 sb2 called --");
		System.out.println("X:"+x);
		System.out.println("y:"+y);
	}
	
}
