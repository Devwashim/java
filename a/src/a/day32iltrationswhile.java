package a;

public class day32iltrationswhile {

	
	void meth1(int a) {
		
		System.out.println("================meth1()============");
		while(a<=5) {
			
			System.out.println("a value is :"+a);
			a++;
		}
		System.out.println("meth1() execution completed");
	}
	void meth2(int a) {
		System.out.println("===========meth2()=============");
		while(a<=3) 
//			int x=90; ce 
			System.out.println("a value :"+a);
			a++;
		
		System.out.println("meth2() execution completed");

	}
	
	void meth3(int a) {
		
		System.out.println("----------meth3() ----------");
		
	
		while(true)
		
			System.out.println("a value :"+a);
//			a++;
		
		System.out.println("meth3() execution completed");

	}
	
	void meth4(int a) {
		
		System.out.println("-----------meth4()-----------");
		
		do {
			System.out.println("a value :"+a);
		}
		while(a<=5);
	}
	
	
	public static void main(String[] args) {
		
		day32iltrationswhile obj=new day32iltrationswhile();
		obj.meth1(1);
//		obj.meth2(1); infinite loop
//		obj.meth3(2); // 
//		obj.meth4(1); // infinite loop
	}
}
