package quiz.test;

public class Quiz01 {

	public static void main(String[] args) {

		// 1. 1부터 100까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하세요

		int sum = 0;

		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				
			} else {
				System.out.printf("[%d] ", i);
				sum += i;
			}
		}
		System.out.println();
		System.out.printf("[합계 : %d]", sum);

	}

}
