package com.test.question;

public class Q016 {

	public static void main(String[] args) {
		
		/*
		  Q16. 메소드오버로딩 : 숫자 합
		  
		  요구사항: 인자로 받은 숫자들의 합을 구하는 메소드를 선언하시오.
		 
		 */
		
		int sum;
		
		sum(10);
		sum(10,20);
		sum(10,20,30);
		sum(10,20,30,40);
		sum(10,20,30,40,50);
		
		
	}//main
	
	
	/**
	 * 인자로 받은 숫자들의 합 구하기
	 * @param a 10 숫자 10
	 * @param b 20 숫자 20
	 * @param c 30 숫자 30
	 * @param d 40 숫자 40
	 * @param e 50 숫자 50
	 * 
	 */
	
	public static void sum(int a) {
		
		System.out.printf("%d = %d\n", a,a);
	}
	
	public static void sum(int a, int b) {
		
		System.out.printf("%d + %d = %d\n", a, b, a+b );
	}
	
	public static void sum(int a, int b, int c) {
		
		System.out.printf("%d + %d + %d = %d\n", a, b, c, a+b+c );
	}
	
	public static void sum(int a, int b, int c, int d) {
		
		System.out.printf("%d + %d + %d + %d = %d\n", a, b, c, d, a+b+c+d );
	}
	
	public static void sum(int a, int b, int c, int d, int e) {
		
		System.out.printf("%d + %d + %d + %d + %d = %d\n", a, b, c, d, e, a+b+c+d+e );
	}
	
	
	
	
}//class
