package b;


class S{
 public int a ;
	public int ankit() {
		
		return 4;
	}
	
	public void meth2() {
	System.out.println(" i am methed to class s");
	}	
}

class B extends S{
	public void meth2() {
		System.out.println(" i am methed 2 to class b");
		}
	
	public void meth3() {
		System.out.println(" i am methed 3 to class b");
		
		
	}
	
}

public class hday37 {

	public static void main(String[] args) {
		S obj =new S();
		obj.meth2();
		B obj2= new B();
		obj2.meth2();
		
		
	}
}


