package com.test.question;

public class Q066 {
	public static void main(String[] args) {
		
		/*
		  Q66. 배열 : 로또
		  요구사항: 중복되지 않는 임의의 숫자 6개를 만드시오.(로또)
		  조건..
			숫자의 범위: 1 ~ 45
			오름차순 정렬
		 */
		
		m1();
		
	}//main

	private static void m1() {
		
		
		int[]lotto = new int[6];
		for(int i=0; i<lotto.length; i++) {
			int temp = (int)(Math.random()*45)+1;
			lotto[i] = temp;
			
			for(int j=0; j<i; j++) {	//중복제거
				if(lotto[j] == temp) {
					i--;
					break;
				}
			}
		}
		System.out.print("[");
		for(int i=0; i<lotto.length; i++) {
			
			System.out.printf(lotto[i]+ ",");
		
		}
		System.out.print("]");
		
		
	}//m1
	
}//class
