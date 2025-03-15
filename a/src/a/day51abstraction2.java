package a;

public class day51abstraction2 extends day51abstraction{

	
	void meth1() {
		System.out.println("abstract method");
	}
	
	
	public static void main(String[] args) {
		day51abstraction obj = new day51abstraction2();
		obj.meth1();
		obj.meth2();
	}
	
}
