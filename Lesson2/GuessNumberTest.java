import java.util.Scanner; //импорт сканера

public class GuessNumberTest {
    public static void main(String[] args) {
        
        Scanner scanName = new Scanner(System.in);
        System.out.print("Введите имя игрока: ");
        Player player1 = new Player(scanName.nextLine());
        System.out.print("Введите имя игрока: ");
        Player player2 = new Player(scanName.nextLine());
        GuessNumber play = new GuessNumber(player1, player2);

        play.play();

        Scanner choice = new Scanner(System.in);
        boolean valid = true;
        while(valid) {
            System.out.print("Хотите продолжить? Y/N ");
            String answer = choice.nextLine();
            switch(answer) {
                case "Y":
                    valid = false;
                    break;
                case "N": 
                    valid = false;
                    break;
                default:
                    valid = true;
            }
        }
    }
}