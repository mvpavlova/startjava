import java.util.Scanner; //импорт сканера

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя игрока: ");
        Player player1 = new Player(scan.nextLine());
        System.out.print("Введите имя игрока: ");
        Player player2 = new Player(scan.nextLine());
        GuessNumber play = new GuessNumber(player1, player2);

        play.gamePlay();

        System.out.print("Хотите продолжить? Y/N ");
        String answer = scan.nextLine();
        switch(answer) {
                case "Y":
                    play.gamePlay();
                case "N":
                    break;
                default:
                System.out.print("Хотите продолжить? Y/N ");
                answer = scan.nextLine();
        }
    }
}