package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index] == key) {
                rsl = index;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException();
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] value = {"One", "Two", "Three"};
        try {
            indexOf(value, "Four");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}