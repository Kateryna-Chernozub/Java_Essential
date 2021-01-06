package com.javaEssentialRenewed.lesson_2_2.task.task_2;

import com.javaEssentialRenewed.lesson_2_2.task.TaskProcessor;
import com.javaEssentialRenewed.lesson_2_2.task.task_2.business.Printer;
import com.javaEssentialRenewed.lesson_2_2.task.task_2.dto.Car;

/**
 * Performs output of all constructors of a class Car
 * 1.Create a Car class
 * 2.Create class constructors
 * 3.Print the result of all constructors
 */

public class TaskSecondProcessor implements TaskProcessor {
    private static final String TASK_DESCRIPTION = "Task_2: Performs output of all constructors of a class Car";

    private Printer printer = new Printer();

    Car car1 = new Car();
    Car car2 = new Car(2);
    Car car3 = new Car(3, 60);
    Car car4 = new Car(4, 80, 350);
    Car car5 = new Car(5,100, 400, "black");

    @Override
    public void process() {
        System.out.println(TASK_DESCRIPTION);

        printer.print(car1);
        printer.printCar2(car2);
        printer.printCar3(car3);
        printer.printCar4(car4);
        printer.printCar5(car5);
    }
}
