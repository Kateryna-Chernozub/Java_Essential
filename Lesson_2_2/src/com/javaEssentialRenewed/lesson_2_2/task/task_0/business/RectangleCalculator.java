package com.javaEssentialRenewed.lesson_2_2.task.task_0.business;

import com.javaEssentialRenewed.lesson_2_2.task.task_0.dto.Rectangle;

/**
 * Performs operations to calculate some measures
 */
public class  RectangleCalculator {

    /**
     * Calculates Area and Perimeter for the given {@link Rectangle}
     *
     * @param rectangle - the {@link Rectangle} Area and Perimeter to calculate
     * @return calculated Area and Perimeter for the given {@link Rectangle}
     */

    public double calculateArea(Rectangle rectangle) {
        return rectangle.getSideA() * rectangle.getSideB();
    }

    public double calculatePerimeter(Rectangle rectangle) {
        return 2 * (rectangle.getSideA() + rectangle.getSideB());
    }
}
