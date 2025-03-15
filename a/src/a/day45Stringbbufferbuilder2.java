package a;

public class day45Stringbbufferbuilder2 {

	void meth1() {
		
		StringBuffer sb = new StringBuffer();
		System.out.println("<--------capcity---------->");
		System.out.println("capicity : "+ sb.capacity());
		
		sb.append("abcfyrifjkfjdlks");
		System.out.println(sb+"<===>"+sb.capacity());
		
		System.out.println("<--------append---------->");

		sb.append("q");
		
		System.out.println(sb+"<===>"+sb.capacity());
		System.out.println(sb+"<===>"+sb.length());
		
		System.out.println("charAt :"+sb.charAt(4));
		System.out.println("string Buffer :"+sb);
		
		System.out.println("reverse():"+sb.reverse());
		System.out.println("string Buffer :"+sb);

		System.out.println("subString():"+sb.substring(0,3));
		System.out.println("string Buffer :"+sb);
		
		sb.setCharAt(0, (char)65);
		
		System.out.println("setCharAt():"+sb);
		sb.delete(0, 5);
		System.out.println(" string buffer delete :"+sb);

	}
	
	public static void main(String[] args) {
		
		new day45Stringbbufferbuilder2().meth1();
	}
	
	
}
