package com.javaex.ex01;

public class Ex05 {
	
	public static void main(String[] args) {
		
		//일반적인 방식
		//진짜의도 -> 상수
		double pi = 3.14;
		double result01 = 5*5*pi;
		System.out.println(result01);
		
		//pi는 항상 3.14로 사용해야하는데 변경되었을 경우
		pi = 3.1415296;
		double result02 = 5*5*pi;
		System.out.println(result02);
		
		//상수로 정의한 경우
		final double PI = 3.14;
		double result03 = 5*5*PI;
		System.out.println(result03);
		
		//PI = 3.1415296; 
		//final을 사용하여 상수로 정의하였음 따라서 값 변경 불가능
		double result04 = 5*5*PI;
		System.out.println(result04);
	}

}
