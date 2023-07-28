package com.test.question;

import java.util.Scanner;

public class Q003 {

	
	public static void main(String[] args) {
	
		/*
		 Q3.연산자 : 사각형
		 
		 요구사항: 사각형의 너비와 높이를 입력받아 넓이와 둘레를 출력하시오.
		 
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("너비(cm): ");  //너비 메세지 출력
		int wide = scan.nextInt();		// 너비 변수 선언

		
		System.out.print("높이(cm): "); //둘레 메세지 출력
		int height = scan.nextInt();  // 둘레 변수 선언
		
		int wide2 = wide * height;			// 넓이 공식 변수 선언
		int circum = (wide*2) + (height*2); // 둘레 공식 변수 선언
		
		System.out.printf("사각형의 넓이는: " +"%d"+"cm2 입니다\n", wide2 ); // 넓이값 출력
		System.out.printf("사각형의 둘레는: " +"%d"+"cm2 입니다", circum );  // 둘레값 출력
		
		
		
	}//main
	
}//class
