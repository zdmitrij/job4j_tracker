package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    @SuppressWarnings("checkstyle:ConstantName")
    private  final Item[] items = new Item[100];
    private int ids = 1;
    private  int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public  Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        int counter = 0;
        Item[] rsl = new Item[size];
        for (int index = 0; index < size; index++) {
            if (items[index].getName().equals(key)) {
                rsl[counter] = items[index];
                counter++;
            }
        }
        return Arrays.copyOf(rsl, counter);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            item.setId(id);
            items[index] = item;
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            System.arraycopy(items, index + 1, items, index, size - index - 1);
            items[size - 1] = null;
            size--;
        }
        return rsl;
    }
}
