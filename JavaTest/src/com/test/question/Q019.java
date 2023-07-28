package com.test.question;

import java.util.Calendar;

public class Q019 {
	
	public static void main(String[] args) {
		
		/*
		  Q19. 날짜시간 : 현재시간
		  
		  요구사항: 현재 시간을 출력하는 메소드 선언하시오.
		  
		 */
		
		nowTime();
		
		
	}//main
	
	
	/**
	 * 현재 시간을 출력하는 메소드
	 * Calendar의 현재 시간 출력법 사용
	 * 
	 */
	
	private static void nowTime() {
			
		Calendar nowTime = Calendar.getInstance();
		
		System.out.printf("현재시간: %d시 %d분 %d초\n"
				,nowTime.get(Calendar.HOUR_OF_DAY)
				,nowTime.get(Calendar.MINUTE)
				,nowTime.get(Calendar.SECOND));
		
		
		System.out.printf("현재시간: %s %d시 %d분 %d초"
				,nowTime.get(Calendar.AM_PM) == 0? "오전": "오후"
				,nowTime.get(Calendar.HOUR_OF_DAY)
				,nowTime.get(Calendar.MINUTE)
				,nowTime.get(Calendar.SECOND));
				
	}







}//class