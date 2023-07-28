package com.test.question;

import java.util.Scanner;

public class Q030 {
	public static void main(String[] args) {
		
		
		/*
		 Q30. 조건문 : 대소문자 변환
		 요구사항: 영문자 1개를 입력받아 대/소문자 변환을 한 뒤 출력하시오. 
		  
		 */
	
		m1();
		
	}//main

	/**
	 * 영문자 1개를 입력받아 대/소문자 변환을 한 뒤 출력하는 메소드
	 * 유효성 검사: 영문자가 아닌경우, 문자 입력할 경우 return 값 생성
	 * toUpperCase: 소문자 -> 대문자 변환
	 * toLowerCase: 대문자 -> 소문자 변환 사용
	 */
	
	private static void m1() {
	 
	Scanner scan = new Scanner(System.in);
	
	String txt = "";
	
	System.out.print("문자: ");
	txt = scan.nextLine();
	
	if(txt.length() > 1) {
		System.out.println("영문자 단어 1개만 입력하시오.");
		return ;
	}
	
	if(!( (txt.charAt(0) >= 'a' && txt.charAt(0)<= 'z') || txt.charAt(0) >= 'A' && txt.charAt(0)<= 'Z' )) {
		System.out.println("영문자만 입력하시오.");
		return ;
	}
	
	if(txt.charAt(0) >= 'a' && txt.charAt(0)<= 'z') {
		System.out.printf("'%s'의 대문자는 '%s'입니다.\n", txt, txt.toUpperCase());
	} 
	else {
		System.out.printf("'%s'의 소문자는 '%s'입니다.\n", txt, txt.toLowerCase());
	}
	
	
	}//m1
	
	
	
	

}//class
