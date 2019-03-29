package com.kuiniu.springbootdubboapi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.Date;
import java.util.concurrent.Executors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SyncThread implements Runnable {
    private static int count;

    /**
     * @date：
     * @author: baojize
     * @accountfor：synchronized的用法 同步线程
     */
    @Override
    @Test
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(Thread.currentThread().getName() + ":" + (count++));
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            SyncThread syncThread = new SyncThread();
            Thread thread1 = new Thread(new SyncThread(),"SyncThread1");
            Thread thread2 = new Thread(new SyncThread(),"SyncThread2");
            thread1.start();
            thread2.start();
        }

    }
    @Test
    public void test1(){
        final SyncThread data = new SyncThread();
        for (int i = 0; i < 10; i++) {
           new Thread(new Runnable() {
               @Override
               public void run() {
                   try {
                       //进入时候暂停1毫秒，增加并发问题出现的几率
                       Thread.sleep(1);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   for (int j = 0; j < 100; j++) {
                       data.addCount();
                   }
                   System.out.println(count + "");
               }
           }).start();
        }
        //主程序暂停3秒，以保证上面的程序执行完成
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("count=" + count);

    }
    private synchronized void addCount() {
        count++;
    }
    @Test
    public void test2(){
        System.out.println("begin");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        System.out.println("end");
    }
    @Test
    public void test3() {
        System.out.println("begin");
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        System.out.println("end");
    }
}
