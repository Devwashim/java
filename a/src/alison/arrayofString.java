package alison;

public class arrayofString {

	
	
	public static void main(String[]args) {
		
		//declare a string array with initail size
		
		
		
		String [] schoolbag = new String[5];
		
		
//		add elements to the array
		
		schoolbag[0] ="Books";
		schoolbag[1] ="pan";
		schoolbag[2] ="notbook";
		schoolbag[3] ="ruf";
		schoolbag[4] ="pencils";
		
		
		
		
		String[] schoolbag2 = {"Books","pan", "notebook","ruf","pencils"};
		
		int size =schoolbag2.length;
		System.out.println("this is size of array"+size);
			
		for(int i=0; i<size;i++ ) {
			
			System.out.print(" index ["+i+"]= "+schoolbag2[i]);
		}
 	
	}
}
