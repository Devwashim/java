package a;

public class day20constructortest {

	
	
	int a=10;
	public String testMethod() {
		
	
		new day20constructortest(100,200,"java");
		System.out.println(40);
		return new day20constructortest().testMethod3(new day20constructortest(50).testMethod2())+
				new day20constructortest().testMethod4("hi");
	}
	
	day20constructortest(){
		System.out.println("hi");
	}
	
	public int  testMethod2(){
		System.out.println(50);
		return 10+15;
		
	}
	day20constructortest(int a){
		System.out.println("java is awesome");
	}
	
	public String testMethod3(int a) {
		System.out.println(18);
		return "is";
		
	}
	day20constructortest(int a, int b, String s){
		System.out.println(a+b);
		System.out.println(s);
	}
	
	public String testMethod4(String s) {
		System.out.println(88);
		return "good";
	}
	
	public static void main(String[] args) {
		
		day20constructortest t1= new day20constructortest();
		t1.a=10;
		day20constructortest t2=new day20constructortest(50);
		t2.a=30;
		System.out.println("java"+t1.testMethod()+" "+(t1.a+t2.a-30));
		
	}
	
}
