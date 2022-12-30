package ru.job4j.oop;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("I am moving on the rails.");
    }

    @Override
    public void speed() {
        System.out.println("My speed is about 120 kmph.");
    }
}
