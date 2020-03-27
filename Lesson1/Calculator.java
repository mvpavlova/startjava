public class Calculator{
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        int result;
        char op = '%';
        if (op == '+') {
            result = num1 + num2;
            System.out.println(result);
        } else if (op == '-') {
            result = num1 - num2;
            System.out.println(result);
        } else if (op == '*') {
            result = num1 * num2;
            System.out.println(result);
        } else if (op == '/') {
            result = num1 / num2;
            System.out.println(result);
        } else if (op == '^') {
            result = num1;
            for (int i = 1; i < num2; i++) {
                result = result * num1;
            }
            System.out.println(result);
        } else if (op == '%') {
            result = num1 % num2;
            System.out.println(result);
        }
        
    }
}