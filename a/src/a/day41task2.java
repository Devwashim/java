package a;

public class day41task2 {

	
	public boolean firstLast6(int[]nums) {
		
		
		if(nums[0]==6 || nums[nums.length-1]==6) 
			
			
			return true;
		
			  return false;
	
	}
	
	
	public static void main(String[] args) 
	
	{
		day41task2 obj =new day41task2();
		boolean result=obj.firstLast6(new int[] {13,6,1,2,3});
		System.out.println(result);
		
	}
}
