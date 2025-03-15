package a;

public class day44stringpraticequestions4 {

	
	
	public void meth1(String word ) {
		
		String revString = "";
		for(int  i=word.length()-1; i>=0; i--) {
			
			revString+=word.charAt(i);
		}
		if(word.equals(revString)) {
			System.out.println(word + " is a palendrome");
		}else
			System.out.println(word +" is not a palendrome");
	}
	
	public static void main(String[] args) {
	
		day44stringpraticequestions4 obj = new day44stringpraticequestions4();
		obj.meth1("MadaM");

	}
}
