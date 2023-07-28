package com.test.question;

import java.util.Scanner;

public class Q076 {
	public static void main(String[] args) {
		
		/*
		 
		  Q76. 배열: 성적 그래프
		  요구사항: 성적을 입력받아 아래와 같이 출력하시오.
		  조건: String[][] score = new String[10][3];
		  
		 */
	
	
	
	
	
		m1();
	}//main

	private static void m1() {
		
	
		int korScore = 0;
		int engScore = 0;
		int mathScore = 0;
		
		String[][] score = new String[10][3];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어 점수: ");
		korScore = scan.nextInt();
		System.out.print("영어 점수: ");
		engScore = scan.nextInt();
		System.out.print("수학 점수: ");
		mathScore = scan.nextInt();
		
		for(int i=0; i<score.length; i++) {
			if(korScore >=(i+1)*10) {			//국어 점수가 10점이 넘으면 ■ 출력되는 식 선언 i행 0번째에 출력됨
				score[i][0] = "■";
			}else {
				score[i][0] = "";
			}
			if(engScore >=(i+1)*10) {			//영어 점수가 10점이 넘으면 ■ 출력되는 식 선언 i행 1번째에 출력됨
				score[i][1] = "■";
			}else {
				score[i][1] = "";
			}
			if(mathScore >=(i+1)*10) {			//수학 점수가 10점이 넘으면 ■ 출력되는 식 선언 i행 2번째에 출력됨
				score[i][2] = "■";
			}else {
				score[i][2] = "";
			}
		}
		for(int i = score.length-1; i>=0; i--) {		// (배열길이-1)부터 0까지 감소 값 출력 10개
			for(int j=0; j<score[0].length; j++) {		//	열길이 설정 score 0번째 길이보다 큰 열 3개
				System.out.print(" "+ score[i][j]+"\t");	// \t사용하여 그래프 위치 맞추기
			}
			System.out.println();
		}
		
		System.out.println("----------------------");
		System.out.println("국어\t영어\t수학");
		
	}//m1

	
	
	
}//class
