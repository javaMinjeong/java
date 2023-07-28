package com.test.question;

import java.util.Scanner;

public class Q039 {
	public static void main(String[] args) {
		
		/*
		 Q39. 반복문 : 숫자 합
		 요구사항 : 아래와 같이 출력하시오 
		  
		 */
	
	
		m1();
	
	
	}//main

	private static void m1() {
		
		int startNum = 0;
		int finishNum = 0;
		int sum = 0;		
		String result = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("시작 숫자: ");
		startNum = scan.nextInt();
		System.out.print("종료 숫자: ");
		finishNum = scan.nextInt();
		
		
		for(int i=startNum; i<=finishNum; i++){
			
			sum += i;			
			result += i;

			if(i != finishNum) {
				
				result += "+";
			}
			
			
			
		}//for
		//System.out.printf(result + "="+sum);
		result = result + "="+sum;
		System.out.printf(result) ;
		
	}//m1
	
	
	
	
	
}//class
