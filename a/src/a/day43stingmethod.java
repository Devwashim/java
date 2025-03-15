package a;

public class day43stingmethod {

	
	void meth1() {
		
		String s1="java";
		String s2 = new String("java");
		String s3 ="java";
		String s4 = new String("java");
		
		/*
		 * equals ();
		 * 
		 * it is going to check the contents present inside the string 
		 * 
		 * --------
		 * it is going to check the address locations of the string 
		 */
		
		System.out.println("=========equal=====");
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals("JAVA"));
		System.out.println(s1.equals("java"));
		System.out.println("java".equalsIgnoreCase("JAVA"));
		System.out.println(" -------  ==   -----------");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s4);
		System.out.println(s1=="java");
		System.out.println(s1==new String("java"));
		
		
		System.out.println("===================");
		
		System.out.println("length() : "+s1.length());
		System.out.println("length() : "+s1.concat("is awesome ").length());
		System.out.println("length() : "+"java is awesome".length());
		
		System.out.println("s1 :"+s1);
		System.out.println("---------------");
		
		
//		System.out.println("charAt() :" +s1.charAt(4)); SIOB
		System.out.println("charAt() :" +s1.charAt(new day43stingmethod().meth2()));
		
		
		System.out.println("-----startwith--------");
		System.out.println("startwith() : "+s1.startsWith(s2));
		System.out.println("startwith() : "+s1.startsWith("".concat(s2)));
		
		
		System.out.println("toLowerCase() :"+s1.toLowerCase());
		System.out.println("toLowerCase() :"+s1.toLowerCase().equalsIgnoreCase(s4));
		
		System.out.println("toLowerCase() :"+s1.toUpperCase());
		
		System.out.println("---substing----------");
		String s5="i love india";
		System.out.println("substring() :"+s5.substring(7) );
		char arr[] = {'j','a','v','a'};
		System.out.println("substring() :"+s5.substring(arr.length-2,6));
		System.out.println("substring() :"+s5.substring(4,9));
		
		System.out.println("replace() : "+s1.replace('a','A'));
		
		String s6= " hello world ";
		System.out.println(s6.length());
		System.out.println(s6.trim());
		
		
		System.out.println("-------index of ------");
		System.out.println("indexof() :"+s6.indexOf('o'));
		System.out.println("indexof() :"+s6.indexOf('z'));
		
		
		String s7 = "java is awesome";
		System.out.println("-------------");
		byte arr2[]= s7.getBytes();
		for(byte x : arr2) {
			
			System.out.println((char)x);
		}
		
		
		
		

	}
	
	int meth2() {
		
		System.out.println("meth2() called");
		return 0;
	}
	
	public static void main(String[] args) {

		
		day43stingmethod obj = new  day43stingmethod();
		obj.meth1();
		obj.meth2();
		
	}
}
