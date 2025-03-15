package alison;

public class Array {

	
	public static void main(String[]args) {
		
		
		int[] mylist = {45,46,47,48,65};

		
		//print all the array 
		
		
		for(int i=0; i<mylist.length; i++ ) {
			
			
//			System.out.print(mylist[0]);
			System.out.print(mylist[i]+" ");

		}
//		summing of all element
		
		double total =0;
		
		for(int i=0; i<mylist.length;i++ ) {
			
			total +=mylist[i];
			
		
		}
		
		System.out.println("total is "+ total);
	}
}
