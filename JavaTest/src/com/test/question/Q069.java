package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q069 {
	public static void main(String[] args) {
		
		/*
		  
		 Q69. 배열: 요소더하기 
		 요구사항: 배열의 요소를 순차적으로 2개씩 더한 결과를 배열로 생성한 뒤 출력하시오.
		 조건
			원본 배열 길이: 사용자 입력
			원본 배열 요소: 난수(1~9)
			결과 배열 길이: 사용자 입력 / 2 
			
			 배열 길이: 10 
			 출력..
			 원본: [ 1, 5, 3, 6, 2, 7, 8, 2, 2, 9 ]
			 결과: [ 6, 9, 9, 10, 11 ]
		  
		 */
		m1();
		
	}//main

	private static void m1() {
		
		int meter= 0;
		int number = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("배열 길이: ");
		
		meter = scan.nextInt();
		
		int[]sum = new int[meter];
		
		for(int i=0; i<meter; i++) {
			sum[i] = (int)(Math.random() * 10); 
		}
		System.out.println("원본: "+ Arrays.toString(sum));
		
		int[]result = new int [(sum.length / 2) +(sum.length % 2)];	// 원본값의 절반을 받아야해서 중간값 설정
			
			int resultIdx = 0;
			
			for(int i=0; i<sum.length; i++) {
				if(i+1==sum.length) {
					result[resultIdx++] = sum[i];
				}else {
					result[resultIdx++] = sum[i]+sum[i+1];
					i++;
				}
		}	
			System.out.println("결과: " + Arrays.toString(result) );
		
		
	}
	
}//class
