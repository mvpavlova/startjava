package com.startjava.lesson_4.calculator;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Calculator {
    String[] calc = new String[3];

    public Calculator() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            calc[i] = scanner.next();
        }


    }
    public void calculate() {
        int num1 = Integer.parseInt(calc[0]);
        int num2 = Integer.parseInt(calc[2]);
        switch (calc[1]) {
            case "+": System.out.println(num1 + num2);
                break;
            case "-": System.out.println(num1 - num2);
                break;
            case "*": System.out.println(num1 * num2);
                break;
            case "/": System.out.println(num1 / num2);
                break;
            case "^":
                int result = (int) Math.pow(num1, num2);
                System.out.println(result);
                break;
            case "%":
                System.out.println(num1 % num2);
                break;
        }

    }
}

