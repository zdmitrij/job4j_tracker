package ru.job4j.ex;

public class Fact {
    public static int calc(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("N could not be less then 0");
        }
        int rsl = 1;
        for (int index = 2; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }

    public static void main(String[] args) throws IllegalArgumentException {
        new Fact().calc(-1);
    }
}