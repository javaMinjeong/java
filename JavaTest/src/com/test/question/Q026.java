package com.test.question;

import java.util.Scanner;

public class Q026 {
	public static void main(String[] args) {
		
		/*
		 Q26. 조건문 : 성적
		 요구사항 : 학생의 국어 점수를 입력받아 성적을 출력하시오.
		  
		 */
		
		m1();
		
		
		
	}//main
	
	/**
	 * 학생의 국어 점수를 입력받아 성적을 출력하는 메소드
	 * score 변수 사용하여 작성
	 * 유효성 검사 위해 if 문 1 생성
	 * 
	 */
	
	

	private static void m1() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수: ");
		int score = scan.nextInt();
		
		
		if(score < 0 || score > 100) { //else if로 마지막줄에 작성한 경우도 있었음
			System.out.printf("점수가 올바르지 않습니다. 0~100사이의 값을 입력하시오.");
		}else {	
			
			if(score >= 90)  {
				System.out.printf("입력한 %d점은 성적 A입니다.", score);
			}else if (score >=80) {
				System.out.printf("입력한 %d점은 성적 B입니다.", score);
			}else if (score >=70) {
				System.out.printf("입력한 %d점은 성적 C입니다.", score);
			}else if (score >=60) {
				System.out.printf("입력한 %d점은 성적 D입니다.", score);
			}else {
				System.out.printf("입력한 %d점은 성적 F입니다.", score);
			}
		}
		
		
		
	}//m1
	
	
	
	
	
}//class
