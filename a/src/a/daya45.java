package a;

public class daya45 {
	
//	void meth() {
//		//what is scb
//		//string class object
//		//imp q1 what is different between string class stringbuffer stringbuilder !? 
//		
//		System.out.println("start");
//		System.out.println("---------------");
//		
//		
//		String s=new String("java");//scb
//		StringBuffer buffer=new StringBuffer("java");
//		StringBuilder buffer1=new StringBuilder("java");
//		
//		String s1=new String("java");//scb
//		StringBuffer buffer3=new StringBuffer("java");
//		StringBuilder buffer2=new StringBuilder("java");
//		
//		System.out.println("string class :" +s);
//		System.out.println("string class :" +buffer);
//		System.out.println("string class :" +buffer1);
//	
//		System.out.println(s.equals(s1));
//		System.out.println(buffer.equals(buffer3));
//		System.out.println(buffer1.equals(buffer2));
//		
//		System.out.println("--------------------");		
//		s.concat(" is awesome");
//		buffer.append(" is  awesome");
//		buffer1.append(" is  awesome");
//		
//		
//		
//		System.out.println("String "+s);
//		System.out.println("string buffer"+buffer);
//		System.out.println("string builder"+buffer1);
//		
//		// how to check the present in sringbuffer  & stringbuilder
//		
//		boolean result =buffer.toString().equals(buffer1.toString());
//		System.out.println("resuolt:"+result);
//		}
	
	void meth1() {
		StringBuffer sb =new StringBuffer();//16
		System.out.println(sb.capacity());
		sb.append("xwertyuiopasdfgl");
		System.out.println(sb+ "----"+sb.capacity());
		sb.append("h");
		System.out.println(sb + "----"+sb.capacity());
		System.out.println(sb + "----"+sb.length());
		
		System.out.println("charat()" +sb.charAt(4));
		System.out.println("charat()" +sb.reverse());
		System.out.println("charat()" +sb.substring(0,3));
		sb.setCharAt(0, (char)65);
		System.out.println("setcharat():"+sb);
		System.out.println("charat()" );
		sb.delete(0, 5);
		System.out.println("delete: "+sb);
		
		
		
		
	}
	
	public static void main(String[] args) {
		daya45 obj = new  daya45();
//		obj.meth();
		obj.meth1();
		
	}

}
