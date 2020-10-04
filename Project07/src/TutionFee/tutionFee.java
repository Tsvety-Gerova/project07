package TutionFee;
	
import java.util.Scanner;

	public class tutionFee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double tution = 10_000;
		double sum = 0;
		for (int i = 0; i < 10; i++) {
					tution *= (double) 106/100;
				System.out.println("The tution in " + (i+1) + " years " + " will be " + tution);
				
			for (int j = 0; j < 4; j++) {
				tution *= 106/100;
				sum += tution;
				
			} 
			}System.out.println("In ten years the tution for 4 years will be " + sum);
			
		}
	}


