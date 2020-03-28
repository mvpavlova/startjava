public class Calculator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        char operator = '^';

        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        } else if (operator == '^') {
            int result = num1;
            for (int i = 1; i < num2; i++) {
                result *= num1;
            }
            System.out.println(result);
        } else if (operator == '%') {
            System.out.println(num1 % num2);
        }
    }
}