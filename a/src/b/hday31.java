package b;


class Myemployee{
	private int id;
	private String name;


public String getname() {
	
	return name;
}

public void  setname(String n) {
	
	this.name=n;
}


public void  getId(int i) {
	this.id=i;
}

public int getId() {
	return id ;
}
}

public class hday31 {
	
public static void main(String[] args) {
	
	Myemployee em = new Myemployee();
	
//	em.id=25;
//	em.name ="ankit";
//	System.out.println(em.name);
	em.setname("aman");
	em.getId(25);
	System.out.println(em.getname());
	System.out.println(em.getId());
	
}
}
