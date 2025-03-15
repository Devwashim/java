package a;

public class day50polymorphismoverriddingpart2 extends day50polymorphismoverriddingpart1 {

	
	

	void meth1() {
		System.out.println("class  B"+10);
	}
	
	void meth2(int a) {
		System.out.println("class B "+a);
	}
	
public void meth3(String s) {
		
		System.out.println("class B"+ s);
	}

// void meth4() { C .E because default is more restrictive than projected
//	System.out.println("class A hello");
//}

static void meth5() {
	
	System.out.println("classB meth5");
	
}





    day50polymorphismoverriddingpart2 meth6(){
	System.out.println("class B meth6");
	return this;
}

	
	
	public static void main(String[] args) {	
	day50polymorphismoverriddingpart1 obj =new day50polymorphismoverriddingpart2();
	
	
	
	obj.meth1();
	obj.meth2(20);
	
//	obj.meth3();//C.E Because it is a private method 
	obj.meth4();//Class A will be executed
	obj.meth5();
	obj.meth6();
	
	
	
	
	}
}
