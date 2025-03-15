package a;

public class day61clonemethodandfinalkeywordtest implements Cloneable {

	int empid;
	String empName;
	
	
	day61clonemethodandfinalkeywordtest(int empid,String empName){
		
		this.empid = empid;
		this.empName = empName;
		
	}
	
	public day61clonemethodandfinalkeywordtest meth1() throws CloneNotSupportedException 
	{
		
		return (day61clonemethodandfinalkeywordtest)super.clone();
	}
	
	public static void main(String[] args) throws CloneNotSupportedException  {
		
		day61clonemethodandfinalkeywordtest s1 = new day61clonemethodandfinalkeywordtest(101,"kishan");
		
		day61clonemethodandfinalkeywordtest s2=s1.meth1();
		day61clonemethodandfinalkeywordtest s3 =new day61clonemethodandfinalkeywordtest(102,"vijay");
		day61clonemethodandfinalkeywordtest s4=new day61clonemethodandfinalkeywordtest(103,"pankaj");
		
		day61clonemethodandfinalkeywordtest s5 =s4;
		
		System.out.println(s1.empid+" "+s1.empName);
		System.out.println(s2.empid+" "+s2.empName);
		System.out.println(s3.empid+" "+s3.empName);
		System.out.println(s4.empid+" "+s4.empName);
		
		
		System.out.println("      ");
		System.out.println("<------------hashcode>------------");
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		System.out.println(s2.hashCode());
	}
}
