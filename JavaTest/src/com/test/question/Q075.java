package com.test.question;

public class Q075 {
		public static void main(String[] args) {
			
			/*
			 Q75 배열: 숫자 출력
			 요구사항: 아래와 같이 출력하시오.
													  
				1	2	3	4	10
				5	6	7	8	26
				9	10	11	12	42
				13	14	15	16	58
				28	32	26	40	136
														
				O      O     O     O    총합										
				O      O     O     O    총합
				O      O     O     O    총합 
				O      O     O     O    총합
			   총합    총합   총합   총합   총합
													  
			 */
			
			
		m1();	
			
		}//main

		private static void m1() {
			
			int[][]nums = new int[5][5];
			
			int n = 1;
			
			 for (int i=0; i<nums.length-1; i++ ) {						// 4개 4개 이므로 
		            for (int j=0; j<nums.length-1; j++) {

		            	nums[i][j] = n; 
		                nums[i][4] = nums[i][4] + n;			//  i행 4개합 증가
		                nums[4][j] = nums[4][j] + n;			// j열 4개합 증가 
		                nums[4][4] = nums[4][4] + n;			// 행 열 각 4개합 증가
		                n++;        
		            }
		       }
			 for(int i = 0; i< 5; i++) {
					for(int j=0; j<5; j++) {
						System.out.printf("%5d", nums[i][j]);
					}
					System.out.println();
				}
			 
			 
		}//m1
		
		
		
}//class
