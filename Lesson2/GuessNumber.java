import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    Player player1 = new Player();
    Player player2 = new Player();
    Scanner scanNumber = new Scanner(System.in);
    Random random = new Random();
    int compNumber;

    public GuessNumber(String player1, String player2) {
        player1 = player1;
        player2 = player2;
    }
    
    public void game() {
       compNumber = random.nextInt(101);
        do {
            System.out.print("Игрок " + player1 + " введите число: ");
            player1.setNumber(scanNumber.nextInt());
            //userNumber = player1.getNumber();
            if(compNumber > player1.getNumber()) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            } else if(compNumber < player1.getNumber()) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else {
                break;
            }

            System.out.print("Игрок " + player2 + " введите число: ");
            player2.setNumber(scanNumber.nextInt());
            //userNumber = player2.getNumber();
            if(compNumber > player2.getNumber()) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            } else if(compNumber < player2.getNumber()) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else {
                break;
            }
        }while(compNumber != player1.getNumber() && compNumber != player2.getNumber());

        System.out.println("Вы Угадали!");
    }
}
