package com.test.question;

public class Q054 {
	public static void main(String[] args) {
		/*
		  
		 Q54 반복문 : 소수
		 요구사항: 2부터 100사이의 소수를 구하시오
		  소수: 1과 자기자신으로밖에 나눠지지 않는 수
		 */
	
		m1();
	
	}//main

	private static void m1() {
		
	
		
		for(int i = 2; i<=100; i++) {
			int sum = 0;	//약수 개수
			for(int j=1; j<=i; j++) {
				if(i%j==0){	//i기준 판단
					sum+=1;//1과 자기자신으로밖에 나눠지지 않는 수
				}
			}
			if(sum==2) {	//약수가 두개(소수)
				System.out.print(i+",");
				
			}
				
		}
		
	}//m1

	
}//class
