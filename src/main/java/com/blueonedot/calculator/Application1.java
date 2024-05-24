package com.blueonedot.calculator;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {
        System.out.println("청일점 계산기입니다.");
        Scanner sc = new Scanner(System.in);

        Parkhayarn hy = new Parkhayarn(); //하얀님
        Euuuuuuan euan = new Euuuuuuan(); //유안님
        Dmsgpk dms = new Dmsgpk();
        Seongeun se = new Seongeun();
        Yeonjin yj = new Yeonjin();




        while (true) {

            System.out.println("원하시는 기능을 입력해주세요");
            System.out.println("+. 두수를 더하는 기능");
            System.out.println("-. 두수를 빼는 기능");
            System.out.println("*. 두수를 곱하는 기능");
            System.out.println("/. 두수를 나누는 기능");
            System.out.println("%. 두수의 몫을 구하는 기능");
            System.out.println("1. 최대값 구하기");
            System.out.println("2. 최소값 구하기");

//        System.out.println("첫번째 값을 입력하세요.");
            String str = sc.nextLine();
            if (str.equals("exit")) {
                System.out.println("계산이 종료되었습니다.");

                break;
            }
//
//        System.out.println("두번째 값을 입력하세요.");

            switch (str) {
                case "+":
                    hy.calculatorPlus1();
                    break;
                case "-":
                    euan.calculatorMinus();
                    break;
                case "*":
                    dms.calculatorMultip3();
                    break;

                case "/":
                    se.calculatorDivide();
                    break;

                case "%":
                    yj.calculatorRemain1();
                    break;

                case "1":
                    dms.calculatorMax();
                    break;

                case "2":
                    // yj.randomPrint();
                    break;

                default:
                    System.out.println("잘못 입력하셨습니다.");
                    continue;

            }
            break;


        }

    }
}