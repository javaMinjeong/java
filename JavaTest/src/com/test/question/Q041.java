package com.test.question;

public class Q041 {
	public static void main(String[] args) {
		
		/*
		  
		 Q41. 반복문: 숫자합 
		 요구사항: 아래와 같이 출력하시오
		  
		 */
	
		m1();
	
	}//main

	private static void m1() {
		
		int sum = 0;
		
		String result = "";
		
		for(int i=1; ;i++) {
			
			sum += i;
			result += i;

			
			if(sum > 1000) {
			
				break;
			
			}	
			
			if( sum < 1000) {
				
				result += "+";
			}
			
			
			
		}//for
		
		result = result + "="+sum;
		System.out.printf(result) ;
		
	}//m1
	
}
