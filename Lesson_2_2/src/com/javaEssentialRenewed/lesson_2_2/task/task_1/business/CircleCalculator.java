package com.javaEssentialRenewed.lesson_2_2.task.task_1.business;

import com.javaEssentialRenewed.lesson_2_2.task.task_1.dto.Circle;

/**
 * Performs operations to calculate the area of the circle
 */

public class CircleCalculator {
    /**
     * Calculate Area of the circle for the given {@link Circle}
     *
     * @param circle - the {@link Circle} Area to calculate
     * @return calculated Area for the given {@link Circle}
     */

    public double calculateArea (Circle circle) {
        return circle.getRadiusOfCircle() * Math.PI;
    }
}
