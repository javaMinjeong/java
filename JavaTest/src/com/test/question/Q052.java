package com.test.question;

import java.util.Scanner;

public class Q052 {
	public static void main(String[] args) {
		/*
		  
		  Q52. 반복문: 영문자
		  요구사항:아래와 같이 출력하시오.  
		  조건: 행의 개수를 받으시오.
		  행: 5 
		     	aa
			   abba
			  abccba
			 abcddbca
			abcdeedcba

		 */
	
		m1();
	}//main

	private static void m1() {
		int line = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("행: ");
		line = scan.nextInt();
		
		for(int i = 0; i<line; i++) {
			char alphabet = 'a';
			for( int j = 0; j<line; j++) {
				
				if(j>=line-(i+1)) {	//line 갯수로 봐서 i가 0부터 시작이므로 1을 더해 개수 변수를 맞춘다.
							
					System.out.print((char)alphabet++); //증가 
				}else {
					
					System.out.print(" ");
				}
			
			}
			for (int m = 0; m<line; m++) {
				if(i >= m) {						
					
					System.out.print((char)--alphabet); //역순 감소 앞에
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		}//m1
		
	
	
}//class
