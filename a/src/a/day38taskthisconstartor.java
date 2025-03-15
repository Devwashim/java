package a;

public class day38taskthisconstartor {
	
	
	String name;

	
	public day38taskthisconstartor(){
		this(" abdul kalam azad");
		this.display();
		
		
	}
	
	day38taskthisconstartor(String name){
		
		this.name =name;
		
	}
	
	
	void display() {
		System.out.println("person Name is ="+name);
	}
	
	
	public static void main(String[] args) {
		
		new day38taskthisconstartor();
		
		
	}

}
