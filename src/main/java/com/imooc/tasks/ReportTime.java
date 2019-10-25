package com.imooc.tasks;

import java.util.Date;
import java.util.Locale;
import java.util.concurrent.Future;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.thymeleaf.util.DateUtils;

/**
 * <br/>
 *
 * @author yangchaozheng
 * @date 2019/10/25 13:20
 */
@Component
public class ReportTime {
    @Autowired
    private AsyncTasks asyncTasks;

    @Scheduled(fixedDelay = 60000)
    public void reportCurrentTime() {
        System.out.println(DateUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss", Locale.CHINA));
    }

    @Scheduled(cron = "0 03 * * * ?")
    public void excuteAsyncTasks() throws InterruptedException {
        long start = System.currentTimeMillis();
        Future<Boolean> f1 = asyncTasks.task1();
        Future<Boolean> f2 = asyncTasks.task2();

        while (!f1.isDone() || !f2.isDone()) {
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
