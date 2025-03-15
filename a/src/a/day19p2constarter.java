package a;

public class day19p2constarter {
	
	
	int studentrollno;
	String studentName;
	
	day19p2constarter(int number,String name){
		
		studentrollno=number;
		studentName=name;
	}
	
	public static void main(String[] args) {
		
		day19p2constarter obj=new day19p2constarter(100, "kishan");
		day19p2constarter obj2=new day19p2constarter(200, "vijay");
		System.out.println(obj.studentrollno+"<====>" +obj.studentName);
		System.out.println(obj2.studentrollno+"<====>" +obj2.studentName);
		
		
		
	}

}

/*for every instance is separate copy of instance variable 
 * will be maintained so hoe many objects you have created 
 * in your class those many copies of instance variable are available
 
 *
 */
