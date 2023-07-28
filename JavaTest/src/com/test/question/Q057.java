package com.test.question;

public class Q057 {
	public static void main(String[] args) {
		
		/*
		 Q57. 반복문: 숫자합
		 요구사항: 아래와 같이 출력하시오. 
		 	1 ~  10:   55
			1 ~  20:  210
			1 ~  30:  465
			1 ~  40:  820
			1 ~  50: 1275
			1 ~  60: 1830
			1 ~  70: 2485
			1 ~  80: 3240
			1 ~  90: 4095
			1 ~ 100: 5050
		 */
	
		m1();
		
	}//main

	private static void m1() {
		
		
		for(int i = 1; i<=10; i++) {
			int sum=0;
			for(int j=1; j<=i*10; j++ ) {
				sum +=j;
			}
			
			System.out.printf("1 ~ %d : %d\n", i*10, sum);
			
		}//for
		
	}//m1
	
}//class
