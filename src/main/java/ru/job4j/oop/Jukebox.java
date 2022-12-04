package ru.job4j.oop;

public class Jukebox {

    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else  if (position == 2) {
            System.out.println("Спят усталые игрушки");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox redJukebox = new Jukebox();
        redJukebox.music(1);
        redJukebox.music(2);
        redJukebox.music(9);
    }
}
