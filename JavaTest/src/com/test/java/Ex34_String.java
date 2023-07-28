package com.test.java;

import java.util.Scanner;

public class Ex34_String {
	public static void main(String[] args) {
		//Ex34_String.java
		//문자열, String
		//- JDK 제공하는 문자열 조작 가능
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		//m9();
		//m10();
		//m11();
		//m12();
		m13();
		
		
	}//main

	private static void m13() {
		// 문자열 분리
		// - String[]  splite(String delimeter)
		// - 구분자를 기준으로 쪼개는 메소드 
		
		String name = ",홍길동,아무개,,유재석,강호동,박명수,";	// 구분자 맨 앞,중간은 빈방 만들어줌 맨 끝에는 빈방 안만들어줌
		
		String[] temp = name.split(","); // 구분자는 사라진다.
		
		for(int i=0; i<temp.length; i++) {
			System.out.println(i+ ":"+ temp[i]);
		}
		
		
		
		
	}

	private static void m12() {
		// 문자열 치환(바꾸기)
		//- String replace(String old, String new)
		//- 문자열의 일부(old)를 다른 문자열(new)로 바꾸는 메소드
		
		String txt = "안녕하세요. 홍길동입니다";
		
		int index = txt.indexOf("홍길동");
		
		String temp1 = txt.substring(0,index); //"안녕하세요"
		String temp2 = txt.substring(index + 3); // "입니다.
		
		System.out.println(temp1 + "아무개" + temp2 );
		
		System.out.println(txt.replace("홍길동", "아무개"));
		
		txt = "           하나         둘             셋";
		System.out.println(txt.trim());
		
		//*** replace로 무언가를 삭제하고 싶으면 .. 찾아서 ""로 교체하면 된다.
		
		System.out.println(txt.replace(" ",""));
		
		
	}

	private static void m11() {
		// 문자열 검색 
		//- indexOf(), lastIndexOf()
		//- startsWith(), endsWith()
		
		//-boolean contains(String)
		
		String txt = "안녕하세요. 홍길동입니다.";
		System.out.println(txt.contains("홍길동"));
		System.out.println(txt.contains("아무개"));
		
	}

	private static void m10() {
		// 문자열 추출 charAT 한글자, 이거는 문자열 일부 뽑을 수 있음
		//- String substring(int beginIndex, int endIndex)
		//- String substring(int beginIndex)
		//- beginIndex : 포함(inclusive)
		//- endIndex: 미포함(exclusive)
		
		//*** 자바에서는 범위를 나타낼때 > 시작(포함) ~ 끝(미포함)
		// Math.random() > 0~1사이 난수 보통 a~b-1까지
		
		
		
		String txt = "가나다라마바사아자차카파타하";
		
		System.out.println(txt.substring(3,7)); // 3~6까지 출력
		System.out.println(txt.charAt(5)); 		// '바' > 문자코드값 변환O
		System.out.println(txt.substring(5,6));	// "바" > 문자코드값 변환X  더 많이 쓰임.
		System.out.println(txt.substring(3));	// end 인덱스 없음 문자열 끝날때까지 추출		
		System.out.println();		
		
		
		//주민등록번호
		String jumin = "970728-1012345";
		
		//성별?
		System.out.println(jumin.charAt(7) == '1'? "남자":"여자");
		System.out.println(jumin.substring(7,8).equals("1")? "남자":"여자");
		
		//몇년생?
		//'9'(57) + '7'(55) =112
		System.out.println(""+jumin.charAt(0)+jumin.charAt(1)); //97 '7'+'7' //복잡해서 안씀
		System.out.println(jumin.substring(0,2));
		
		//몇월생?
		System.out.println(jumin.substring(2,4));
		
		//몇일생?
		System.out.println(jumin.substring(4,6));
		System.out.println();
		
		
		String path = "C:\\class\\java\\JavaTest\\Ex34_String.java";
		
		//1.파일명 추출 > "EX34_String.java"
		
		int index = path.lastIndexOf("\\");
		
		String filename = path.substring(index+1);
		System.out.println(filename);
				
		//2. 확장자 없는 파일명 추출 > "EX34_String"
		filename.lastIndexOf(".");
		String filenameWithoutExtension = filename.substring(0, index);
		System.out.println(filenameWithoutExtension);
		
		//3. 확장자 추출> ".java"
		String extension = filename.substring(index);
		System.out.println(extension);
		
		
	}

