package com.test.question;

import java.util.Scanner;

public class Q004 {

	
	public static void main(String[] args) {
		
		/*
		 Q4. 연산자 : 온도 
		 
		 요구사항: 섭씨 온도를 입력받아서 화씨 온도로 변환하시오.
		  
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("섭씨(℃):  ");		     // 안내메세지 출력	
		                                          
		double tem1 = scan.nextDouble();         // tem1 변수 선언
		                                         
		double tem2 = tem1 * 1.8 + 32;           // tem2 변수 선언
		
		System.out.printf("섭씨(℃) " + "%.1f" + "℃는 " + "화씨 " + "%.1f"+ "℉" + "입니다 \n", tem1, tem2 ); // 결과값 출력
		
		
		
		
		
	}//main
	
}//class
