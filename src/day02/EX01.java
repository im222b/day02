package day02;

public class EX01 {
	public static void main(String[] args) {
		/*
		 변수 : 데이터를 저장하는 공간
		 자료형 : 데이퍼가 어떤 값인지에 따라 사용하는 값
		 - int  : 정수를 표현 : 4byte
		 bit > byte > Kb > Gb > Tb
		 float / double : 실수를 표현  : 4 / 8 byte   소숫점 6자리 / 소숫점 12자리
		 char : 문자표현 : 2byte - 문자 하나값 ( 가 ,ㄱ ,ㄷ)
		 boolean : true 또는 false 표현 - 1byte
		
		  변수 생성
		  자료형 변수명 , 또는 자료형 변수명 = 값
		  예시) 1number(x) 숫자가 먼저오면 안됨 -> n22u11m33(o) 
		       changnumber(x) => changNumber or chang_number
		       예약어는 사용 불가 
		*/
		int age = 50;
		float heght = 150.0f; 
		double weight = 20.0;
		System.out.println("나이는 50살 입니다");  // 하드코딩 = 좋지 못한코딩
		System.out.println("나이는" + age + "살 입니다.");
		System.out.println("키는" + heght + "cm 입니다.");
		System.out.println("몸무게는" + weight + "kg 입니다.");
	} 
}
