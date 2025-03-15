package a;

public class day31task2 {
	
	
	void meth1() {
		System.out.println("==============end================");
	}
	day31task2(int a,int b){
		
		if (a>=b) {
			System.out.println("a is greater then b a value is :"+a);
		}
		else {
			System.out.println("b is grater then a, b value is  :"+b);
		}
	}
			
		
	
	
	
	public static void main(String[] args) {
		
		System.out.println("----------------start----------------");
		day31task2 obj =new day31task2(85,100);
		obj.meth1();	
		obj.meth2();
	}
	
}
