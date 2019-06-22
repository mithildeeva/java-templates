package com.taskscheduler.template.tasks.taskgroupa;

import com.taskscheduler.template.tasks.CustomTask;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Task2 implements CustomTask {

    // 5 sec
    @Scheduled(fixedDelay = 1000 * 5)
    @Override
    public void execute() throws InterruptedException {
        System.out.println("Task 2 started");
        Thread.sleep(2);
        System.out.println("Task 2 complete");
    }
}
