import java.util.Scanner; //импорт сканера

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Введите первое число:");
        calc.setNum1(scan.nextInt());
        System.out.print("Введите знак математической операции:");
        calc.setOperator(scan.next());
        System.out.print("Введите второе число:");
        calc.setNum2(scan.nextInt());

        calc.calculate();

        System.out.print("Хотите продолжить? [Y/N]");
        String answer = scan.next();
        if(answer.equals("Y")) {
        } else if(answer.equals("N")){
        } else {
            System.out.print("Хотите продолжить? [Y/N]");
        }
    }
}