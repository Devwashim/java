package alison;

public class Stringproject {

	
	public static void main(String[] args) {
		
		String s1="java";
		char ch[] = {'s','r','o','d','e'};
		
		String s2 = new String(ch);//converting char array to string 
		
		String s3 = new String("example");//creating java string by new keyboad
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s2.length());
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s2.replace('r', 'p'));
	}
	
}
