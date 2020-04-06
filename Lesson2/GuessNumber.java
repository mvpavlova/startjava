import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    Player player1;
    Player player2;
    Scanner scanNumber = new Scanner(System.in);
    Random random = new Random();
    int compNumber;

    public GuessNumber(Player player1, Player player2) {
         this.player1 = player1;
         this.player2 = player2;
     }

    public void play() {

       compNumber = random.nextInt(101);

        do {
            System.out.print("Игрок " + player1.getName() + " введите число: ");
            player1.setNumber(scanNumber.nextInt());
            if(compNumber > player1.getNumber()) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            } else if(compNumber < player1.getNumber()) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else {
                break;
            }

            System.out.print("Игрок " + player2.getName() + " введите число: ");
            player2.setNumber(scanNumber.nextInt());
            if(compNumber > player2.getNumber()) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            } else if(compNumber < player2.getNumber()) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else {
                break;
            }
        }while(true);

        System.out.println("Вы Угадали!");
    }
}
