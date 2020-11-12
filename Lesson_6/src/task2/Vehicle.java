package task2;

public class Vehicle {
    public static void print() {
        System.out.println("Method by Vehicle");
    }

    public class Wheel{
        public void print() {
            System.out.println("Method by Wheel");
        }
    }

    public class Door{
        public void print() {
            System.out.println("Method by Door");
        }
    }
}

class Main{
    public static void main(String[] args) {
        Vehicle.Wheel wheel = new Vehicle().new Wheel();
        Vehicle.Door door = new Vehicle().new Door();

        // Vehicle.print() - possible if Vehicle print method is static.
        Vehicle.print();
        wheel.print();
        door.print();
    }
}