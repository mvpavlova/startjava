package com.startjava.lesson_4.game;

import sun.plugin.javascript.navig.Array;

import java.util.Arrays;

public class Player {

    private String name;
    private int number;
    private int[] numbers = new int[10];
    private int i;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
        if(numbers[i] == 0) {
            numbers[i] = number;
            i++;
        } else {
            numbers[i] = number;
        }
    }

    public int getNumber() {
        return number;
    }

    public int[] getNumbers() {
        numbers = Arrays.copyOf(numbers, i);
        return numbers;
    }

    public void setUP() {
        Arrays.fill(numbers, 0, i, 0);
        i = 0;
    }
}