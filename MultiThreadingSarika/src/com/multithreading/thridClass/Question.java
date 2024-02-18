package com.multithreading.thridClass;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

//Ques- You have 20000 tasks, and 4 threads is there, 1 thread can perform 50 task at a time. So after doing 200
//task by four thread. I want to check first is any problem with that 200 task or not. If there is no problem then
//will start execution of next 200 task.

public class Question {
    public static void main(String[] args) {
        int totalTasks = 20000;
        int batchSize = 200;
        int threadCount = 4;

        ExecutorService executorService = Executors.newFixedThreadPool(threadCount);
        CompletionService<Boolean> completionService = new ExecutorCompletionService<>(executorService);

        List<Future<Boolean>> futures = new ArrayList<>();

        try {
            for (int i = 0; i < totalTasks; i += batchSize) {
                List<Callable<Boolean>> batchTasks = createBatchTasks(i, batchSize);
                
                for (Callable<Boolean> task : batchTasks) {
                    futures.add(completionService.submit(task));
                }

                // Check results of the completed tasks
                for (int j = 0; j < batchSize; j++) {
                    Future<Boolean> completedTask = completionService.take();
                    Boolean result = completedTask.get();

                    if (!result) {
                        // There is a problem with the task, handle it accordingly
                        System.out.println("Problem detected in tasks. Exiting...");
                        executorService.shutdown();
                        return;
                    }
                }
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }

        // All tasks completed successfully
        System.out.println("All tasks completed successfully.");
    }

    private static List<Callable<Boolean>> createBatchTasks(int startTaskId, int batchSize) {
        List<Callable<Boolean>> tasks = new ArrayList<>();

        for (int i = 0; i < batchSize; i++) {
            final int taskId = startTaskId + i;
            tasks.add(() -> {
                // Perform your task logic here
                // If there is a problem, return false; otherwise, return true
                System.out.println("Executing task: " + taskId);
                return true; // Replace with your task logic and error-checking
            });
        }

        return tasks;
    }
}

