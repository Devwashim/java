package a;

public class day38thisconstrator {

	
	
	day38thisconstrator(){
		this(500);
		this.meth1();
		System.out.println("default constrator");
//		System.out.println();
	}
	
	 day38thisconstrator(int a) {
		 this("java is awesome");
		System.out.println("parameterzied constructor "+ a);
	}
	 
	 day38thisconstrator(String s)
	 {
		System.out.println(s); 
	 }
	void meth1() {
		System.out.println("meth1()");
	}
	
	public static void main(String[] args) {
		
	new day38thisconstrator();
		
	}
	
}
