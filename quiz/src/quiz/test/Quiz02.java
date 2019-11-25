package quiz.test;

public class Quiz02 {

	public static void main(String[] args) {

		// 2. 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) 의 결과를 계산하세요
		int[] arr = new int[10 + 1];
		triangular(arr);

	}

	static void triangular(int[] arr) {
		arr[0] = 0;
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			arr[i] = i * (i + 1) / 2;
			System.out.printf("[%d] ", arr[i]);
		}
		for (int i = 1; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println();
		System.out.printf("[정답 : %d]", sum);
	}

}
