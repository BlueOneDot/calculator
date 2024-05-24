package com.blueonedot.calculator;

import java.util.Scanner;


public class Yeonjin {
    public void calculatorRemain1() {

       Scanner sc = new Scanner(System.in);

       System.out.println("첫 번째 값을 입력하세요 : ");
       int num1 = sc.nextInt();

       System.out.println();

       System.out.println("두 번째 값을 입력하세요 : ");
       int num2 = sc.nextInt();

       Math.min(num1, num2);

       System.out.println(num1 + " 와 " + num2 + " 중 최소값은 : " + Math.min(num1, num2) + " 입니다.");


   }

}
