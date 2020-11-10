package task21;

public class Worker {
    String name;
    String position;
    int year;


    Worker (String name, String position, int year){
        this.name = name;
        this.position = position;
        this.year = year;
    }

    public String toString(){
        return "Name: " + this.name + ". Position: " + this.position + ". Year: " + this.year;
    }
}

