package com.test.question;

import java.util.Scanner;

public class Q056 {
	public static void main(String[] args) {
		
		/*
		  
		  Q56. 반복문 : 공약수
		  요구사항: 숫자를 2개 입력받아 각각의 약수와 두 숫자의 공약수를 구하시오.
		  조건: 공약수: 둘 이상의 정수에 공통된 약수
		  
		 */
		
		m1();
		
	}//main

	private static void m1() {
		
		int firstNum = 0;
		int secondNum = 0;
		String firstDivisor = "";
		String secondDivisor = "";
		String sameDivisor = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		firstNum = scan.nextInt();
		
		System.out.print("두번째 숫자: ");
		secondNum = scan.nextInt();
		
		
		
		for(int i = 1; i<=firstNum; i++) {
			if(firstNum % i == 0) {
				firstDivisor += i + ",";
			} 
		}
		for(int i = 1; i<=secondNum; i++) {
			if(secondNum % i == 0) {
				secondDivisor += i + ",";
			} 
		}	
			
		for (int i=1; i<=((firstNum < secondNum)? firstNum : secondNum); i++) {
			if(firstNum % i == 0 && secondNum % i == 0 ) {
				sameDivisor += i + ",";
			}
		}
		
		
		System.out.printf("%d의 약수: %s\n", firstNum, firstDivisor);
		System.out.printf("%d의 약수: %s\n", secondNum, secondDivisor);
		System.out.printf("%d의 공약수: %s\n", firstNum,secondNum, sameDivisor);
		
		
		
	}//m1
	
}//class
