package a;

import java.util. Scanner;
public class hday11 {

	
	//loop control statement
	//vide021
	
	void meth1() {
		System.out.println("start");
		System.out.println("--------------");
		
//		int i =1;
//		while(i<=3) {
//			System.out.println(i);
//			  i++;
//			
//			
//		}
		
//		int b =10;
//		do {
//			
//			System.out.println(b);
//			b++;
//		}while(b<5);
//		
//		int b1 =1;
//		do {
//			
//			System.out.println(b1);
//			b1++;
//		}while(b1<=53);
//		
//		System.out.println("end ");
		
		
//		for(int i=1; i<=10; i++ ) {
//		System.out.println(i);
		
		
		
		
//		Scanner sc=new Scanner(System.in);

		
//		int n =sc.nextInt();
		
		//only for event number 
		
//		for(int i=0; i<n; i++ ) {
//		System.out.println(2*i+2);
//		//odd number
		
		
//		for(int i=0; i<n; i++ ) {
//			System.out.println(2*i+2);
		
		
////		
//			for(int i=5; i!=0; i-- ) {
//				System.out.println(i);
//				  int n1=10;
//				for(int i=n1; i!=0; i-- ) {
//					System.out.println(i);
					
		///break statement break the loop
		
//		for(int i=0; i<5; i++ ) {
//			System.out.println(i);
//
//			System.out.println("java is grate");
//			if(i==3) {
//				
//				System.out.println("end java loop");
//				break;
//			}
//			
//		}
		
		
//		int i=0;
//		 do{
//			System.out.println(i);
//			if(i==2) {
//				System.out.println("ending loop");
//				break;	
//			}
//			
//			i++;
//		}
//		 while(i<5);
		 
//		int i=0;
//		while(i<5) {
//			System.out.println(i);
//			if(i==2) {
//				System.out.println("ending loop");
//				break;	
//			}
//			
//			i++;
//		}
	}
	
	void meth2() {
		
		for(int i=0; i<5; i++ ) {

			if(i==2) {
				
				System.out.println("end java loop");
				continue;
			}
			
			System.out.println(i);

			System.out.println("java is grate");
			
		}
	
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		hday11 obj = new hday11();
		obj.meth1();
		obj.meth2();
		
	}
}
