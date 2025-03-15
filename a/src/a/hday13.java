package a;

public class hday13 {

	
//	void meth1() {
//		
//		//video 26
//		
//		
//	System.out.println("start  Array");
//	System.out.println("-----------");
//	System.out.println("three way to using array");
//	//first way
//	int[] mark;
//	mark=new int [5];
//	//first way  declaration//
//
//	
//	int [] marks=new int[5];
//	marks[0]=200;
//	marks[1]=100;
//	marks[2]=400;
//	marks[3]=500;
//	marks[4]=600;
//	System.out.println(marks[1]);
//	System.out.println(marks.length);
//	
//	//third way declaration and the memory allocation initialization
//int[]mark1 = {100,200,300,400,500};
//
//System.out.println(mark1[0]);
//	}
	
	void meth2() {
		
		
		int []mark3 = {25,26,28,24,26};		
//		float []mark3 = {25.4f,26.5f,28.7f,24.6f,26.6f};	
//		String [] mark3 = {"ankt","aman","kapil","arun","prince"};
		
		System.out.println(mark3.length);
		
//		display the array navive way 
		
//		
//		System.out.println(mark3[1]);
//		System.out.println(mark3[2]);
//		System.out.println(mark3[3]);
//		System.out.println(mark3[4]);
//		System.out.println(mark3[5]); C E
		
		//good way printing array in for loop
		//this method array travarsal
		
		//reverse order
//		for(int i=mark3.length-1; i>=0; i--) {
//			System.out.println(mark3[i]);
//			
//			
//		}
//		for(int i=0; i<mark3.length; i++) {
//			System.out.println(mark3[i]);	
//		}
		//good way printing array in for  each loop

		for(int element:mark3) {
			System.out.println(element);
		}
	}
	
	public static void main(String[] args) {
		
		
//		new hday13().meth1();
		new hday13().meth2();
	}
}
