package com.test.question;

import java.util.Scanner;

public class Q048 {
	public static void main(String[] args) {
		
		/*
		 Q48.반복문 : 숫자 합 
		 요구사항: 최대 9자리 정수를 입력받아 각자리의 홀수 숫자합과 짝수 숫자합을 구하시오. 
		  
		 */
	
		
		m1();
	
	}//main

	private static void m1() {
		
		int num = 0;
		int evenSum = 0;
		int oddSum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		num = scan.nextInt();
		
		for(;;) {
			
			int checkSum = num%10;
			if(checkSum %2==0) {
				evenSum += checkSum;
			} else {
				oddSum += checkSum;
			}
			num = num/10;
			
			if(num==0) {
				break;
			}
		}
		System.out.printf("짝수의 합: %d\n", evenSum);
		System.out.printf("홀수의 합: %d", oddSum);
	}
	
	
}//class
