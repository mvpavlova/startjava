package com.startjava.lesson_4.game;

import sun.plugin.javascript.navig.Array;

import java.util.Arrays;

public class Player {

    private  String namePlayer;
    private int number;
    private int[] numberPlayer = new int[10];
    private int i = 0;

    public Player(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public String getName() {
        return namePlayer;
    }

    public void setNumber(int number) {
        this.number = number;
        if(!numberPlayer.equals(0)) {
            numberPlayer[i] = number;
            i++;
        } else {
            numberPlayer[i] = number;
        }
    }

    public int getNumber() {
        return number;
    }

    public void getNumberPlayer() {
    int[] numbersCopy = Arrays.copyOf(numberPlayer, i);
    System.out.println(Arrays.toString(numbersCopy));
    }

    public void restartGame() {
        Arrays.fill(numberPlayer, 0, i, 0);
        i = 0;
    }
}