package com.test.question;

public class Q053 {
	public static void main(String[] args) {
		
		/*
		  
		  Q53. 반복문 : 구구단
		  요구사항: 아래와 같이 출력하시오.
		  조건: 구구단을 출력하시오.
		  
		 */
	
	 m1();

		
	 
	}//main


	private static void m1() {
		int baseNum = 2;
		
		for(int j=1; j<=9; j++) {
			for(int p=baseNum; p<=5; p++) {
				System.out.printf("%d X %d = %2d\t",p,j,p*j);
			}
			System.out.println();
		}
		System.out.println();
		for(int m=1; m<=9; m++) {
			for(int q=baseNum+4; q<=9; q++) {
				System.out.printf("%d X %d = %2d\t",q,m,q*m);
			}
			
			System.out.println();
			
		}
	
		
	}//m1
	
	
	
	
}//class
