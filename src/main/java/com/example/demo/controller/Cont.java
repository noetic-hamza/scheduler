package com.example.demo.controller;


import com.example.demo.service.Scheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
public class Cont {



    @Autowired
    Scheduler scheduler;

    @GetMapping("/apii")
    public String get() throws ParseException {
        scheduler.method();

        return "Success";
    }

}
