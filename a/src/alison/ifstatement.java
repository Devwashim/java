package alison;

public class ifstatement {

public static void main(String[]args) {
	
	
	int testscore=76;

	char grade;
	
	if(testscore >= 90) {
		grade = 'A';
		
	}else if (testscore >= 80) {
		grade = 'B';
	}
	else if (testscore >= 70) {
		grade = 'c';
	}
	else if (testscore >= 60) {
		grade = 'D';
	}
	else {
		grade ='F';
	}
	System.out.print("grade = "+grade);
}
}
