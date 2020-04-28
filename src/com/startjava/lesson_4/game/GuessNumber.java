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
    private Player player;

    public GuessNumber(Player player1, Player player2) {
         this.player1 = player1;
         this.player2 = player2;
     }

    public void startGame() {
        restart();
        compNumber = random.nextInt(101);
        int i = 0;
        do {
            if (i < 10) {
                player = player1;
                enterNumber();
                controlNumber();
                if (player.getNumber() == compNumber) {
                    break;
                }
            player = player2;
            enterNumber();
            controlNumber();
            i++;
            }
        } while(player.getNumber() != compNumber);

        if(i == 10) {
            System.out.println("У " + player + " закончились попытки");
        } else {
            System.out.println("Игрок " + player.getName() + " угадал число " + compNumber + " с " + i + " попытки");
        }

        System.out.print(player1.getName() + ": " + Arrays.toString(player1.getNumbers()));
        System.out.print(player2.getName() + ": " + Arrays.toString(player2.getNumbers()));
    }

    private void enterNumber() {
        System.out.print("Игрок " + player.getName() + " введите число: ");
        player.setNumber(scanNumber.nextInt());
    }

    private void controlNumber() {
        if (compNumber > player.getNumber()) {
            System.out.println("Введенное вами число меньше того, что загадал компьютер");
        } else if (compNumber < player.getNumber()) {
            System.out.println("Введенное вами число больше того, что загадал компьютер");
        }
    }

    private void restart() {
        player1.setUP();
        player2.setUP();
    }
}
