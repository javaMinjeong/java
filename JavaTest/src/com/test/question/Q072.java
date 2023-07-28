package com.test.question;

public class Q072 {
	public static void main(String[] args) {
		
		/*
		  
		Q72. 배열 : 숫자 출력
		요구사항: 아래와 같이 출력하시오.
		출력..
		1	6	11	16	21
		2	7	12	17	22
		3	8	13	18	23
		4	9	14	19	24
		5	10	15	20	25
		  
		 */
		
		m1();
	}//main

	private static void m1() {
		
		int[][]nums = new int[5][5];
		
		int n = 1;
		
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums.length; j++) {
				
				 nums[i][j]= (i+1) + j*5;	// i줄은 1씩 늘고 j줄은 5의 배수가 나옴
				 n++;
				}
				
			}
			
		//출력 > 수정없이 그대로 사용 복붙

		for(int i = 0; i< 5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}	

		
	}//m1
	
	
}//class
