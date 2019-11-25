package quiz.example;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.printf("정수를 입력하세요 : ");
		String sNo = sc.nextLine();

		int sum = 0;

		// 1.
//		for (int i = 0; i < sNo.length(); i++) {
//			char c = sNo.charAt(i);
//			int no = Integer.parseInt(String.valueOf(c));
//			sum += no;
//		}

		// 2.
		int no = Integer.parseInt(sNo);
		for (int i = (int) Math.pow(10, sNo.length() - 1); i > 0; i /= 10) {
			sum += (no / i);
			no = no % i;
		}

		System.out.printf("RESULT : [%d]", sum);

		sc.close();

	}

}