	private static void m9() {
		// 패턴 검색
		// - boolean starsWith(String)
		// - boolean endsWitch(String)
		
		String txt = "자바 프로그래밍";
		
		System.out.println(txt.startsWith("자바"));
		System.out.println(txt.startsWith("프로그래밍"));
		
		System.out.println(txt.endsWith("자바"));
		System.out.println(txt.endsWith("프로그래밍"));
		
		
		String name = "홍길동";
		
		System.out.println(name.startsWith("홍")); // 가독성이 가장 높음
		System.out.println(name.charAt(0)== '홍');
		System.out.println(name.indexOf('홍')== 0);
		
		System.out.println(name.endsWith("동"));
		System.out.println(name.length()-1 == '동');
		System.out.println(name.indexOf('동') == name.length()-1);
		System.out.println();
		
		//파일 경로
		
		String path = "C:\\class\\java\\JavaTest\\Ex34_String.java";
		
		//해당 파일이 '자바 소스 파일' 입니까? > 확장자 검사
		
		if (path.endsWith(".java")) {
			System.out.println("자바 소스 파일");
		}else {
			System.out.println("다른 파일");
		}
		
		
	}

	private static void m8() {
		
		//대소문자 변경
		//- String toUpperCase()
		//- String toLowerCase()
		
		String content = "오늘 수업은 Java입니다.";
		String word = "java";
		
		System.out.println(content);
		System.out.println(content.toUpperCase());
		System.out.println(content.toLowerCase());
		
		//대소문자 구분(Case sensitive)
		//-정확도 높음
		//-검색율 낮음
		if(content.indexOf(word)>-1){
			
			System.out.println("결과 O");
		}else {
			
			System.out.println("결과 X");
		}
		
		//대소문자 구분X(Case insensitive)
		//-정확도 낮음
		//- 검색율 높음
		if(content.toUpperCase().indexOf(word.toUpperCase())>-1){
			
			System.out.println("결과 O");
		}else {
			
			System.out.println("결과 X");
		}
		
		
					
	}//m8

	private static void m7() {
		//주민등록번호 > '-' 기입
		String jumin = "970728-2012345";
		
		if(jumin.charAt(6) == '-') {
			System.out.println("0");
		}else {
			System.out.println("X");
		}
		
		if(jumin.indexOf('-') == 6) {	// 활용도 훨씬 더 높음
			System.out.println("0");
		}else {
			System.out.println("X");
		}
		
		
		
		//게시판 글쓰기 > 관리자 > 금지어!!!
		
		String word = "바보";
		String content= "안녕하세요. 반갑습니다~ 자바를 공부하고 있어요.";
				
		if(content.indexOf(word) > -1){
			System.out.println("급지어 발견!!!");
		}else {
			System.out.println("글쓰기 진행~");
		}	
		
		
		String[] words = {"바보", "멍청이", "메롱", "ㅂㅏㅂㅗ"};
		
		for(int i=0; i<words.length; i++) {
			if(content.indexOf(words[i]) > -1){
				System.out.println("급지어 발견!!!");
				break;
			}else {
				System.out.println("글쓰기 진행~");
			}	
		}
		
		
		
		
	}

