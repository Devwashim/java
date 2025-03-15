package a;

public class day19constater {
	
	day19constater(){
		
		System.out.println("non pramiiterized constrater");
		new day19constater(999).method2();
	}
	day19constater(int a){
		
		System.out.println(" pramiiterized constrater"+a);
		
		
	}
	
	
	
	
	  void method() {
		  
		  
		  System.out.println("method(1) called");
	  }
	  
	  void method2() {
		  
		  
		  System.out.println("method(2) called");
	  }
	  
	  
	  
	public static void main(String[] args) {
	
		
		day19constater obj = new day19constater();
		obj.method();
	}

}
