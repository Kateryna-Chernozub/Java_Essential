package com.javaEssentialRenewed.lesson_2_2.task.task_1.business;

import com.javaEssentialRenewed.lesson_2_2.task.task_1.dto.Circle;

import java.util.Scanner;

/**
 * Loads the radius value of the circle from the console.
 */

public class ConsoleCircleLoader {
    public Circle load(){
        Circle circle = new Circle();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of the radius of the circle: ");
        circle.setRadiusOfCircle(scanner.nextDouble());

        return circle;
    }
}
