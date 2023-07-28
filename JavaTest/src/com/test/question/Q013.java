package com.test.question;

import java.util.Scanner;

public class Q013 {

	public static void main(String[] args) {
		
		/*
		  
		  Q13. 메소드 : 성적 처리
		  
		  요구사항: 국어, 영어, 수학 점수를 전달하면 '합격' 혹은 '불합격'이라는 단어를 반환하는 메소드를 선언하시오.
		  
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String result = ""; 
		
		System.out.print("국어: ");
		int kor = scan.nextInt();
		
		System.out.print("영어: ");
		int eng = scan.nextInt();
		
		System.out.print("수학: ");
		int math = scan.nextInt();
		
		result = test(kor, eng, math);
		System.out.printf(result);
		
		
		
	}//main
	
	public static String test(int kor, int eng, int math) {
		
		int average = 0;
		average = (kor+eng+math)/3;
		
		String result = "";
		result = kor < 40? "불합격"
				:eng < 40? "불합격"
				:math< 40? "불합격" 		
				:average >= 60 ? "합격" : "불합격";			
					
		return result + "입니다." ;
	}
	
	
	
}//class
