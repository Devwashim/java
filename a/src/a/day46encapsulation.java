package a;

import java.util.Scanner;

public class day46encapsulation {
	
	
	
	
	void meth() {
		
		
		Scanner sc = new Scanner(System.in);
		day46encapsulation1 aobj= new day46encapsulation1();
		System.out.println("please enter your name");
		aobj.setStuname(sc.nextLine());
		
		System.out.println("please enter your name");
		aobj.setSturollnumber(sc.nextInt());
		
		System.out.println("accessing the variables which are present in class");
		
		System.out.println("student name "+aobj.getStuname());
		System.out.println("student roll number "+aobj.getSturollnumber());
		
	}
	
	public static void main(String[] args) {
		
		day46encapsulation obj = new day46encapsulation();
		obj.meth();
		
		
	}

}


