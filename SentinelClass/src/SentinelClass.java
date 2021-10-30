import java.util.Scanner;

public class SentinelClass {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		int numValue = 0;
		String userResponse = "";
		int total = 0;
		double avg = 0.0;
		int countOfValues = 0;
		
		do {
			System.out.print("Eneter a numeric value (or -1 to Quit): ");
			numValue = Integer.parseInt(scnr.nextLine());
			
			if (numValue != -1) {
				// accumulates the sum
				total = total + numValue;
				countOfValues = countOfValues + 1;
			}
			
			
			
		} while ( numValue != -1);
		
		// casting as double to avoid integer division
		avg = (double)total / countOfValues;
		
		System.out.printf("The average of all values is %.1f \n", avg);
		
		scnr.close();
		
		
	}

}
