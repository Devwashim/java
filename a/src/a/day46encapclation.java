package a;

import java.util.Scanner;

public class day46encapclation {
	
	
void meth1() {
	
	Scanner sc=new Scanner(System.in);
	day46p2 obj=new day46p2();
	
	System.out.println("enter you name");
	obj.setStuName(sc.next());
	
	System.out.println("enter your number");
	obj.setStuRollNumber(sc.nextInt());
	System.out.println("==========================");
	
	System.out.println("student name: "+ obj.getStuName());
	System.out.println("student number: "+ obj.getStuRollNumber());
	
}

public static void main(String[] args) {
	day46encapclation obj = new day46encapclation();
	obj.meth1();
}
}
