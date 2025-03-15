package b;


///video 53 abstract abstract methods







  abstract class parents1 {
	
	
	public  parents1() {
		System.out.println("good morning");
	}
	
	public void say() {
		System.out.println("hello");
	}
	abstract public void greet();
	abstract public void greet2();
}
  
  
   class Child2 extends parents1{
	
	  
	  public void greet() {
		  System.out.println("good ");
	  }
  
   
   public void greet2() {
	   System.out.println("good afternoon");
   }
}
  
  abstract class Child3 extends parents1{
	  
	  
	  public void th() {
		  System.out.println("good afternon");
	  }
  }


public class hday38 {
//dynam0ic method
	public static void main(String[] args) {
		
		Child2 obj = new Child2();
//		parents1 obj2 = new parents1(); throw a error 
//		Child3 obj3 = new Child3(); throw a error 
		obj.greet();
		
	}
}
