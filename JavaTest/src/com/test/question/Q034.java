package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q034 {
	public static void main(String[] args) {
		
		/*
		 
		  Q34. 조건문 : 날짜 계산
		  요구사항: 날짜를 입력받아 아래의 조건에 맞게 결과를 출력하시오.
		  
		 */
	
		
		m1();
	
	
	}//main 

	private static void m1() {
		
		int year = 0;
		int month = 0;
		int day = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("년: ");
		year = scan.nextInt();
		System.out.print("월: ");
		month = scan.nextInt();
		System.out.print("일: ");
		day = scan.nextInt();
		
		Calendar inDay = Calendar.getInstance();
		
		inDay.set(Calendar.YEAR, year);
		inDay.set(Calendar.MONTH, month-1);
		inDay.set(Calendar.DAY_OF_MONTH, day);
		
		
		//System.out.print(inDay.get(Calendar.DAY_OF_WEEK));
		
		
		
		if(inDay.get(Calendar.DAY_OF_WEEK)==1||inDay.get(Calendar.DAY_OF_WEEK)==7){
			System.out.println("입력하신 날짜는 '휴일(토/일)' 입니다.");
			System.out.println("결과가 없습니다.");
			
		} else{
			System.out.println("입력하신 날짜는 '평일' 입니다.");
			System.out.print("해당 주의 토요일로 이동합니다.\n");
			
			int moveDay = 7 - inDay.get(Calendar.DAY_OF_WEEK);
			
			inDay.set(Calendar.DAY_OF_MONTH, day+moveDay);
			System.out.printf("이동한 날짜는 '%tF' 입니다. \n", inDay);
		}
		
		
		
	}//m1
	
	
	
}//class
