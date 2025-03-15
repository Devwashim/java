package alison;

interface printableinterface {

	void print();
}
	
	class A6 implements printableinterface {

	public void print() {System.out.println("java");}
	
	public static void main(String[] args) {
		
		A6 obj = new A6();
		obj.print();
	}
	}

