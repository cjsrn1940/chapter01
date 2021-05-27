package com.javaex.ex04;

public class Ex07 {

	public static void main(String[] args) {
		
		// 내가 짠 코드
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				System.out.print("*");
				if(j == i) {
					System.out.println("");
					j=6;
				}
			}
		}
		
		//쌤이 짠 코드
		/*
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		 */

	}

}
