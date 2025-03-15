package a;

public class day44stringpraticequestions5 {

	
	
	public String extraEnd(String str) {
		
//		return str.repeat(3);
		String s = str.substring(str.length()-2);
		return s+s+s;
	}
	
	public static void main(String[] args) {
		
		
		day44stringpraticequestions5 obj =  new day44stringpraticequestions5();
	
		
//		String str = "hello".substring(3,5);
		String str ="hello";
		String s1=obj.extraEnd(str);
		System.out.println(s1);
	}
}
