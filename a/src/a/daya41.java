package a;

public class daya41 {
	
	
	boolean meth2(int []arr)
	{
		
		if(arr[0]!=2&&arr[1]!=2&&arr[1]!=3) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		daya41 obj=new daya41();
		int[]input= {4,5};
		boolean result=obj.meth2(input);
		System.out.println(result);
	}
}

