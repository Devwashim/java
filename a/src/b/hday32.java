package b;





 class my{
	private int id ;
	private String name;
	
	
	public my(String Aname, int myid) {
		id =myid;
		name= Aname;
	}
	public my() {
		id =45;
		name="your";
	}
	public String getName() {return name;}
	
	public void setName(String n) {this.name=n;}
	public void setId(int i) {this.id=i;}
	public int getId() {return id;}
}


public class hday32 {
	
	public static void main(String[] args) {
		
		my get = new my("anhjsk",65);
//		my get = new my();
		System.out.println(get.getId());
		System.out.println(get.getName());
		
//		
//		System.out.println(my.setName());
	}
}