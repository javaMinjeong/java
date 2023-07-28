package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q024 {
	public static void main(String[] args) {
	
		/*
		  
		  Q24. 날짜 시간: 배달 음식
		  
		  요구사항:여러 배달 음식을 같은 시간에 받기를 원하는 고객이 있다.
		  		고객이 각각의 매장에 몇시에 전화를 해야 모든 음식을 같은 시간에 받을 수 있는지 알려주시오
		  
		 */
		
		
		m1();
		
		
		
	}//main
	
	//코드리뷰 : 메소드를 따로 빼지 않고 작성한 경우도 있음.
	private static void m1() {
		
		Scanner scan = new Scanner(System.in);
		
		int time = 0;
		int minute = 0; 
	
		System.out.println("음식을 받기 원하는 시각");	
		System.out.print("시: ");
		time = scan.nextInt();
		System.out.print("분: ");
		minute = scan.nextInt();
		
		if(time>=23) {
			System.out.println("음식을 받기 원하는 시간은 오후 11시 이전에만 가능합니다.");
		}else {
			
			getOrderTime(time, minute, 10, "짜장면");
			getOrderTime(time, minute, 18, "치킨");
			getOrderTime(time, minute, 25, "피자");
			
		}
		
		 
	}//m1

	
	private static void getOrderTime(int time, int minute, int runTime, String food) {
		
		Calendar resultTime = Calendar.getInstance();
		
		resultTime.set(Calendar.HOUR_OF_DAY, time);
		resultTime.set(Calendar.MINUTE, minute-runTime);
		
		System.out.printf("%s: %d시 %d분\n", food
				,resultTime.get(Calendar.HOUR_OF_DAY)
				,resultTime.get(Calendar.MINUTE));
		
	}//getOrderTime
	
	
	
}//class
