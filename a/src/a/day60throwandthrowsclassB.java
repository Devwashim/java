package a;

@SuppressWarnings("serial")
public class day60throwandthrowsclassB extends Exception 
{

	
	String message;
	 public day60throwandthrowsclassB(String message) 
	 {
		 this.message = message;
		 
	 }
	 public String toString() {
		 return message;
	 }
	 
	
}
