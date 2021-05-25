package com.javaex.ex01;

public class Ex07 {
    
	public static void main(String[] args) {

        double v01 = 5/4;
        System.out.println(v01);  
        //1.25 xxxxxx -> 1.0 : 5/4는 정수로 존재하여 1이고 그 뒤 double이 적용되어 1.0이 된다

        double v02 = (double)5 / 4 ;  
        System.out.println(v02);   //1.25

        double v03 = 5 / (double)4 ;  
        System.out.println(v03);     //1.25

        double v04 = (double)5 / (double)4 ;  
        System.out.println(v04);    //1.25

        int v05 = (int)1.3 + (int)1.8 ;  
        System.out.println(v05);    
        //3 xxxx -> 2 : 1.3, 1.8에 각각 int를 적용하면 소수점 아래값이 없어진 1이고 이 둘을 더하면 2
    }


}
