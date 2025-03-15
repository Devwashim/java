package a;

public class day40p2 
{
	int[] meth1()
	{
		
		int arr[]= {2,4,2};
		
		for(int i=0; i<arr.length-1;i++) {
			if(arr[i]==2 && arr[i+1]==3) {
				arr[i+1]=0;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		day40p2 obj=new day40p2();
		int result[]=obj.meth1();
		for(int x:result) 
		{
			System.out.println(x+"");//203
	}
		
		new day40p2().meth1();
		
	}
}
