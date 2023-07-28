package com.test.question;

import java.util.Scanner;

public class Q001 {

	public static void main(String[] args) {
		
		/*
		 Q1. 연산자 : 나이
		 
		 요구사항 : 태어난 년도를 입력받아 나이를 출력하시오. 
		  
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("태어난 년도: ");      //안내메세지 출력 
		
		int year = scan.nextInt();		     //태어난 년도 변수 선언
		
		int age = 2023 - year + 1 ;		    // 나이 변수 선언
		
		System.out.printf("나이: " + age ); // 결과값 출력
		
		
		
		
		
		
		
	}//main
	
	
	
	
}//class
