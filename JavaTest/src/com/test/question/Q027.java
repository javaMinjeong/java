package com.test.question;

import java.util.Scanner;

public class Q027 {
	public static void main(String[] args) {
		/*
		  
		 Q27. 조건문 : 문자조건
		 요구사항: 문자 1개를 입력받아 아래와 같이 출력하시오.
		  
		 */
	
	
	m1();
	
	
	}//main
	
	/**
	 * 문자 1개를 입력받아 아래와 같이 출력하는 메소드. 
	 * (f,F),(m,M),(s,S),(b,B) 이외 문자는 예외처리
	 * 소문자 입력시 대문자로 바꿔주는 toUpperCase 이용하여 작성
	 * 
	 */
	

	private static void m1() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자: ");
		String lecture = scan.nextLine();
		
		if(lecture.toUpperCase().equals("F")) {
			System.out.println("Father");
		} else if (lecture.toUpperCase().equals("M")){
			System.out.println("Mother");
		} else if (lecture.toUpperCase().equals("S")){
			System.out.println("Sister");
		} else if (lecture.toUpperCase().equals("B")){
			System.out.println("Brother");
		} else 
			System.out.println("입력한 문자가 올바르지 않습니다.");
		
		
	}//m1
	
	
	
	
	
	
	
	
}//class
