package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q062 {
	public static void main(String[] args) {
		/*
		  Q62.배열:이름 정렬
		  요구사항: 학생의 이름을 N개 입력받아 아래와 같이 출력하시오.
		  조건: 이름을 오름차순 정렬하시오.
		 */

		
	m1();
	
	}//main

	private static void m1() {
		
		int studentNum = 0;
		String studentName = "";
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생 수: ");
		studentNum = scan.nextInt();
		String[]student = new String[studentNum];
		scan.nextLine();
		
		for(int i=0; i<studentNum; i++) {
			System.out.print("학생명: ");
			studentName = scan.nextLine();
			
			student[i] = studentName;
			
		}
		
		
		//System.out.println(Arrays.toString(student));
		
		sort(student);
		
		System.out.printf("입력한 학생은 총 %d명 입니다.\n", student.length);
		
		for(int i=0 ; i<student.length; i++ ) {
			System.out.printf("%d. %s\n", i+1, student[i]);
		}
	
	
	}//m1

	private static void sort(String[] student) {
		String temp = "";
		
		for(int i=0; i<student.length-1; i++) {	
			for(int j=0; j<student.length-i-1; j++) {	//오름차순이라 뒤에서부터 정렬되어서
				if(student[j].compareTo(student[j+1])>0) { //compareTo라는 비교하는 메소드사용,   
					temp = student[j];		//버블 정렬공식	  //왼쪽을 기준으로 오른쪽에 파라매터에 들어가있는 값이 크면 음수, 작으면 양수 같으면 0	
					student[j] = student[j+1];//저장된 순서를 저장 //오름차순이니까 작은게 앞으로 빠져야하니 >0을 해서 j+1이 j보다 작을때 앞으로 치환하는 로직을 넣음
					student[j+ 1] = temp; 
				}
				
			}
		}
		
	}
	
}//class
