package quiz.example;

public class Quiz05 {

	public static void main(String[] args) {
		
		int[][] ar = new int[5][5];
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = (int)(Math.random() * 100) + 1;
			}
		}
		
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				sum += ar[i][j];
			}
		}
		double mean = (double)sum / (ar.length * ar[0].length);
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("[%3d]", ar[i][j]);		
			}
			System.out.println();
		}
		
		System.out.printf("[TOTAL : %d][MEAN : %f]\n", sum, mean);
		
				
	}

}









