package com.test.question;

import java.util.Scanner;

public class Q046 {
	public static void main(String[] args) {
		
		/*
		  
		  Q46. 반복문 : 한글 숫자
		  요구사항 : 숫자를 10개 입력받아 한글로 변환 후 출력하시오.
		  조건 : 1~9까지만 입력하시오.
		  
		 */
		
		m1();
	
	
	}//main
	
	public static String numToKoNum(int num) {
		
		String strReturn = "";
		
		if(num == 1) {
			strReturn = "일";
		}else if (num == 2) {
			strReturn = "이";
		}else if(num == 3) {
			strReturn = "삼";
		}else if(num == 4) {
			strReturn = "사";
		}else if(num == 5) {
			strReturn = "오";
		}else if(num == 6) {
			strReturn = "육";
		}else if(num == 7) {
			strReturn = "칠";
		}else if(num == 8) {
			strReturn = "팔";
		}else if(num == 9) {
			strReturn = "구";
		}
		
		
		return strReturn;
	}//numToKoNum
	
	
	private static void m1() {
		
		int num = 0;
		
		
		Scanner scan = new Scanner(System.in);
		
		String result = "";
		
		for(int i=1; i<=10; i++ ) {
			System.out.print("숫자: ");
			num = scan.nextInt();
			
			result += numToKoNum(num);
			
		}
		System.out.println(result);
	
	
	}//m1	
	
}//class
