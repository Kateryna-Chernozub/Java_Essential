package task1;

public abstract class Shape {
    public abstract void draw();
}

class Circle extends Shape {
    public void draw(){
        System.out.println("Circle");
    }
}

class Rectangle extends Shape {
    public void draw(){
        System.out.println("Rectangle");
    }
}

class Main{
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.draw();
        rectangle.draw();
    }
}
