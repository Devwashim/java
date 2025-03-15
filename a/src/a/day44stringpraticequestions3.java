package a;

public class day44stringpraticequestions3 {


	
	String makeOutWord(String out, String word) {
		return out.substring(0,2)+word+out.substring(2);
		
//		return out.replace("<>", "java");
	}
	
	
	public static void main(String[] args) {
		
		day44stringpraticequestions3 obj = new day44stringpraticequestions3();
		
		String out = "<<>>";
		String word ="java";
		String s2 = obj.makeOutWord(out, word);
		System.out.println(s2);
		
		
		
	}
	
}


