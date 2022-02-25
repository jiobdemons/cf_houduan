package com.cf_houduan.cf_houduan.config;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;


@Component
public class TreadTasks {
    @Async
    public void startMyTreadTask() {
        System.out.println("this is my async task");
    }
}

