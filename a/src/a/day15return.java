package a;

public class day15return {

	
	
	void meth1() {
		
		System.out.println(10);
		System.out.println(20);
		System.out.println(30);
		System.out.println(40);
		return;
	}
	
	
	
	int meth2() {
		
		System.out.println( "method2() calling");
		return 99;

	}
	
	int meth3() {
		
		System.out.println("method3() calling");
		int a = 1;

		if (a<5){
			System.out.println("if block executed");
			
			return 100;
		}else {
			System.out.println("if block executed");
			return 200;

		}
	}
	
	public static void main(String[] args) {
		
		day15return obj = new day15return();
		
		
		System.out.println("start");
		
		obj.meth1();
		
		int x = obj.meth2();
		
		System.out.println("method2 is returing : " +x);
		int y = obj.meth3();
		System.out.println("method3 is returing : " +y);
		System.out.println("end");
		
	}
}
