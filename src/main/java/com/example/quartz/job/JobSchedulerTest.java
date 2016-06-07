package com.example.quartz.job;

/**
 * Created by parya on 5/31/2016.
 */
public class JobSchedulerTest {

    public static void main(String[] args) {

        JobScheduler jobScheduler = JobScheduler.getInstance();
        jobScheduler.scheduleJob(GetIndianTimeJob.class, "0/5 * * * * ?", "indianTime");
        jobScheduler.scheduleJob(GetParisTimeJob.class, "0/5 * * * * ?", "parisTime");
    }
}
