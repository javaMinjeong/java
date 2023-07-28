package com.test.question;

import java.util.Scanner;

public class Q065 {
	public static void main(String[] args) {
		/*
		 Q65. 배열 : 최대 최소
		 요구사항
		  난수를 담고 있는 배열을 생성한 뒤 아래와 같이 출력하시오.
		 조건..
		  난수를 20개 발생 후 배열에 넣는다.
		  난수는 1 ~ 20 사이
		  배열을 탐색하여 범위에 만족하는 숫자만 출력한다.
		*/
		
		m1();
	}//main

	private static void m1() {
		
		int max = 0;
		int min = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("최대 범위: ");
		max = scan.nextInt();
		System.out.print("최소범위: ");
		min = scan.nextInt();
		
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
			
//			//최소, 최대값 구하기
//			for(int i =0; i<num1.length; i++) {
//				//최댓값 구하기
//				if(max<num1[i]) {		// 
//					max = num1[i];
//				}
//				
//				//최솟값 구하기
//				if(min>num1[i]) {
//					min = num1[i];
//				}
//			}
//			
			//출력하기
			System.out.print("원본: ");
			for(int i=0; i<num1.length; i++) {
				System.out.printf("%d,", num1[i]);
			}
				
			System.out.printf("\n결과: ");
				
			for(int i=0; i<num1.length; i++) {
				if(max >= num1[i] && min<= num1[i]) {
					
					System.out.printf("%d,", num1[i]);
				}
			}
				
			
	}//m1
	
	
	
}//class
