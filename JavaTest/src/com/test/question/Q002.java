package com.test.question;

import java.util.Scanner;

public class Q002 {

	public static void main(String[] args) {
		
		/*
		 
		 Q2. 연산자 : 연산식 
		  
		 요구사항: 숫자 2개를 입력받아 아래의 연산식을 출력하시오.
		  
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: "); 	// 안내메세지 출력
		int num1 = scan.nextInt();			// num1 변수 선언
		
		System.out.print("두번째 숫자: "); 	// 안내메세지 출력
		
		int num2 = scan.nextInt();			// num2 변수 선언
		
		System.out.printf("%,d + %,d = %,d\n", num1, num2, num1 + num2);			 //  num1 + num2
		System.out.printf("%,d - %,d = %,d\n", num1, num2, num1 - num2);             //  num1 - num2
		System.out.printf("%,d * %,d = %,d\n", num1, num2, num1 * num2);             //  num1 * num2
		System.out.printf("%d / %d = %.1f\n", num1, num2, ((double)num1 / num2));    //  num1 / num2  나눗셈을위한 double형 변환
		System.out.printf("%,d %% %,d = %,d\n", num1, num2, num1 % num2);            //  num1 % num2
		
		
	}//main
	
	
	
	
}//class
