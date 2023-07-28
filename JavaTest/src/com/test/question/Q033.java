package com.test.question;

import java.util.Scanner;

public class Q033 {
	public static void main(String[] args) {
	
		/*
		 Q33. 조건문 : 윤년검사 
		 요구사항: 년도를 입력받아 해당 년도가 '평년' 인지 '윤년' 인지 출력하시오.
		 * 
		 */
	

		m1();
	
		
	}//main

	
	/**
	 * 년도를 입력받아 해당 년도가 '평년' 인지 '윤년' 인지 출력하는 메소드
	 * 조건
		a. 년도를 4로 나눈다.
		떨어지면 b 검사
		떨어지지 않으면 "평년"
		b. 년도를 100으로 나눈다.
		떨어지면 c 검사
		떨어지지 않으면 "윤년"
		c. 년도를 400으로 나눈다.
		떨어지면 "윤년"
		떨어지지 않으면 "평년"
	 * 해당 조건에 따라 if else문 사용
	 */
	
	private static void m1() {
		
		
		int year = 0;
		String result = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("년도 입력: ");
		year = scan.nextInt();
		
		if (year % 4 == 0) {
			
			if(year%100 ==0) {
				
				if(year%400 == 0) {
					result = "윤년";
					
				} else {
					result = "평년";
				}
			} else {
				result = "윤년";
			}
		} else {
			result = "평년";
		}
			
		System.out.printf("%s년은 '%s'입니다.\n", year, result);
			

		
		
	}//m1

	


}//class
