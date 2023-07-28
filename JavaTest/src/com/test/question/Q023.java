package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q023 {
	
	public static void main(String[] args) {
		
		
		/*
		  Q23. 날짜시간 : 아빠와 딸
		  
		  요구사항: 아빠와 딸의 생일을 입력받아 아빠가 딸보다 며칠을 더 살았는지 출력하시오.
		  
		 */
		
		
		m1();
		
		
		
	}//main
	
	/**
	 * 아빠와 딸의 생일을 입력받아 아빠가 딸보다 며칠을 더 살았는지 출력하는 메소드
	 * 아빠 생일(년,월,일) 변수 선언
	 * 딸 생일(년,원,일) 변수 선언
	 * tick 활용하여 두 tick 차를 구하여 결과값 출력
	 * 
	 */

	private static void m1() {
		// 아빠와 딸의 생일 입력

		Scanner scan = new Scanner(System.in);
		
		int fatherbirthYear = 0;
		int fatherbirthMonth = 0;
		int fatherbirthDay = 0;
		
		int daughterbirthYear = 0;
		int daughterbirthMonth = 0;
		int daughterbirthDay = 0;
		
		System.out.print("아빠 생일(년): ");
			fatherbirthYear = scan.nextInt();
		System.out.print("아빠 생일(월): ");
			fatherbirthMonth = scan.nextInt();
		System.out.print("아빠 생일(일): ");
			fatherbirthDay = scan.nextInt();
		System.out.print("딸 생일(년): ");
			daughterbirthYear = scan.nextInt();
		System.out.print("딸 생일(월): ");
			daughterbirthMonth = scan.nextInt();
		System.out.print("딸 생일(일): ");
			daughterbirthDay = scan.nextInt();
		
		Calendar fbirthday =  Calendar.getInstance();
		Calendar dbirthday =  Calendar.getInstance();
		
		fbirthday.set(fatherbirthYear, fatherbirthMonth-1, fatherbirthDay);
		dbirthday.set(daughterbirthYear, daughterbirthMonth-1, daughterbirthDay);
		
		
		long fbirthdayTick = fbirthday.getTimeInMillis();
		long dbirthdayTick = dbirthday.getTimeInMillis();
		
		System.out.printf("아빠는 딸보다 총 %,d일을 더 살았습니다.\n" 
				,( dbirthdayTick - fbirthdayTick)/ 1000/60/60/24);
		
		
	}//m1
	
	
	
	
}//class
