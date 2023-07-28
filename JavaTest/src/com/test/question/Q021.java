package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q021 {
	
	public static void main(String[] args) {
		
	 	/*
		  Q21. 날짜시간 : 나이
		  
		  요구사항: 올해를 기준으로 나이를 계산하시오.
				  내년, 내후년에 실행해도 그때에 맞는 나이를 출력한다.
				  우리나라 나이로 출력하시오.
		  
		 */
		
		
		m1();
		
		
	}//main

	/**
	 * 태어난 년도를 입력하면 나이를 출력하는 메소드
	 * 태어난 년도: birthYear 변수 선언
	 * 나이: age 변수 선언
	 * 
	 */
	
	
	private static void m1() {
		// 태어난 년도, 나이 출력
		
		int birthYear = 0;
		int age = 0;
		
		
		Calendar now = Calendar.getInstance();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("태어난 년도: ");
		
		birthYear = scan.nextInt();
		
		age = now.get(Calendar.YEAR) - birthYear +1;
		
		System.out.printf("나이: %d세 \n", age);
		
		
	
	}//m1
	
	
	
	
	
	
}//class
