package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя игрока: ");
        Player player1 = new Player(scan.nextLine());
        System.out.print("Введите имя игрока: ");
        Player player2 = new Player(scan.nextLine());
        GuessNumber play = new GuessNumber(player1, player2);
        String answer = "Y";
        while(!answer.equals("N")) {
            if(answer.equals("Y")) {
                System.out.println("У вас 10 попыток");
                play.startGame();
            }
            System.out.print("Хотите продолжить? Y/N ");
            answer = scan.nextLine();
        }
    }
}