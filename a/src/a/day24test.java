package a;

public class day24test {

	
	static int a= 0;
	int b=0;
	
	day24test(){
		
		a++;
		b++;
		System.out.println("static variable===>"+a);
		System.out.println("instance variable===>"+b);
		System.out.println("========");
	}
	
	void display() {
		
		System.out.println("*******accessing static variable*******");
		System.out.println(day24test.a);
		System.out.println(a);
		System.out.println(new day24test().a);
	}
	public static void main(String[] args) {
		
		new day24test();
		new day24test();
		new day24test();

	System.out.println("$$$$$$$$$$$$$$");
	new day24test().display();
	}
	
	
}
