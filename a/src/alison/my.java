package alison;

import a.MyInterfaces;
import a.MyInterfaces.XYZ;



interface MyInterfaces {

	
	public void method11();
	public void method21();
	
	
	class XYZ implements MyInterfaces{
		
		public void method11()
		{
			System.out.println( "method 1 implemets");
		}
		
		public void method21() 
		{
			System.out.println("implementation");
		}
	}
		public static void main(String[] args) {
			
			MyInterfaces obj = new XYZ();
			
			obj.method11();
			obj.method21();
			
		}
	}


