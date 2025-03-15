package alison;

public class tostring {

	
	int rollno ;
	String name;
	String city;
	

	tostring(int rollno, String name , String city){
		
		this.rollno=rollno;
		this.name=name;
		this.city=city;
	}
	
	public String toString() {
		
		return rollno+ " "+name+ " "+city;
	}
	
	public static void main(String[] args) {
		
		tostring obj = new tostring(1,"aman","delhi");
		tostring obj1 = new tostring(2,"kapil","new delhi");
		
		System.out.println(obj);
		System.out.println(obj1);
		
	
	}
}
