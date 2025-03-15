package alison;

public class myStringBulder {
    
	
	
	public static void main(String[] args) {
		
		//inefficent method
		String name="";
		
		name += "my name is aman";
		
		name +=" ";
		name += " i am a programmer";
		
		System.out.println(name);
		
		
		//efficent method
		
		StringBuilder sb = new StringBuilder();
		sb.append("my name is aman ");
		sb.append("i am web developer");
		System.out.println(sb.toString());
	}
	
}
