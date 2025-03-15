package b;

class One{
	
	public void greet() {
		
		System.out.println("good moring");
	}
	public void name() {
		
		
		System.out.println("my name is java");
	}
	
}
class Two extends One{
	
	
	public void welcome() {
		System.out.println("welcome");
	}
	public void name() {
		System.out.println("java 2");
		
	}
}





public class hday39 {

	public void meth1() {
		System.out.println("start");
		System.out.println("-----------");
	}
	
	public static void main(String[] args) {
		
		
		hday39 obj=new hday39();
		obj.meth1();
		
		One obj1 =new One();
//		obj1.name();
		obj1.greet();
		
	}
}
