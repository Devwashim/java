package a;
import java.util.Scanner;

public class days38 {
	
	

	void meth1() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("how many  student names you want to enter");
//		int num=sc.nextInt();	
		String studentNames[]=new String[sc.nextInt()];
		System.out.println("user want to enter "+studentNames.length+" names");
		System.out.println("please enter "+studentNames.length+"names");
		
		for(int i=0;i<=studentNames.length-1;i++)
		{
			studentNames[i]=sc.next();
		}
		
		System.out.println("data enter");
		System.out.println("==============for loop==========");
		
		for(int i=0; i<=studentNames.length-1;i++) {
			System.out.println(studentNames[i]);
		
		}
		System.out.println("==============for loop==========");

		for(int i=studentNames.length-1;i>=0;i--) {
			System.out.println(studentNames[i]);
			
		}
		System.out.println("==============for loop==========");
//		for(String data:studentNames)
//			System.out.println(data);
		
		
	}
	public static void main(String[] args) {
		new days38().meth1();
	}
}
