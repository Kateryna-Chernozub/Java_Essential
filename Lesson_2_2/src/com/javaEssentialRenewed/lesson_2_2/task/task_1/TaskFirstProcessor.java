package com.javaEssentialRenewed.lesson_2_2.task.task_1;

import com.javaEssentialRenewed.lesson_2_2.task.TaskProcessor;
import com.javaEssentialRenewed.lesson_2_2.task.task_1.business.CircleCalculator;
import com.javaEssentialRenewed.lesson_2_2.task.task_1.business.ConsoleCircleLoader;
import com.javaEssentialRenewed.lesson_2_2.task.task_1.business.Printer;
import com.javaEssentialRenewed.lesson_2_2.task.task_1.dto.Circle;

/**
 * Performs operations to calculate the area of the circle
 * 1.Loads parameter
 * 2.Calculate
 * 3.Print result
 */

public class TaskFirstProcessor implements TaskProcessor {
    private static final String TASK_DESCRIPTION = "Task_1: Performs operations to calculate the area of the circle.";

    private ConsoleCircleLoader consoleCircleLoader = new ConsoleCircleLoader();
    private CircleCalculator circleCalculator = new CircleCalculator();
    private Printer printer = new Printer();

    @Override
    public void process(){
        System.out.println(TASK_DESCRIPTION);
        Circle circle = consoleCircleLoader.load();

        double area = circleCalculator.calculateArea(circle);

        printer.print(area);
    }
}
