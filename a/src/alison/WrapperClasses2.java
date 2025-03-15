package alison;

public class WrapperClasses2 {

	
	public static void main(String[] args) {
		
		
		//converting Integer to int 
		
		Integer a =new Integer(3);
		int i = a.intValue(); //converting Integer to int
		
		int j =a;//unboxing now compiler will essentially write a.intvalue() internally
		
		System.out.println(a +" "+i+" "+j);
		}
}
