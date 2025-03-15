package a;

public interface interfaceA {

	
	void meth1();
	
	default void meth2() {
		System.out.println("default method of interface A");
		this.meth4();
	}
	
	static void meth3() {
		System.out.println("static meth of interface A");
	}
	
	private void meth4() {
		System.out.println("private method of interfaceA");
	}
	
	default void msg() {
		System.out.println("i am interface A");
	}
	
	
	public static void main(String[] args) {
		interfaceA.meth3();
	}
}
