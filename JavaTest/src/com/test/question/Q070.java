package com.test.question;

public class Q070 {
	public static void main(String[] args) {
		/*
		  	Q070. 배열: 숫자출력
		  	요구사항: 아래와 같이 출력하시오.
			출력..
			1	2	3	4	5
			10	9	8	7	6
			11	12	13	14	15
			20	19	18	17	16
			21	22	23	24	25
		 */
		
		m1();
		
	}//main

	private static void m1() {
		
		
		int[][]nums = new int [5][5];
		
		int n = 1;
		for(int i=0; i<nums.length; i++) {
			if(i%2==0) {						// i를 2로 나눈 값이 0이면 0,2,4번째 행
			for(int j=0; j<nums[i].length; j++) {		// 값 1씩 증가
					nums[i][j] = n;						//n에 저장
					n++;
				}
			}else {											// i를 2로 나눈 값이 0이 아니면 1,3번째 행
				for(int j=nums[i].length-1; j>=0; j--) {	//  값 1씩 감소
					nums[i][j] = n;
					n++;
				}
			} 
		}
		
		
		//출력 > 수정없이 그대로 사용 복붙
		
		for(int i = 0; i< 5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%3d", nums[i][j]);
			}
			System.out.println();
		}
	
	}//m1
}//class
