package com.test.question;

  public class Q017 {

	public static void main(String[] args) {
		
		/*
		  Q17. 메소드오버로딩 : 직급
		 
		  요구사항:인자로 받은 이름들을 직급 순으로 출력하는 메소드를 선언하시오.
		  
		 */
		
		String n1 = "홍길동";
		String n2 = "유재석";
		String n3 = "박명수";
		String n4 = "정형돈";
		
		position("홍길동");
		
		System.out.println();
		position("홍길동","유재석");

		System.out.println();
		position("홍길동","유재석","박명수");
		
		System.out.println();
		position("홍길동","유재석","박명수","정형돈");
		
		
		
	}//main
	
	/**
	 * 인자로 받은 이름들을 직급 순으로 출력
	 * @param n1 홍길동 사원
	 * @param n2 유재석 대리
	 * @param n3 박명수 과장
	 * @param n4 정형돈 부장
	 */
	
	public static void position(String n1) {
		
		
		System.out.printf("사원 = %s\n", n1);
	
	}
	
		
	public static void position(String n1, String n2) {
		
		
		System.out.printf("사원 = %s\n대리 = %s\n", n1,n2);
		
	}
	
	public static void position(String n1, String n2, String n3) {
		
		
		System.out.printf("사원 = %s\n대리 = %s\n과장 = %s\n", n1,n2,n3);
		
	}
	
	public static void position(String n1, String n2, String n3, String n4) {
		
		
		System.out.printf("사원 = %s\n대리 = %s\n과장 = %s\n부장 = %s\n", n1,n2,n3,n4);
		
	}
	
	
	
	
	
	
}//class
