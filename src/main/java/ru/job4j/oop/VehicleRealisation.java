package ru.job4j.oop;

public class VehicleRealisation {

    class Flyer implements Vehicle {
        @Override
        public void move() {
            System.out.println("I am flying.");
        }

        @Override
        public void speed() {
            System.out.println("My speed is about 800 kmph.");
        }
    }

    class Train implements Vehicle {
        @Override
        public void move() {
            System.out.println("I am moving on the rails.");
        }

        @Override
        public void speed() {
            System.out.println("My speed is about 120 kmph.");
        }
    }

    class Bus implements Vehicle {
        @Override
        public void move() {
            System.out.println("I am bus. I am moving on the streets.");
        }

        @Override
        public void speed() {
            System.out.println("My speed is about 60 kmph.");
        }
    }

    public static void main(String[] args) {
        Vehicle boeing  = new VehicleRealisation().new Flyer();
        Vehicle tu = new VehicleRealisation().new Flyer();
        Vehicle lastochka = new VehicleRealisation().new Train();
        Vehicle oldtimer = new VehicleRealisation().new Train();
        Vehicle mercedes = new VehicleRealisation().new Bus();
        Vehicle ikarus = new VehicleRealisation().new Bus();
        Vehicle[] vehicle = {boeing, tu, lastochka, oldtimer, mercedes, ikarus};
        for (int index = 0; index < vehicle.length; index++) {
            System.out.println("This is " + vehicle[index] + " object: ");
            vehicle[index].move();
            vehicle[index].speed();
            System.out.println();
        }
    }
}
