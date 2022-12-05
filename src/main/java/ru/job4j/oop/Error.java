package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Логическая переменная active инициализирована как " + active);
        System.out.println("int переменная status инициализирована как " + status);
        System.out.println("Строковая переменная message это " + message);
    }

    public static void main(String[] args) {
        Error errorNoParameters = new Error();
        errorNoParameters.printInfo();
        Error errorSet1 = new Error(true, 4, "Set1");
        errorSet1.printInfo();
        Error errorSet2 = new Error(false, 345, "Set2");
        errorSet2.printInfo();
        Error errorSet3 = new Error(true, 90, "Set3");
        errorSet3.printInfo();
    }
}