package ru.job4j.oop;

public class Flyer implements Vehicle {
    @Override
    public void move() {
        System.out.println("I am flying.");
    }

    @Override
    public void speed() {
        System.out.println("My speed is about 800 kmph.");
    }
}
