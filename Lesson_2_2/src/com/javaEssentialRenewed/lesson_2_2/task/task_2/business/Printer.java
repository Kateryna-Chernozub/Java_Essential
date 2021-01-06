package com.javaEssentialRenewed.lesson_2_2.task.task_2.business;

import com.javaEssentialRenewed.lesson_2_2.task.task_2.dto.Car;

public class Printer {
    public void print (Car car1) {
        System.out.println("Car 1:" +
                "\nyear: " + car1.getYear() + ", speed: " + car1.getSpeed() + ", weight: " + car1.getWeight() + ", color: " + car1.getColor() + ".\n");
    }

    public void printCar2(Car car2) {
        System.out.println("Car 2:" +
                "\nyear: " + car2.getYear() + ", speed: " + car2.getSpeed() + ", weight: " + car2.getWeight() + ", color: " + car2.getColor() + ".\n");
    }

    public void printCar3(Car car3) {
        System.out.println("Car 3:" +
                "\nyear: " + car3.getYear() + ", speed: " + car3.getSpeed() + ", weight: " + car3.getWeight() + ", color: " + car3.getColor() + ".\n");
    }

    public void printCar4(Car car4) {
        System.out.println("Car 4:" +
                "\nyear: " + car4.getYear() + ", speed: " + car4.getSpeed() + ", weight: " + car4.getWeight() + ", color: " + car4.getColor() + ".\n");
    }

    public void printCar5(Car car5) {
        System.out.println("Car 5:" +
                "\nyear: " + car5.getYear() + ", speed: " + car5.getSpeed() + ", weight: " + car5.getWeight() + ", color: " + car5.getColor() + ".\n");
    }
}
