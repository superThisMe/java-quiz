package quiz.example;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			
			for (int j = 1; j <= i; j++) {
				sum += j;
			}
		}
		
		System.out.printf("RESULT : [%d]", sum);
		
	}

}
