package com.example.calculator;

import java.util.ArrayList;

public class Calculator {
    public ArrayList<Integer> collection = new ArrayList<>();

    public int calculate(int num1, int num2, char operator) {
        int result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                //(예외 처리) 0으로 나누기
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                    break;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println(operator + "는 계산할 수 없는 연산자입니다.");
                break;
        }
        collection.add(result);
        return result;
    }

}
