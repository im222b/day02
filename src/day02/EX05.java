package day02;

import java.util.Scanner;

public class EX05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n; 
		double dou;
		String str;
		
		
		System.out.print("수 입력 : ");
		n = input.nextInt();   //정수를 입력받을때 쓰는 기능
		System.out.println("입력 수 :  "+n);
		
		System.out.println("실수 입력:");
		dou =input.nextDouble();  //실수를 입력 받을떄 사용
		System.out.println("입력 실수 :"+dou);
		
		System.out.println("문자열 입력 : ");
		str = input.next(); // 문자열 입력 사용
		System.out.println("입력 문자열 :"+str);
		
			
		
		
	}

}
