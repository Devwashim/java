package alison2;

public class encapsulation {

	private int ssn;
	private String empName;
	private int empage;
	
//get and set method in encapsulation
	
	public  int getEmpSSn() {
		return ssn;
	}
	public String  getempName() {
		return empName;
	}

	public  int getempage() {
		return empage;
	}
	
	//set
	
	public void setempage(int newValue) {
		
		empage =newValue;
	}
	public void setempName(String  newValue) {
		
		empName =newValue;
	}
	public void setempssn(int  newValue) {
		
		ssn =newValue;
	}
	
public static void main(String[] args) {
	
	encapsulation obj = new encapsulation();
	obj.setempName("john");
	obj.setempage(45);
	obj.setempssn(2);
	
	System.out.println("emp Name "+obj.getempName());
	System.out.println("emp Age "+obj.getempage());
	System.out.println("emp snn "+obj.getEmpSSn());
}
}
