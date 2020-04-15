package com.startjava.lesson_4.array;

import java.sql.SQLOutput;

public class ArrayTest {
    public static void main(String[] args) {
        int[] numbers = new int[6];
        float[] numbers1 = {5.1f, .5f, 200.5f};
        System.out.println(numbers.length);
        System.out.println(numbers1.length);
//        System.out.println(numbers1);
        for(float number:numbers1) {
            System.out.print(numbers + " ");
        }
        //for(int i = 0; i < numbers1.length; i++) numbers[i] = i * 10;
        //for(int i = 0; i < numbers1.length; i++) System.out.print(numbers[i] + " ");

        String[] text = new String[3];

        for(String string: text) {
            System.out.println(text);
        }


    }
}
