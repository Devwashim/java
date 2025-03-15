package a;

public class day46encapsulation1 {

	
	private String stuname;
	private int sturollnumber;
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
		System.out.println("name assigned");

	}
	
	public int getSturollnumber() {
		return sturollnumber;
	}
	public void setSturollnumber(int sturollnumber) {
		
		this.sturollnumber = sturollnumber;
		System.out.println("roll number assigned");
	}
}
