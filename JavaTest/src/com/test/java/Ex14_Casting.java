package com.test.java;

public class Ex14_Casting {

	
	public static void main(String[] args) {
		
		//Ex14_Casting.java
		
		//정수형 리터럴은 int이다.
		//실수형 리터럴은 double이다.
		
		//byte = int
		//작은형(1) = 큰형(4)
		byte b1 = 10; //서비스 문법
		
		//short = int
		//작은형(2) = 큰형(4)
		short s1 = 10;
		
		//int = int
		int n1 = 10;
		
		//long = int
		//큰형(8) = 작은형(4)
		long l1 = (long)10;
		
		//float = double
		//작은형(4) = 큰형(8)
		//float f1 = (float)3.14F;
		float f1 = 3.14F;
		
		//double = double
		double f2 = 3.140;
		
		
	//-----------------------------------------------
		
		
		
		//정수 > 실수
		
		int n2 = 100;//원본(4byte)
		float n3;	//복사본(4byte)
		
		//형변환
		//float = int
		//4byte = 4byte
		//암시적 형변환 > 안전 (왼큰 오짝)
		n3 = n2;
		
		System.out.println(n3);
		
		
		int n4;			//복사본	
		float n5 = 100; //원본
		
		
		//형변환
		//int  = float
		//4byte = 4byte
		//명시적 형변환(왼짝 오큰)
		n4 = (int)n5;
	
		System.out.println(n4);
		
		
		//*** 정수와 실수간의 크기 비교는 단순하게 byte로 하는게 아니라
		//	  실제 표현 가능한 숫자의 범위로 비교해야 한다.
		
		//int(4) < float(4)
		//long(8) < float(4)
		
		//크기 정리
		//byte(1) < short(2) < int(4) < long(8) <<< float(4) < double(8)
		
		//char > 겉보기는 문자, 속으론 숫자 > 프로그램 입장 > 숫자 취급
		char m1; //2byte
		short m2; //2byte
		
		m1 = '가'; //44035 한글 넣으면 다 깨짐
		
		//형변환
		//short = char
		//2byte = 2byte
		m2 = (short)m1;
		
		System.out.println(m2);
		
		char m3;
		short m4;
		
		m4 = 65;
		
		//형변환 char 형변환은 오직 int로만 가능
		//char = short// 0~6만 = -32768~ 중복되는 범위 제외하고 위험해서 명시적으로 바뀜 절대 short 불가능
		//2byte = 2byte
		m3 = (char)m4;
		
		System.out.println(m3);
		
		
		int m5;
		char m6;
		
		m5 = 44032;
		
		System.out.println((char)m5);
		
		m6 = '가';
		System.out.println((int)m6);
		
		//**** 값형끼리 형변환
		//**** 값형과 참조형끼리는 형변환이 절대 불가능
		//**** boolean은 형변환 불가능(자바는 불가능)
		//정수>정수
		//실수>실수
		//정수>실수
		//실수>정수
		//문자>정수
		//정수>문자
		
		
		//값형 <- (형변환O) -> 값형
		//값형 <- (형변환X) -> 참조형
		
		String a1 = "100";
		int a2;
		
		//"100" > 100
		a2 = Integer.parseInt(a1); //별도의 수단을 통해 변환하는 행위 지원은 함/ 형변환(X)
		System.out.println(a2);
		
		//100 > "100"
		String a3;
		int a4;
		
		a4 = 100;
		
		// String.valueOf(값형 데이터)
		a3 = String.valueOf(a4); // 100 > "100"
		
		a3 = a4 + ""; // 100 + "" > "100" + "" > "100"
		
		
		
		
	}//main
}
