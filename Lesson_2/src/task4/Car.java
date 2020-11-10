package task4;

public class Car {
    int year;
    private double speed;
    int weight;
    String color;

    Car(){
        this.year = 1;
        this.speed = 100;
        this.weight = 200;
        this.color = "pink";
    }

    Car(int year){
        this.year = year;
        this.speed = 150;
        this.weight = 250;
        this.color = "gray";
    }

    Car(int year, double speed){
        this.year = year;
        this.speed = speed;
        this.weight = 300;
        this.color = "black";
    }

    Car(int year, double speed, int weight){
        this(year, speed);
        this.weight = weight;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
