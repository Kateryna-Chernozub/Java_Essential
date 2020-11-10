package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyArea area = new MyArea();
        System.out.println("Please, enter the number: ");

        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();

        System.out.println("The area of circle: " + MyArea.areaOfCircle(radius));
    }
}
