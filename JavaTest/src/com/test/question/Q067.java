package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q067 {
	public static void main(String[] args) {
		
		/*
		  
		 Q67. 배열: 삽입
		 요구사항:배열에 요소를 삽입하시오. 
		 조건..
		  배열 길이: 10
		  마지막 요소는 우측으로 옮겨질 공간이 없으면 삭제된다.
		  입력..
			삽입 위치: 2 
			
			값: 100 
			
			출력..
			원본: [5, 6, 1, 3, 2, 0, 0, 0, 0, 0]
			결과: [5, 6, 100, 1, 3, 2, 0, 0, 0, 0]
		 
		 */
		
		m1();
	}//main

	private static void m1() {
		
		int[]numArr = {5,6,1,3,2,0,0,0,0,1};
		
		int insPos = 0;
		int insVal = 0;	
		Scanner scan = new Scanner(System.in);
		System.out.print("삽입 위치: ");
		insPos =scan.nextInt();//2
		System.out.print("값 : ");
		insVal =scan.nextInt();//100
		
		System.out.print("원본: "+ Arrays.toString(numArr));
		
		int temp = 0;
		for(int i=0; i<numArr.length; i++) {
			if(i==insPos) { 
				temp = numArr[i];	//원본값 저장
				numArr[i] = insVal;	
			}else if(insPos<i) {
				int orgNum = numArr[i];
				numArr[i] = temp;
				temp = orgNum;
				
			}
		}
		
		System.out.print("\n결과: "+ Arrays.toString(numArr));
		
	}
	
	
	
}//class