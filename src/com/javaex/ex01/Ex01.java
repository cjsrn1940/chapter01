package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		//byte형 예제
		/*
		byte myAge;
		myAge = 25;
		System.out.println(myAge);
		*/
		
		/*
		long myAge;
		myAge = 2147483648L;
		//long형은 숫자 뒤에 L을 붙여야 함, int범위 내에 있는 숫자들은 L불필요
		System.out.println(myAge);
		*/
		
		/* 변수 생성과 값 입력되는 순서 비교
		int age; //나이
		int weight; //몸무게
		int tall; //키
		
		age = 25;
		weight = 78;
		tall = 180;
		*/
		
		/*
		int age;
		int weight;
		int tall;
		
		weight = 78;
		tall = 180;
		age = 25;
		*/
		
		/*변수가 여러개일때 표현방법 -1
		int var01;
		int var02;
		int var03;
		
		var01 = 10;
		var02 = 20;
		var03 = 30;
		*/
		
		/*변수가 여러개일때 표현방법 -2
		int var01 = 10;
		int var02 = 20;
		int var03 = 30;
		*/
		
		/*변수가 여러개일때 표현방법 - 3
		int var01, var02, var03;
		
		var01 = 10;
		var02 = 20;
		var03 = 30;
		 */
		
		//변수가 여러개일때 표현방법 - 4
		int var01=10, var02=20, var03=30;
		
		System.out.println(var01);
		System.out.println(var02);
		System.out.println(var03);
	}
	
}
