package a;
import java.util.*;

public class day44stringpraticequestions {

	
	
	
	public String helloName(String name) {
		
		return name.concat("!");
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		
		day44stringpraticequestions obj = new day44stringpraticequestions();
		
		
		
		String name= s1;
		String n1 = obj.helloName(name);
		System.out.println("hello "+n1);
//		System.out.println("length() : "+n1.concat("is awesome ").length());

		
	}
}
