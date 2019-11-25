package quiz.test;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {

		// 4. 숫자로 이루어진 문자열을 입력받아서 각 자리의 합을 더한 결과를 출력하는 코드를 작성하세요.
		// - 예) 문자열이 "12345"라면 1+2+3+4+5 결과인 15를 출력해야 합니다.

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 : ");
		try {
			int no;
			no = Integer.parseInt(sc.nextLine());
			System.out.println(answer(no));
		} catch (Exception e) {
			System.out.println("숫자가 아닙니다.");
		}
		sc.close();

	}
	
	public static int answer(int a) {
		int result = 0;
		while (a != 0) {
			result += (a % 10);
			a = a / 10;
		}
		return result;
	}

}
