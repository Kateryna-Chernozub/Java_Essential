package task1;

public enum Vehicles {
    Car1 (10, "black"), Car2(15, "white");

    private int cost;
    private String color;

    Vehicles (int cost, String color) {
        this.cost = cost;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String toString () {
        return this.name() + ": cost = " + cost + ", color: " + this.getColor();
    }
}

class Main{
    public static void main(String[] args) {
        Vehicles vehicles = null;

        System.out.println(vehicles.Car1.toString());
        System.out.println(vehicles.Car2.toString());
    }
}

