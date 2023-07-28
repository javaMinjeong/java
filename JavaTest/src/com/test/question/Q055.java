package com.test.question;

public class Q055 {
	public static void main(String[] args) {
		
		/*
		  
		  Q55. 반복문 : 완전수
		  요구사항: 1부터 100사이의 완전수를 구하시오. 
		  조건
		  - 완전수 : 자기 자신을 제외한 나머지 약수들의 합이 자신과 동일한 수
		  - 약수  : 어떤 수나 식을 나누어 나머지가 없이 떨어지는 수
		  
		  출력
			 6 = [1, 2, 3,]
			28 = [1, 2, 4, 7, 14,]
		 */
		
		m1();
		
	}//main

	private static void m1() {
		
		int sum = 0;
		String text = "";
		
		for(int i = 1; i<=100; i++) {
			sum = 0;	//약수 개수
			text = "";
			
			for(int j=1; j<i; j++) {	//완전수 : 자기 자신을 제외한 나머지 약수들의 합이 자신과 동일한 수
				if(i%j==0){	//i기준 판단
					sum+=j;//1과 자기자신으로밖에 나눠지지 않는 수
					text+=j+",";
				}
			}
			if(sum==i) {	
				System.out.printf("%d = [%s]\n", i, text);
				
			}
				
		}
		
		
		
		

		

	
	}//m1
	

}//class
