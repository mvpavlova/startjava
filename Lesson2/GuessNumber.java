import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    // Player player1 = new Player();
    // Player player2 = new Player();
    // Player compNumber = new Player();
    Scanner scanNumber = new Scanner(System.in);
    Random random = new Random();


    public GuessNumber() {

        compNumber.setNumber(random.nextInt(101));
    }

    public void game() {
        do {
            System.out.print("Игрок " + player1.getName() + " введите число: ");
            player1.setNumber(scanNumber.nextInt());
            //userNumber = player1.getNumber();
            if(compNumber.getNumber() > player1.getNumber()) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            } else if(compNumber.getNumber() < player1.getNumber()) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else {
                break;
            }

            System.out.print("Игрок " + player2.getName() + " введите число: ");
            player2.setNumber(scanNumber.nextInt());
            //userNumber = player2.getNumber();
            if(compNumber.getNumber() > player2.getNumber()) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            } else if(compNumber.getNumber() < player2.getNumber()) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else {
                break;
            }
        }while(compNumber.getNumber() != player1.getNumber() && player2.getNumber());

        System.out.println("Вы Угадали!");
    }
}
