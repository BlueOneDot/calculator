package com.blueonedot.calculator;

import java.util.Scanner;

public class Seongeun {

    public void calculatorDivide () {

        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 값을 입력하세요.");
        double num1 = sc.nextDouble();
        System.out.println("두번째 값을 입력하세요.");
        double num2 = sc.nextDouble();

        System.out.println("연산 결과 몫: " + num1 / num2);
    }

}
