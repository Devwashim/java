package alison;
//super class


//this is simpy a class to display the attributes of the vechicle
class inheritance1 {
	 String color;
	 int speed;
	 int size;
	 
	 void attributes() {
		 System.out.println("color :"+color);
		 System.out.println("color :"+speed);
		 System.out.println("color :"+size);
	 }
	
}
 
 //this is sub class which extend for vechile 
class Car extends inheritance1{
	 
	 int cc;
	 int gear;
	 void attributescar() {
		 
		 
		 //this sub class refers to memeber of superclass
		 
		 System.out.println("color "+color);
		 System.out.println("color "+speed);
		 System.out.println("color "+size);
		 System.out.println("color "+cc);
		 System.out.println("color "+gear);
	 }


 
public static void main(String[] args) {
	Car b1 =new Car();
	b1.color="blue";
	b1.speed=50;
	b1.size=500;
	b1.cc=250;
	b1.gear=5;
	b1.attributescar();
}
}
 
 
