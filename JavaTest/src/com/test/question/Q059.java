package com.test.question;

public class Q059 {
	public static void main(String[] args) {
		/*
		 Q58. 반복문: 숫자합
		 요구사항: 아래와 같이 출력하시오. 
		 조건 : 마지막 숫자가 100이 넘기 전까지 출력하시오.
		 1 + 2 + 4 + 7 + 11 + 16 + 22 + 29 + 37 + 46 + 56 + 67 + 79 + 92 +  = 469
		  +1 (1+1)(2+1)		
		 */
	
		
		m1();	
		
	}//main

		private static void m1() {
		
		int total = 0;
		int sum = 0;
			
		for(int i = 1; i<100; i++) {
			if(num(i)>100) {
				break;
			}else {
				System.out.print(num(i)+"+");
				total += sum;
				sum +=i;
			}
		} 
		System.out.print("="+total);
		
		
		}//m1
	
		private static int num(int n) {
			if(n==1) {
				return 1;
			
			}else {
				return num(n-1)+(n-1);
			}
		}
	
	
	
}//class
