package alison;

public class GenericsandArray {

	
	
	public static void main(String[]args) {
		
		int a[] =new int[5]; //declartion and instantiation
		
		a[0] = 10; // initialization
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		//printing of the array
		
		for (int i =0; i<a.length; i++) {  //length is the property of arry
			System.out.println(a[i]);
		}
	}
}
