package task1;

public class Animal {
    String name;
    int age;
    Boolean tail;

    Animal(String name, int age, Boolean tail){
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "Name is: " + name + ". Age is: " + age + ". Tail is " + tail;
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}


class Main{
    public static void main(String[] args) {
        Animal animal = new Animal("Barsik", 13, true);
        System.out.println(animal.toString());
        System.out.println(animal.hashCode());
    }
}
