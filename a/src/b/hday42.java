package b;



class Circle{
	
	
	Circle(int r){
		
		System.out.println("i am circle parameterized constructer");
		this.radius =r;
	}
	public int radius;
	
	
	public double area() {
		return Math.PI*this.radius*this.radius;
	}
}


class Cylinder1 extends Circle {
	public int height;

	Cylinder1 (int r ,int h){
		super(r);
		System.out.println(" i am Cylinder1 parameterized constructer ");
		this.height=h;
	}
	public double volume() {
		return Math.PI*this.radius*this.radius*this.height;

	}
	
}

public class hday42 {

public static void main(String[] args) {
	Cylinder1 obj =new Cylinder1(12,4);
//	Circle obj1 =new Circle(12);
	
}
}
