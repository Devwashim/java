package alison;

public class Constructors {

	public static void main(String[]args) {
		
		
	new Constructors();
		
	}
	
	
	Constructors(){
		
System.out.println("bike is created"); 
	}
	
}


class Student{
	
	int id ;
	String name;
	
	void display() {
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) {
		Student	 obj =new Student();
		Student	 obj1 =new Student();
		
		obj.display();
		obj1.display();
	}
}



class studentclas {
	
	
	int id;
	String name;
	
	studentclas(int i, String n){
		
	id =i;
	name=n;
	}
	
	void display() {
		System.out.println(id +" "+ name);
	}
	
	public static void main(String[] args) {
		
		studentclas obj =new studentclas(1,"john");
	
	studentclas obj2 =new studentclas(2,"honey");
	
	obj.display();
	obj2.display();
}
}





