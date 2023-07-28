package com.test.question;

public class Q009 {

	public static void main(String[] args) {
		
		/*
		  
		  Q09. 메소드 : 고객명
		  
		  요청사항: 이름을 전달하면 이름뒤에 '님'을 붙여서 반환하는 메소드를 선언하시오.
		  
		 */
		
		
		String result = "";
		
		result = getName("홍길동");
		System.out.printf("고객: %s\n", result);
		
		result = getName("이무개");
		System.out.printf("고객: %s\n", result);
		
	
		
	}//main
	
	
	public static String getName(String name) {
		
		String result = "";
		result = name + "님";
		return  result;
	
	}
	
}//class
