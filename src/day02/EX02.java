package day02;

public class EX02 {
	public static void main(String[] args) {
		int num = 123;
		char ch = 'a';
		System.out.println("변경전");
		System.out.println("num : "+ num );
		System.out.println("ch : "+ ch );
		System.out.println("변경후");
		num = 500; //이름이 같을경우 자료형 제거후
		ch = 'B';
		System.out.println("num : "+ num );
		System.out.println("ch : "+ ch );
		
		num = num + 200;
		System.out.println("num : "+ num );
		
		
	}
}
