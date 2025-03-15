package alison2;

public class polyAnimals {
	
	
	public static void main(String[]args) {
		
		
		Insect allinsects[] = new Insect[4];
		
		
		
		allinsects[0] = new Roch();
		allinsects[1] = new Beatle();
		allinsects[2] = new spider();
		allinsects[3] = new ant();
		
		for(int i=0; i<allinsects.length; i++) {
			
			allinsects[i].eat();
		}

}
}