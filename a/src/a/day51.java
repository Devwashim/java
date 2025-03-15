package a;

public abstract class day51 {
	
		
	void meth2() {
		
		System.out.println("classA meth2() called");
		this.display();
	}
	
	static void meth3() {
		System.out.println("classA meth3() called");
	}
	
void display() {
	
	System.out.println("start");
	System.out.println("--------------");
}

day51(){
	System.out.println("day51 constructor");
}

public static void main(String[] args) {
	
	System.out.println("java is awesome");
	day51.meth3();
}

}
