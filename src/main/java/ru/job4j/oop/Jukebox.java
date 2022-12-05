package ru.job4j.oop;

public class Jukebox {

    public void music(int position) {
        String rsl = switch (position) {
            case 1 -> "Пусть бегут неуклюже";
            case 2 -> "Спят усталые игрушки";
            default -> "Песня не найдена";
        };
        System.out.println(rsl);
    }

    public static void main(String[] args) {
        Jukebox redJukebox = new Jukebox();
        redJukebox.music(1);
        redJukebox.music(2);
        redJukebox.music(9);
    }
}
