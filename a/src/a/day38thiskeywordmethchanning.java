package a;

public class day38thiskeywordmethchanning {

	
	public day38thiskeywordmethchanning meth1() {
		System.out.println("meth1() called");
		
		return this ;
	}
	
	day38thiskeywordmethchanning meth2() {
		System.out.println("meth2() called");
		return this ;
	}
	
	int  meth3() {
		System.out.println("meth3 called ");
		return 100;
	}
	
	public static void main(String[] args) {
		System.out.println(new day38thiskeywordmethchanning().meth1().meth2().meth3()-99);
	}
}

