package com.test.question;

import java.util.Scanner;

public class Q040 {
	public static void main(String[] args) {
		
		/*
		 Q40.반복문: 숫자 합
		 요구사항: 아래와 같이 출력하시오.  
		  
		 */
		
		
		m1();
		
	}//main

	private static void m1() {
		
		int startNum = 0;
		int finishNum = 0;
		String result = "";
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("시작 숫자: ");
		startNum = scan.nextInt();
		System.out.print("종료 숫자: ");
		finishNum = scan.nextInt();
		
		for(int i=startNum; i<=finishNum; i++){
			
			String strPlusMinus = "";
			if(i % 2 == 1) {
				sum += i;
				if(i!=startNum) {
					strPlusMinus = "+";
				}
			}else { 
				sum -= i;
				strPlusMinus = "-";
				
			} 
			
			result += strPlusMinus + i;
			
		}//for
		
		result = result + "="+sum;
		System.out.printf(result) ;	
			
	}//m1
	
	
}//class
