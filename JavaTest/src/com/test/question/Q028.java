package com.test.question;

import java.util.Scanner;

public class Q028 {
	public static void main(String[] args) {
		
		/*
		  
		 Q28. 조건문 : 개발자 경력
		 요구사항: 근무 년수를 입력받아 아래와 같이 출력하시오.
		 
		  
		 */
	
		m1();
		
		
		
		}//main
	
	
	/**
	 * 근무 년수를 입력받아 아래와 같이 출력하는 메소드
	 * 조건: 1 ~ 4년차: 초급 개발자
			5 ~ 9년차: 중급 개발자
		    10년차 이상: 고급 개발자
		    유효성 검사를 하시오.(1 미만 입력 예외 처리)  
	 * 유효성 검사를 위한 if문 생성
	 * 
	 */

	private static void m1() {
		
		Scanner scan = new Scanner(System.in);
		
		int workYear = 0;
		
		System.out.print("근무 년수: ");
		workYear = scan.nextInt();
		
		if(workYear >=1) {
			
		if(workYear <= 4 ) {
			System.out.printf("%d년차 초급 개발자입니다.\n"
							+ "앞으로 %d년 더 근무를 하면 중급 개발자가 됩니다.", workYear, 5 - workYear);
			
			
		}else if (workYear <= 9 ) {
			System.out.printf("%d년차 중급 개발자입니다.\n"
						+ "당신은 %d년전까지 초급 개발자였습니다.\n"
						+"앞으로 %d년 더 근무를 하면 고급 개발자가 됩니다.", workYear, workYear-4 ,10 - workYear);
			
		}else {
			System.out.printf("%d년차 고급 개발자입니다.\n"
							+ "당신은 %d년전까지 중급 개발자였습니다.\n", workYear, workYear-9);
		  }
		
		}else {
			System.out.println("입력한 값이 올바르지 않습니다. 1이상의 값을 입력하시오.");
		 }
		
		
		
	}//m1
	
	
	
	
	
}//class
