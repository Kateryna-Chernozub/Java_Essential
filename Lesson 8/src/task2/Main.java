package task2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Worker [] worker = new Worker[2];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < worker.length; i++) {
            String name = " ";
            String position = " ";
            String year = " ";

            System.out.println("Name: ");
            name = sc.nextLine();

            System.out.println("Position: ");
            position = sc.nextLine();

            System.out.println("Year: ");
            year = sc.nextLine();
    //        if (2000 > year || year > 2020 ) {
    //            System.out.println("Wrong year.");
    //        }

            worker[i] = new Worker (name, position, year); //write to constructor
        }

        for (int i = 0; i < worker.length; i++) {
            System.out.println(worker[i].toString());
        }


    //   Відсортувати по алфавіту?
    //    System.out.println(Arrays.sort());   error
    }
}
