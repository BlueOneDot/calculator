package com.blueonedot.calculator;

import java.util.Scanner;

public class Euuuuuuan {
    public static void main(String[] args) {
        Euuuuuuan eu = new Euuuuuuan();
        eu.calculator();
    }

    public void calculator() {
        Scanner sc = new Scanner(System.in);
        System.out.print("연산할 첫번째 숫자를 입력하세요. : ");
        int num1 = sc.nextInt();

        System.out.print("연산할 두번째 숫자를 입력하세요. : ");
        int num2 = sc.nextInt();

        System.out.println("-(마이너스)와 m(최소값) 기호를 입력시 연산 실행");

        int result = 0;
        char minus = sc.next().charAt(0);

        switch (minus){
            case '-':
                result = num1 - num2;
                break;
            case 'm':
                result = Math.min(num1, num2);
        }
        
        System.out.println("결과값: " + result);

    }
}
