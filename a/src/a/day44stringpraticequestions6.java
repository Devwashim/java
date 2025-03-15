package a;

public class day44stringpraticequestions6 {
	

	public String firstTwo(String str) {
		
//		
//		if(str.length()>=2) 
//			return str.substring(0,2);
//			 return str;
			
		
		
		return str.substring(0, 2);
	}
	
	
	public static void main(String[] args) {
		
		

		day44stringpraticequestions6 obj = new day44stringpraticequestions6();
		
		String str = "kapil";
		String s1=obj.firstTwo(str);
		System.out.println(s1);

		
		
	}
}
