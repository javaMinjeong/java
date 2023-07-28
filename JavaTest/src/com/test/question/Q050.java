package com.test.question;

import java.util.Scanner;

public class Q050 {
	public static void main(String[] args) {
		
		/*
		 Q50. 반복문 : 별찍기
		 요구사항: 아래와 같이 출력하시오 
		  
		 */
	
	m1();
	
	}//main

	private static void m1() {
		
		int line = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("행: ");
		line = scan.nextInt();
		
		for(int i = 0; i<line; i++) {
			for( int j = 0; j<line; j++) {
				if(j>=line-(i+1)) {	//line 갯수로 봐서 i가 0부터 시작이므로 1을 더해 개수 변수를 맞춘다.
					System.out.print("*");
					
				}else {
					
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		}//m1
		
		
		

	
}//class
