package com.javaEssentialRenewed.lesson_2_2.task.task_0;

import com.javaEssentialRenewed.lesson_2_2.task.TaskProcessor;
import com.javaEssentialRenewed.lesson_2_2.task.task_0.business.ConsoleRectangleLoader;
import com.javaEssentialRenewed.lesson_2_2.task.task_0.business.Printer;
import com.javaEssentialRenewed.lesson_2_2.task.task_0.business.RectangleCalculator;
import com.javaEssentialRenewed.lesson_2_2.task.task_0.dto.Rectangle;

/**
 * Performs operations to calculate Rectangle Area and Perimeter.
 * 1.Loads Rectangle
 * 2.Calculate
 * 3.Print result
 */
public class TaskZeroProcessor implements TaskProcessor {
    private static final String TASK_DESCRIPTION = "Task_0: Performs operations to calculate Rectangle Area and Perimeter.";

    private ConsoleRectangleLoader consoleRectangleLoader = new ConsoleRectangleLoader();
    private RectangleCalculator rectangleCalculator = new RectangleCalculator();
    private Printer printer = new Printer();

    @Override
    public void process() {
        System.out.println(TASK_DESCRIPTION);
        Rectangle rectangle = consoleRectangleLoader.load();

        double area = rectangleCalculator.calculateArea(rectangle);
        double perimeter = rectangleCalculator.calculatePerimeter(rectangle);

        printer.print(area, perimeter);
    }
}
