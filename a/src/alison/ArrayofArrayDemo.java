package alison;

public class ArrayofArrayDemo {

public static void main(String[]args) {
	
	
	String [][] catoons ={
		
			{"bob","karge","wilma","pebbles"},
			{"rubbles","mana","betty"},
			{"scooby doo", "scooer","hhhh"}};
	
	for(int i=0; i<catoons.length; i++) {
		
		System.out.print(catoons[i][1] +":");
		
		for(int j=i; j<catoons[i].length;j++) {
			
			System.out.println(catoons[i][j]+ ":");
		}
		
	}
}
	
	
}
