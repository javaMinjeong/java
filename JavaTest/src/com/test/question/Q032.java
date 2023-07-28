package com.test.question;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Q032 {
	public static void main(String[] args) {
		
		/*
		  Q32. 조건문: 주차요금
		  요구사항 : 주차 요금을 계산하시오.
		 
		 */
		
		
		m1();
		
	}//main

	/**
	 * 주차 요금을 계산하는 메소드
	 * Calendar 이용하여 주차시간을 분으로 환산한 뒤 초과시간에 대한 요금 구함
	 * 
	 */
	
	
	private static void m1() {
		int inTime = 0;
		int inMinute = 0;
		int outTime = 0;
		int outMinute = 0;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("[들어온 시간]\n");
		System.out.print("시: ");
		inTime = scan.nextInt();
		System.out.print("분: ");
		inMinute = scan.nextInt();
		long inputTick = getTick(inTime,inMinute);
		
		System.out.print("[나간 시간]\n");
		System.out.print("시: ");
		outTime = scan.nextInt();
		System.out.print("분: ");
		outMinute = scan.nextInt();
		long outputTick = getTick(outTime,outMinute);
		long parkTime = (outputTick - inputTick)/1000/60 ;
		
		long chargeTime =  parkTime - 30;
		
		if(chargeTime > 0 ) {
			
			System.out.printf("주차 요금은 %,d원입니다.\n", (chargeTime/10)*2000);
			
		} else {
			System.out.println("주차요금이 없습니다.");
		}
		

		
	}//m1
	

	private static long getTick(int time, int minute) {
		
		Calendar cal  = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, time);
		cal.set(Calendar.MINUTE, minute);
		cal.set(Calendar.SECOND, 0);
		
		return cal.getTimeInMillis();
	}
	
	
	
}//class
