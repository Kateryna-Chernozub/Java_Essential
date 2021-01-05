package com.javaEssentialRenewed.lesson_2_2.task.task_0.business;

import com.javaEssentialRenewed.lesson_2_2.task.task_0.dto.Rectangle;

import java.util.Scanner;

/**
 * Loads some values from the console
 */

public class ConsoleRectangleLoader {
    public Rectangle load() {
        Rectangle rectangle = new Rectangle();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of the first side of the rectangle:");
        rectangle.setSideA(scanner.nextDouble());

        System.out.println("Enter the value of the second side of the rectangle:");
        rectangle.setSideB(scanner.nextDouble());

        return rectangle;
    }
}
