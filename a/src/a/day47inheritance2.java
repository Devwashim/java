package a;

public class day47inheritance2 extends day47inheritance1 {
	
	
	void meth2() {
		System.out.println("method  B ");
	}
	public static void main(String[] args) {
		
		
		day47inheritance1 obj = new day47inheritance1();
		obj.meth1();
		System.out.println("-----------");//has a relation
		
		
		day47inheritance1 obj1 = new day47inheritance2();
		obj1.meth1();

		System.out.println("-----------");
		
		day47inheritance2 obj2 = new day47inheritance2();
		obj2.meth1();
		obj2.meth2();
		
		System.out.println("-----------");//is a relation
		

		
//		day47inheritance2 obj2 = new day47inheritance1(); C.E
//		obj2.meth1();
		
//		day47inheritance1==>parent class
//		day47inheritance2==>child class
		

	}
}
