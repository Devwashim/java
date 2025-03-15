package a;
//import java.util.Scanner;

public class day44stringpraticequestions2 {

	
//	Scanner sc = new Scanner(System.in);
//	String s2 = sc.nextLine();
	
	String makeAbba(String a , String b){
		return (a+b)+(b+a);
		
	}
	public static void main(String[] args) {
		
		day44stringpraticequestions2 obj = new day44stringpraticequestions2();
		
		
		String a = "hi ";
		String b = "bye ";
		String s1 = obj.makeAbba(a ,b);
		System.out.println(s1);
		
		
		
	}
}
