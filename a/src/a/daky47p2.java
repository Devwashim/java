package a;

public class daky47p2  extends day47inheritance{

	void meth2() {
		System.out.println("class B meth");
	}
	
	public static void main(String[] args) {
		
		
		day47inheritance obj=new day47inheritance();
		obj.meth1();//has - a relation
		
		daky47p2 obj1= new daky47p2();
		
//		obj.meth1();//
		obj1.meth2();//is - a relation
		System.out.println("------------");
		
		
		day47inheritance aobj = new daky47p2();
		aobj.meth1();
//		aobj.meth2();//C,E
		System.out.println("-----------");
		
		daky47p2 obj2 = new daky47p2();
	obj2.meth1();//is a relation
	obj2.meth2();//
	
	//daky47p2 obj2=new day47inheritance();//C.E
		
	}
	
}
