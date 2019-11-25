package quiz.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;

public class Quiz07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		java.util.Date date; // 일반 날짜 클래스
//		java.sql.Date date2; // 데이터베이스와 연동하는데 사용하는 날짜 클래스
		java.util.Calendar calendar; // 일반 날짜 클래스

		ArrayList<Calendar> list = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			Calendar c = Calendar.getInstance();
			c.set(2019, 10, i);
			list.add(c);
		}

		for (Calendar c : list) {
			System.out.printf("%d년 %d월 %d일\n", c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1, c.get(Calendar.DATE));
		}

		System.out.println("---------------------------------------------------------");
		calendar = Calendar.getInstance(); // 현재 시간으로 Calendar 객체 만들기
		System.out.printf("%d년 %d월 %d일\n", calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1,
				calendar.get(Calendar.DATE));

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("calendar2.dat");
			oos = new ObjectOutputStream(fos);

			oos.writeObject(list);
			System.out.println("저장 성공");
		} catch (Exception e) {
			System.out.println("저장 실패");
		} finally {
			try {
				oos.close();
			} catch (Exception ex) {
			}
			try {
				fos.close();
			} catch (Exception ex) {
			}
		}

	}

}
