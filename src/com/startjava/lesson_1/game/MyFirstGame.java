package com.startjava.lesson_1.game;

public class MyFirstGame {
    public static void main(String[] args) {
        int compNumber = 20;
        int userNumber = 10;

        while(compNumber > userNumber) {
            System.out.println(userNumber);
            System.out.println("Введенное вами число меньше того, что загадал компьютер");
            userNumber++;
        }

        while(compNumber < userNumber) {
            System.out.println(userNumber);
            System.out.println("Введенное вами число больше того, что загадал компьютер");
            userNumber--;
        }
        
            System.out.println(userNumber);
            System.out.println("Вы Угадали!");
    }
}