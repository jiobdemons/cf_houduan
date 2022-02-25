package com.cjcwecha.cjcwecha.controller;

import com.cjcwecha.cjcwecha.config.TreadTasks;
import com.cjcwecha.cjcwecha.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/")
public class RunableApi {

    @Autowired
    private AsyncService asyncService;

    @Autowired
    private TreadTasks treadTasks;

    @RequestMapping("/useMySyncTask")
    public void useMySyncTask() {
        System.out.print("-*-*-*-*-*-");
        treadTasks.startMyTreadTask();
    }

    @RequestMapping("/getSyncTask")
    public void getSyncTask1() {
        asyncService.runThreadTest(5);
    }

    @RequestMapping("/getSyncTask2")
    public void getSyncTask2() {
        asyncService.runThreadTest2(5);
    }

}
