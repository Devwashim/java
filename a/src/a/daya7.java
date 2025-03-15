package a;

public class daya7 {
	
	public void meth1(String word) {
		
		String revs="";
		for(int i= word.length()-1;i>=0;i--)
		{
			revs+=word.charAt(i);
			
			System.out.println(i);
		}
		
		if(word.equals(revs)) {
			
			System.out.println(word +" is a palendrome ");
			
			
		}else {
			System.out.println(word +" is not palendrome ");

		}
	}
	public static void main(String[] args) {
		
		
		
		daya7 obj = new daya7();
		obj.meth1("mukesh ");
	}

}
