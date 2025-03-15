package a;

public class day39 {

	
	void meth1() {
		
		
		int arr1[];
		arr1 =new int[5];
		
		int arr2[]=new int[4];
		
		int arr3[]= {100,200,300,400,500,600};
		
		int arr4[]=new int [] {11,22,33,44,55};
		
		String s1="java is  awsome";
		

		
		System.out.println("arr1 length :" +arr1.length);
		System.out.println("arr1 length :" +arr2.length);
		System.out.println("arr1 length :" +arr3.length);
		System.out.println("arr1 length :" +arr4.length);
		System.out.println("string length :" +s1.length());
		
		System.out.println(arr1[4]);
//		System.out.println(arr1[arr1.length]);
		System.out.println(arr3[arr1.length-arr2.length]);
		System.out.println(arr4[arr4.length-1]);
		
		
		}
	
	


	
	public static void main(String[] args) {
		new day39().meth1();
	}
	
}
