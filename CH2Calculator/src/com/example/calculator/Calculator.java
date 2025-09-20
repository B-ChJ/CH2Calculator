package com.example.calculator;

import java.util.ArrayList;

public class Calculator {
    private ArrayList<Integer> collection = new ArrayList<>();

    public int result = 0;

    //간접 접근을 통해 필드의 collection 리스트를 가져오는 메서드
    public ArrayList<Integer> getCollection() {
        return collection;
    }
    public void setCollection() {
        collection.add(this.result);
    }
    public void removeResult() {
        //collection 배열에서 가장 먼저 저장된 결과값을 삭제하는 메서드
        this.collection.remove(0);
    }
    //연산 기능을 수행하는 메서드
    public int calculate(int num1, int num2, char operator) {

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
        this.setCollection();
        return result;
    }
}
