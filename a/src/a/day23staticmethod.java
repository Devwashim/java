package a;

public class day23staticmethod {

	
	int x =10;
	static int y=20;
	
	void meth() {
		System.out.println("instance "+x); 
		System.out.println("static "+y); 
	}
	static void meth1() {
		System.out.println("instance "+new day23staticmethod().x); 
		System.out.println("static "+y); 
		
		
	}
	public static void main(String[] args) {
		
		
		day23staticmethod obj =	new day23staticmethod();
		obj.meth();
		System.out.println("============"); //by using classObject
//		meth1();//by using identierName
		day23staticmethod.meth1();//by using clasName
		
		
		
		
	}
	
}