	private static void m6() {
		// 문자열 조작
		// 1. int length()
		// 2. char charAt(int)
		// 3. String trim()
		
		// 문자열 검색
		//- int indexOf(char)
		//- int indexOf(String)
		//- int indexOf(char, int)
		//- int indexOf(String, int)\
		
		//- int lastindexOf(char)
		//- int lastindexOf(String)
		//- int lastindexOf(char, int)
		//- int lastindexOf(String, int)

		
		String txt = "안녕하세요. 홍길동입니다.";
		
		int index = -1; // 없음
		
		index=txt.indexOf('하');
		System.out.println(index);
		
		index=txt.indexOf('홍');
		System.out.println(index);
		
		index=txt.indexOf('김');
		System.out.println(index);
		
		index=txt.indexOf("홍길동");	// 첫번째 문자의 위치를 반환
		System.out.println(index);
		System.out.println();
		
		
		txt = "안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다. 안녕히가세요. 홍길동입니다.";
	
	
//		index=txt.indexOf("홍길동");	// 7 - 첫번째 문자의 위치를 반환
//		System.out.println(index);
//
//		index=txt.indexOf("홍길동", 10);	//,숫자 시작 위치 설정 22
//		System.out.println(index);
//		
//		index=txt.indexOf("홍길동",25);	// 38 앞선 찾은 위치 찾으면 다음 위치 계싼 가능
//		System.out.println(index);
//	
		
		index = -1;
		
		//for( int i=0; i<3; i++) {
		while(true) {
			
		
			index = txt.indexOf("홍길동", index);
			
			if(index == -1) {// 홍길동을 못찾았니?
				break;
				
			}
			
			
			System.out.println(index);
			
			index += 3;
		}
		txt = "안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다. 안녕히가세요. 홍길동입니다.";
		
		//검색방향: 왼쪽 > 오른쪽
		System.out.println(txt.indexOf("홍길동"));	//7
		
		//검색방향: 오른쪽 >왼쪽
		System.out.println(txt.lastIndexOf("홍길동",21));	//22
	
	}
	

	private static void m5() {
		// 공백 제거
		//-String trim()
		//- 문자열내의 공백(Whitespace > 스페이스 , 탭, 개행} 문자를제고
		//- 문자열의 시작과 끝에 존재하는 공백을 제거한다.(***)
		String txt= "		하나 			둘			셋 		";		
		System.out.printf("[%s]\n",txt);
		System.out.printf("[%s]\n",txt.trim());
	}

	private static void m4() {
		// 주민등록번호: 970727-1000001
		
		String jumin = "970727-1000001";
		System.out.println(jumin.charAt(6));
		
		if(jumin.charAt(6)== '-') {
			System.out.println("올바른 주민번호");
			
			if(jumin.charAt(7) == '1' || jumin.charAt(7)== '3') {
					System.out.println("남자");
		}else {
			System.out.println("여자");
		}
			
			
		}else {
			System.out.println("올바르지 않는 주민번호");
		}
		
	}

	private static void m3() {
		Scanner scan = new Scanner(System.in);
		
		//요구사항] 회원 가입 > 아이디 입력 > 영어 소문자만 입력
		System.out.println("아이디: ");
		String id = scan.nextLine();
		
		//아이디 : h o n g > 'h', 'o,' 'n', 'g'
		
		for(int i=0; i<id.length(); i++);{
			
			char c = id.charAt('i');
			
			//System.out.println(c);
			//소문자가 아니냐?
			if(c<'a'|| c>'z') {
			System.out.println("잘못된 문자가 발견되었습니다.");	
			
			//break;
			
			}
		System.out.println("종료");
	}
}

	private static void m2() {
		//문자열 추출
		//- char charAt(int index)
		//- 자바: Zero-based Index
		
		//			 0 1 2 3 4567 8 9 10 공백도 글자
		
		String txt = "안녕하세요. 홍길동입니다.";
		
		//Returns the char value at thespecified index.
		//An index ranges from 0 to length() - 1.
		char c = txt.charAt(3);
		System.out.println(c);
		
		c = txt.charAt(7);
		System.out.println(c);
		
		c = txt.charAt(13);
		System.out.println(c);
		
		c = txt.charAt(txt.length()-1);
		System.out.println(c);
		
//		c = txt.charAt(14);
//		System.out.println(c);
		
		
	}

	private static void m1() {
		//문자열(String), 문자(char)
		//문자열 == 문자의 집합
		//String == char[]
		
		//문자열 조작 기능 == 배열 조작 기능 유사
		
		//문자열 길이
		//- int length()
		//- 문자열의 글자수
		
		//홍길동입니다.
		char[] clist = { '홍', '길', '동', '입', '니', '다', '.'};
			System.out.println(clist.length);	
			
		String str = "홍길동입니다.";
		System.out.println(str.length());
		
		System.out.println("홍길동".length());
		
		System.out.println("AI가$".length());
		
		//요구사항] 회원 가입 > 이름 입력 > 이름을 2자 ~ 5자이내로 작성하시오.
		//		유효성 검사
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = scan.nextLine();
		
		if(name.length()>=2 && name.length() <=5) {
			System.out.println("올바른 이름~");
		}else {
			System.out.println("이름을 2자~5자 이내로 작성하시오.");
		}
	
	
	}
		
	
}//class
