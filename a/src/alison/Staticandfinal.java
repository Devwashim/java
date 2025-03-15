package alison;

public class Staticandfinal {

	
	int rollno;
	String name;
	static String collage ="DPS";
	
	
	Staticandfinal(int r, String n){
		rollno =r;
		name =n;
		
	}
	
	void display() {
		
		System.out.println(rollno+ " "+name+" " +collage);
	}
	
	
	public static void main(String[]args) {
		
		
		Staticandfinal obj1 =new Staticandfinal(1,"kapil");
		
		Staticandfinal obj2 =new Staticandfinal(2,"aman");
		
		obj1.display();
		obj2.display();
		
		
	}
}
