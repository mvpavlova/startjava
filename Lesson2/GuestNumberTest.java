import java.util.Scanner; //импорт сканера

public class GuestNumberTest {
    public static void main(String[] args) {
        GuestNumber guestNumber = new GuestNumber();

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