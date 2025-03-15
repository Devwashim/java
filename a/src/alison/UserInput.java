package alison;
import java.util.Scanner;

public class UserInput {

	
	public static void main(String[]args) {
		
		Scanner sc =new Scanner(System.in);
		
		//output
System.out.print("enter a floating point value please");	

//wait for the user to enter something 
Double value = sc.nextDouble();

//tell the user string entered
System.out.print("you entered " + value);
	}
	
	
}
