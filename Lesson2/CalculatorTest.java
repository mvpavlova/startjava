import java.util.Scanner; //импорт сканера

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator oneCalculator = new Calculator();

        System.out.print("Введите первое число:");
        oneCalculator.setNum1(scan.nextInt());
        System.out.print("Введите знак математической операции:");
        oneCalculator.setOperator(scan.next());
        System.out.print("Введите второе число:");
        oneCalculator.setNum2(scan.nextInt());

        oneCalculator.Operation();
    }
}