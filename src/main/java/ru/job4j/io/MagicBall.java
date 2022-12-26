package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        String phrase;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите закрытый вопрос: ");
        String name = input.nextLine();
        int answer = new Random().nextInt(3);
        switch (answer) {
            case 0: phrase = "Да";
                break;
            case 1: phrase = "Нет";
                break;
            default : phrase = "Может быть";
        }
        System.out.println("Ответ на ваш вопрос: " + name + ",  будет - " + phrase);
    }
}