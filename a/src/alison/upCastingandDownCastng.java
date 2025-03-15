package alison;

class Animal{
	int health =100;
	
}

class Mammal extends Animal{}

class Cat extends Mammal{}

class Dog extends Mammal{}

public class upCastingandDownCastng {
	
	public static void main(String[] args) {
		
		
		//Upcasting
//		Cat c = new Cat();
//		System.out.println(c.health);//upcasting
//		
//		Dog d= new Dog();
//		System.out.println(d.health);
		
//		DownCasting
		
		Cat c = new Cat();
		System.out.println(c);//DownCasting
		
		Mammal m =c;
		System.out.println(m);

	}
	
}

