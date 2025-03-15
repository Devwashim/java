package alison;

public class castinginjava {

	
//	Casting a variable 
//	casting Numerical value
	
	
	
//	two type of type casting impicit-(widening) or Explicitly(Narrowing)
	
//	impicit-(widening)
	
//	byte -> short -> int -> long -> float-> double 
	
	
	
//	Explicitly(Narrowing)
	
//	double -> float -> long -> int -> short-> byte
	
	
	public static void main(String[] args) {
		
		int  i =100;
		long  l=i; //no explicit type casting required
		float f=1;//no explicit type casting required
		
		System.out.println( "int value "+i);
		System.out.println( "Long  value "+l);
		System.out.println( "Float value "+f);
	}
	
}
