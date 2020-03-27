public class MyFirstGame {
    public static void main(String[] args) {
        int numberComputer = 20;
        int numberUser = 20;
        if (numberUser > numberComputer) {
            System.out.println("Введенное вами число больше того, что загадал компьютер");
        } else if (numberUser < numberComputer) {
              System.out.println("Введенное вами число меньше того, что загадал компьютер");
        } else if (numberUser == numberComputer) {
              System.out.println("Вы Угадали!");
        } 
    }
}