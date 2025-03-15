package a;

public class day41task7 {

	
	
	public boolean commonEnd(int[]a,int[]b) {
		
		
		if(a[0]==b[0] || a[a.length-1]==b[b.length-1])
		return true;
		
		return false;
	}
	
	
	
public static void main(String[] args) {
		
	day41task7 obj = new day41task7();
		int input[] = {4,5,6};
		int input1[] = {7,9,3};
		boolean result = obj.commonEnd(input,input1);
		
		System.out.println(result);
		
		
		
	}
}
