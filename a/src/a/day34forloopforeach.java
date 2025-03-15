package a;

public class day34forloopforeach {

	
	void meth1() {
		
		int arr[]= {10,20,30,40,50};
		
		
		for(int i=0;i<=0;i++) {
			System.out.println(arr[5-1]);
			
		}
	
		System.out.println("printing data same order");
		System.out.println("====================");
		System.out.println();
		
		int arr1[]= {10,20,30,40,50};
		
		
		for(int i=4;i>=0;i--) {
			System.out.println(arr1[i]);
			
		}
		
		
		
		System.out.println("printing data rervers order");
		System.out.println("====================");
		System.out.println();
		
		for(int i: arr) {
			
			System.out.println(+i);
		}
		
		System.out.println("printing data same order");
		System.out.println("====================");
		System.out.println();
		
		int arr2[]= {10,20,30,40,50};
		
		
		for(int i=3;i>=1;i--) {
			System.out.println(arr2[i]);
			
		}
		
		}
	

	
	public static void main(String[] args) {
		
		
		day34forloopforeach obj = new day34forloopforeach();
		obj.meth1();
	}
}

//for loop will be working on index values
//for each will be working on stremaing data 
