package a;

public class day29controlstatement {
	
	
	
	
	public static void main(String[] args) {
		
		day29controlstatement obj =new day29controlstatement();
		obj.meth1(1);
		obj.meth2(10);
		System.out.println(obj.meth3('A'));
		obj.meth4('A'-60);
		obj.meth6(5);
		obj.meth7(17);
		obj.meth8(0);
	
	}
	
	void meth1(int a) {
		
		
	System.out.println("----------meth1()----------");
	
	 if(a<=10) {
		System.out.println("if block excuted :" +a);
	 }
	 
	 System.out.println("meth1() exexuted");
	
	}
	
	void meth2(int a) {
		
		
		System.out.println("----------meth2()----------");
		
		
		if(a<=5) {
			
			System.out.println("hi");
			System.out.println("hello");
			System.out.println("meth2() exexuted");
			
		}
		

	}
	
	int meth3(int a) {
		
		System.out.println("----------meth3()----------");
		if(!(a<='A'))
			
			return 100;
			return 200;
			

		
//			System.out.println("meth3() excuted");
	}

	
	void meth4(int a) {
		System.out.println("----------meth4()----------");
		
		if(a<5) {
			System.out.println("if block exexuted :" +(++a));
			if(a==6) {
				new day29controlstatement().meth5(a);
			}
			System.out.println("compiler came out from the inner if block");

		}else {
			System.out.println("else block executed");
		}
		System.out.println("meth4()executed");
		
	}
	
	void meth5(int a) {
		System.out.println("----------meth5()---------- :"+a);

		
	}
	
	void meth6(int a) {
		
		System.out.println("----------meth6()----------");
		
		if (a<=3) {
			System.out.println("hi");
		}else {
			System.out.println("hello");
			System.out.println("meth6() excuted");
		}
	}
	
	void meth7(int a) {
		System.out.println("----------meth7()----------");
		
		if(false) 
			System.out.println("hi");// it is dead code to the compiler
		
		else 
			System.out.println("hrllo");
			System.out.println("meth7() excuted");

		
	}
	
	void meth8(int a ) {
		System.out.println("----------meth8()----------");
		if(a>0) {
			System.out.println(a+ "is postive number");
		}
		else if (a<0) {
			System.out.println(a+"is negative number");
		}
		else {
			System.out.println("is equal to 0");
		}
		System.out.println("meth8() excuted");
		
	}
}
