package java_study;

public class Chapter02 {

	public static void main(String[] args) {
		//챕터 2 연습문제 풀이
		
		//2-1 기본형
		boolean a;	// 1byte 논리형
		char	b;	// 2byte 문자형
		byte	c;	// 1byte 정수형
		short	d;	// 2byte 정수형
		int		e;	// 4byte 정수형
		long	f;	// 8byte 정수형
		float 	g;	// 4byte 실수형
		double	h;	// 8byte 실수형
		
		
		//2-2 주민등록번호를 숫자로 저장할 때, 자료형을 선택하고 regNo 이름의 변수로 코드 작성
		long regNo = 8609071111111L;
		
		
		//2-3 다음의 문장에서 리터럴, 변수, 상수, 키워드를 구분하시오
		int i = 100;
		long l = 100L;
		final float PI = 3.14f;
		
		//리터럴 - 100, 100L, 3.14f
		//변수 - i, l
		//상수 - PI
		//키워드 - int, long, final, float
		
		
		//2-4 다음 중 기본형이 아닌 것은? b
		//a. int  b. Byte  c.double  d.boolean
		
		
		//2-5 다음 문장의 출력결과를 확인하시오
		System.out.println("1"+"2");	//12
		System.out.println(true+"");	//true
		System.out.println('A'+'B');	//131
		System.out.println('1'+2);		//51
		System.out.println('1'+'2');	//99	
		System.out.println('J'+"ava");	//Java
		//System.out.println(true+null); //오류
		
		
		//2-6 다음 중 키워드가 아닌 것은? b,c,d,e
		//a. if   b.True   c.NULL   d.Class   e.System
		
		
		//2-7 다음 중 변수의 이름으로 사용할 수 있는 것은? a,d,e,g
		//a. $ystem   b. channel#5   c. 7eleven   d. lf
		//e. 자바             f. new         g. $MAX_NUM  h. hello@com 
		
		
		//2-8 참조형 변수와 같은 크기의 기본형은? a, d
		//a. int(4byte)   b. long(8byte)   c. short(2byte)
		//d. float(4byte) e. double(8byte)
		
		
		//2-9 다음 중 형변환을 생략할 수 있는 것은? d,e
		byte bb = 10;
		char ch = 'A';
		int ii = 100;
		long ll = 1000L;
		
		//a. b = (byte)ii;
		//b. ch = (char)bb;
		//c. short s = (short)ch;
		//d. float f = (float)ll;
		//e. i = (int)ch;
		
		
		//2-10 char타입의 변수에 저장될 수 있는 정수 값의 범위는?
		// 0 - 65535
		
		
		//2-11 다음 중 변수를 잘못 초기화 한 것은? a,b,c,d
		//a. byte b = 256;
		//b. char c = '';
		//c. char answer = 'no';
		//d. float f = 3.14;
		//e. double d = 1.4e3f;
		
		
		//2-12 다음 중 main메서드의 선언부로 알맞은 것은? a,b,c,e
		//a. public static void main(String[] args)
		//b. public static void main(String args[])
		//c. public static void main(String[] arv)
		//d. public void static main(String[] args)
		//e. static public void main(String[] args)
		
		
		//2-13 다음 중 타입과 기본값이 잘못 연결된 것은? c,e,f
		//a. boolean - false
		//b. char - 'Wu0000'
		//c. float - 0.0
		//d. int - 0
		//e. long - 0
		//f. String - ""
		
		
	}
}
