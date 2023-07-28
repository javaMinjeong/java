package com.test.question;

public class Q011 {

	public static void main(String[] args) {
		
	
		/*
		  
		  Q11. 메소드 : 연산식
		  
		  요구사항: 숫자를 2개 입력받아 연산식을 반환하는 메소드를 선언하시오.
		  
		 */

		String result = "";
		
		int n1 = 5;
		int n2 = 3;	
		
	    result = add(n1, n2); 
		System.out.println(result);
		
		result = subtract(n1, n2);
		System.out.println(result);
		
		result = multiply(n1, n2);
		System.out.println(result);
		
		result = divide(n1, n2);
		System.out.println(result);
		
		result = mod(n1, n2);
		System.out.println(result);
		
		
	}//main	
		
	public static String add(int n1, int n2) {
				
		String result = String.format("%d + %d = %d", n1, n2, n1+n2);
		return result; 
		
	}
	
	public static String subtract(int n1, int n2) {
			
		String result = String.format("%d - %d = %d", n1, n2, n1-n2);
		return result;
		
		
	}
	
	public static String multiply(int n1, int n2) {
		
		String result = String.format("%d * %d = %d", n1, n2, n1*n2);
		return result;
		
		
	}
	
	
	public static String divide(int n1, int n2) {
		String result = String.format("%d / %d = %.1f", n1, n2, (double)n1/n2);
		return result; 
		
	}
	
	
	public static String mod(int n1, int n2) {
		String result = String.format("%d %% %d = %d", n1, n2, n1%n2);
		return result;
		
	}

//String.format: String형을 print f 형식으로 반환해주는 함수	
	
	
	
}//class
