package com.test.question;

import java.util.Scanner;

public class Q081 {
	public static void main(String[] args) {
		/*
		 Q081. 문자열 : 이메일 
		  요구사항 : 이메일 주소를 입력받아 아이디와 도메인을 각각 추출하시오
		 */
	
		m1();
	}//main

	private static void m1() {
		
		String email = "";
		String id = "";
		String domain = "";
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("이메일: ");
		email = scan.nextLine();
		
		int index = email.lastIndexOf("@");	//@표시 제외
		id = email.substring(0,index);		// 아이디는 0부터 @전까지
		System.out.println("아이디: " + id);
		
		domain = email.substring(index+1);	//도메인은 @다음부터 끝까지
		System.out.println("도메인: "+ domain);
		
		
	}//m1
	
	
	
}//class
