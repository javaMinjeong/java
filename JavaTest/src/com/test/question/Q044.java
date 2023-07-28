package com.test.question;

import java.util.Scanner;

public class Q044 {
	public static void main(String[] args) {
		
		/*
		 Q44. 반복문 : 숫자합
		 요구사항: 숫자를 N개 입력받아 아래와 같이 출력하시오. 
		 조건: 누적값이 100을 넘어가는 순간 루프를 종료하시오
		 	  짝수는 더하고 홀수는 빼시오
		 	  
		  
		 */
	
		m1();
		
		
		
	}//main

		private static void m1() {
		
		int input = 0;
		int num = 0;
		int sum = 0;
		String result = "";
		
		
		Scanner scan = new Scanner(System.in);
			
		for(int i=1; ; i++ ) {
			System.out.print("숫자: ");
			num = scan.nextInt();
			
			String strPlusMinus = "";
			
			
			if(num % 2 == 0) {
				sum += num;
				strPlusMinus = "+";
			}else { 
				sum -= num;
				strPlusMinus = "-";
			}
			
			result = result + strPlusMinus + num;

			if(sum > 100 ) {
				break;
			}
			
		}//for	
			
		result = result + "="+sum;
		System.out.printf(result) ; 
		
	}//m1
	
	
	
	
	
}//class
