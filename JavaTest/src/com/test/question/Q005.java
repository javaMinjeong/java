package com.test.question;

import java.util.Scanner;

public class Q005 {

	
	public static void main(String[] args) {
		
		/*
		 Q5.연산자: 자전거 
		 
		 요구사항: 자전거가 있다. 자전거의 바퀴는 지름(직경)이 26인치이다.
		 사용자가 페달을 밟은 횟수를 입력하면 자전거가 총 몇 m를 달렸는지 출력하시오. 
		  
		 */
		
		Scanner scan = new Scanner(System.in);
		                                                         
		System.out.print("사용자가 페달을 밟은 횟수: ");            // 안내메세지 출력  
		
		int pedal = scan.nextInt();                          // pedal 변수 선언     
		                                                         
		double tire = (26 * 0.0254) * 3.14159265358979 ;    // tire 변수 선언 지름 * (1인치당)m값 * 원주율     
		                                                       
		double distance = tire * (double)pedal   ;        //  distance 거리 선언 pedal변수 double형으로 형변환   
		
		System.out.printf("사용자가 총 %,d회 페달을 밟아 자전거가 총 " + "%,.3f" +"m를 달렸습니다.", pedal, distance);	// 결과값 출력
		
		
		
	}//main
	
}// class