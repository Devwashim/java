package b;


class Phone{
	
	public void greet() {
		
		System.out.println("good moring");
	}
	public void name() {
		
		
		System.out.println("my name is java");
	}
	
}
class Smart extends Phone{
	
	
	public void welcome() {
		System.out.println("welcome");
	}
	public void name() {
		System.out.println("java 2");
		
	}
}

public class hday39p1 {
	
	public void meth1() {
		System.out.println("start");
		System.out.println("-----------");
	}
	
	public static void main(String[] args) {
		
		
		hday39 obj=new hday39();
		obj.meth1();
		
		Phone obj11= new Smart();
//		Smart obj11= new Phone();// child class could not excess present class 
		obj11.name();
		
//		Phone obj1 =new Phone();
//		
//		obj1.name();
//		obj1.greet();
		
	}

}
