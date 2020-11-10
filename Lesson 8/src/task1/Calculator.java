package task1;

import java.util.Scanner;

public class Calculator {
    int a;
    int b;
    int result;

    Calculator (int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void add() {
//        result = a + b;
//        System.out.println("a + b = " + result);
        System.out.println("a + b = " + (a + b));
    }

    public void sub() {
        System.out.println("a - b = " + (a - b));
    }

    public void mul () {
        System.out.println("a * b = " + (a * b));
    }

    public void div () {
        try {
            a = a / b;
            System.out.println("a / b = " + (a / b));
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}

class Main{
    public static void main(String[] args) {
        System.out.println("Enter the arithmetic operation \n (add, sub, mul, div): ");
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();

        System.out.println("Enter the numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Calculator calculator = new Calculator(a, b);

        if (operation.equals("add")) {
            calculator.add();
        } if (operation.equals("sub")) {
            calculator.sub();
        } if (operation.equals("mul")) {
            calculator.mul();
        } if (operation.equals("div")) {
            calculator.div();
        }
  //      } else {
  //          System.out.println("Wrong operation");
  //      }
    }
}
