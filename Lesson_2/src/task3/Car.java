package task3;

public class Car {
    int year;
    private double speed;
    int weight;
    String color;

    Car(){
        this.year = 1;
        this.speed = 70;
        this.weight = 300;
        this.color = "white";
    }

    Car(int year){
        this.year = year;
        this.speed = 80;
        this.weight = 400;
        this.color = "violet";
    }

    Car(int year, double speed){
        this.year = year;
        this.speed = speed;
        this.weight = 500;
        this.color = "yellow";
    }

    Car(int year, double speed, int weight){
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = "blue";
    }

    Car(int year, double speed, int weight, String color){
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
