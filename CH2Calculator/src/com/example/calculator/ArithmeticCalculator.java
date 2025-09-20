package com.example.calculator;

import java.util.ArrayList;

public class ArithmeticCalculator<T> {
    private ArrayList<Double> collection = new ArrayList<>();

    public double result = 0;
    //간접 접근을 통해 필드의 collection 리스트를 가져오는 메서드
    public ArrayList<Double> getResult() {
        return collection;
    }
    public void setResult() {
        collection.add(this.result);
    }
    public void removeFirst() {
        //collection 배열에서 가장 먼저 저장된 결과값을 삭제하는 메서드
        this.collection.remove(0);
    }
    //연산 기능을 수행하는 메서드
    public double calculate(double num1, double num2, char operator) {
        OperatorType operatorType1 = OperatorType.calculate(operator);
        result = operatorType1.apply(num1, num2);
        this.setResult();
        return result;
    }
    //결과값 중 입력값보다 큰 결과값을 출력하는 메서드
    public void bigResult(double num) {
        System.out.println(collection.stream().filter(r -> r > num).toList());
    }
}
