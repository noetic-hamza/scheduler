package com.example.demo.Scheduler;

import com.example.demo.service.Scheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.ParseException;

@EnableScheduling
@Service
public class SchedulerClass {




@Autowired
Scheduler scheduler;


    @Scheduled(cron = "0 29 17 * * ?")
    public void method () throws ParseException {
        scheduler.method();
        System.out.println("Success");

    }


}
