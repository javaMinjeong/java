package com.test.question;

import java.util.Scanner;

public class Q043 {
	public static void main(String[] args) {
		
		/*
		  
		 Q43.숫자 게임
		 요구사항: 컴퓨터가 1~10 사이의 숫자 1개를 생각하면 사용자가 맞추는 프로그램을 구현하시오.
		 조건: 시도 횟수가 10회가 넘어가면 프로그램을 종료하시오. 
		 
		 */
	
	m1();
	
	}//main

	private static void m1() {
		
		int computerNum = 0;
		int inputNum = 0;
		int i = 1;
		
		computerNum = (int)(Math.random()*10)+1;
		System.out.print("컴퓨터가 1~10사이의 숫자를 1개 생각했습니다.");
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
	
		for(; i<=10; i++ ) {
			System.out.print("숫자: ");
			inputNum = scan.nextInt();	
			
			 if (computerNum == inputNum) {
				 System.out.println("맞았습니다.");
				 break;
			 }else {
				System.out.println("틀렸습니다.");
			 }
			 System.out.println();
			 
			 
		}	
		
		System.out.println();
		System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n",computerNum);
		
		
		if(computerNum == inputNum) {
			System.out.printf("정답을 맞추는데 시도한 횟수는 %d회 입니다.\n",i);
		}else {
			System.out.println("모든 기회를 실패했습니다.");
		}
		
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
		
			
			
		
		
	}//m1
	
}//class
