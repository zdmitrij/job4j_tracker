package ru.job4j.pojo;

import java.util.Date;
public class Student {
    private String name;
    private int group;
    private Date entrance;

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    public Date getEntrance() {
        return entrance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setEntrance(Date entrance) {
        this.entrance = entrance;
    }
}
