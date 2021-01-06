package com.javaEssentialRenewed.lesson_2_2.main;

import com.javaEssentialRenewed.lesson_2_2.task.TaskFactory;

public class EntryPoint {

    private  static TaskFactory taskFactory = new TaskFactory();
    public static void main(String[] args) {

        //taskFactory.getTaskZeroProcessor().process();
        //taskFactory.getTaskFirstProcessor().process();
        taskFactory.getTaskSecondProcessor().process();
    }
}
