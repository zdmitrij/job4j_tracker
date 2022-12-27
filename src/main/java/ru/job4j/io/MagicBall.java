package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите закрытый вопрос: ");
        String name = input.nextLine();
        int answer = new Random().nextInt(3);
        String phrase = switch (answer) {
            case 0 -> "Да";
            case 1 -> "Нет";
            default -> "Может быть";
        };
        System.out.println("Ответ на ваш вопрос: " + name + ",  будет - " + phrase);
    }
}
