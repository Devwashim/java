package a;

public class day59trycatchfinallyclassA {

	
	void meth1() {
		
		System.out.println(10);
		try {
			
			System.out.println("try block executed");
			System.out.println("-->"+20/0);
			
		}
		catch(Exception e) {
			
			System.out.println("catch block exectued");
			
//			System.out.println(e.getMessage());//reason of exception
//		System.out.println(e.toString());// name &reason of the exception
		e.printStackTrace();//prints complete information about the exception
		}
		
		finally {
			System.out.println("finally block executed");
		}
		
		System.out.println(30);
	}
	
	public static void main(String[] args) {
		
		new day59trycatchfinallyclassA().meth1();;
		
	}
}
