package quiz.test;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {

		// 3. 문자열을 입력받아서 숫자인지 확인하는 프로그램을 작성하세요
		// - 예) "1347" -> 숫자입니다. "12p1" -> 숫자가 아닙니다.

		Scanner sc = new Scanner(System.in);
		boolean bl = true;
		while (bl) {
			System.out.print("문자열을 입력하세요(종료는 q) : ");
			String str = sc.nextLine();
			if (str.equalsIgnoreCase("q")) {
				break;
			}
			try {
				Integer.parseInt(str);
				System.out.println("숫자입니다.");
			} catch (NumberFormatException e) {
				System.out.println("숫자가 아닙니다.");
			}
		}
		sc.close();

	}

}
