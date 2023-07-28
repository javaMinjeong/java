package com.test.question;

public class Q074 {
	public static void main(String[] args) {
		
		/*
		 	Q74. 배열: 숫자 출력 
		 	요구사항: 아래와 같이 출력하시오.
		 	출력..
			0	0	1	0	0
			0	2	3	4	0
			5	6	7	8	9
			0	10	11	12	0
			0	0	13	0	0
	  
		 */
		
		
		m1();
		
	}//main
	
	
	private static void m1() {
		
	
		int[][]nums = new int[5][5];
		int n = 1;
		//int mid = (nums.length/2)+(nums.length%2);//중심값 설정
		for(int i = 0; i<nums.length/2+1; i++) {	//중심값 설정		
			for( int j = 2-i; j<2+i; j++) {
					nums[i][j] = n;
					n++;
					
				}
		}
		for(int i=nums.length/2+1; i<nums.length; i++) {
			for(int j=i-2; j<=6-i; j++) {
				nums[i][j] = n;
			}
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
	}//m1	
}//class
