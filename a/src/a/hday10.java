package a;

import java.util.Scanner;

public class hday10 {

	public static void main(String[] args) {
		
		
		hday10 obj =new hday10();
//		obj.meth1();
//		obj.meth2();
		obj.meth3();
		
		
	}
	
	
	void meth3() {
		
//		
//		System.out.println("start");
//		System.out.println("--------------");
//		Scanner sc=new Scanner(System.in);
//System.out.println("enter yor income");		
//float tax =0;
//		float income  =sc.nextFloat();
//		
//		if(income<2.5) {
//			
//			tax= tax=0;
//
//		}
//		else if(income>2.5f && tax<5f) {
//			tax =tax +0.05f *(income-2.5f);
//		
//		}
//		else if(income>5f && income <10.0f){
//				tax = tax +0.05f *(5.0f-2.5f);
//				tax = tax +0.02f *(income-2.5f);
//			
//		
//	}else if(income>10.0f) {
//		tax = tax + 0.05f *(5.0f - 2.5f);
//		tax = tax + 0.02f *(10.0f - 5f);
//		tax = tax + 0.03f *(income - 10.0f);
//	}
//		
//		System.out.println("paded "+tax);
		
		Scanner sc=new Scanner(System.in);
		String website = sc.next();
		
		if(website.endsWith(".org")) {	
			System.out.println("this is oganizattinal website  ");		
		}
		
	else if(website.endsWith(".com")) {	
			System.out.println("this is comercial  website  ");		
		}
		
	else if(website.endsWith(".in")) {	
		System.out.println("this is indian  website  ");		
	}
		
		
	
	}
	
//	void meth2() {
//		
//		byte  m1, m2, m3;
//		
//		System.out.println("start");
//
//		
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("enter your mark physics");
//		
//		m1=sc.nextByte();
//
//		System.out.println("enter your mark maths");
//		m2=sc.nextByte();
//
//		System.out.println("enter your mark sst");
//		
//		m3=sc.nextByte();
//		
//		float avg =(m1+m2+m3)/3.0f;
//		
//		System.out.println("overall percentage is "+avg);
//		
//		if (avg>40 && m1>=33 && m2>=33 && m3>=33) {
//			
//			System.out.println("congratulation ,you have been promoted");
//
//		}
//		
//		else {
//			
//			System.out.println("sorry ,you have not be promoted \t please try agent");
//
//		}
//		
//	}
	
//	void meth1() {
//		
//		 q1
//		System.out.println("start");
//		System.out.println("---------------");
//		
//		
//		int a = 11;
//		if(a=11) {
//			
//			System.out.println("i am ");
//		}else 
//			
//			System.out.println("i am not");
//		}
//		q2
		
		
//	}
		
	}

