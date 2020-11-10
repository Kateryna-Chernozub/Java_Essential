package task2;

public class Car {
    int year;
    String color;
    
    Car () {
        this.year = 1;
        this.color = "green";
    }
    
    Car(int year){
        this.year = year;
        this.color = "red";
    }
    
    Car (int year, String color){
        this.year = year;
        this.color = color;
    }
    
    // Create getters and setters
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
