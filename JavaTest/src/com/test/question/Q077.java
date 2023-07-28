package com.test.question;

public class Q077 {
		public static void main(String[] args) {
			
			/*
		  		
		  	Q77.배열: 숫자 출력 
		  	요구사항: 아래와 같이 출력하시오.
		  	1	2	4	7	11
			3	5	8	12	16
			6	9	13	17	20
			10	14	18	21	23
			15	19	22	24	25
			  
			  
			  		0,0=1  0,4=11	1,4=16
   					0,1=2  1,3=12 	2,3=17	
				    1,1=3  2,2=13   3,2=18
				   		   3,1=14   4,1=19
				   0,2=4   4,0=15
				   1,1=5	i=+1	2,4=20
				   2,0=6	j=-1	3,3=21
				   					4,2=22
				   0.3=7
				   1,2=8			3,4=23
				   2,1=9			4,3=24
				   3,0=10			
				   					4,4=25
			 */
			
			m1();
		}//main

		
		private static void m1() { 
			
			int[][]nums = new int[5][5];
			int n = 1;
			
			for(int i=0; i<nums.length; i++) {
				for(int j=nums.length-1; j>=0; j--) {
					nums[i][j] = n;
					n++;
				}
			}
		
			
			for(int i = 0; i< 5; i++) {
				for(int j=0; j<5; j++) {
					System.out.printf("%5d", nums[i][j]);
				}
				System.out.println();
		}//m1

		//출력 > 수정없이 그대로 사용 복붙
		}
		
	
		
}//class
