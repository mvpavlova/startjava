package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String answer = "да";
        while(answer.equals("да")) {
            System.out.print("Введите математическое выражение: ");
            String srcMathExpression = scanner.nextLine();
            String[] splitMathExpression = srcMathExpression.split(" ");
            Calculator calc = new Calculator(splitMathExpression);
            calc.calculate();
            do {
                System.out.print("Хотите продолжить? да/нет ");
                answer = scanner.nextLine();
            } while (!answer.equals("да") && !answer.equals("нет"));
        }
    }
}