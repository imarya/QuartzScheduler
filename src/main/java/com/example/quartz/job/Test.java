package com.example.quartz.job;

import java.time.LocalTime;
import java.time.ZoneId;

/**
 * Created by parya on 5/31/2016.
 */
public class Test {

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now(ZoneId.of("Europe/Paris"));
        System.out.println(localTime);
    }
}
