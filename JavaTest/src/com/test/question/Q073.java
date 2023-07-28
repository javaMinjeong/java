package com.test.question;

public class Q073 {
	public static void main(String[] args) {
		/*
		 Q73.배열: 숫자 출력
		 요구사항: 아래와 같이 출력하시오. 
		 출력..
			1	2	3	4	5
			6	7	8	9	0
			10	11	12	0	0
			13	14	0	0	0
			15	0	0	0	0
 
		 */
	
		m1();
	}//main
	
	private static void m1() {
		
		int[][]nums = new int [5][5];
		int n = 1;
		for(int i = 0; i<nums.length; i++) {
			for(int j = 0; j<nums.length; j++) {
				if(j<=nums.length-(i+1)) {	// i=0일때 01234 출력 i=1일때 0123출력 i=2일때 0123출력... 하여 출력식 작성
					nums[i][j] = n;
					n++;
				}else {
					
					
				}
			}
			
		}
		//출력 > 수정없이 그대로 사용 복붙
		
		for(int i = 0; i< 5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
		
	}

}//class
