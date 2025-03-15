package alison;

public class GenericsMethod {

	
	//generic method printArray
	
//	public static<E> void PrintArray(E[]intputArray) 
	public static<E> void PrintArray(E[]elements) 
	{
		
		
		//Display array elements
		for(E element :elements) {
			System.out.printf("%s",element);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// create arrays of integer double and charactor
		
//	    Integer[]IntArray = {1,2,3,4,5};
	    Integer[]IntArray = {10,20,30,40,50};
//		Double[]DoubleArray = {1.1,1.2,1.3,1.4};
		Character[]CharArray = {'h','e','l','l','o'};
		
		System.out.println("array interArray contains");
		PrintArray(IntArray);//pass an integer array
		
//		System.out.println("\nArray doubleArray Contains ");
//		PrintArray(DoubleArray);// pass a double array
// 		
		System.out.println("\nArray character contains");
		
		PrintArray(CharArray); // pass a character array
	}
}
