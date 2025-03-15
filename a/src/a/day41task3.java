package a;

public class day41task3 {

	
	 boolean  meth2(int []arr) {
		 if(arr[0]!=2&&arr[1]!=2&&arr[0]!=3&&arr[1]!=3) {
			 
			 return true;
		 }
		 else {
			return false;
			 
		 }
	 }
	
	
	public static void main(String[] args) {
		
		day41task3 obj = new day41task3();
		int []input= {4,5};
		boolean result = obj.meth2(input);
		System.out.println(result);
	}
}
