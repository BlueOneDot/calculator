package com.blueonedot.calculator;
import java.util.Scanner;

import java.util.Scanner;

public class Yeonjin {
    public void calculatorMin() {

       Scanner sc = new Scanner(System.in);

       System.out.println("정수 두 개를 입력받아 둘 중 더 작은 수를 출력합니다.");
       System.out.println();


       System.out.println("첫 번째 숫자를 입력하세요 : ");
       int num1 = sc.nextInt();

       System.out.println();

       System.out.println("두 번째 숫자를 입력하세요 : ");
       int num2 = sc.nextInt();

       Math.max(num1, num2);

       System.out.println("min : " + Math.min(num1, num2));
   }

   public void calculatorRemain1() {

      Scanner sc = new Scanner(System.in);

      System.out.println("정수 두 개를 입력받아 둘 중 더 작은 수를 출력합니다.");
      System.out.println();

      System.out.println("첫 번째 숫자를 입력하세요 : ");
      int num1 = sc.nextInt();

      System.out.println("두 번째 정수를 입력하세요");
      int num2 = sc.nextInt();

      int remainder = num1 % num2;


      System.out.println("두 정수를 나눈 나머지는 : " + remainder);

   }
}
