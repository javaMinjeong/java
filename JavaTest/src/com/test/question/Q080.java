package com.test.question;

import java.util.Scanner;

public class Q080 {
	public static void main(String[] args) {
		
		
		/*
		 Q80. 문자열 : 역순 출력 
		  요구사항: 문장을 입력받아 역순으로 출력하시오.
		  
		 */
	
	
	m1();
	
	}//main

	private static void m1() {
		
		String sen = "";	//문장 변수 선언
		String result = "";	// 결과 변수 선언
		
						
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문장 입력: ");
		sen = scan.nextLine();
		
		
		for(int i=sen.length()-1; i>=0; i-- ) {	// 역순 작성
			result += sen.charAt(i);	// 결과는 String 형을 char형으로 변환
			
		}
		
		System.out.print("역순 결과: "+ "\""+ result + "\"");
		
	}//m1
	
	
}//class
