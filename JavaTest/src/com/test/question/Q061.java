package com.test.question;

import java.util.Scanner;

public class Q061 {
	public static void main(String[] args) {
		/*
		  Q61. 배열: 역순
		  조건: int[] nums = new int[5];
		  
		 */
	
		m1();
	}//main

	private static void m1() {
		
		int num = 0;
		
		int[] nums = new int[5];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			
			System.out.print("숫자: ");
			num = scan.nextInt();
			
			nums[i] = num;
		
		}//for
		
		
	
		for(int i = nums.length-1; i>=0; i--) {	//역순
			
			System.out.printf("nums[%d] = %d\n", i, nums[i] );
		}
		
	}//m1
	
	
}//class
