package ru.job4j.oop;

public class VehicleRealisation {

    public static void main(String[] args) {
        Vehicle boeing  = new Flyer();
        Vehicle tu = new Flyer();
        Vehicle lastochka = new Train();
        Vehicle oldtimer = new Train();
        Vehicle mercedes = new Bus();
        Vehicle ikarus = new Bus();
        Vehicle[] vehicle = {boeing, tu, lastochka, oldtimer, mercedes, ikarus};
        for (int index = 0; index < vehicle.length; index++) {
            System.out.println("This is " + vehicle[index] + " object: ");
            vehicle[index].move();
            vehicle[index].speed();
            System.out.println();
        }
    }
}