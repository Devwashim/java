package a;

public class day25typecasting {

	
	void Implicit() {
		byte b = 10;
		System.out.println("byte value is "+b);
		
		short s=b;
		System.out.println("short value is "+s);
		s++;
		int i = s++;
		System.out.println("int  value is "+i);
		System.out.println("short value is "+s);
		long L=i;
		System.out.println("long value is "+(--L));
		float f=L;
		System.out.println("float value is "+(f+b));
		double d = (--f);
		System.out.println("double value is "+d);
	
	show();
	if (!(d==f)) {
		System.out.println("equal");
	}
	else {
		System.out.println("not equal");
	}
	
	
	}
	
	public static void main(String[] args) {
		
		day25typecasting a= new day25typecasting();
		a.Implicit();
		
	}
	static void show() {
		char c ='A';
		int a=++c;
		System.out.println(a);
		day25typecasting obj =new day25typecasting();
		String s =obj.meth();
		System.out.println(s);
	
		}
	String meth() {
		String S="impicit casting is done by the compiler automatically";
				return S;
		
	}
}
