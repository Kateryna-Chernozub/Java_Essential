package task21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Worker[] worker = new Worker[2];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < worker.length; i++) {
    //        String name = " ";
    //        String position = " ";
    //        int year = 0;

            System.out.println("Name: ");
            String name = sc.nextLine();

            System.out.println("Position: ");
            String position = sc.nextLine();

            System.out.println("Year: ");
            int year = sc.nextInt();
            //        if (2000 > year || year > 2020 ) {
            //            System.out.println("Wrong year.");
            //        }

          worker[i] = new Worker(name, position, year);
        }

        for (int i = 0; i < worker.length; i++) {
            System.out.println(worker[i]);
        }
    }
}

