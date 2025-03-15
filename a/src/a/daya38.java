package a;

public class daya38 {
	
	daya38 meth1() {
		
		System.out.println( "meth1() callled");
		return this;
		
	}
	
	daya38 meth2() {
		System.out.println("meth2() callled");
		return this;
	}
	
	int meth3() {
		System.out.println("meth3() callled");
		return 100;
		
	}
	
	
	public static void main(String[] args) {
//		int a=new daya38().meth1()-99;
//		System.out.println(a);
		
		System.out.println(new daya38().meth1().meth2().meth3()-99);
	}

}

