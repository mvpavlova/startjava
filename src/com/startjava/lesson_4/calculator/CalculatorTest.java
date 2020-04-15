package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        System.out.print("Введите математическое выражение: ");
        Calculator expr = new Calculator();
        expr.calculate();

        Scanner choice = new Scanner(System.in);
        boolean valid = true;
        while(valid) {
            System.out.print("Хотите продолжить? Y/N ");
            String answer = choice.nextLine();
            if(answer.equals("Y")) {
                valid = false;
            } else if (answer.equals("N")) {
                valid = false;
            } else {
                valid = true;
            }
        }
    }
}