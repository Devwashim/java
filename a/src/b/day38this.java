package b;

public class day38this {

	
	int a=10;
	static int b =20;
	
	
	void meth1() {
		
		int a = 30;
		System.out.println("instances variable:"+ this.a);
		System.out.println("static variable:"+ day38this.b);
		System.out.println("local  variable:"+ a);

	}
	
	public static void main(String[] args) {
		
		new day38this().meth1();
	}
	
	
}
