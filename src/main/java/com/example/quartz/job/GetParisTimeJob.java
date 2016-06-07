package com.example.quartz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

/**
 * Created by parya on 5/31/2016.
 */
public class GetParisTimeJob implements Job {
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        LocalTime localTime = LocalTime.now(ZoneId.of("Europe/Paris"));
        LocalDate localDate = LocalDate.now(ZoneId.of("Europe/Paris"));
        System.out.println("Europe/Paris -> Time : " + localTime + " Date : " + localDate);
    }
}
