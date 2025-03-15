package a;

public class day03p13 {

	
//	int meth1() {
		void meth1() {
		
		System.out.println("java is awesome");
//		return 100;
	}
		
		protected void finalize() {
			
			System.out.println("garbage has been collecred");
		}
		
	
	public static void main(String[] args) {
		
		day03p13 obj=new day03p13();
		day03p13 obj2=new day03p13();
		

		
		
		System.out.println("start");
		System.out.println("=================================");
		System.out.println(obj.getClass());// i am using the get class method 

		System.out.println("=================================");
		System.out.println(obj.toString());//  i am using toString method 
		
		System.out.println("=================================");
		System.out.println(obj2.toString());// 
		
		obj.meth1();
		obj2=null;

		
//		int x = obj.hashCode(); // hashcode will be generate unique identifications number
//		int x2 = obj2.hashCode(); // hashcode will be generate unique identifications number
		
				
//		System.out.println("hascode:"+x);
//		System.out.println("hascode"+x2);
		
		
		System.out.println("====================");
		
		boolean result = obj.equals(obj);
		System.out.println(result); //true 

		
		boolean result2 = obj.equals(obj2);
		System.out.println(result2); // false
		System.out.println("=================");
		System.out.println("ends"); // false
		
		
		//garbage  collector  is use to destroy unused and reference object the heap memory 
		
		System.gc(); // it is a process to call the garbage collector manually 
		
		
	}
}
