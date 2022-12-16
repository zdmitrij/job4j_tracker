package ru.job4j.pojo;
import java.util.Date;
public class College {
  public static void main(String[] args) {
     Student student = new Student();
     student.setName("Nikolay");
     student.setGroup(5);
     student.setEntrance(new Date());
     System.out.println("Имя студента " + student.getName() + ", группа " +  student.getGroup() + ", дата  " + student.getEntrance());
    }
}