package quiz.test;

public class Quiz05 {

	public static void main(String[] args) {

		// 5. 5행 5열의 정수형 2차원 배열을 만들고 1 ~ 100 사이의 난수를 저장한 후, 저장된 정수의 합과 평균을 출력하는 프로그램을
		// 작성하세요

		int[][] sqrArr = new int[5][5];
		int sum = 0;
		int mean = 0;

		for (int i = 0; i < sqrArr.length; i++) {
			for (int j = 0; j < sqrArr.length; j++) {
				sqrArr[i][j] = (int) (Math.random() * 99 + 1);
				sum += sqrArr[i][j];
			}
		}
		mean = sum / (sqrArr.length * sqrArr.length);
		System.out.printf("[합 : %d]\n", sum);
		System.out.printf("[평균 : %d]", mean);

	}

}
