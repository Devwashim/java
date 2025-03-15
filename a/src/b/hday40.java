package b;
import java.util.Random;
import java.util.Scanner;

class Game{
	
		
		public int number;
		public int inputnumber;

		public int go=0;
		

		public int getNumber() {
			return number;
		}


		public void setNumber(int number) {
			this.number = number;
		}


		
		
		public int getGo() {
			return go;
		}


		public void setGo(int go) {
			this.go = go;
		}

		
		
		
		 Game() {
			Random rand =new Random();
			this.number = rand.nextInt(100);
			
		}
		
		
		void takeUserInput() {
			
			System.out.println("guess the number");
			Scanner sc =new Scanner(System.in);
			inputnumber =sc.nextInt();
			
		}
		
		
		boolean isCorrectNumber(){
			
			go++;
			if (inputnumber==number) {
				System.out.format("yes you guessed it right , it was %d\n attempts ", number );
				return true;
				
			}
			else if (inputnumber<number) {
				System.out.println("to less no =========");
			}
			else if (inputnumber>number) {
				System.out.println("to high no =========");
			}
		return false;
	
	
}



}


public class hday40 {
	
	public static void main(String[] args) {
		
		Game g = new Game();
		boolean b=false;
		while(!b) {
		g.takeUserInput();
		 b=g.isCorrectNumber();
		System.out.println(b);
		}
	
	}

}
