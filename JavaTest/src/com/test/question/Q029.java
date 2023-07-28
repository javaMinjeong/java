package com.test.question;

import java.util.Scanner;

public class Q029 {
	public static void main(String[] args) {
		
		/*
		  
		  Q29.조건문 : 연산식
		  요구사항: 숫자 2개와 연산자 1개를 입력받아 연산 과정과 결과를 출력하시오.
		  조건: 정수만 입력하시오.(유효성 검사 필요없음)
		       나머지 연산 결과는 소수이하 첫째자리까지 출력 하시오.
		       연산자는 산술 연산자(+, -, *, /, %)만 입력하시오.
		  
		 */
		
		
		m1();
		
		
		
	}//main
	
	/**
	 * 숫자 2개와 연산자 1개를 입력받아 연산 과정과 결과를 출력하는 메소드
	 * 조건: 정수만 입력하시오.(유효성 검사 필요없음)
		    나머지 연산 결과는 소수이하 첫째자리까지 출력 하시오.
		    연산자는 산술 연산자(+, -, *, /, %)만 입력하시오.
	 * 숫자열 다음 문자열 입력 위해서 scan.nextLine(); 입력
	 * 첫째자리수까지 출력을 위한 %.1f 사용 위해 double 형변환
	 */

	private static void m1() {
		
		int num1 = 0;
		int num2 = 0;
		String operator = "";
		
		Scanner scan = new Scanner(System.in);
		//Scanner scanStr = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		num1 = scan.nextInt();
		
		System.out.print("두번째 숫자: ");
		num2 = scan.nextInt();
		scan.nextLine();
		
		System.out.print("연산자: ");
		operator = scan.nextLine();
			
		if(operator.equals("+")) {
			System.out.printf("%d + %d = %d", num1, num2, num1+num2);
		} else if(operator.equals("-")) {
			System.out.printf("%d - %d = %d", num1, num2, num1-num2);
		} else if(operator.equals("*")) {
			System.out.printf("%d * %d = %d", num1, num2, num1*num2);
		} else if(operator.equals("/")) {
			System.out.printf("%d / %d = %.1f", num1, num2, (double)num1/num2);
		} else if(operator.equals("%")) {
			System.out.printf("%d %% %d = %d", num1, num2, num1%num2);
		} else {
			System.out.printf("연산이 불가능합니다.");
		}	
		
	}//m1
	
	
}//class
