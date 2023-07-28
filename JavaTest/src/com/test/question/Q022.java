package com.test.question;

import java.util.Calendar;

public class Q022 {
	
	public static void main(String[] args) {
		
		/*
		  Q22. 날짜시간 : 커플기념일
		  
		  요구사항: 남녀 커플의 이름과 만난날을 입력받아 기념일을 출력하시오.
		  
		 */

	
	m1();
	
	/**
	 * 남녀 커플의 이름과 만난날을 입력받아 기념일을 출력하는 메소드
	 * anniverSary 변수 선언
	 * Calendar.DATE 활용하여 작성
	 */
	
	
	
		
	}//main

	private static void m1() {
		// 기념일 입력
		
				
		System.out.printf("'%s'과(와) '%s'의 기념일\n", "하하하", "호호호" );
		
		Calendar anniverSary = Calendar.getInstance();
		
		anniverSary.set(2023,6,21);
		
		anniverSary.add(Calendar.DATE, 100);
		System.out.printf("100일차: %tF\n", anniverSary);
		
		anniverSary.add(Calendar.DATE, 200);
		System.out.printf("200일차: %tF\n", anniverSary);
		
		anniverSary.add(Calendar.DATE, 300);
		System.out.printf("300일차: %tF\n", anniverSary);
		
		anniverSary.add(Calendar.DATE, 500);
		System.out.printf("500일차: %tF\n", anniverSary);
		
		anniverSary.add(Calendar.DATE, 1000);
		System.out.printf("1000일차: %tF\n", anniverSary);
		
		
		
	}//m1
	
	
	
	
}//class
