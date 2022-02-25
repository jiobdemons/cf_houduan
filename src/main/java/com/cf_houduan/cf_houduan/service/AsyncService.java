package com.cjcwecha.cjcwecha.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {



    @Async("taskExecutor")
    public void runThreadTest(Integer i) {
        // TODO Auto-generated method stub
        System.out.println("执行异步任务1--->"+i+"-->"+Thread.currentThread().getName());
        for(int j=0;j<20;j++) {
            System.out.println("异步执行1：current j:"+j);
        }

    }


    @Async("taskExecutor")
    public void runThreadTest2(Integer i) {
        // TODO Auto-generated method stub
        System.out.println("执行异步任务2--->"+i+"-->"+Thread.currentThread().getName());
        for(int j=100;j<120;j++) {
            System.out.println("异步执行2：current j:"+j);
        }

    }

}
