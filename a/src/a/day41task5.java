package a;

public class day41task5 {
	
	
	 public int[] makePi(){
		
		
		 
		 return new int[] {3,1,4};
		}
	

	public static void main(String[] args) {
		
		day41task5 obj = new day41task5();
		obj.makePi();
		
		int result []= obj.makePi();
		
		
		for (int x:result) {
		System.out.println(x+ " ");
		}
		
	}
	
}
