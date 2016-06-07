package com.example.quartz.job;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

/**
 * Created by parya on 5/31/2016.
 */
public class JobScheduler {

    private static JobScheduler instance = new JobScheduler();

    private JobScheduler() {

    }

    public static JobScheduler getInstance() {
        return instance;
    }

    public void scheduleJob(Class<? extends Job> tClass, String cronExpression, String jobName) {
        try {
            JobDetail job1 = JobBuilder.newJob(tClass)
                    .withIdentity(jobName, "group1").build();

            Trigger trigger1 = TriggerBuilder.newTrigger()
                    .withIdentity(jobName, "group1")
                    .withSchedule(CronScheduleBuilder.cronSchedule(cronExpression))
                    .build();

            Scheduler scheduler1 = new StdSchedulerFactory().getScheduler();
            scheduler1.start();
            scheduler1.scheduleJob(job1, trigger1);
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
}
