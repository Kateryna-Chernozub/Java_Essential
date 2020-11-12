package task2;

public class Worker {
    String name;
    String position;
    String year;


    Worker (String name, String position, String year){
        this.name = name;
        this.position = position;
        this.year = year;
    }

    public String toString() {
        return "Name: " + this.name + ". Position: " + this.position + ". Year: " + this.year;
    }
}
