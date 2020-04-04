import java.util.Scanner; //импорт сканера

public class GuessNumberTest {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        GuestNumber compNumber = new GuestNumber();
        GuestNumber userNumber = new GuestNumber(GuessNumberTest.player1,GuessNumberTest.player2);

        userNumber.game();

        Scanner choice = new Scanner(System.in);
        boolean valid = true;
        while(valid) {
            System.out.print("Хотите продолжить? Y/N ");
            String answer = choice.nextLine();
            if(answer.equals("Y"&&"N")) {
                valid = false;
            } else {
                valid = true;
            }
        }
    }
}