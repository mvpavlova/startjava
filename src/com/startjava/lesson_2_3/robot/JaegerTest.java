package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jagerOne = new Jaeger("", "Mark-3", 9);

        System.out.println(jagerOne.getModelName());
        System.out.println(jagerOne.getMark());
        System.out.println(jagerOne.getArmor());

        Jaeger jagerTwo = new Jaeger("Cherno Alpha","Mark-1", 0);
        System.out.println(jagerTwo.getModelName());
        System.out.println(jagerTwo.getMark());
        System.out.println(jagerTwo.getArmor());
    }
}