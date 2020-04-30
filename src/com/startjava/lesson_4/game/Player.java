package com.startjava.lesson_4.game;

import sun.plugin.javascript.navig.Array;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] numbers = new int[10];
    private int attempt = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        attempt++;
        numbers[attempt] = number;
    }

    public int getNumber() {
        return numbers[attempt];
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }

    public void setUp() {
        Arrays.fill(numbers, 0, attempt, 0);
        attempt = 0;
    }
}