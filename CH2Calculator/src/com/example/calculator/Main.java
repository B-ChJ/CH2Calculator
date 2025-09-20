package com.example.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double result = 0;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        ArithmeticCalculator<Double> calculator = new ArithmeticCalculator<>();

        while(flag){

            System.out.println("첫 번째 숫자를 입력하세요: ");
            double num1 = sc.nextDouble();

            System.out.println("두 번째 숫자를 입력하세요: ");
            double num2 = sc.nextDouble();

            System.out.println("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            result = calculator.calculate(num1, num2, operator);

            System.out.println("result = " + result);
            System.out.println("더 계산하시겠습니까? Press Any key to Continue...\n(exit 입력 시 종료)");
            if(sc.next().equals("exit")) {
                flag = false;
            }
        }
        calculator.removeFirst();
        System.out.println("result = " + calculator.getResult());
    }

}
