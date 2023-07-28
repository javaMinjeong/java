package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q068 {
	public static void main(String[] args) {
		
		/*
		  Q68. 배열: 삭제
		  요구사항: 배열의 요소를 삭제하시오.
		  조건: 배열 길이: 10
			   마지막 요소는 0으로 채우시오.
		  입력..
			삭제 위치: 2 
			
			출력..
			원본: [5, 6, 1, 3, 2, 0, 0, 0, 0, 0]
			결과: [5, 6, 3, 2, 0, 0, 0, 0, 0, 0]
		 */
	
		m1();
		
	
	}//main

	private static void m1() {
			
			int[]numArr = {5,6,1,3,2,0,0,0,0,0};
			
			int delPos = 0;
			
			Scanner scan = new Scanner(System.in);
			System.out.print("삭제 위치: ");
			delPos =scan.nextInt();//2
			
			
			System.out.print("원본: "+ Arrays.toString(numArr));
			
			int temp = 0;
			for(int i=0; i<numArr.length; i++) {
				if(i>=delPos) { 
					if(i==numArr.length-1) {
						numArr[i] = 0;
					}else {
						numArr[i] = numArr[i+1];
					}
				}
			}
			
			System.out.print("\n결과: "+ Arrays.toString(numArr));
			
		}//m1
		
	
	
	
	
	
}//class
