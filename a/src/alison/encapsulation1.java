package alison;

public class encapsulation1 {
	
	private String Name ;
	private String IdNum;
	private int age ;
	

	
//	get method 
	public int getAge() {
		
		return age;
	}
	
	public String getIdname(){
		
		return IdNum;
	}
	public String getName(){
		
		return Name;
	}
	
//	set method 
	
	
	public void setAge(int NewAge) {
		age= NewAge;
	}
	
	public void setIdnum(String NewAge) {
		IdNum= NewAge;
	}
	
	
	public void setName(String NewAge) {
		Name= NewAge;
	}
	
	public static void main(String[] args) {
		
		encapsulation1 obj = new encapsulation1();
		obj.setName("aman");
		obj.setAge(45);
		obj.setIdnum("4525");
		
		
		//print the value 
		System.out.println("Name "+ obj.getName());
		System.out.println("age "+ obj.getAge());
		System.out.println("id "+ obj.getIdname());
	}
	
}
