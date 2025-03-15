package a;

public class day17datatype {

	
	int i;
	byte b;
	short s;
	long l;
	
	float f;
	double d;
	
	char c;
	boolean flag;
	
	
	void meth1() {
		
		System.out.println("printing the default values of the PDt");
		System.out.println("int value is :"+i);
		System.out.println("byte value is :"+b);
		System.out.println("short value is :"+s);
		System.out.println("long value is :"+l);
		
		
		System.out.println("float value is :"+f);
		System.out.println("double value is :"+d);
		
		
		System.out.println("char value is :"+c);
		System.out.println("boolean value is :"+flag);
		
		
	}
	
	void meth2() {
		int i1=45;
		int i2=60;
		int i3=i1+i2;
		System.out.println("i3 :"+ i3);
		
		
		byte b1=10;   //byte ===> -128 to 127
		byte b2=20;
		byte b3 =(byte)(b1+b2);
		System.out.println("b3: "+ b3);
		
		float f = 85.96f;
		System.out.println("f :"+f);
		
		long x =2147483648L;
		System.out.println( "x :"+ x);
		
	}
	
	public static void main(String[] args) {
		
		day17datatype obj = new day17datatype();
		
		obj.meth1();
		System.out.println("===============================");
		obj.meth2();
		
	}
}
