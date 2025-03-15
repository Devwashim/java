package a;

public class day48 extends day48p2 {

	
	void meth1() {
	
		
		//constrators does not particapates inheritance 
		
		System.out.println("classB");
		super.meth1();
		
	}
	day48(){
		System.out.println("constrater does");
		
	}
	day48(int b){
		super(" is  awesome");
		System.out.println("constrater B :" +b);
		
	}
	
	
	
	public static void main(String[] args) {
		
		
//		day48 obj = new day48();
//		obj.meth1();
		
		new day48(100).meth1();
	}
	
	
	
}
