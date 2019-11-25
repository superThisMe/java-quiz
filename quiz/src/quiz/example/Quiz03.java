package quiz.example;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");
		String sNo = sc.nextLine();

		// 1. 예외처리를 조건분기의 요소로 사용해선 안 됨
//		try {
//			int no = Integer.parseInt(sNo);
//			System.out.printf("%d는 숫자입니다.\n", no);
//		} catch (Exception ex) {
//			System.out.printf("%s는 숫자가 아닙니다.\n", sNo);
//		}

		// 2. char c 가 '0' ~ '10' 의 연속된 숫자 사이에 있다는 걸 이용 
//		boolean valid = true;
//		for (int i = 0; i < sNo.length(); i++) { // String.length() : 문자열에 포함된 문자의 갯수
//			char c = sNo.charAt(i); // 문자열의 i번째 문자 가져오기
//			if (c < '0' || c > '9') {
//				valid = false;
//				break;
//			}
//		}
//		
//		if (valid) {
//			System.out.println("숫자입니다.");
//		} else {
//			System.out.println("숫자가 아닙니다.");
//		}
//		
//		sc.close();

		// 3. charAt() contains()를 이용
		boolean valid = true;
		for (int i = 0; i < sNo.length(); i++) { // String.length() : 문자열에 포함된 문자의 갯수
			boolean bl = "0123456789".contains(String.valueOf(sNo.charAt(i)));
			if (!bl) {
				valid = false;
				break;
			}
		}

		if (valid) {
			System.out.println("숫자입니다.");
		} else {
			System.out.println("숫자가 아닙니다.");
		}

		sc.close();

	}

}
