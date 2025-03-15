package a;

import java.util.*;
public class day35scanner {
	
	Scanner sc =new Scanner(System.in);
	
	void meth1() {
		
		System.out.println("please enter the first number");
		int a = sc.nextInt();
		System.out.println("a value is "+a);
		
		System.out.println("please enter the second number");
		int b = sc.nextInt();
		System.out.println("a value is "+b);
		
		int c = a+b;
		System.out.println("a value is "+c);

	}
	
	void meth2() {
		
		System.out.println(" please enter you age");
		
		int age = sc.nextInt();
		
		if(age>=18) {
			
			System.out.println("your are eligible for vote");
			
		}else {
			System.out.println("your are not  eligible for vote");

		}
	}
	
	int meth3(int a) {
		
		System.out.println("a value is "+a);
		System.out.println("please enter a number to return");
		return sc.nextInt();
		
	}
	
	void meth4() {
		System.out.println("what is your name");
		String name =sc.nextLine();
//		String name =sc.next();//accepts only one word
		System.out.println("user enter name "+name);
	}
	
	
	void meth5() {
		System.out.println("enter your empName");
		String empName =sc.nextLine();
//		
		System.out.println("enter your empid");
		String empid =sc.nextLine();
		
		System.out.println("enter your empdept");
		String  empdept =sc.nextLine();
		
		
		System.out.println("enter your empAddress");
		String  empAddress =sc.nextLine();
		
		
		System.out.println("empName  is  :" +empName);
		System.out.println("empid is  :" +empid);
		System.out.println("empdept is  :" +empdept);
		System.out.println("empAddress is  :" +empAddress);

	}
	
	public static void main(String[] args) {
		
		day35scanner obj =new day35scanner();
//		obj.meth1();
//		obj.meth2();
//		System.out.println("------------");
		
//		System.out.println("please enter 1 int parameter for meth3()");
//	obj.meth3(obj.sc.nextInt()+obj.sc.nextInt());
//		System.out.println(obj.meth3(obj.sc.nextInt())+obj.sc.nextInt());
//		System.out.println("------------");

//		obj.meth4();
		obj.meth5();

	}
}
