package com.taskscheduler.template.config;

import com.taskscheduler.template.TaskSchedulerApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

@Configuration
@EnableAsync
@EnableScheduling
@ComponentScan(basePackageClasses = TaskSchedulerApplication.class)
public class TaskSchedulerSettings {

    @Bean
    public ThreadPoolTaskScheduler getThreadPoolTaskScheduler() {
        ThreadPoolTaskScheduler tpts = new ThreadPoolTaskScheduler();
        tpts.setPoolSize(2);
        tpts.setThreadNamePrefix(TaskSchedulerApplication.class.getName());
        return tpts;
    }
}
