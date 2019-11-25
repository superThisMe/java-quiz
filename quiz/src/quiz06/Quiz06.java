package quiz06;

public class Quiz06 {

	public static void main(String[] args) {
//		6-1. 다음과 같이 클래스를 만드세요
//		   - 이름 : Student
//		   - 변수 : String name, int ban, int no, int kor, int eng, int math
//		   - 메서드1 : getter, setter
//		   - 메서드2 : getTotal (kor, eng, math의 합을 반환), getMean (kor, eng, math의 평균 반환
//
//		6-2. 다음과 같이 6에서 만든 클래스를 사용하는 코드를 작성하세요
//		   - Student 인스턴스를 만들고 참조 변수에 주소 저장 (객체 만들기)
//		   - 각 변수에 "홍길동", 5반, 12번, 97점, 94점, 89점 저장
//		   - getTotal, getMean 함수를 호출해서 총점과 평균을 구하고 출력
		
		Student std = new Student();
		std.setName("홍길동");
		std.setBan(5);
		std.setNo(12);
		std.setKor(97);
		std.setEng(94);
		std.setMath(89);
		
		int total = 0;
		total = std.getTotal(std.getKor(), std.getEng(), std.getMath());
		double mean = 0.0;
		mean = std.getMean(total);
		System.out.printf("[총점 : %d]\n", total);
		System.out.printf("[총점 : %f]\n", mean);

	}

}
