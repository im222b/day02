package day02;

import java.util.Scanner;

public class test01 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int n1,n2,n3; 
	String str;
	
	System.out.print("당신의 이름은 무엇입니까 ? ");
	str = input.next(); // 문자열 입력 사용
	System.out.print("국어 점수 입력 : ");
	n1 = input.nextInt();
	System.out.print("영어 점수 입력 : ");
	n2 = input.nextInt();
	System.out.print("수학 점수 입력 : ");
	n3 = input.nextInt();
	System.out.println("================");
	System.out.println("이름 :"+str);
	System.out.println("================");
	System.out.println(str+"님의"+"국어 점수는 "+n1);
	System.out.println(str+"님의"+"영어 점수는 "+n2);
	System.out.println(str+"님의"+"수학 점수는 "+n2);
	System.out.println("================");
	System.out.println("합계 : "+(n1+n2+n3));
	System.out.println("================");
	
}
}
