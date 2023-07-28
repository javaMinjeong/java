package com.test.question;

public class Q008 {
	public static void main(String[] args) {
		/*
		  
		  Q08. 메소드 : 인삿말
		  
		  요청사항: 인삿말을 출력하는 메소드 3개를 선언하시오.
		  
		 */
		
		hello();        // hello 호출
		introduce();    // introduce 호출
		bye();          // bye 호출
		
	}//main
	
	
	// 메소드 hello 선언
	public static void hello() {		
	
		System.out.println("안녕하세요.");  //	 출력		
	
	}
	
	
	// 메소드 introduce 선언
	public static void introduce() {
	
		System.out.println("저는 홍길동입니다."); // 출력	
	
	}
	
	
	// 메소드 bye 선언
	public static void bye() {
		
		System.out.println("안녕히가세요.");  // 출력	
	
	}
	
 
}//class