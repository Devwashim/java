package a;

public class day34loop {

	//table for 2 to 100
	void meth(int a) {
		
		
		for(int i=1;i<=10;i++) {
			
			System.out.println(a+" * "+i+" = "+(a*i));	
		}
		
	}
	
	public static void main(String[] args) {
		
		day34loop obj = new day34loop();
		obj.meth(2);
		
	}
}
