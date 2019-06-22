package com.taskscheduler.template.tasks.taskgroupa;

import com.taskscheduler.template.tasks.CustomTask;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Task1 implements CustomTask {

    //5 sec
    @Scheduled(fixedDelay = 1000 * 5)
    @Override
    public void execute() throws InterruptedException {
        System.out.println("Task 1 started");
        Thread.sleep(2);
        System.out.println("Task 1 complete");
    }
}
