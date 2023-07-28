package com.test.question;

public class Q018 {

	public static void main(String[] args) {
		
		/*
		  Q18. 메소드오버로딩 : 양수 개수
		  
		  요구사항: 인자로 받은 숫자들 중 양수의 갯수를 반환하는 메소드를 선언하시오.
		  
		 */
		
		int n1 = 10;
		int n2 = 20;
		int n3 = -30;
		int n4 = 40;
		int n5 = 50;
		
		int count = 0; 
		
		count = positive(10);
		System.out.printf("양수: %d개\n",count);
		count = positive(10, 20);
		System.out.printf("양수: %d개\n",count);
		count = positive(10, 20, -30);
		System.out.printf("양수: %d개\n",count);
		count = positive(10, 20, -30, 40);
		System.out.printf("양수: %d개\n",count);
		count = positive(10, 20, -30, 40, 50);
		System.out.printf("양수: %d개\n",count);
		
		
		
		
	}//main
	
	/**
	 * 인자로 받은 숫자들 중 양수의 갯수를 반환하는 메소드
	 * @param n1 10 숫자 10
	 * @param n2 20 숫자 20
	 * @param n3 -30 숫자 -30
	 * @param n4 40 숫자 40
	 * @param n5 50 숫자 50
	 * @return 양수의 개수를 확인하여 반환
	 */
	
	public static int positive(int n1) {
		
		int result = 0;
		int count = 0;
		
		count =  n1 > 0? 1:0;
		
		result =  count;
				
		return result;
		
	}
	
	
	public static int positive(int n1, int n2) {
		
		int result = 0;
		int count = 0;
	
		count =  n1 > 0? 1:0 ;
		result += count ;			// count를 더한 값 +=
		count =  n2 > 0? 1:0 ;
		result += count ;
		
		return result;
		
	}
	
	
	public static int positive(int n1, int n2, int n3) {
		
		int result = 0;
		int count = 0;
		
		count =  n1 > 0? 1:0 ;
		result += count ;
		count =  n2 > 0? 1:0 ;
		result += count ;
		count =  n3 > 0? 1:0 ;
		result += count ;
		
		return result;
		
	}
	
	public static int positive(int n1, int n2, int n3, int n4) {
	
		int result = 0;
		int count = 0;
		
		count =  n1 > 0? 1:0 ; 
		result += count ;			
		count =  n2 > 0? 1:0 ;
		result += count ;
		count =  n3 > 0? 1:0 ;
		result += count ;
		count =  n4 > 0? 1:0 ;
		result += count ;
		
		return result;
		
	}
	
	public static int positive(int n1, int n2, int n3, int n4, int n5) {
		
		int result = 0;
		int count = 0;
		
		count =  n1 > 0? 1:0 ;
		result += count ;
		count =  n2 > 0? 1:0 ;
		result += count ;
		count =  n3 > 0? 1:0 ;
		result += count ;
		count =  n4 > 0? 1:0 ;
		result += count ;
		count =  n5 > 0? 1:0 ;
		result += count ;
		
		return result;
		
	}
	
	
	
	
	
}//class
