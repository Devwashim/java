package a;

public class day40taskquestion {

	
	
	int[] meth1() {
		
		int arr[]={1,4  ,2};
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]==2 && arr[i+1]==3) {
				arr[i+1]=0;
			}
		}
		return arr;
		
	
	}
	public static void main(String[] args) {
	
		
		day40taskquestion obj =new day40taskquestion();
				int result[]=obj.meth1();
				
				for(int x:result) {
					
					
					System.out.print(x+ " ");
				}
	}
}
