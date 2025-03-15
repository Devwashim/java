package alison;

public class accessmodifiers {

	int  day =1;
	
	public int week = 7;
	protected int month =31;
	private int  year =365;
	
	public int printweek() {
		
		return  week +day + month +year;
		
	}
}
