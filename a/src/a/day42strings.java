package a;

public class day42strings {
	
	
	
	void meth() {
		
		
		String s1="java";
		String s2 = new String();
//		String s3 = new String("java");
		char arr[] = {'j','a','v','a'};
		String s4=new String(arr);
		String s5 = new String(arr,2,2);
		
		System.out.println("s1 :"+s1);
		System.out.println("s2 :"+s2);
		System.out.println("s4 :"+s4);
		System.out.println("s5 :"+s5);
		
		
	}
	
	void meth2() {
		
		String s = "java";
		System.out.println("before concatination s "+s);
		System.out.println("after concatination s "+s.concat(" is awesome"));
		System.out.println("s value : "+s);
		
//		String which are created by using String class are immutable
		
	}
	public static void main(String[] args) {
		
		day42strings  obj  =new  day42strings();
		obj.meth();
		System.out.println("=================");
		obj.meth2();
		
	}
	
}

