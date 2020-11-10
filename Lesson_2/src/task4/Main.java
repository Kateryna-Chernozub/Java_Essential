package task4;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(1, 100);
        Car car3 = new Car (2,150, 300);

        System.out.println(car3.year + " " + car3.getSpeed() + " " + car3.weight);
    }
}
