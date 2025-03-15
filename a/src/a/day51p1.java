package a;

public  class day51p1 extends day51 {
	
	
	void meth() {
		
		System.out.println("abstract method overridden");
	}
	
	
	public static void main(String[] args) {
		
		
		day51 obj=new day51p1();
		obj.meth2();
		
		
	}

}
