package a;

public class day41task4 {

	
	public boolean meth2(int []nums) {
		
		if(nums.length>=1 && nums[0]==nums[nums.length-1]) 
			
			return true;
		return false;
		
			
			
			
		

	}
	
	public static void main(String[] args) {
		
		day41task4 obj = new day41task4();
		int []input= {4,5,6,7,9};
		boolean result = obj.meth2(input);
		System.out.println(result);
	}
	
}
