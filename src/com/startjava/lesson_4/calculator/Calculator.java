package com.startjava.lesson_4.calculator;

import java.util.Scanner;
import static java.lang.Integer.*;

public class Calculator {

    private String[] calc;
    public Calculator(String[] splitMathExpression) {
        this.calc = splitMathExpression;
    }

    public void calculate() {

        int num1 = parseInt(calc[0]);
        int num2 = parseInt(calc[2]);
        switch (calc[1]) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            case "^":
                int result = (int) Math.pow(num1, num2);
                System.out.println(result);
                break;
            case "%":
                System.out.println(num1 % num2);
                break;
            case "max":
                result = Math.max(num1, num2);
                System.out.println(result);
                break;
            case "min":
                result = Math.min(num1, num2);
                System.out.println(result);
                break;
            case "hypot":
                result = (int) Math.hypot(num1, num2);
                System.out.println(result);
                break;

        }
    }
}