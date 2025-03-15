package b;

public class day38usingthiskeyboard {

	
	
	void  meth1() {
		System.out.println("meth1() called");
//		meth2();
		this.meth2();
	}
	
	void  meth2() {
		System.out.println("meth2() called");
//		meth3();//c e add by default this keyword
		this.meth3();
		}
	void  meth3() {
		System.out.println("meth3() called");
	}
	
	public static void main(String[] args) {
		
		
		new day38usingthiskeyboard().meth1();
//		this.meth1(); //Cannot use this in a static context( c e we can't this keyword inside a static area )
	}
}
