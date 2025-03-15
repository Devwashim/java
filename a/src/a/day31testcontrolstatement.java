package a;

public class day31testcontrolstatement {

	
	void meth1(int a,int b, int c) {
		
		
		if(a>b) {
			System.out.println(" a grater then b, a value is :"+a);
			if(a>c) {
				System.out.println(a+" is biggest number");
				
			}else{
				System.out.println(c+" is biggest number");

			}
		}
		
		else {
			
//			System.out.println("a is mot grater then b, b value is  : "+b );
		
		 if(b>c) {
			 System.out.println("b  is grater then c,  b value is :"+b);
			
		}
		 else {
			 System.out.println("b is not grater then c,  c value is  :"+c);

		 }
	 }
	}
	
	public static void main(String[] args) {
		
		new day31testcontrolstatement().meth1(450,550,350);
	}
}
