package a;

public class day22test {
	
	void meth1(int a , int b ,int c) {
		 c=a+b;
		System.out.println("addition:"+c);
		new day22test().meth2(45, 56);;

	}
	
	
void meth2(int f,int g) {
		
//		int r = f-g;
//		System.out.println("substractions"+r);
		System.out.println("substractions"+(f-g));
	}
	


day22test(){
	System.out.println("divsion :"+(65/2));
}
	day22test(int k){
		System.out.println("multipcation :"+(k*2));
		 

	}
	
	
	
	public static void main(String[] args) {
		
		day22test obj= new day22test(8);
		obj.meth1(45, 10, 10);
//		obj.meth2(46, 54);

	}
}
