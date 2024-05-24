package com.blueonedot.calculator;

import java.util.Scanner;

public class Dmsgpk {

    public void calculatorMultip3() {

        Scanner sc = new Scanner(System.in);


        System.out.println("첫 번째 숫자를 입력하세요. : ");
        double value1 = sc.nextDouble();

        System.out.println("두 번째 숫자를 입력하세요. : ");
        double value2 = sc.nextDouble();

        System.out.println();
        double result = 0;
        result = value1 * value2;

        System.out.println( value1 + " 와 " + value2 + " 의 * 값은 : " + result + " 입니다.");
        System.out.println();

    }

    public void calculatorMax() {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 두 개를 입력받아 둘 중 더 큰 수를 출력합니다.");
        System.out.println();

        System.out.println("첫 번째 값를 입력하세요 : ");
        int num1 = sc.nextInt();

        System.out.println();

        System.out.println("두 번째 값를 입력하세요 : ");
        int num2 = sc.nextInt();

        Math.max(num1, num2);

        System.out.println(num1 + " 와 " + num2 + " 중 최대값은 : " + Math.max(num1, num2) + " 입니다.");

    }

    public void calculatorOperator() {
        Scanner sc = new Scanner(System.in);

        System.out.println("연산자를 선택하세요 : ");
        System.out.println("(연산자 보기 : +, -, *, /, % 중 선택)");
        char op = sc.next().charAt(0);

        double result = 0;

        switch (op) {
            case '+':
                break;

            case '-':
                break;

            case '*':
                break;

            case '/':
                break;

            case '%':
                break;

            default:
                System.out.println("연산 기호를 잘못 입력하셨습니다. ");

        }

    }

}
