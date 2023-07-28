package com.test.question;

import java.util.Scanner;

public class Q014 {

	public static void main(String[] args) {
		
		/*
		  
		  Q14. 메소드 : 지하철
		  
		  요구사항: 지하철 탑승 소요 시간을 구하시오. 지나가는 역의 개수, 환승역의 횟수, 시간대를 전달 받아 총 걸리는 시간을 반환하는 메소드를 선언하시오.
		  
		 */
		
		int station = 0;
		int change = 0;
		int time = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("역의 개수: ");
		station = scan.nextInt();
		
		System.out.printf("환승역의 개수: ");
		change = scan.nextInt();
		
		System.out.printf("시간대(1.평상시, 2.출근시, 3.퇴근시): ");
		time = scan.nextInt();
		
		
		int resultTime = 0;
		resultTime = getTime(station, change, time);
		
				
		System.out.printf("총 소요 시간은 " + "%d" + "분입니다.\n", resultTime );
		
		
		
		
	}//main
	
	
	public static int getTime(int station, int change, int time) {
		
		int result = 0;
		int stationTime = station * 2;
		int changeTime = time == 1? change*3
					   : time == 2?	change*4
					   : time == 3? change*5
					   : 0;	   	
		
		result = stationTime + changeTime;			
		
		
		return result;
		
	}
	
	
	
	
	
}//class
