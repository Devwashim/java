package a;

public class day45Stringbbufferbuilder {

	void meth1() {
	
	String s1 = new String("java");
	StringBuffer s2 = new StringBuffer("java");
	StringBuilder s3 = new StringBuilder("java");
	
	String st1 = new String("java");
	StringBuffer st2 = new StringBuffer("java");
	StringBuilder st3 = new StringBuilder("java");
	
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	
	
	System.out.println("----------");
	System.out.println(s1.equals(st1));//contents
	System.out.println(s2.equals(st2));//false//address location
	System.out.println(s3.equals(st3));//false//address location
	
	
	//how to check the contents present in stringBuffer & StringBuilder ?
	
	System.out.println("tostring and equal method");
	
	boolean result =s2.toString().equals(st2.toString());
	System.out.println(result);
	
	System.out.println("append concat");
	s1.concat(" is awesome");
	s2.append(" is awesome");
	s3.append(" is awesome");

	
	System.out.println("-------------");
	System.out.println("String "+s1);
	System.out.println("string buffer "+s2);
	System.out.println("string builder "+s3);
	
	

	}
	public static void main(String[] args) {
		new day45Stringbbufferbuilder().meth1();
	}
	
}
