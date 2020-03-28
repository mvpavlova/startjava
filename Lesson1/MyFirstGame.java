public class MyFirstGame {
    public static void main(String[] args) {
        int compNumber = 20;
        int userNumber = 10;

        while(userNumber < compNumber) {
            if(compNumber > userNumber) {
                System.out.println(userNumber);
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
                userNumber++;
            }
        }

        while(compNumber < userNumber) {
            if(compNumber < userNumber) {
                System.out.println(userNumber);
                System.out.println("Введенное вами число больше того, что загадал компьютер");
                userNumber--;
            }
        }

        if (compNumber == userNumber) {
            System.out.println(userNumber);
            System.out.println("Вы Угадали!");
        }
    }
}