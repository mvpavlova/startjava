import java.util.Scanner; //импорт сканера

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanName = new Scanner(System.in);
        System.out.print("Введите имя игрока: ");
        Player player1 = new Player(scanName.nextLine());
        System.out.print("Введите имя игрока: ");
        Player player2 = new Player(scanName.nextLine());
        GuessNumber userNumber = new GuessNumber(player1.getName(), player2.getName());
    }


        userNumber

    //     Scanner choice = new Scanner(System.in);
    //     boolean valid = true;
    //     while(valid) {
    //         System.out.print("Хотите продолжить? Y/N ");
    //         String answer = choice.nextLine();
    //         if(answer == "Y" && answer == "N") {
    //             valid = false;
    //         } else {
    //             valid = true;
    //         }
    //     }
    // }
}