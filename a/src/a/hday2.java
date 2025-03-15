package a;

import java.util.Scanner;

public class hday2 {

//	void meth1() {
////		by using is scanner class 
//	System.out.println("taking input from the user ");
//	
//	Scanner sc = new Scanner(System.in);
//	
//	System.out.println( "enter number 1");
//	int a = sc.nextInt();
//
//	System.out.println( "enter number 2");
//	int b = sc.nextInt();
//	
//	int sum = a+b;
//	System.out.println("sum of this number is :"+sum);
//	
//	
//	}
	
	
//	void meth2() {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println( "enter number 1");
//		float a = sc.nextFloat();
//
//		System.out.println( "enter number 2");
//		float b = sc.nextFloat();
//		
//		float sum = a+b;
//		System.out.println("sum of this number is :"+sum);
//
//	}
	
	void meth3() {
		
//		System.out.println("enter your number");
//		
//		Scanner sc = new Scanner(System.in);
//			boolean b1 = sc.hasNextInt();
//			System.out.println(b1);
		
//		System.out.println("enter your number");
//		Scanner sc = new Scanner(System.in);
//
//		String str = sc.nextLine();
//		
//		System.out.println(str);
		
		
		System.out.println("taking input from the user ");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println( "your  marks  is");
		int sub1  = sc.nextInt();
		System.out.println("hindi :" +sub1); 
	
		int sub2  = sc.nextInt();
		System.out.println("english :" +sub2); 
		
		int sub3  = sc.nextInt();
		System.out.println("math :" +sub3); 
		
		int sub4  = sc.nextInt();
		System.out.println("sst :" +sub4);
		
		int sub5  = sc.nextInt();
		System.out.println("hindi :" +sub5); 
		
		int sum =sub1+sub2+sub3+sub4+sub5;
		System.out.println("total :"+sum); 
		
	System.out.println("percent" +sum*100/500);

		
		
		
		
		
	
			
		
		
		
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
//		new hday2().meth1();
//		new hday2().meth2();
		new hday2().meth3();
		
	
		
	}
}
