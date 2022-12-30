package ru.job4j.oop;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("I am bus. I am moving on the streets.");
    }

    @Override
    public void speed() {
        System.out.println("My speed is about 60 kmph.");
    }
}
