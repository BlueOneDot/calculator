package com.blueonedot.calculator;

import java.util.Scanner;

public class Euuuuuuan {
    public static void main(String[] args) {
        Euuuuuuan eu = new Euuuuuuan();
        eu.printIntegers();
    }

    public void calculatorMinus() {
        int[] arr = twoNumbersInput();

        int result = arr[0] - arr[1];

        System.out.println(arr[0] + " 와 " + arr[1] + " 의 - 값은 : " + result + " 입니다.");


    }

    public void printIntegers() {

        int[] numbers = twoNumbersInput();

        System.out.println("첫번째 숫자 : " + numbers[0]);
        System.out.println("두번째 숫자 : " + numbers[1]);
        System.out.println("두 수를 뺀 값 : " + (numbers[0] - numbers[1]));
    }


    public int[] twoNumbersInput() {
        int[] arr = new int[2];

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 값을 입력하세요. : ");
        arr[0] = sc.nextInt();

        System.out.print("두 번째 값을 입력하세요. : ");
        arr[1] = sc.nextInt();
        return arr;
    }


}
