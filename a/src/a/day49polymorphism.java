package a;

public class day49polymorphism {
	
	static final private void meth1() {
		
		
		System.out.println("10");
	}
	
	int meth1(int a) {
		System.out.println(20);
		return a;
		
	}
	
	static final void meth1(int a , String s) {
		System.out.println(30);
		
	}
	
	public String meth1(String s, int a) {
		System.out.println(40);
		return s;
		
	}
	
	static protected void meth1(byte b) {
		System.out.println(50);
		
	}
	
	public static void main(String s) {
		
		System.out.println(" 1 main");
		
	}
	public static void main(int a) {
		
		System.out.println(" 2 main");
		
	}
	
	public static void main(String[] args) {
		
		day49polymorphism obj = new day49polymorphism();
		obj.meth1();
		obj.meth1(100);
		obj.meth1("java", 100);
		obj.meth1(100, "java");
		obj.meth1((byte)100);
		
		System.out.println("--------------");
		obj.main("java is awesome");
		obj.main(100);
	}

}
