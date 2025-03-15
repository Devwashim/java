package b;

public class day49 {
	
	
	static final private void meth1()
	{
		System.out.println(10);
	}
	
	

	int meth1(int a) {
		System.out.println(20);
		return a;
	}

	static final void meth1(int a, String s) {
		System.out.println(30);
	}

	
	static String meth1(String s,int a ) {
		
		System.out.println(40);
		return s;
	}
	static protected void meth1(byte b) {

		System.out.println(50);
	}
	

	public static void main(String[] args) {
		
		
		day49 obj=new day49();
		obj.meth1();
		obj.meth1(100);
		obj.meth1(100, "java");
		obj.meth1("java",500);
		obj.meth1((byte)200);
			
		
		
	}
}
