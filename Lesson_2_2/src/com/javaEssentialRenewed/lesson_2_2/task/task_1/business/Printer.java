package com.javaEssentialRenewed.lesson_2_2.task.task_1.business;

import com.javaEssentialRenewed.lesson_2_2.task.task_1.dto.Circle;

public class Printer {
    Circle circle = new Circle();

    public void print(double area) {
        System.out.println("The area of the circle with the radius " + circle.getRadiusOfCircle() + " is: " + area);
    }
}

