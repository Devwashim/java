package a;


import java.util.Scanner;
public class day38arrywithforloop {
	
	void meth1() {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("how many studented name you want to enter");
		String studentName[]= new String[sc.nextInt()];
		System.out.println("user want to enter  "+studentName.length + " names");
		System.out.println("please enter  " +studentName.length + " names");
		
		for(int i=0;i<=studentName.length-1;i++) {
		
			
		studentName[i]=sc.next();
		}
		System.out.println("data entered");
		System.out.println("=================for loop ==============");

		
	for(int i=0;i<=studentName.length-1;i++) {
		
		System.out.println(studentName[i]);
		
		
	}
	
	System.out.println("=================for loop ==============");
	for(int i=studentName.length-1;i>=0;i--) {
		
		System.out.println(studentName[i]);
		
	}
	
	System.out.println("===========for each ==================");
	for(String data:studentName) {
		
		
		System.out.println(data);
	}
	
	}
	
	
	public static void main(String[] args) {
		
		
		new day38arrywithforloop().meth1();
	}

}
