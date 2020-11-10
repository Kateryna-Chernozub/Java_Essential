package task3;

public class Main {
    public static void main(String[] args) {

        Plane p = new Plane();
        p.cost = 1000000;
        p.speed = 300;
        p.year = 10;
        p.height = 5000;
        p.passengers = 300;

        System.out.println("Plane: cost " + p.cost + ", speed " + p.speed + ", year " + p.year + ", height " + p.height + ", passengers " + p.passengers);

        Ship s = new Ship();
        s.cost = 500000;
        s.speed = 150;
        s.year = 5;
        s.port = "Odessa";
        s.passengers = 800;

        System.out.println("Ship: cost " + s.cost + ", speed " + s.speed + ", year " + s.year + ", port " + s.port + ", passengers " + s.passengers);

        Car c = new Car();
        c.cost = 300000;
        c.speed = 120;
        c.year = 3;
        c.passengers = 5;

        System.out.println("Car: cost " + c.cost + ", speed " + c.speed + ", year " + c.year +  ", passengers " + c.passengers);
    }
}
