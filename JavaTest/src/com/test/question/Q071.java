package com.test.question;

public class Q071 {
	public static void main(String[] args) {
		/*
		  	Q71.배열: 숫자 출력
		  	요구사항: 아래와 같이 출력하시오.
		  	출력..
			25	24	23	22	21
			20	19	18	17	16
			15	14	13	12	11
			10	9	8	7	6
			5	4	3	2	1

		 */
	
		m1();
		
	}//main

	private static void m1() {
		
		int[][]nums = new int[5][5];
		
		int n = 1;
		
		for(int i = nums.length-1; i>=0; i--) {			// i와 j 역순으로 출력뽑기
			for(int j=nums.length-1; j>=0; j--) {		// 
				nums[i][j] = n;
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
