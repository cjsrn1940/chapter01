package com.javaex.ex01;

public class Ex08 {

	public static void main(String[] args) {
		
		//대입연산자
		System.out.println("대입연산자----------------------");
		int a = 7;
		int b = 2;
		System.out.println(a);
		System.out.println(b);
		
		//산술연산자
		System.out.println("산술연산자----------------------");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		
		System.out.println(a/b); //몫
		System.out.println(a%b); //나머지
		
		//산술연산자 / %
		System.out.println("산술연산자 / % 자세히-----------------");
		System.out.println(7.0/2.0);
		System.out.println(7.0%2.0);

		//부호연산자
		System.out.println("부호연산자---------------------------");
		int var = -3;
		int pVar = +var;
		int mVar = -var;
		System.out.println(var);
		System.out.println(pVar);
		System.out.println(mVar);
		System.out.println(var);
		
		
		//증감연산자
		System.out.println("증감연산자-------------------");
		System.out.println(a); // a-->7
		System.out.println(++a);//8 , 더하고 값 출력 후 저장
		System.out.println(a);//8
		System.out.println(a++); //8, 값을 먼저 출력한 뒤 더하기 저장
		System.out.println(a);//9
		
		System.out.println(b);//b-->2
		System.out.println(--b);//1 , 빼고 출력 후 저장
		System.out.println(b);//1
		System.out.println(b--);//1, 출력 후 빼고 저장
		System.out.println(b);//0
	}

}
