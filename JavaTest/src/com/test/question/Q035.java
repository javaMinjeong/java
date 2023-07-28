package com.test.question;

import java.util.Scanner;

public class Q035 {
	
	public static void main(String[] args) {
		
		/*
		 Q35. 반복문 : 반복인사
		 요구사항: 사용자의 이름과 인사할 횟수를 입력 받아 출력하시오 
		  
		 */
		
		
		m1();
		
		
	}//m1

	private static void m1() {
		
		String name = "";
		int number = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름: ");
		name = scan.nextLine();
		System.out.print("횟수: ");
		number = scan.nextInt();
		
		for(int i=0; i<number ; i++) {
			
			System.out.printf("%s님 안녕하세요~\n", name);
			
		}
		
		
	}

	
	
	
	
}//class
