package a;

import java.util.Scanner;

public class daya5 {
	
	public String helloname(String name) {
		
//		return   "hello "  .concat(name).concat("!");
//		return "hello" +name+"!";
		return "hello" .concat(name)+"!";
		
	}
	
//	void meth1() {
//		
//		String name =" bob";
//		
//		System.out.println("start");
//		System.out.println("-------------------");
//		
//		
//		Scanner sc = new Scanner(System.in);
//		
//		String  str =new String(sc.nextLine());
//		
//		System.out.println(str+name);
//		
//	}
	
public static void main(String[] args) {
//	new  daya5().meth1();
	
	daya5 obj = new daya5();
	String re=obj.helloname("ramesh");
System.out.println(re);
//	obj.meth1();
		
		
		

}
	
	
	
}
