package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private Scanner scanNumber = new Scanner(System.in);
    private Random random = new Random();
    private int compNumber;
    private int i = 0;

    public GuessNumber(Player player1, Player player2) {
         this.player1 = player1;
         this.player2 = player2;
     }

    public void startGame() {
        setDefaultValues();
        compNumber = random.nextInt(101);
        do {
            enterNumber(player1);
            if(compare(player1)) {
                break;
            }
            enterNumber(player2);
            if(compare(player2)) {
                break;
            } else {
                i++;
            }
        } while(i < 10);

        System.out.println(player1.getName() + ": " + Arrays.toString(player1.getNumbers()));
        System.out.println(player2.getName() + ": " + Arrays.toString(player2.getNumbers()));
    }

    private void enterNumber(Player player) {
        System.out.print("Игрок " + player.getName() + " введите число: ");
        player.setNumber(scanNumber.nextInt());
    }

    private boolean compare(Player player) {
        if (compNumber > player.getNumber()) {
            System.out.println("Введенное вами число меньше того, что загадал компьютер");
        } else if (compNumber < player.getNumber()) {
            System.out.println("Введенное вами число больше того, что загадал компьютер");
        } else if (player.getNumber() == compNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + compNumber + " с " + i + " попытки");
            return true;
        } else if (i == 10) {
            System.out.println("У игрока " + player.getName() + " закончились попытки.");
        }
        return false;
    }

    private void setDefaultValues() {
        player1.setUp();
        player2.setUp();
    }
}
