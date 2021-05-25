package com.javaex.ex01;

public class Ex04 {
	
	public static void main(String[] args) {
		
		//기본사용방법
		/*
		char ch01 = 'A';
		char ch02 = '안';
		
		System.out.println(ch01);
		System.out.println(ch02);
		*/
		
		char ch03 = 65;
		System.out.println(ch03); 
		// 아스키 코드로 값이 저장된다
		
		char ch04 = 65;
		System.out.println(ch04); 
		//의도 점수 65 대입하려 했으나 자료형은 char 선언한 경우
		
		//문자 -> 1글자	문자열 -> 1글자 이상
		char ch05 = '황';
		String ch06 = "안녕하세요";
		
		System.out.println(ch05);
		System.out.println(ch06);
		
		boolean c01 = true;
		String c02 = "true";
		
		System.out.println(c01); //참의 의미
		System.out.println(c02); //단순 글자
	}
}
