package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("You are driver now.");
    }

    @Override
    public void passengers(int passengers) {
        System.out.println("It is " + passengers + " passengers in your bus.");
    }

    @Override
    public int fuel(int liters) {
        int fuelPrice = liters * 50;
        System.out.println("You need to pay " + fuelPrice + " rubles for " + liters + " liters of fuel.");
        return fuelPrice;
    }

    public static void main(String[] args) {
        Bus bus =  new  Bus();
        bus.drive();
        bus.passengers(23);
        bus.fuel(200);
    }
}