package a;

public class day41task {

	
	
	int meth3(int []arr) {
		
	if(arr.length>=2) {
		return arr[0]+arr[1];
	}
	else if(arr.length==1) {
		return arr[0];
	}
	else
			return 0;
			
	}
	
	public static void main(String[] args) {
		
		
		day41task obj=new  day41task();
		int result =obj.meth3(new int[] {1,5,6});

System.out.println(result);
	}
}
