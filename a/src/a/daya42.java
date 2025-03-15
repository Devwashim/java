package a;

public class daya42 {

	void meth1() {
		
		String s1="java";
		String s2=new String("java");
		
		char arr[]= {'j','a','v','a'};
		String s3=new String(arr);
		String s4=new String(arr,2,2);
		
		
		System.out.println("s1 :"+s1);
		System.out.println("s2 :"+s2);
		System.out.println("s3 :"+s3);
		System.out.println("s4 :"+s4);
	}
	
	
	void meth2() {
		
		String s="java";
		System.out.println("before Concatination : "+s);
		System.out.println("After Concatination :"+ s.concat(" is awesome"));
		System.out.println("s value :"+s);//java
	}
	public static void main(String[] args) {
		
		daya42 obj=new daya42();
		obj.meth1();
		System.out.println("----------------");
		obj.meth2();
	}
}
