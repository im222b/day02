package day02;

public class EX04 {
public static void main(String[] args) {
	/*
	 상수 : 한번 저장하면 변경할 수 없다
	 */
	final int num = 100;
	//num = 200;
	System.out.println( num );
	
	String name = "홍길동";
	System.out.println( name );
	
	final String KOREA = "대한민국";  //보편적으로 상수화 시킨 값은 대문자로 사용
	System.out.println( KOREA );
	
	boolean bool = true;
	System.out.println( bool );
	bool = false;
	System.out.println( bool );
		
	String addr;
	addr = "산골짜기";
	System.out.println( addr );
	
	int n1 , n2 , sum ;
	n1=10;
	n2=20;
	sum = n1 + n2;
	System.out.println( sum );
	System.out.println( n1+n2 );
	
	int num1 =0 , num2=0, sum2=0;  //소문자의 기본값은 0
	sum2 = num1 + num2;
	System.out.println( sum2 );
	
	String a = null;   //대문자의 기본값은 null
	System.out.println( a );
	
}
}
