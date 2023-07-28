package com.test.question;

import java.util.Scanner;

public class Q036 {
	public static void main(String[] args) {
		/*
		  
		 Q36. 반복문: 숫자 범위
		 요구사항: 숫자 1개를 입력받아 1부터 입력한 숫자까지의 합을 출력하시오. 
		  
		 */
		
		
		m1();
		
	}//main

	private static void m1() {
		
		int startNum = 0;
		int finishNum = 0;
		int incre = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("시작 숫자: ");
		startNum = scan.nextInt();
		System.out.print("종료 숫자: ");
		finishNum = scan.nextInt();
		System.out.print("증감치: ");
		incre = scan.nextInt();
		
		for(int i = startNum; i<=finishNum ; i+=incre) {
			System.out.println(i);
		}
		
	}//m1
	
	
	
	
	
}//class
