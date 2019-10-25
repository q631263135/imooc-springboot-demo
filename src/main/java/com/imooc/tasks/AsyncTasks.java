package com.imooc.tasks;

import java.util.concurrent.Future;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

/**
 * <br/>
 *
 * @author yangchaozheng
 * @date 2019/10/25 13:42
 */
@Component
public class AsyncTasks {

    @Async
    public Future<Boolean> task1() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread.sleep(1000);
        long end = System.currentTimeMillis();
        System.out.println("task1() 耗时" + (end - start) + "毫秒");
        return new AsyncResult(true);
    }

    @Async
    public Future<Boolean> task2() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread.sleep(2000);
        long end = System.currentTimeMillis();
        System.out.println("task2() 耗时" + (end - start) + "毫秒");
        return new AsyncResult(true);
    }
}
