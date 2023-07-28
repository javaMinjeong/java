package com.test.question;

import java.util.Scanner;

public class Q007 {

	
		public static void main(String[] args) {
			
			/*
			  
			  Q7. 연산자: 대소문자 변환
			  
			  요청사항: 영문 소문자를 1글자 입력받은 후 대문자로 변환해서 출력하시오.
			  
			 */

			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("문자 입력: ");			// 안내 메세지 출력
			
			int min = scan.next().charAt(0);		// min 변수 선언(char형은 int로 받을 수 있으므로 int형 선언)	
			char max = (char)(min - 32) ;			// max 변수 선언(대문자 출력을 위한 char형으로 변경) 
			System.out.printf("소문자 " + "'%c'"+ "의 대문자는 " + "'%c'" + "입니다.\n", min, max); // 결과값 출력
			
		
		}//main
		
}//class
