package com.test.question;

import java.util.Calendar;

public class Q020 {
	public static void main(String[] args) {
		
		/*
		  Q20. 날짜시간 : 백일 첫돌
		  
		  요구사항: 오늘 태어난 아이의 백일과 첫돌을 출력하시오.
		  
		 */
	
		m1();
		m2();
		
	
	}//main
	
	/**
	 * 오늘 태어난 아이의 백일과 첫돌을 출력하는 메소드 작성
	 * 백일: baekdays 변수 선언
	 * 첫돌: birthday 변수 선언
	 * 
	 */
	

	private static void m1() {
		// 백일 출력하기
		
		Calendar baekdays = Calendar.getInstance();
				
		baekdays.set(2023, 7, 21);
		
		baekdays.add(Calendar.DATE, 100);
		
		System.out.printf("백일 : %tF\n", baekdays);
		
	}//m1

	private static void m2() {
		// 첫돌 출력하기
		
		Calendar birthday = Calendar.getInstance();
		
		birthday.set(2023, 7, 21);
		
		birthday.add(Calendar.YEAR, 1);
		
		System.out.printf("돌잔치: %tF\n",birthday);
		
		
	}//m2
	
	
	
	
	
}//class
