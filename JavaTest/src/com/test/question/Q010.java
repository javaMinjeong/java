package com.test.question;

public class Q010 {
	public static void main(String[] args) {
		
		/*
		  Q10. 메소드 : 자릿수
		  
		  요구사항: 숫자 1개를 전달하면 4자리로 출력하는 메소드를 선언하시오.
		  
		 */
		
		digit(1);
		digit(12);
		digit(321);
		digit(5678);
		digit(98765);
		
		
	}//main
	
	
	
	public static void digit(int num) {
		
		String result = "";

		result =  num <= 10? "000"+ num    // 10미만 정수 대입시 출력값 
				: num <= 100? "00"+ num   // 100미만 정수 대입시 출력값	 
				: num <= 1000? "0"+ num  // 1000미만 정수 대입시 출력값 
				: ""+num ;				// 4자리 이상 출력값
			   
		System.out.printf("%s → %s\n", num, result );
	
	}
	
	
	
}//class
