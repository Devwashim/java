package a;

public class day48p2 {

	
	void meth1() {
		
		System.out.println("start");
		
		System.out.println("======== colled A");
		
	}
	day48p2(){
		
		
		System.out.println("class default con");
	}
	
	day48p2(String s){
		this();
		this.meth1();
		System.out.println("java "+s);
		
	}
	
	
	
		
		
		
		
	public static void main(String[] args) {
		
		
		day48p2 obj = new day48p2();
		obj.meth1();
	}
}
