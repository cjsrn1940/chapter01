package com.javaex.ex01;

public class Ex02 {

	public static void main(String[] args) {
		
		//실수형 기본 사용방법
		double var01 = 3.14;
		float var02 = 3.14F; //float형은 항상 값에 F를 붙임
		
		System.out.println(var01);
		System.out.println(var02);
		
		//double(8byte) float(4byte)의 값 정확도 표현비교
		double var03 = 0.1234567890123456789;
		float var04 = 0.1234567890123456789F;
		
		System.out.println(var03); //0.123456789012345678
		System.out.println(var04); //0.123456789
	}
}
