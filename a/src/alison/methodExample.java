package alison;

public class methodExample{
	
	public static void counter() {
		for(int x=1; x<5; x++) {
			System.out.print(" "+x);
		}
	}
	
	
	
	public static void main(String[]args) {
		
		for(int i=0; i<5; i++) {
			counter();
//			System.out.println(i);
		}
	}
	
}
