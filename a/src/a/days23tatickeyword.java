package a;

public class days23tatickeyword {
	int a; //instance 
	static int b; //static 2
	
	days23tatickeyword(){
		
	a++;
	b++;
		System.out.println("instance varible:" +a);
		System.out.println("static  varible:" +b);// by using identifier name
//		System.out.println("static  varible object:" +new days23tatickeyword().b);// by using object name
		System.out.println("static  varible className:  "+days23tatickeyword.b);// by using className
	}
	public static void main(String[] args) {
		
		new days23tatickeyword();
		System.out.println("--------");
		new days23tatickeyword();
		System.out.println("--------");
//
//		new days23tatickeyword();
//		System.out.println("--------");

	}
	
	/*
	 * for instance variable for every instance/object a separate copy will be created
	 * for  static variable there will be one copy available through out the parents  
	 * a static variable can never be a local variable 
	 * 
	 * */
	
}
