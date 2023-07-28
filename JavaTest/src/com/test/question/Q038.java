package com.test.question;

import java.util.Scanner;

public class Q038 {
	public static void main(String[] args) {
		
		/*
		 Q38. 반복문 : 짝수 홀수 합 
		 요구사항:입력 횟수(N)와 숫자 N개를 입력받아 짝수의 합과 홀수의 합을 각각 출력하시오. 
		  
		 */
	
		m1();
		
	}//m1

	private static void m1() {
		
		int input = 0;
		int num = 0;
		int evenSum = 0;
		int oddSum = 0;
		int evenCount = 0;
		int oddCount = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력 횟수: ");
		input = scan.nextInt();
		
		for(int i=1; i<=input; i++ ) {
			System.out.print("숫자: ");
			num = scan.nextInt();
			
			if(num % 2 ==0) {
				
				evenCount += 1;
				evenSum += num;
				
			}else {
				
				oddCount += 1;
				oddSum += num;
		
			}	
			
		}//for

		
		
		System.out.printf("짝수 %d개의 합: %d\n", evenCount, evenSum );
		System.out.printf("홀수 %d개의 합: %d\n",  oddCount, oddSum );
	


	}//m1
	


}//class

	

