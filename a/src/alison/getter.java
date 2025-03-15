package alison;

class Person{
	
	String name;
	int age; 
	
	
	void speak() {
	
		System.out.println("my name is "+ name);
	}
	
	int calculateYeartoretirement() {
		
		int yearleft=	65-age;
		return yearleft;
	
	}
	
	int getAge() {
		return age;
	}

	
	String getName() {
		return name;
	}
}

public class getter{
	public static void main(String[]args) {
	
	Person  person1 = new Person();
	
	person1.name="aman";
	person1.age=25;
	
//	speak person1
	
	int year = person1.calculateYeartoretirement();
	System.out.println("year till retiement :"+ year);
	
	int age = person1.getAge();
	String name= person1.getName();
	
	System.out.println("name is:"+name);
	System.out.println("age is:"+age);
	
	}
	
}

