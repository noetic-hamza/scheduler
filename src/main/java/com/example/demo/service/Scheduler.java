package com.example.demo.service;

import com.example.demo.Repositiry.RepositoryData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class Scheduler {

    @Autowired
    RepositoryData repository;

//    @Scheduled(cron = "0 27 17 * * * ")
//    public void method2 (){
//        System.out.println("Run1 at ");
//    }
    public void method ()  {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date date = new Date();
        String dar= simpleDateFormat.format(date);
         repository.getResult(Timestamp.valueOf("2022-08-01 00:00:00"),Timestamp.valueOf("2022-08-01 23:59:59"));

        System.out.println("Success");

    }

}
