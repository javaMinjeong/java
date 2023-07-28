package com.test.question;

import java.util.Scanner;

public class Q047 {
	public static void main(String[] args) {
		
		/*
		 Q47. 반복문 : 자판기 
		 요구사항 : 자판기 프로그램으로 구현하시오.
		 
		 */
	
	m1();
	
	}//main

	private static void m1() {
		
		int coin = 0;
		int drinkNum = 0;
		int changeMoney = 0;
		int cokePrice = 700;
		int spritePrice = 600;
		int vitaPrice = 500;
		int price = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=1;;) {
			
			System.out.println("=======================");
			System.out.println("	 자판기		");
			System.out.println("=======================");
			
			System.out.printf("1. 콜라: \t\t%,6d원\n", cokePrice);
			System.out.printf("2. 사이다: \t%,6d원\n", spritePrice);
			System.out.printf("3. 비타500: \t%,6d원\n", vitaPrice);
			System.out.println("-----------------------");
			System.out.print("금액 투입(원): ");
			coin = scan.nextInt();
			
			System.out.println("-----------------------");
			System.out.print("음료 선택(번호): ");
			drinkNum = scan.nextInt();
			
		
			if(coin< cokePrice|| coin< spritePrice || coin< vitaPrice ) {
				System.out.print("+투입 금액이 부족합니다.\n투입 금액을 확인해주세요.\n");
				break;
				
			}else {
				
				if( drinkNum == 1) {
					price = cokePrice;
					System.out.println("+콜라를 제공합니다.");
				}else if( drinkNum == 2) {
					price = spritePrice;
					System.out.println("+사이다를 제공합니다.");
				}else {
					price = vitaPrice;
					System.out.println("+비타500을 제공합니다.");
					
				}
			}
			
			changeMoney =  coin - price;
			System.out.printf("+잔돈 %d원을 제공합니다.\n", changeMoney);
			System.out.println();
			scan.nextLine();
		
			System.out.println("계속하시려면 엔터를 입력하세요.");
			scan.nextLine();
			
	
		}//for	
			
		
		
		
	}//m1
	
	
}//class
