package b;
//ch44 video44
import java.util.Scanner;
 class Cylinder{
	private int  radius;
	private int height;
	
	
	
	/**
	 * @param radius
	 * @param height
	 */
	public Cylinder(int radius, int height) {
		super();
		this.radius = radius;
		this.height = height;
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public double surfaceArea() {
		return 2*Math.PI*radius * radius +2*Math.PI*radius*height;
	}
	
	
	public double volume() {
		return 2 *Math.PI* radius *radius*height;
	}
	
	
	 
}

 class rectangle{
		private int lenght; 
		private int breadth;
		
		
		
		public rectangle(){
			this.lenght=4;
			this.breadth=5;
		}
		
		public rectangle(int lenght,int breadth) {
			this.lenght=lenght;
			this.breadth=breadth;
		}

		public int getLenght() {
			return lenght;
		}

		public int getBreadth() {
			return breadth;
		}
	}

public class hday34 {
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
	String  str =new String(sc.nextLine());
System.out.println("enter your hight"+str);

		Cylinder myc=new Cylinder(9,12);
		myc.setHeight(12);
		int h = myc.getHeight();
		System.out.println(h);
		
		myc.setRadius(9);
		int j=myc.getRadius();
		System.out.println(j);
		//prob2
		System.out.println(myc.surfaceArea());
		System.out.println(myc.volume());
		rectangle r=new rectangle();
		System.out.println(r.getLenght());
		System.out.println(r.getBreadth());
	}
	

}
