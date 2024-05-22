package com.blueonedot.calculator;

import java.util.Scanner;

public class Yeonjin {
    public void remain (){

        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 정수를 입력하세요");
        int num1 = sc.nextInt();

        System.out.println("두번째 정수를 입력하세요");
        int num2 = sc.nextInt();

        int remainder = num1 % num2;

        System.out.println("두 정수를 나눈 나머지는: " + remainder);

    }

}
