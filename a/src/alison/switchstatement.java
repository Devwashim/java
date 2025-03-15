package alison;
import java.util.Scanner;

public class switchstatement {

	
	public static void main(String[]args) {
		
		System.out.println("plases enter your months");

		Scanner sc = new Scanner(System.in);
		int value =sc.nextInt();
		
		int month= value;
		String monthString = null;
		switch(month) {
		
		case 1 : monthString = "january";
		break;
		
		case 2:monthString = "feb" ;
				break;
				
		case 3:monthString = "march" ;
		break;
		
		case 4:monthString = "APRIL" ;
		break;
		
		case 5:monthString = "MAY" ;
		break;
		
		case 6:monthString = "JUNE" ;
		break;
		case 7:monthString = "JULY" ;
		break;
		case 8:monthString = "AUGUST" ;
		break;
		case 9:monthString = "SET" ;
		break;
		case 10:monthString = "OCT" ;
		break;
		case 11:monthString = "NOV" ;
		break;
		case 12:monthString = "DEC" ;
		break;
		}

		System.out.print(monthString);
		
	}
	
}
