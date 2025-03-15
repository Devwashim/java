package b;

public class hday15 {

	void meth2()
	{
		
		System.out.println("start");
		System.out.println("--------------");
		
	}
	
	
//	static int sum(int a, int b) {
//		return a+b;
//	}
//	static int sum(int a, int b ,int c) {
//		return a+b+c;
//	}
	
	static int sum(int x, int...arr) {
		int value =x;
	
		
		for (int a:arr) {
			value +=a;
			
		}
		return value;
	}
	
	 public static void main(String[] args) {
	
		 new hday15().meth2();
		 
		 System.out.println("the sum of 4 and 5 is: "+ sum(4,5));
		 System.out.println("the sum of 4 and 5 is: "+ sum(45,65));
		 System.out.println("the sum of 4 and 5 is: "+ sum(4,5,6));
		 
		 
	}
}
