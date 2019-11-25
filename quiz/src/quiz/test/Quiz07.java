package quiz.test;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;

public class Quiz07 {

	public static void main(String[] args) {

//		7-1. jdk api 문서를 사용해서 java.util.Calendar 클래스를 검토하고 다음 코드를 작성하세요
//		   - ArrayList 객체 만들기
//		   - 2019년 11월 1일부터 2019년 11월 10일까지 각 날짜별로 Calendar 객체를 만들고 ArrayList에 저장
//		   - ArrayList에 저장된 날짜를 반복문을 사용해서 출력
//
//		7-2. 8에서 만든 ArrayList를 calendar.dat 파일에 저장하는 코드를 작성하세요

		ArrayList<Calendar> calArr = new ArrayList<>();
		Calendar[] cal = new Calendar[10];

		for (int i = 0; i < 10; i++) {
			cal[i] = Calendar.getInstance();
			cal[i].set(2019, 11, i + 1);
			calArr.add(i, cal[i]);

			int year = calArr.get(i).get(Calendar.YEAR);
			int month = calArr.get(i).get(Calendar.MONTH);
			int day = calArr.get(i).get(Calendar.DATE);

			System.out.printf("[%d-%02d-%02d]\n", year, month, day); // 출력
		}

		try {
			ObjectOutputStream oos = new ObjectOutputStream(
					new BufferedOutputStream(new FileOutputStream("calendar.dat")));
			for (int i = 0; i < calArr.size(); i++) {
				oos.writeObject(calArr.get(i)); // 파일에 저장
			}
			oos.flush();
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
