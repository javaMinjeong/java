package com.test.question;

public class Q064 {
	public static void main(String[] args) {
		
		/*
		  
		 Q64. 배열: 최대 최소
		 요구사항: 1~20 사이의 난수를 담고 있는 배열을 생성하고 최댓값과 최솟값을 출력하시오.
		 조건..
			난수를 20개 발생 후 배열에 넣는다.
			난수는 1 ~ 20 사이
		  
		 */
		
	
	
	m1();
	
	}//main

	private static void m1() {
		
		int num = 0;
		int max = 0;
		int min = 20;
		
		int[]num1 = new int[20];
		
		//1~20 사이의 난수 담기
		for(int i=0; i<num1.length ; i++) {
			num1[i] = (int)(Math.random()*20)+1 ; 
			
			//중복체크
			for(int j=0; j<i; j++) {			//중복안되게 하기
				if(num1[i] == num1[j]) {
					i=j;				// 다시 랜덤 돌리기
					break;
				}
			}
		}//for
		
		//최소, 최대값 구하기
		for(int i =0; i<num1.length; i++) {
			//최댓값 구하기
			if(max<num1[i]) {		// 
				max = num1[i];
			}
			
			//최솟값 구하기
			if(min>num1[i]) {
				min = num1[i];
			}
		}
		
		//출력하기
		System.out.print("원본: ");
		for(int i=0; i<num1.length; i++) {
			System.out.printf("%d,", num1[i]);
		}
			
			System.out.printf("\n최댓값: %d\n", max);
			System.out.printf("최솟값: %d\n", min);
			
		
	}//m1
	
	
	
	
}//class
