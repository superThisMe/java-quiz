package quiz.example;

import lombok.Data;

public class Quiz06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std = new Student();
		std.setName("홍길동");
		std.setBan(5);
		std.setNo(12);
		std.setKor(97);
		std.setEng(94);
		std.setMath(89);
		
		Student std2 = new Student();
		std2.setName("홍길동");
		std2.setBan(5);
		std2.setNo(12);
		std2.setKor(97);
		std2.setEng(94);
		std2.setMath(89);
		
		System.out.println(std.equals(std2));

		System.out.println(std.toString());
		System.out.printf("[TOTAL : %d][MEAN : %d]\n", std.getTotal(), std.getMean());

	}

}
@Data // 변수에 대해서 자동으로 getter와 setter를 만들고, equals()와 toString(), hashCode()를 오버라이드
class Student {
	private String name;
	private int ban;
	private int no;
	private int kor; 
	private int eng;
	private int math;

	public String getName() {
		return name;
	}

	public int getTotal() {
		return kor + eng + math;
	}

	public int getMean() {
		return getTotal() / 3;
	}

//	@Override
//	public String toString() {
//		return String.format("[%d - %d][%s][%d][%d][%d]", ban, no, name, kor, eng, math);
//	}

}
