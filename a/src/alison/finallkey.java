package alison;

 class finallkey {

	
	final int speedlimit = 90;
	void run() {
		 speedlimit = 400;
	}
	
	
	public static void main(String[] args) {
		
		
		finallkey obj=new finallkey();
		obj.run();
	}
}
