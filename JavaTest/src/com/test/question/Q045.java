package com.test.question;

import java.util.Scanner;

public class Q045 {
	public static void main(String[] args) {
		
		/*
		 Q45. 반복문: 369
		 요구사항: 사용자가 입력한 범위의 숫자까지 369 게임 과정을 출력하시오.
		 조건: 최대 3자리까지만 입력하시오 
		  
		 */
	
		m1();
	
	}
	
	private static void m1() {
		
		int maxNum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("최대 숫자: ");
		maxNum = scan.nextInt();
		
		for(int i = 1; i <= maxNum ; i++) {
			
			if(play369Game(i)
				|| (i > 10 && (play369Game(i/10)||play369Game(i%10)))
				|| (i > 100 && (play369Game(i/100)||play369Game((i/10)%10)||play369Game(i%10)))) {
				System.out.printf("짝 ");
			} else {
				System.out.print(i+ " ");
			}
			
		
		}
		
	}//m1
	
	private static boolean play369Game(int num) {
		if(num == 3 || num == 6 || num == 9) {
			return true;
		}else {
			return false;
		}
	}
	
	
}//class
