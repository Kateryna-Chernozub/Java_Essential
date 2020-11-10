package task3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car ();
        Car car2 = new Car (2);
        Car car3 = new Car (3, 60);
        Car car4 = new Car (4, 80, 320);
        Car car5 = new Car (5, 100, 400, "black");

        System.out.println(car1.year + " " + car1.getSpeed() + " " + car1.weight + " " + car1.color);
        System.out.println(car2.year + " " + car2.getSpeed() + " " + car2.weight + " " + car2.color);
        System.out.println(car3.year + " " + car3.getSpeed() + " " + car3.weight + " " + car3.color);
        System.out.println(car4.year + " " + car4.getSpeed() + " " + car4.weight + " " + car4.color);
        System.out.println(car5.year + " " + car5.getSpeed() + " " + car5.weight + " " + car5.color);
    }
}
