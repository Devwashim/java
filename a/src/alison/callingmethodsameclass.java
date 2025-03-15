package alison;

public class callingmethodsameclass {

	
	public static void main(String[]args) {
		
		
		
		printOne();
		printTwo();
//		printOne();
		
	
	}
	
	public static void printOne() {
		
		System.out.println("hello world");
	}
	
	
	public static void printTwo() {

		printOne();
		printOne();

	}
}
