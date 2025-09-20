package com.example.calculator;

import java.util.function.BiFunction;//Enum 활용

public enum OperatorType {
    ADD('+', (num1, num2) -> num1 + num2),
    MINUS('-', (num1, num2) -> num1 - num2),
    MULTIPLY('*', (num1, num2) -> num1 * num2),
    DIVIDE('/', (num1, num2) -> {
        if (num2==0) throw new ArithmeticException("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
        return num1 / num2;
    });

    private final char operator;
    private final BiFunction<Double, Double, Double> expression;

    OperatorType(char operator, BiFunction<Double, Double, Double> expression) {
        this.operator = operator;
        this.expression = expression;
    }

    public double apply(double num1, double num2) {
        return expression.apply(num1, num2);
    }

    public char getOperator() {
        return operator;
    }

    public static OperatorType calculate(char operator) {
        for (OperatorType op : values()) {
            if (op.getOperator()==operator) {
                return op;
            }
        }
        throw new IllegalArgumentException(operator + "는 계산할 수 없는 연산자입니다.");
    }
}
