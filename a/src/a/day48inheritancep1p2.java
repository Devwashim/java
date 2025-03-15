package a;

public class day48inheritancep1p2  extends day48inheritancep1{

	
	void meth2() {
		
		System.out.println("meth2 called from class b" );
		super.meth1();
	}
	
	day48inheritancep1p2(){
		System.out.println("class b deault constructor");
		super.meth1();
	}
	
	day48inheritancep1p2(int a){
		
		super("is awesome");
		//this();//c.e we cant use both super() & this both inside a single constructor
		System.out.println("class b parameterized constructor "+a);
		
	}
	
	public static void main(String[] args) {
		new day48inheritancep1p2(100).meth2();
	}
	
}
