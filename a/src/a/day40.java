package a;

public class day40 {

	void meth1() {
		
//		int arr[] =new int[0];
//		arr[0]=100;
//		System.out.println(arr[0]);
		
		
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		for (int i=0; i<3; i++) {
			
			for (int j=0;j<3;j++) {
				System.out.print(arr[i][j]+"");
			}
		System.out.println();
		}
		
		
		
	}
	public static void main(String[] args) {
	
		
		new day40(). meth1();
	}
}
