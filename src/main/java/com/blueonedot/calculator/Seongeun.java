package com.blueonedot.calculator;

import java.util.Scanner;

public class Seongeun {

    public void calculatorDivide () {

        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 값을 입력하세요.");
        double num1 = sc.nextDouble();

        System.out.println("두 번째 값을 입력하세요.");
        double num2 = sc.nextDouble();

        double result = num1 / num2;

        System.out.println( num1 + " 와 " + num2 + " 의 + 값은 : " + result + " 입니다.");
    }

}
