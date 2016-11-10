/* 
 * 이프로그램은 주석처리에 관한 설명을 위해서 작성된 것입니다.
 * 작성일자 2016/07/06
 */
//import java.lnag.*; 생략 가능한 package 입니다.
public class Round03_Ex01 { // 파일명과 클래스명은 같아야 합니다.
	public static void main(String[] ar ) { // mian method 형식은 지켜야 합니다.
		System.out.println("주석처리"); //println은 글자를 출력하는 method.
		int a=11; // int는 기본 2147483648
		System.out.println(a);
		boolean bool=true;
		System.out.println(bool);
		byte by=22;
		System.out.println(by);
		a++;
		System.out.println(a);
		a++;
		System.out.println(a);
		char ch = 66;
				System.out.println(ch);
		by=(byte)a;
		System.out.println(by);
		double dou=20.001;
		System.out.println(dou);
		float fl=20.34f;
		System.out.println(fl);
		
		long lo=123124214234234L;
		
		System.out.println(lo);
		byte b=127;
		System.out.println(b);
		b++;
		System.out.println(b);
		System.out.println(fl);
		System.out.println(Byte.MAX_VALUE);
		byte min=Byte.MIN_VALUE;
		System.out.println(min);
		
	} // main method의 마지막 블록
} //round03_01 클래스의 마지막 블록 
