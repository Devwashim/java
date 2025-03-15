package a;


import java.util.Scanner;
public class hday9 {

	
	void meth1() {
		
//		///conitional if else 
//		System.out.println("Start");
//		System.out.println("-------------");
//		
//		
//		
//		int a= 50;
//		
//		if(a>=18) {
//			
//			System.out.println("yes boy you can drive");
//			
//		}else {
//			
//			System.out.println(" no boy you cannot drive yet ");
//
//		}
		
		
		
//		logical oprater
		
//		boolean a= true;
//		boolean b= false;
//		boolean c= false;
//		
//		 //for And
//		if(a&&b&&c) {
//			System.out.println("Y");
//			
//		}else {
//			
//			System.out.println("N");
//		}
//		
//		//for OR
//		boolean a= true;
//		boolean b= false;
////		boolean c= false;
//		
//		
//		if(a||b) {
//			System.out.println("Y");
//			
//		}else {
//			
//			System.out.println("N");
//		}
		//for OR
//		boolean a= true;
//		boolean b= false;
////		boolean c= false;
//		
//		
//		if(a||b) {
//			System.out.println("Y");
//			
//		}else {
//			
//			System.out.println("N");
//		}
//		
	
		
	}
	
//	void meth2() {
//		
////	elseif
//		
//				
//		int age;
//
//		System.out.println("enter your AGE");
//		Scanner sc= new Scanner(System.in);
//		 age = sc.nextInt();	
//
//		if(age>60) {
//			
//			System.out.println("you are experience ");
//			
//			
//		}
//		else if(age>45){
//			
//			System.out.println("you are sem experiece  ");
//
//		}
//		else if(age>35){
//				
//				System.out.println("you are SEM sem experiece");
//				
//		}
//		else {
//			
//			System.out.println("you are not  experience ");
//
//		}
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//	}
	
	
	void meth3() {
		
		
		int age;
		
		System.out.println("enter your age");
		Scanner sc= new Scanner(System.in);
		 age = sc.nextInt();	
		 
		 switch(age) {
		 
		 case 18:
			 
			 System.out.println("you are going to be came a adult");
		 break;
		 
		 case 24:
			 
 System.out.println("you are going to job");
			 break;
			 
		 case 60:
			 
			 System.out.println("you are going to retried");
			 break;
			 
			 default :
				 System.out.println("enjoy your life");
		 
		 }
		 
		
		
		
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		
		hday9 obj=new hday9();
//		obj.meth1();
//		obj.meth2();
		obj.meth3();
		System.out.println("end");

	}
}
