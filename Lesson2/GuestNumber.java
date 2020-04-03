import java.util.Random;
import java.util.Scanner;

public class GuestNumber {

    Player player1 = new Player();
    Player player2 = new Player();
    Scanner scanNumber = new Scanner(System.in);
    Random random = new Random();
    int compNumber;
    int userNumber;

    public GuestNumber() {

        compNumber = random.nextInt(100);

        do {
            System.out.print("Игрок " + player1.getName() + " введите число: ");
            player1.setNumber(scanNumber.nextInt());
            userNumber = player1.getNumber();
            if(compNumber > userNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            } else if(compNumber < userNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else {
                break;
            }

            System.out.print("Игрок " + player2.getName() + " введите число: ");
            player2.setNumber(scanNumber.nextInt());
            userNumber = player2.getNumber();
            if(compNumber > userNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            } else if(compNumber < userNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else {
                break;
            }
        }while(compNumber != userNumber);

        System.out.println("Вы Угадали!");
    }
}