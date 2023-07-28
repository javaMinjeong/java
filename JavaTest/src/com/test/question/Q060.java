package com.test.question;

public class Q060 {
	public static void main(String[] args) {
		
		/*
		  
		 Q58. 반복문: 숫자합
		 요구사항: 아래와 같이 출력하시오. 
		 조건 : 마지막 숫자가 100이 넘기 전까지 출력하시오.
		 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 34 + 55 + 89 +  = 232
		 
		 */
	
		m1();
	}//main

	private static void m1() {
		int sum = 1;
		int a = 0;
		int b = 1;
		int temp = 0;
		String txt = "1+ ";
		
		while (true) {
			temp = a + b;
			if(temp > 100) {
				break;
			}
			
			sum+= temp;
			txt += temp + " + ";
			
			a = b;
			b = temp;
		}
		
		System.out.printf("%s = %d\n", txt, sum);
	}
	
	
}//class
