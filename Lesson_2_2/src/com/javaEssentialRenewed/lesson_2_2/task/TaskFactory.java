package com.javaEssentialRenewed.lesson_2_2.task;

import com.javaEssentialRenewed.lesson_2_2.task.task_0.TaskZeroProcessor;
import com.javaEssentialRenewed.lesson_2_2.task.task_1.TaskFirstProcessor;
import com.javaEssentialRenewed.lesson_2_2.task.task_2.TaskSecondProcessor;


public class TaskFactory {
    private TaskProcessor taskZeroProcessor;
    private TaskProcessor taskFirstProcessor;
    private TaskProcessor taskSecondProcessor;

    public TaskProcessor getTaskZeroProcessor() {
        if (taskZeroProcessor == null) {
            taskZeroProcessor = new TaskZeroProcessor();
        }
        return taskZeroProcessor;
    }
    
    public TaskProcessor getTaskFirstProcessor() {
        if (taskFirstProcessor == null) {
            taskFirstProcessor = new TaskFirstProcessor();
        }
        return taskFirstProcessor;
    }

    public TaskProcessor getTaskSecondProcessor() {
        if (taskSecondProcessor == null) {
            taskSecondProcessor = new TaskSecondProcessor();
        }
        return taskSecondProcessor;
    }
}
