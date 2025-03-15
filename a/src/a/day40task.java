package a;

public class day40task {

	boolean meth2(int []arr) {
		
		if(arr[0]!=2&&arr[0]!=3&&arr[1]!=3) {
			return true;
			
		}else
		{
			return false;
		}
		
		
	}
	
	public static void main(String[] args) {
	
		
		day40task obj = new day40task();
		int []input = {4,5};
		boolean result =obj.meth2(input);
		System.out.println(result);
	}
}
