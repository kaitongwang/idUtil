package cn.wkt.com.test;


import cn.wkt.com.util.DateID;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 描述: 测试生成UUID
 *
 * @Author: Kt.w
 * @Date: 2018/12/20
 * @Version 1.0
 * @since 1.0
 */
public class TextUUID {
    public static void main(String[] args) {
        timer2();
    }

    public static void timer2() {

        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleAtFixedRate(new Runnable() {
            public void run() {
                DateID.dataIns= 10000;
            }
        }, 0, 24 * 60 * 60 * 1000, TimeUnit.MILLISECONDS);
    }
}
