package com.blueonedot.calculator;

import java.util.Scanner;

public class FinalYeonjin {

    public void calculatorMin() {

        Scanner sc = new Scanner(System.in);

        System.out.println("정수 두 개를 입력받아 둘 중 더 작은 수를 출력합니다.");
        System.out.println();

        System.out.println("첫 번째 숫자를 입력하세요 : ");
        int num1 = sc.nextInt();

        System.out.println();

        System.out.println("두 번째 숫자를 입력하세요 : ");
        int num2 = sc.nextInt();

        Math.min(num1, num2);

        System.out.println(num1 + " 와 " + num2 + " 중 최소값은 : " + Math.min(num1, num2) + " 입니다.");
    }

    public void calculatorRemain1() {

        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 값을 입력하세요 : ");
        int num1 = sc.nextInt();

        System.out.println("두 번째 값을 입력하세요");
        int num2 = sc.nextInt();

        int remainder = num1 % num2;

        System.out.println("두 정수를 나눈 나머지는 : " + remainder);

        System.out.println( num1 + " 와 " + num2 + " 의 % 값은 : " + remainder + " 입니다.");

    }
}
