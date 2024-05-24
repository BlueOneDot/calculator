package com.blueonedot.calculator;

import java.util.Scanner;

public class Parkhayarn {

    public void calculatorPlus1(){

        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 값을 입력해주세요");
        double num1 = sc.nextDouble();
        System.out.println("두번째 값을 입력해주세요");
        double num2 = sc.nextDouble();

        System.out.println(num1 + num2);

        }

    }
