package com.test.question;

import java.util.Scanner;


public class Q049 {
	public static void main(String[] args) {
		
		/*
		 Q49. 반복문 : 별찍기
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
			for(int j = 0; j<line; j++) {
				if(i<=j) {
					System.out.print("*");
					
				}else {
					System.out.print(" ");
					
				}
			}
			System.out.println();
		}
		
		
		
	
	}//m1
	

	
}//class
