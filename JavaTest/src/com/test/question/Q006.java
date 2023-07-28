package com.test.question;

import java.util.Scanner;

public class Q006 {

	public static void main(String[] args) {
		
	
	/*
	  
	  Q6. 연산자: 세금 계산
	  
	  요청사항: 사용자의 한달 수입을 입력받아 세후 금액을 출력하시오.
	  
	 */

	Scanner scan = new Scanner(System.in);
	
	System.out.print("한달 수입 금액(원): "); 		//안내메세지 출력
	
	int impor = scan.nextInt();
	
	int  tax= (int) (impor * 0.033) ;			//세금 변수 선언 및 형변환
	int afterTax = impor - tax; 				// 세후 금액 변수 선언
	
	System.out.printf("세후 금액(원): %,d \n", afterTax);	// 세후 금액 출력
	System.out.printf("세금(원): %,d \n", tax);			// 세금 출력
	

	
	
	}//main
	
	
	
}//class