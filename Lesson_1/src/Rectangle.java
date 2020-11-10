import java.util.Scanner;

public class Rectangle {
    double side1;
    double side2;

//Створюю метод визначення площі прямокутника:
    public double areaCalculator(double side1, double side2){
        double result1 = side1 * side2;
        return result1;
    }
//Метод визначення периметра прямокутника:
    public double perimetrCalculator (double side1, double side2){
        double result2 = side1 + side2;
        return result2;
    }
//Написала програму, яка приймає від користувача данні і виводить периметр і площу.
    public static void main(String[] args) {
        System.out.println("Введіть перше значення першої сторони прямокутника:");

        Scanner sc = new Scanner(System.in);
        double side1 = sc.nextDouble();

        System.out.println("Введіть друге значення другої сторони прямокутника:");
        double side2 = sc.nextDouble();

        System.out.println("Периметр прямокутника: " + result1);
        System.out.println("Площа прямокутника: " + result2);

    }
}
