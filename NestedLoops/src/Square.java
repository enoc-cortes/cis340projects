
public class Square {

	public static void main(String[] args) {

		// 5x5 square
		
		// outer loop for generating 5 lines
		for (int i = 0; i < 5; i++) {
			// inner loop for the star symbols 
			for (int j = 0; j < 5; j++) {
				System.out.print("* ");
			} // end of inner loop
			
			System.out.println();
			
		}
	}

}
