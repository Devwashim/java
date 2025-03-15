package a;

public class Day24staticp1 {

	
	static int x = m1();
	
	public static void main(String[] args) {
		
		System.out.println(Day24staticp1.x);
	}
	
	static {
		System.out.println(x);
		Day24staticp1.x=x+20;
		
	}
	static int m1()
	{
		Day24staticp1.x=50;
		return m2();
		
	}
	
	static int m2() {
		System.out.println(Day24staticp1.x);
		return 100;
	}
}
