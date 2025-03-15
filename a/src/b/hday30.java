package b;

class Employee{
		int salary;
		String name;
		
		
		
		public int getsalary() {
			return salary;
		}
		
		public String getname() {
			return name;
		}
		public void setname(String n ) {

		name = n;
		
		}
}


		
		class CellPhone{
			
			public void ring(){
				System.out.println("rining");
			}
			
			public void vibrating() {
				System.out.println("vibrating");
			}
			
			public void callfriend() {
				System.out.println("calling ananS");
			}
			
			
		}
		//pob3
		
		class Square{
			
			int side;
			
			public int area() {
			return	side*side;
			}
			
			public int perimeter() {
				return 4*side;
			}
			
			
		}
		//pob5
		
		class tommy{
			
			
			public void hitting() {
				System.out.println("hitting");
			}
			public void running() {
				System.out.println("running");
			}
			
			public void fireing() {
				System.out.println("fireing");
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		

public class hday30 {
		
	
	public static void main(String[] args) {
		
		Employee obj =new Employee();
		obj.setname("ankit");
		obj.salary =255;
		System.out.println(obj.getsalary());
		System.out.println(obj.getname());
		
		CellPhone obj1=new CellPhone();
		obj1.callfriend();
		obj1.vibrating();
		obj1.ring();
	
	
	Square obj2 =new Square();
	obj2.side =3;
	System.out.println(obj2.area());
	System.out.println(obj2.perimeter());
	
	tommy game=new tommy();
	game.fireing();
	game.hitting();
	game.running();
			
}
}
