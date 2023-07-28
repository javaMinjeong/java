package com.test.question;

import java.util.Scanner;

public class Q031 {
	public static void main(String[] args) {
		
		/*
		  
		  Q31. 조건문 : 짝수홀수
		  요구사항: 숫자 5개를 입력받아 짝수와 홀수의 개수를 출력하시오.
		  
		 */
	
		
		m1();
		
	}//main
	
	/**
	 * 
	 * @param even 짝수 개수 판단 변수 선언
	 * @param odd  홀수 개수 판단 변수 선언
	 * evenCount 짝수 개수 변수 선언
	 * oddCount	 홀수 개수 변수 선언
	 * 짝수 개수 홀수 개수에 따른 결과값 출력 선언
	 * 숫자 입력 개수가 늘어날시 짝수와 홀수가 같을 경우까지 작성함
	 * 
	 */
	
	
	private static int evenCal(int even) {
		
		int result = 0;
		
				
		if(even % 2 == 0) {
			result += 1;
		}
		
		return  result;
		
	}//evenCal
		
	private static int oddcal(int odd) {
			
		int result = 0;
		
		
		if(odd % 2 == 1) {
			result += 1;
		}
		
		return  result;
		
		
		
	}//oddCal

	private static void m1() {
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
				
		int evenCount = 0;	//짝수 개수	
		int oddCount = 0;	// 홀수 개수
	
		
		System.out.print("숫자입력: ");
		num = scan.nextInt();
		evenCount = evenCount + evenCal(num);
		oddCount = oddCount + oddcal(num);
		
		
		System.out.print("숫자입력: ");
		num = scan.nextInt();
		evenCount = evenCount + evenCal(num);
		oddCount = oddCount + oddcal(num);
		
		System.out.print("숫자입력: ");
		num = scan.nextInt();
		evenCount = evenCount + evenCal(num);
		oddCount = oddCount + oddcal(num);
		
		System.out.print("숫자입력: ");
		num = scan.nextInt();
		evenCount = evenCount + evenCal(num);
		oddCount = oddCount + oddcal(num);
		
		System.out.print("숫자입력: ");
		num = scan.nextInt();
		evenCount = evenCount + evenCal(num);
		oddCount = oddCount + oddcal(num);
		
		System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.\n" , evenCount , oddCount);
		
		if(evenCount < oddCount) {
			System.out.printf("홀수가 짝수보다 %d개 더 많습니다\n", oddCount - evenCount );
		} else if (evenCount > oddCount) {
			System.out.printf("짝수가 홀수보다 %d개 더 많습니다\n", evenCount - oddCount);
		} else {
			System.out.printf("짝수와 홀수의 개수가 같습니다.");
		}
		
		
		
	}//m1
	
	


}//class