public class Calculator {
    int num1;
    int num2;
    String operator;

    public int getNum1(){
        return num1;
    }

     public void setNum1(int num1){
        this.num1 = num1;
    }

    public int getNum2(){
        return num2;
    }

    void setNum2(int num2){
        this.num2 = num2;
    }

    public String getOperator(){
        return operator;
    }

    void setOperator(String operator){
        this.operator = operator;
    }

    void Operation() {
        switch(operator){
        case "+": System.out.println(num1 + num2);
                  break;
        case "-": System.out.println(num1 - num2);
                  break;
        case "*": System.out.println(num1 * num2);
                  break;
        case "/": System.out.println(num1 / num2);
                  break;
        case "^": int result = num1;
                    for (int i = 1; i < num2; i++) {
                        result *= num1;
                    }
                  System.out.println(result);
                  break;
        case "%": System.out.println(num1 % num2);
                  break;
        }
    }
}
